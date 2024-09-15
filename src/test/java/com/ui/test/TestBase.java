package com.ui.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.pages.Pages;
import com.qa.util.Browser;

import io.cucumber.java.After;

public class TestBase  {

	protected Pages  pages;

	
	@BeforeMethod(description = "Setup for the tests", alwaysRun = true)
	public void setup() throws InterruptedException {
		pages = new FrontDeskLoginPage(Browser.CHROME);	
		Thread.sleep(5000);
	}
	
	@After
	public void tearDown() {
		pages.tearDown();
	}
	
	
}
