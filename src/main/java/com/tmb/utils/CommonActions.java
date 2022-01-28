package com.tmb.utils;

import com.tmb.drivers.DriverOperations;
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
        DriverOperations.getDriver().get(value);
    }

    protected void maximizePage() {
        DriverOperations.getDriver().manage().window().maximize();
    }

    protected String getPageTitle() {
        return DriverOperations.getDriver().getTitle();
    }

}
