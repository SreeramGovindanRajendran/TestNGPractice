package com.tmb.tests;

import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;
import org.testng.annotations.Test;

public final class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    private HomePageTest() {
    }

    @Test
    public void logout() {
        homePage.clickWelcome().clickLogout();
    }

}
