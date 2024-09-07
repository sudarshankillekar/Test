package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Pause;

import com.qa.factory.DriverFactory;
import com.qa.util.elementUtil;

public class EngineerDashBoardPage extends elementUtil {

	public EngineerDashBoardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	private static final By PendingForRepairButton = By.xpath("//div[contains(text(),\" Pending for repair \")]/../div/button");
	private static final By RepairJob = By.xpath("//span[contains(text(),\"Repair Job\")]");
	private static final By PendingForRepairText = By.xpath("//div[contains(text(),\"Pending for repair\")]"); 
	private static final By Repaircompleted = By.xpath("//div[contains(text(),\"Repair completed\")]");
	private static final By Job_Number = By.xpath("//mat-header-cell[contains(text(),\" Job Number \")]");
	private static final By SEARCH_BOX_TEXT_LOCATOR = By.xpath("//input[@placeholder = \"Search for a Job or IMEI\"]");
	private static final By Begin_to_repair = By.xpath("(//span[contains(text(),\"Begin Repair\")])[1]");
	public String  verifyForPendingForRepairText(String data) {
		 return	getVisibleText(PendingForRepairText);
		}
	
	public String  verifyForRepaircompleted() {
		 return	getVisibleText(Repaircompleted);
		}
	
	public String  verifyForSearch() {
		 return	getVisibleText(Job_Number);
		}
	
	public String GetbuttonpforR() throws InterruptedException {
		PauseFor(5000);
		return getVisibleText(PendingForRepairButton);
	}
	
	public String  verifyRepairjob() throws InterruptedException {
	PauseFor(5000);	
	 return	getVisibleText(RepairJob);
	}
	
	public GlobalList searchForIMEI_Number(String IMEI_Number) throws InterruptedException {
		PauseFor(5000);
		enterTextInto(SEARCH_BOX_TEXT_LOCATOR, IMEI_Number);
		enterKeyInto(SEARCH_BOX_TEXT_LOCATOR, Keys.ENTER);
		return new GlobalList(DriverFactory.getDriver());
	}
	
	public void clickOnPendingForRepair() throws InterruptedException {		
		PauseFor(5000);
		clickOn(PendingForRepairButton);
//		clickElementWhenVisible(DriverFactory.getDriver(), PendingForRepairButton);
		//enterKeyInto(PendingForRepairButton, Keys.RETURN);
//		clickUsingjavascript(PendingForRepairButton);

	}
	
	
	public void clickOnRepairJob(){ 
		clickElementWhenVisible(getDriver(), RepairJob);
	}
	
    public void  EngineerClickOnBeginToRepair() {
    	clickElementWhenVisible(getDriver(), Begin_to_repair);
    }
	
	
}
