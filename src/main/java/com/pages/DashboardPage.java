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
import com.qa.util.elementUtil;
import com.ui.pojo.GlobalDetailsPojo;

public class DashboardPage extends elementUtil {
    
	
	
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
    private static final By TABLE_LOCATOR  =  By.xpath("//mat-table/mat-row");
    private static final By TABLE_CELL_LOCATOR  = By.xpath(".//mat-cell");
//	 public void enterKeyInto(By locator ,Keys key) {
//			WebElement element = driver.findElement(locator);
//			element.sendKeys(key);
//		}
//	 
//	 public void enterTextInto(By locator ,String data) {
//			WebElement element = driver.findElement(locator);
//			element.sendKeys(data);
//		}
	 
	 public void searchForJobUsing(String imeiorcellList) {
		 enterTextInto(SEARCH_TEXT_BOX_LOCATOR, imeiorcellList);
		 enterKeyInto(SEARCH_TEXT_BOX_LOCATOR, Keys.ENTER);
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
		List<WebElement>rowlist = findElements(TABLE_LOCATOR);
		GlobalDetailsPojo globalDetailsPojo;
		ArrayList<GlobalDetailsPojo> dataList = new ArrayList<>();
		for(WebElement row : rowlist) {
			List<WebElement>cellList = row.findElements(TABLE_CELL_LOCATOR);
		    globalDetailsPojo = new GlobalDetailsPojo(cellList.get(0).getText(), cellList.get(1).getText(), cellList.get(2).getText(), cellList.get(3).getText(), cellList.get(4).getText(), cellList.get(5).getText(), cellList.get(6).getText());
		    dataList.add(globalDetailsPojo);
		}
		
//		for(GlobalDetailsPojo globalDetailsPojo1 :dataList) {
//			System.out.println(globalDetailsPojo1);
//		}
	 List<GlobalDetailsPojo> resultList =	dataList.stream().filter(new JobFilter(jobNumber)).toList();
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
		return new CreateJobpage(DriverFactory.getDriver());
	}
	
}
