package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.CommonActions;
import com.tmb.utils.LoginConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;

public class LoginPage extends CommonActions {

    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);

    private final By txtBxUserName = By.id("txtUsername");
    private final By txtBxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By btnLogin = By.id("btnLogin");

    public LoginPage launchURL() {
        get(loginConfig.url().trim());
        return this;
    }

    public LoginPage maximizeLoginPage() {
        maximizePage();
        return this;
    }


    public LoginPage enterUsername() {
        clear(txtBxUserName, WaitStrategy.VISIBLE);
        sendKeys(txtBxUserName, loginConfig.username().trim(), WaitStrategy.VISIBLE);
        return this;
    }

    public LoginPage enterPassword() {
        clear(txtBxPassword, WaitStrategy.VISIBLE);
        sendKeys(txtBxPassword, loginConfig.password().trim(), WaitStrategy.VISIBLE);
        return this;
    }

    public HomePage clicklogin() {
        click(btnLogin, WaitStrategy.CLICKABLE);
        return new HomePage();
    }

}
