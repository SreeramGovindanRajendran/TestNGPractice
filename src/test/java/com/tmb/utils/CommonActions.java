package com.tmb.utils;

import com.tmb.drivers.DriverManager;
import com.tmb.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

    Select select;

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).sendKeys(value);
    }

    protected void click(By by, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).click();
    }

    protected void clear(By by, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.waitBy(by, waitStrategy).clear();
    }

    protected String getText(By by, WaitStrategy waitStrategy) {
        return ExplicitWaitFactory.waitBy(by, waitStrategy).getText();
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

    protected void selectText(By by, String text){
        select = new Select(DriverManager.getDriver().findElement(by));
        select.selectByVisibleText(text);
    }

    protected void selectIndex(By by, int index){
        select = new Select(DriverManager.getDriver().findElement(by));
        select.selectByIndex(index);
    }

    protected void selectValue(By by, String text){
        select = new Select(DriverManager.getDriver().findElement(by));
        select.selectByValue(text);
    }

}
