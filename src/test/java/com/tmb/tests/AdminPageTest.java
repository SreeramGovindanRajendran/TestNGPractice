package com.tmb.tests;

import com.tmb.pages.AdminPage;
import com.tmb.utils.LoginConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class AdminPageTest extends BaseTest{

    AdminPage adminPage = new AdminPage();
    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);
    private AdminPageTest(){}

    @Test
    public void getUserDetails(){
        String userDetails=adminPage.clickAdmin().searchUser(loginConfig.username().trim()).clickSearch().getColumnValues();
        Assertions.assertThat(userDetails).contains(loginConfig.username().trim());
    }
}
