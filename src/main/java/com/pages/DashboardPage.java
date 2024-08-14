package com.pages;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.elementUtil;

public class DashboardPage {

	private WebDriver driver ;	
	private final By ClickOnbeginrepair = By.xpath("(//span[contains(text(),\" Begin Repair\")])[1]");
	private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");private final By NavOptions = By.xpath("//div[@class = \"fuse-vertical-navigation-item-title-wrapper ng-star-inserted\"]");
    private final By CreatedToday = By.xpath("//div[contains(text(),\" Created today \")]"); 
    private final By creatJob = By.xpath("//span[contains(text(),\" Create Job \")]");
    private static final By SEARCH_TEXT_BOX_LOCATOR = By.xpath("//input[@placeholder=\"Search for a Job or IMEI\"]");
    
	 public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	 public void enterKeyInto(By locator ,Keys key) {
			WebElement element = driver.findElement(locator);
			element.sendKeys(key);
		}
	 
	 public void enterTextInto(By locator ,String data) {
			WebElement element = driver.findElement(locator);
			element.sendKeys(data);
		}
	 
	 public void searchForJobUsing(String imeiorJobNumber) {
		 enterTextInto(SEARCH_TEXT_BOX_LOCATOR, imeiorJobNumber);
		 enterKeyInto(SEARCH_TEXT_BOX_LOCATOR, Keys.ENTER);
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
