package com.ui.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.qa.util.Browser;

public class DashBoardPageTest {
	DashboardPage dashboardPage = frDeskLoginPage.doLoginWith("iamfd", "password");
//	DashboardPage dashboardPage;
	FrontDeskLoginPage frDeskLoginPage;
	@BeforeMethod(description = "Setup for the tests")
	public void setup() throws InterruptedException {
		frDeskLoginPage = new FrontDeskLoginPage(Browser.CHROME);	
		Thread.sleep(5000);
  	    
	}
	
	@Test
	public void verifyForTextPreseny() throws InterruptedException {
	    DashboardPage dashboardPage = frDeskLoginPage.doLoginWith("iamfd", "password");
		String actualtext = "Created today" ;
		Assert.assertEquals(dashboardPage.Job_Created_today_buttonText(),actualtext);
		dashboardPage.click_On_pending_for_delivery();
	}
	
//	@Test
//	public void searchForPendingfordeliveryJob() {
//	 dashboardPage.click_On_pending_for_delivery();
//	}
}
