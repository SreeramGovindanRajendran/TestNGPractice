package com.tmb.tests;

import com.tmb.drivers.DriverOperations;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeSuite
    protected void setup() {
        DriverOperations.init();
    }

    @AfterSuite
    protected void tearDown() {
        DriverOperations.quit();
    }
}
