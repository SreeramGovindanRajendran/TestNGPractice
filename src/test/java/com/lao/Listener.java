package com.lao;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }

}
