package com.tmb.tests;

import com.tmb.pages.HomePage;
import org.testng.annotations.Test;

public final class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    private HomePageTest() {
    }

    @Test
    public void logout() {
        homePage.clickWelcome().clickLogout();
    }
}
