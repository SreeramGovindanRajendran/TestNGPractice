package com.lao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchPage {

    public WebDriver driver;
    String baseURL = "https://www.google.com";
    String driverPath = "C:\\Dev\\chromedriver.exe";

    @BeforeTest
    public void driverInstantiation() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
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
        driver.close();
        driver.quit();
    }

}
