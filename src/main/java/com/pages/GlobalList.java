package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.elementUtil;
import com.ui.pojo.GlobalDetailsPojo;

public class GlobalList extends elementUtil {
    
	private static final By TABLE_DATA_LOCATOR = By.xpath("//mat-table/mat-row/mat-cell");
	
	
	
	public GlobalList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public  GlobalDetailsPojo getJobDetails() throws InterruptedException {
		PauseFor(5000);
		List<String> dataList = getALLVisibleText(TABLE_DATA_LOCATOR);
		GlobalDetailsPojo data = new GlobalDetailsPojo(dataList.get(0), dataList.get(1), dataList.get(2),dataList.get(3), dataList.get(4),dataList.get(5), dataList.get(6)); 
	    return data;
	}	
}
