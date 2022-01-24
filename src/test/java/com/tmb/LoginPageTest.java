package com.tmb;

import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public final class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    private LoginPageTest() {}

    @Test
    public void login() {
        loginPage.launchURL().maximizeLoginPage().enterUsername().enterPassword().clicklogin();
        Assertions.assertThat(homePage.getHomePageTitle()).isEqualTo("OrangeHRM");
    }
}


