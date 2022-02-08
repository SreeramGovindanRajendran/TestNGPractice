package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.CommonActions;
import org.openqa.selenium.By;

public class AdminPage extends CommonActions {

    private final By btnAdmin = By.id("menu_admin_viewAdminModule");
    private final By txtUsername = By.id("searchSystemUser_userName");
    private final By btnSearch = By.id("searchBtn");
    private final By txtColumn = By.className("odd");
    private final By btnAdd = By.id("btnAdd");
    private final By drpUserRole = By.id("systemUser_userType");
    private final By drpStatus = By.id("systemUser_status");
    private final By txtCreateUsername = By.id("systemUser_userName");
    private final By txtCreatePassword = By.id("systemUser_password");
    private final By txtConfirmPassword = By.id("systemUser_confirmPassword");
    private final By btnSave = By.id("btnSave");
    private final By txtEmpName = By.id("systemUser_employeeName_empName");
    private final By btnDelete = By.id("btnDelete");
    private final By chkSelectAll = By.id("ohrmList_chkSelectAll");
    private final By btnOK = By.xpath("//*[@value='Ok' and @id='dialogDeleteBtn']");

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

    public AdminPage clickAdd(){
        click(btnAdd, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage selectUserDrpdwn(String text){
        selectText(drpUserRole, text);
        return this;
    }

    public AdminPage selectStatusDrpdwn(String text){
        selectText(drpStatus, text);
        return this;
    }

    public AdminPage enterNewUsername(String text){
        sendKeys(txtCreateUsername, text, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage enterEmpName(String text){
        sendKeys(txtEmpName, text, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage enterNewPassword(String text){
        sendKeys(txtCreatePassword, text, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage enterCnfmPassword(String text){
        sendKeys(txtConfirmPassword, text, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage clickSave(){
        click(btnSave, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage checkAll(){
        click(chkSelectAll, WaitStrategy.CLICKABLE);
        return this;
    }

    public AdminPage clickDelete(){
        click(btnDelete, WaitStrategy.CLICKABLE);
        return this;
    }

    public void clickOk(){
        click(btnOK, WaitStrategy.CLICKABLE);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
