package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;
import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}" + FrameworkConstants.LOGINCONFIGPROPERTIESPATH)
public interface LoginConfig extends Config {

    @Key("URL")
    String url();

    @Key("Username")
    String username();

    @Key("Password")
    String password();

    @Key("CreateUsername")
    String createUsername();

    @Key("CreatePassword")
    String createPassword();

    @Key("Browser")
    String browser();

    @Key("EmployeeName")
    String empName();

    @Key("UserRole")
    String userRole();

    @Key("Status")
    String status();

}
