package com.tmb.pages;

import com.tmb.utils.CommonActions;
import com.tmb.utils.LoginConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;

public class LoginPage extends CommonActions {

    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);

    private final By txtBxUserName = By.id("txtUsername");
    private final By txtBxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By btnLogin = By.id("btnLogin");

    public LoginPage launchURL(){
        get(loginConfig.url().trim());
        return this;
    }

    public LoginPage enterUsername(){
        clear(txtBxUserName);
        sendKeys(txtBxUserName, loginConfig.username().trim());
        return this;
    }

    public LoginPage enterPassword(){
        clear(txtBxPassword);
        sendKeys(txtBxPassword, loginConfig.password().trim());
        return this;
    }

    public HomePage clicklogin() {
        click(btnLogin);
        return new HomePage();
    }

}
