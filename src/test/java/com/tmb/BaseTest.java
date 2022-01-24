package com.tmb;

import com.tmb.drivers.DriverOperations;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    protected void setup() {
        DriverOperations.init();
    }

    @AfterTest
    protected void tearDown() {
        DriverOperations.quit();
    }
}
