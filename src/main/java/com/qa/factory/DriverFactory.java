package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFactory {
    
	
	 private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	    public static WebDriver init_driver(String browser) {
	        System.out.println("browser value is: " + browser);

	        if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            tlDriver.set(new ChromeDriver());
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            tlDriver.set(new FirefoxDriver());
	        } else if (browser.equalsIgnoreCase("edge")) {
	            tlDriver.set(new EdgeDriver());
	        } else {
	            throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }

	        getDriver().manage().deleteAllCookies();
	        getDriver().manage().window().maximize();
	        return getDriver();
	    }

	    public static synchronized WebDriver getDriver() {
	        return tlDriver.get();
	    }

	    public static synchronized void quitDriver() {
	        if (tlDriver.get() != null) {
	            tlDriver.get().quit();
	            tlDriver.remove();
	        }
	    }
}
