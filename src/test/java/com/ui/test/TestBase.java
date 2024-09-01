package com.ui.test;
import com.qa.util.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	protected WebDriver driver;

	public TestBase(WebDriver driver) {
		driver = new ChromeDriver();
	}
	
	public TestBase() {
//		if(browser == Browser.CHROME) {
			
		}
	}
	

