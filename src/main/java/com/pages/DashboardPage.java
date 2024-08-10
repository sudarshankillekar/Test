package com.pages;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	private WebDriver driver ;	
	private final By ClickOnbeginrepair = By.xpath("(//span[contains(text(),\" Begin Repair\")])[1]");
	private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");private final By NavOptions = By.xpath("//div[@class = \"fuse-vertical-navigation-item-title-wrapper ng-star-inserted\"]");
    private final By CreatedToday = By.xpath("//div[contains(text(),\" Created today \")]"); 
    private final By creatJob = By.xpath("//span[contains(text(),\" Create Job \")]");
    
	 public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	 public void UserClickSoBeginRePair() {
	     driver.findElement(ClickOnbeginrepair).click();	
	    }
	
     public boolean VerifyForJobCreatedTodayField() {
    	return driver.findElement(CreatedToday).isDisplayed();
       }
    
	 public int getNavSectionCount() {
		return driver.findElements(NavOptions).size();
	   }
	
	 public boolean verifyrepairJob() {
		return driver.findElement(repairJobPage).isDisplayed();
	   }
	
	public void clickOnverifyrepairJob() {
		driver.findElement(repairJobPage).click();
	   }
	
	public List<String> getAccountsSectionList() {		
		List<String> StoredNavList = new ArrayList<>();
		List<WebElement> NavPanList = driver.findElements(NavOptions);		
		for(WebElement e : NavPanList) {
			String text = e.getText();
			System.out.println(text);
			StoredNavList.add(text);			
		}		
		return StoredNavList;		
	}
		
	public CreateJobpage goToCreateJobPage() throws InterruptedException {
		driver.findElement(creatJob).click();
		Thread.sleep(5000);
		return new CreateJobpage(driver);
	}
	
}
