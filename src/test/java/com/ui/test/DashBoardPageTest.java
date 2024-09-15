package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.pages.Pages;
import com.qa.util.Browser;

public class DashBoardPageTest extends TestBase {
	
	 private DashboardPage dashboardPage;
    
    
//	@BeforeMethod(description = "Setup for the tests")
//	public void setup() throws InterruptedException {
//	 Pages pages = new Pages(Browser.CHROME);	
//	 dashboardPage = ((FrontDeskLoginPage) pages).doLoginWith("iamfd", "password");
//	}
	
	@Test(priority = 1)
	public void verifyForTextPreseny() throws InterruptedException {
		dashboardPage = ((FrontDeskLoginPage) pages).doLoginWith("iamfd", "password");
		String actualtext = "Created today" ;
		Assert.assertEquals(dashboardPage.Job_Created_today_buttonText(),actualtext);
		dashboardPage.click_On_pending_for_delivery().searchForJob("JOB_34041");
	}
//	
//	@Test(priority = 2)
//	public void searchForPendingfordeliveryJob() {
//	 dashboardPage.click_On_pending_for_delivery().searchForJob("JOB_34041");
//	}
}
