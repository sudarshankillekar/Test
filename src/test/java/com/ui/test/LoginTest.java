package com.ui.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;


public class LoginTest extends TestBase {
	
	
	@Test(description = "test user login via ui", groups = {"sanity","smoke"})
	public void verifyUserLogin() throws InterruptedException {
	DashboardPage dashboardPage = ((FrontDeskLoginPage)pages).doLoginWith("iamfd", "password");
	Assert.assertTrue(dashboardPage.getCurrentUrl().contains("dashboard"));	
	}
	
}
