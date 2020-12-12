package com.testng.learning;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser {

	public WebDriver driver;
	String baseURL="https://www.google.com";
	
	@BeforeTest
	@Parameters("browser")
	public void browser_Selection(String browser) throws Exception {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Dev\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Dev\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Dev\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Other browser defined");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void launchURL() {
		driver.get(baseURL);
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterTest
	@Parameters("browser")
	public void killDriver(String browser) throws IOException {
		driver.close();
		if(browser.equalsIgnoreCase("Chrome")) {
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		}
		else if(browser.equalsIgnoreCase("Firefox")){
		Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
		}
		else if(browser.equalsIgnoreCase("Edge")){
		Runtime.getRuntime().exec("taskkill /F /IM msedgedriver.exe /T");
		}
	}
}
