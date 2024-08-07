package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepairJobPage {

	private WebDriver driver ;

	private final By repairJobPage = By.xpath("//span[contains(text(),\"Repair Job\") ]");
	
	public RepairJobPage(WebDriver driver) {
		this.driver = driver;
	}
	
   
	
}
