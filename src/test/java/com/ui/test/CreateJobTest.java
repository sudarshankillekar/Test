package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.CreateJobpage;
import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.qa.util.TestUtility;

public class CreateJobTest extends TestBase {

	DashboardPage dashboardPage;
	CreateJobpage createJobpage ;
	
	@Test(description = "test user login via ui", groups = {"sanity","smoke"})
	public void verifyUserLogin() throws InterruptedException {
	DashboardPage dashboardPage = ((FrontDeskLoginPage)pages).doLoginWith("iamfd", "password");
	createJobpage =  dashboardPage.goToCreateJobPage();
	createJobpage.createJobUsingPojo(TestUtility.createFakeUserData());
	}
	
	
	
	
	
}
