package com.tmb.tests;

import com.tmb.drivers.DriverOperations;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    protected void setup() {
        DriverOperations.init();
    }

    @BeforeTest
    protected void tearDown() {
        DriverOperations.quit();
    }
}
