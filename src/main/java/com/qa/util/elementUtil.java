package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class elementUtil {

	WebDriver driver;

	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
    public void clickOn(By locator) {
    	WebElement element = driver.findElement(locator);
    	element.click();
    }
    
	
    public boolean verifyelementDisplayed(By locator) {
   	 return driver.findElement(locator).isDisplayed();
   	   }
	
	
}
