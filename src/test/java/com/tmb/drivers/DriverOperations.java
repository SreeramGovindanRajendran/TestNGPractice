package com.tmb.drivers;

import com.tmb.utils.LoginConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Objects;

public final class DriverOperations {

    private static WebDriver driver;

    static LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);

    private DriverOperations() {
    }

    public static void init() {
        switch (loginConfig.browser().trim().toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                if (Objects.isNull(driver)) {
                    driver = new ChromeDriver();
                }
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                if (Objects.isNull(driver)) {
                    driver = new EdgeDriver();
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + loginConfig.browser().trim().toLowerCase());
        }
        DriverManager.setDriver(driver);
    }

    public static void quit() {
        if (Objects.nonNull(driver)) {
            driver.quit();
            DriverManager.unload();
        }
    }
}
