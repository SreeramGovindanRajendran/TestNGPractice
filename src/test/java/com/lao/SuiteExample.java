package com.lao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

    WebDriver driver;
    long startTime;
    long endTime;
    String baseURL = "https://www.google.com";
    String driverPath = "C:\\Dev\\chromedriver.exe";

    @BeforeSuite
    public void driverInstantiation() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        startTime = System.currentTimeMillis();
    }

    @Test
    public void launchURL() {
        driver.get(baseURL);
    }

    @AfterSuite
    public void killDriver() {
        driver.close();
        driver.quit();
        endTime = System.currentTimeMillis();
        long totalTimeTaken = endTime - startTime;
        System.out.println("Start Time " + startTime);
        System.out.println("End Time " + endTime);
        System.out.println("Total Time Taken " + totalTimeTaken);
    }


}
