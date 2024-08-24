package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.qa.factory.DriverFactory;

public class FrontDeskLoginPage {
    
	private WebDriver driver ;
		
	private final By UserNameText = By.xpath("//mat-label[contains(text(),\"Username\")]");
	private final By PasswordText = By.xpath("//mat-label[contains(text(),\"Password\")]");
	private final By UserName = By.id("username");
	private final By Password = By.id("password");
	private final By SignIn = By.xpath("//span[contains(text(),\" Sign in \")]");
	
	public FrontDeskLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyVisibleTextUserName() {
		return driver.findElement(UserNameText).isDisplayed();
	}
	
	public boolean verifyVisibleTextPassword() {
		return driver.findElement(PasswordText).isDisplayed();
	}
	
	public boolean verifyVisibleTextSignIn() {
		return driver.findElement(SignIn).isDisplayed();
	}
	
	
	
	public void enterUserName(String username ) {
		driver.findElement(UserName).clear();
		driver.findElement(UserName).sendKeys(username);
	}
	
	public void enterpasword(String password ) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickOnSignInButton() throws InterruptedException {		
		driver.findElement(SignIn).click();
	}
	
	public DashboardPage doLoginWith(String username ,String Pwd) throws InterruptedException {
		driver.findElement(UserName).clear();
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(Pwd);
		driver.findElement(SignIn).click();
		Thread.sleep(5000);
		return new DashboardPage(driver);
	}
	
	public EngineerDashBoardPage doLoginWithengg(String username ,String Pwd) throws InterruptedException {
		driver.findElement(UserName).clear();
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(Pwd);
		driver.findElement(SignIn).click();
		Thread.sleep(5000);
		return new EngineerDashBoardPage(DriverFactory.getDriver());
	}
	
}
