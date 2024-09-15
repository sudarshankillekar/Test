package com.qa.util;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.CreateJobPojo;
import com.ui.pojo.GlobalDetailsPojo;

public class TestUtility {

	public static List<GlobalDetailsPojo> searchDataInList(List<GlobalDetailsPojo> dataList,String key) {
		 List<GlobalDetailsPojo> resultList =	dataList.stream().filter(new JobFilter(key)).toList();
		 return resultList;
	}
	
	public static String [] [] readExceldata(String fileName ,String sheetName)  {
		XSSFWorkbook myWorkbook = null;
		try {
			myWorkbook = new XSSFWorkbook(System.getProperty("user.dir")+"//testdata//"+ fileName + ".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	            
         XSSFSheet mySheet  = myWorkbook.getSheet(sheetName);
	     XSSFRow headerrow =  mySheet.getRow(0);
          int  totalNumberOfCols  = headerrow.getLastCellNum();
	      int lastRowIndex  =   mySheet.getLastRowNum();        
	      String data[] [] = new String[lastRowIndex][totalNumberOfCols];
	     XSSFRow row;
	     XSSFCell cell ;
	     for(int rowIndex = 1;rowIndex< lastRowIndex;rowIndex++) {
	    	  for(int cellIndex = 0; cellIndex<totalNumberOfCols ;cellIndex++) {
	    		  row = mySheet.getRow(rowIndex);
	    		  cell = row.getCell(cellIndex);
	    		  System.out.print(cell.getStringCellValue()+" ");
	               data[rowIndex-1][cellIndex] = cell.getStringCellValue();
	    	  }
	    	  System.out.println("");
	     }
		return data;
	}
	
	public static List<String[]>readDataFromCSV(String fileName){
		
		//gets the location o the file 
		File file = new File(System.getProperty("user.dir")+"//testdata//"+ fileName);
		
		//class that reads the file 
		FileReader fileReader = null;
		try {
			fileReader  = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//class for open csv & traversing through the file
		
		CSVReader csvReader = new CSVReader(fileReader);
		List<String[]> datalist = null;
		try {
			datalist =   csvReader.readAll();
		 } catch (IOException | CsvException e) {
								// TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 return datalist;
	}
	
	
	
	public static String convertPOJOToJSON(Object data) {
		Gson gson = new Gson();
		String result = gson.toJson(data);
		return result;
	}
	
	public static  CreateJobPojo createFakeUserData() {
     Faker faker = new Faker();
     CreateJobPojo createJobPojo = new CreateJobPojo(faker.numerify("##############"), faker.name().title(), faker.name().firstName(), faker.name().lastName(), faker.numerify("##########"), faker.numerify("##########"), "Google", faker.name().fullName(), faker.address().buildingNumber(),faker.address().cityName(), faker.name().firstName(), faker.address().lastName(),faker.name().firstName(),faker.address().zipCode());
		
		return createJobPojo;
}
}