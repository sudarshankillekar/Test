package com.qa.util;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.pojo.GlobalDetailsPojo;
public abstract class elementUtil {

	WebDriver driver;
    
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
    public elementUtil(Browser browser) {
		if(browser == Browser.CHROME) {
			driver = new ChromeDriver();
		}
		else if(browser == Browser.EDGE){
			driver= new EdgeDriver();
		}
		else if(browser == Browser.FF){
			driver= new EdgeDriver();
		}
	}

    public void  goToWebSite(String string) {
       	driver.get(string);
    }
    
    public void clearText(By locator) {
    	driver.findElement(locator).clear();
    }
    
	public void clickOn(By locator) {
    	WebElement element = driver.findElement(locator);
    	element.click();
    }
    
     public void enterTextInto(By locator,String textToEnter) {
    	 WebElement element = driver.findElement(locator);
    	 element.clear();
    	 element.sendKeys(textToEnter);
     }
    
     public void enterKeyInto(By locator,Keys key) {
    	 WebElement element = driver.findElement(locator);
    	 element.sendKeys(key);
     }
     
     
     
     public void PauseFor(long time) throws InterruptedException {
    	 Thread.sleep(time);
     }
	
     public void clickUsingjavascript(By locator) {
    	 JavascriptExecutor jse =  (JavascriptExecutor)driver;
    	 jse.executeScript("arguments[0].click", locator);
     }
     
    public boolean verifyelementDisplayed(By locator) {
   	 return driver.findElement(locator).isDisplayed();
   	   }
	
    public String getVisibleText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
    
    public int Count(By locator) {
		return driver.findElements(locator).size();
	   }
    
    public List<WebElement> findElements(By locator) {
    	return driver.findElements(locator);
     }
    
    public void findElement(By locator) {
    	 driver.findElements(locator);
     }
    
    public ArrayList<GlobalDetailsPojo> getTableData(By tableLocator,By cell) {
    	List<WebElement>rowlist = findElements(tableLocator);
    	List<WebElement> cellList;
    	GlobalDetailsPojo globalDetailsPojo;
		ArrayList<GlobalDetailsPojo> dataList = new ArrayList<>();
    	for(WebElement row : rowlist) {
			cellList = row.findElements(cell);
		    globalDetailsPojo = new GlobalDetailsPojo(cellList.get(0).getText(), cellList.get(1).getText(), cellList.get(2).getText(), cellList.get(3).getText(), cellList.get(4).getText(), cellList.get(5).getText(), cellList.get(6).getText());
		    dataList.add(globalDetailsPojo);
		}
    	return dataList;
    }
    
    public List< String> getALLVisibleText(By locator) {
    	List<WebElement> elementList = driver.findElements(locator);
    	List<String> dataList = new ArrayList<>();
		for(WebElement e : elementList) {
			dataList.add(e.getText());
		}
		return dataList;
    }
    
    public void clickElementWhenVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait for up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }
    
    public String getCurrentUrl() {
    	return driver.getCurrentUrl();
    }
    
    public void tearDown() {
    	driver.close();;
    }
}
