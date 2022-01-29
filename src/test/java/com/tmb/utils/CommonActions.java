package com.tmb.utils;

import com.tmb.drivers.DriverManager;
import com.tmb.enums.WaitStrategy;
import org.openqa.selenium.By;

public class CommonActions {

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).sendKeys(value);
    }

    protected void click(By by, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).click();
    }

    protected void clear(By by, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).clear();
    }

    protected void get(String value) {
        DriverManager.getDriver().get(value);
    }

    protected void maximizePage() {
        DriverManager.getDriver().manage().window().maximize();
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
