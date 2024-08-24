package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
   
	private static WebDriver driver ;
	private final static By UserNameText = By.xpath("//mat-label[contains(text(),\"Username\")]");
	private final static By PasswordText = By.xpath("//mat-label[contains(text(),\"Password\")]");
	private final static By UserName = By.id("username");
	private final static By Password = By.id("password");
	private final static By SignIn = By.xpath("//span[contains(text(),\" Sign in \")]");
	 private static final By Job_Created_today_button = By.xpath("//div[contains(text(),\"Created today\")]/../div/button");
	public static void main(String[] args) throws InterruptedException {
	
		   driver  = new ChromeDriver();
		    driver.manage().window().maximize();
	        driver.get("http://phoenix.testautomationacademy.in/");
	        Thread.sleep(5000);
			driver.findElement(UserName).clear();
			driver.findElement(UserName).sendKeys("iamfd");
			driver.findElement(Password).clear();
			driver.findElement(Password).sendKeys("password");	
			driver.findElement(SignIn).click();
			Thread.sleep(5000);
			driver.findElement(Job_Created_today_button).click();

	}

}
