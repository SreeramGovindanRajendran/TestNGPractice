package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.CommonActions;
import com.tmb.utils.LoginConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;

public class LoginPage extends CommonActions {

    private final By txtBxUserName = By.id("txtUsername");
    private final By txtBxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By btnLogin = By.id("btnLogin");
    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);

    public LoginPage launchURL() {
        get(loginConfig.url().trim());
        return this;
    }

    public LoginPage maximizeLoginPage() {
        maximizePage();
        return this;
    }


    public LoginPage enterUsername() {
        sendKeys(txtBxUserName, loginConfig.username().trim(), WaitStrategy.VISIBLE);
        return this;
    }

    public LoginPage enterPassword() {
        sendKeys(txtBxPassword, loginConfig.password().trim(), WaitStrategy.VISIBLE);
        return this;
    }

    public void clicklogin() {
        click(btnLogin, WaitStrategy.CLICKABLE);
    }

    public LoginPage enterNewUsername() {
        sendKeys(txtBxUserName, loginConfig.createUsername().trim(), WaitStrategy.VISIBLE);
        return this;
    }

    public LoginPage enterNewPassword() {
        sendKeys(txtBxPassword, loginConfig.createPassword().trim(), WaitStrategy.VISIBLE);
        return this;
    }
}
