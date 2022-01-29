package com.tmb.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class DriverOperations {

    private static WebDriver driver;

    private DriverOperations() {
    }

    public static void init() {
        WebDriverManager.chromedriver().setup();
        if (Objects.isNull(driver)) {
            driver = new ChromeDriver();
            DriverManager.setDriver(driver);
        }
    }

    public static void quit() {
        if (Objects.nonNull(driver)) {
            driver.quit();
            DriverManager.unload();
        }
    }
}
