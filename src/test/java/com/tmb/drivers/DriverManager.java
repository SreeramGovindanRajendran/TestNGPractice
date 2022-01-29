package com.tmb.drivers;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private static ThreadLocal<WebDriver> tl = new ThreadLocal<>();

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        return tl.get();
    }

    public static void setDriver(WebDriver driverRef) {
        tl.set(driverRef);
    }

    public static void unload() {
        tl.remove();
    }

}
