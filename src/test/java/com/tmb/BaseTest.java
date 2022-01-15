package com.tmb;

import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setup() {
        DriverOperations.init();
    }

    //@AfterTest
    public void tearDown(){
        DriverOperations.close();
    }
}
