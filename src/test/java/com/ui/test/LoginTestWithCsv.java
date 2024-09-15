package com.ui.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;


public class LoginTestWithCsv extends TestBase {
	
	
	@Test(description = "test user login via ui", groups = {"sanity","smoke"}, dataProviderClass  = com.dataProvider.loginDataProvider.class, dataProvider  = "loginTestDataProviderWithExcel")
	public void verifyUserLogin(String userName,String password) throws InterruptedException {
	DashboardPage dashboardPage = ((FrontDeskLoginPage)pages).doLoginWith(userName,password);
	Assert.assertTrue(dashboardPage.getCurrentUrl().contains("dashboard"));	
	}
	
}
