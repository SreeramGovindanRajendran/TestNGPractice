package com.tmb.tests;

import com.tmb.pages.AdminPage;
import com.tmb.utils.LoginConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class AdminPageTest extends BaseTest {

    AdminPage adminPage = new AdminPage();
    LoginConfig loginConfig = ConfigFactory.create(LoginConfig.class);

    private AdminPageTest() {
    }

    @Test
    public void createUser() {
        adminPage.clickAdmin()
                .clickAdd()
                .selectUserDrpdwn(loginConfig.userRole().trim())
                .enterEmpName(loginConfig.empName().trim())
                .selectStatusDrpdwn(loginConfig.status().trim())
                .enterNewUsername(loginConfig.createUsername().trim())
                .enterNewPassword(loginConfig.createPassword().trim())
                .enterCnfmPassword(loginConfig.createPassword().trim())
                .clickSave();

        adminPage.searchUserDetails(loginConfig.createUsername().trim());

        Assertions.assertThat(adminPage.getColumnValues()).contains(loginConfig.createUsername().trim());
    }

    @Test
    public void deleteUser() {
        adminPage.clickAdmin()
                .searchUser(loginConfig.createUsername().trim())
                .clickSearch()
                .checkAll()
                .clickDelete()
                .clickOk();

        adminPage.searchUserDetails(loginConfig.createUsername().trim());

        Assertions.assertThat(adminPage.noRecordsFound()).isTrue();
    }

}
