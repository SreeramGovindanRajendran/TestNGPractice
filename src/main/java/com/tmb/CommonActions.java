package com.tmb;

import org.openqa.selenium.By;

public final class CommonActions {

    public CommonActions sendKeys(By ByElement, String value){
        DriverOperations.getDriver().findElement(ByElement).sendKeys(value);
        return this;
    }

    public CommonActions click(By ByElement){
        DriverOperations.getDriver().findElement(ByElement).click();
        return this;
    }

    public CommonActions clear(By ByElement){
        DriverOperations.getDriver().findElement(ByElement).clear();
        return this;
    }

    public CommonActions get( String value){
        DriverOperations.getDriver().get(value);
        return this;
    }

}
