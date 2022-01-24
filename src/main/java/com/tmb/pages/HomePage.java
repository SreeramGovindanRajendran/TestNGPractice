package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.CommonActions;
import org.openqa.selenium.By;

public class HomePage extends CommonActions {

    private final By lnkWelcome = By.id("welcome");
    private final By lnkLogout = By.xpath("//a[text()='Logout']");

    public String getHomePageTitle(){
        return getPageTitle();
    }

    public HomePage clickWelcome(){
        click(lnkWelcome, WaitStrategy.CLICKABLE);
        return this;
    }

    public void clickLogout(){
        click(lnkLogout, WaitStrategy.CLICKABLE);
    }
}
