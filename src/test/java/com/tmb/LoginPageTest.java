package com.tmb;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public final class LoginPageTest extends BaseTest {

    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);
    CommonActions commonActions = new CommonActions();

    private final By userName = By.id("txtUsername");
    private final By password = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By LoginButton = By.id("btnLogin");

    private LoginPageTest() {
    }

    @Test
    public void login() {
    commonActions.get(loginConfig.URL().trim())
            .clear(userName)
            .sendKeys(userName, loginConfig.Username().trim())
            .clear(password)
            .sendKeys(password, loginConfig.Password().trim())
            .click(LoginButton);
    }

}
