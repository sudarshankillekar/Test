package com.dataProvider;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.qa.util.TestUtility;

public class loginDataProvider {

	@DataProvider(name = "loginTestDataProvider")
	public  List<String[]> loginDP() {
		           List<String[]>  data  =  TestUtility.readDataFromCSV("logindata.csv");
		           return data;
	}
	
	@DataProvider(name = "loginTestDataProviderWithExcel")
	public  String[][] loginexcelDP() {
		       String data [] [] =    TestUtility.readExceldata("testdataexcel", "loginData");
		           return data; 
	}
	
}
