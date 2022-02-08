package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.CommonActions;
import org.openqa.selenium.By;

public class AdminPage extends CommonActions {

    private final By btnAdmin = By.id("menu_admin_viewAdminModule");
    private final By txtUsername = By.id("searchSystemUser_userName");
    private final By btnSearch = By.id("searchBtn");
    private final By txtColumn = By.className("odd");

    public AdminPage clickAdmin(){
        click(btnAdmin, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage searchUser(String user){
        sendKeys(txtUsername, user, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage clickSearch(){
        click(btnSearch, WaitStrategy.CLICKABLE);
        return this;
    }

    public String getColumnValues(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getText(txtColumn, WaitStrategy.VISIBLE);
   }

}
