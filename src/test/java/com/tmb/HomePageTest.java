package com.tmb;

import com.tmb.pages.HomePage;
import org.testng.annotations.Test;

public final class HomePageTest extends BaseTest{

    HomePage homePage = new HomePage();

    private HomePageTest(){}

    @Test
    public void clickLogout(){
        homePage.clickWelcome().clickLogout();
    }
}
