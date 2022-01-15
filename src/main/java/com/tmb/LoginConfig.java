package com.tmb;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/tmb/LoginConfig.properties")
public interface LoginConfig extends Config {

    @Key("URL")
    String url();

    @Key("Username")
    String username();

    @Key("Password")
    String password();
}
