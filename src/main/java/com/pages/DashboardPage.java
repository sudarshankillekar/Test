package com.pages;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;
import com.qa.util.JobFilter;
import com.qa.util.TestUtility;
import com.qa.util.elementUtil;
import com.ui.pojo.GlobalDetailsPojo;

public class DashboardPage extends Pages {
    
	
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver ;	
	private final By ClickOnbeginrepair = By.xpath("(//span[contains(text(),\" Begin Repair\")])[1]");
	private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");
	private final By NavOptions = By.xpath("//div[@class = \"fuse-vertical-navigation-item-title-wrapper ng-star-inserted\"]");
    private final By CreatedToday = By.xpath("//div[contains(text(),\" Created today \")]"); 
    private final By creatJob = By.xpath("//span[contains(text(),\" Create Job \")]");
    private static final By SEARCH_TEXT_BOX_LOCATOR = By.xpath("//input[@placeholder=\"Search for a Job or IMEI\"]");
    private static final By Job_Created_today_button = By.xpath("//div[contains(text(),\"Created today\")]/../div/button");
    private static final By Job_Created_today_text = By.xpath("//div[contains(text(),\"Created today\")]");
    private static final By TABLE_LOCATOR  =  By.xpath("//mat-table/mat-row");
    private static final By TABLE_CELL_LOCATOR  = By.xpath(".//mat-cell");
    private static final By pending_for_delivery_button  = By.xpath("//div[contains(text(),\"Pending for delivery\")]/../div/button");
//	 public void enterKeyInto(By locator ,Keys key) {
//			WebElement element = driver.findElement(locator);
//			element.sendKeys(key);
//		}
//	 
//	 public void enterTextInto(By locator ,String data) {
//			WebElement element = driver.findElement(locator);
//			element.sendKeys(data);
//		}
	 
    public String Job_Created_today_buttonText() throws InterruptedException {
    	Thread.sleep(5000);
    	return getVisibleText( Job_Created_today_text);
    }
    
	 public void searchForJobUsing(String imeiorcellList) {
		 enterTextInto(SEARCH_TEXT_BOX_LOCATOR, imeiorcellList);
		 enterKeyInto(SEARCH_TEXT_BOX_LOCATOR, Keys.ENTER);
	 }
	 
	 public DashboardPage click_On_pending_for_delivery() {
		 clickOn(pending_for_delivery_button);
		return new  DashboardPage(getDriver());
	    }
	 
	 public void UserClickSoBeginRePair() {
	     clickOn(ClickOnbeginrepair);
	    }
	
     public boolean VerifyForJobCreatedTodayField() {
     return	verifyelementDisplayed(CreatedToday);
       }
    
	 public int getNavSectionCount() throws InterruptedException { 
		return Count(NavOptions);
	   }
	
    public DashboardPage clickOnJobCreatededToday() throws InterruptedException {   
        clickOn(Job_Created_today_button);
    	Thread.sleep(10000);
    	return new DashboardPage(DriverFactory.getDriver());
    }
	
	public void clickOnverifyrepairJob() {
		clickOn(repairJobPage);
	   }
	
	public List<String> getAccountsSectionList() {		
		List<String> StoredNavList = new ArrayList<>();
		List<WebElement> NavPanList = findElements(NavOptions);		
		for(WebElement e : NavPanList) {
			String text = e.getText();
			System.out.println(text);
			StoredNavList.add(text);			
		}		
		return StoredNavList;		
	}
	
	public boolean searchForJob(String jobNumber) {
	   ArrayList<GlobalDetailsPojo> dataList      =	getTableData(TABLE_LOCATOR, TABLE_CELL_LOCATOR);
	   List<GlobalDetailsPojo> resultList = TestUtility.searchDataInList(dataList, jobNumber) ;
	   System.out.println(resultList);
	 if(resultList.size()>0) {
		 return true;
	 }else {
		 return false;
	 }		
	}
	
	
	public CreateJobpage goToCreateJobPage() throws InterruptedException {
		clickOn(creatJob);
		Thread.sleep(5000);
		return new CreateJobpage(getDriver());
	}
	
}
