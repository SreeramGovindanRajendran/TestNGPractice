package com.tmb.utils;

import com.tmb.drivers.DriverOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonActions {

    protected void wait(By ByElement) {
        new WebDriverWait(DriverOperations.getDriver(), Duration.ofSeconds(10))
                .until(d->d.findElement(ByElement).isEnabled());
    }

    protected void sendKeys(By ByElement, String value) {
        wait(ByElement);
        DriverOperations.getDriver().findElement(ByElement).sendKeys(value);
    }

    protected void click(By ByElement) {
        wait(ByElement);
        DriverOperations.getDriver().findElement(ByElement).click();
    }

    protected void clear(By ByElement) {
        wait(ByElement);
        DriverOperations.getDriver().findElement(ByElement).clear();
    }

    protected void get(String value) {
        DriverOperations.getDriver().get(value);
    }

    protected String getPageTitle() {
        return DriverOperations.getDriver().getTitle();
    }

}
