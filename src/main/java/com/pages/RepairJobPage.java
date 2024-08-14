package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.elementUtil;

public class RepairJobPage extends elementUtil {

	public RepairJobPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private final By ClickOnRepairJob = By.xpath("//span[contains(text() ,\" Repair Job\")]");
	private final By ClickOnbeginrepair = By.xpath("(//span[contains(text(),\" Begin Repair\")])[1]");
	private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");
	
//	public RepairJobPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public void ClickOnRepairJob() {
		clickOn(ClickOnRepairJob);
	}
	
    public void UserClickSonBeginRePair() {
        clickOn(ClickOnbeginrepair);	
    }
    
	 public void verifyrepairJob() {
	  verifyelementDisplayed(repairJobPage);
	   }
    
    
    
    
    
}
