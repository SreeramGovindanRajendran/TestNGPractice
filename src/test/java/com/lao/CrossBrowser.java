package com.lao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Objects;


public class CrossBrowser {

    public WebDriver driver;
    String baseURL = "https://www.google.com";

    @BeforeTest
    @Parameters("browser")
    public void browser_Selection(String browser) throws Exception {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new Exception("Other browser defined");
        }
    }

    @Test
    public void launchURL() {
        driver.get(baseURL);
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @AfterTest
    public void killDriver() {
        if (Objects.nonNull(driver)) {
            driver.quit();
        }
    }
}
