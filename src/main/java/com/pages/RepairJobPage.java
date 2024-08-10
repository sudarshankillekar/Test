package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepairJobPage {

	private WebDriver driver ;

//private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");
	private final By ClickOnbeginrepair = By.xpath("(//span[contains(text(),\" Begin Repair\")])[1]");
 	
	public RepairJobPage(WebDriver driver) {
		this.driver = driver;
	}
	
    public void UserClickSoBeginRePair() {
     driver.findElement(ClickOnbeginrepair).click();	
    }
    
   
    
    
    
    
    
}
