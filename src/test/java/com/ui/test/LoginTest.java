package com.ui.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Browser;

import io.cucumber.java.After;

public class LoginTest  {
	
	WebDriver driver;
	
	DashboardPage dashboardPage;
	FrontDeskLoginPage frDeskLoginPage;
	
	@BeforeMethod(description = "Setup for the tests")
	public void setup() throws InterruptedException {
		frDeskLoginPage = new FrontDeskLoginPage(driver);	
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyUserLogin() throws InterruptedException {
	DashboardPage dashboardPage = frDeskLoginPage.doLoginWith("iamfd", "password");
	Assert.assertTrue(dashboardPage.getCurrentUrl().contains("dashboard"));	
	}
	
	@After
	public void tearDown() {
		dashboardPage.tearDown();
	}

}
