package com.tmb.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Objects;

public final class DriverOperations {

    private static WebDriver driver;

    private DriverOperations(){}

    public static WebDriver getDriver() {
        return driver;
    }

    public static void init() {
        WebDriverManager.chromedriver().setup();
        if (Objects.isNull(driver))
            driver = new ChromeDriver();
    }

    public static void quit() {
        if (Objects.nonNull(driver)) {
            driver.quit();
            driver = null;
        }
    }
}
