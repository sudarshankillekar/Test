package com.dataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelExample {

	public static void main(String[] args) throws IOException {
	
    //First create the object of XSSFwork then specfiy the location of the excel sheet		
	     XSSFWorkbook myWorkbook = new XSSFWorkbook(System.getProperty("user.dir")+"//testdata//testdataexcel.xlsx");	
	 //then create an object of XSFFSheet which goes to the sheet             
         XSSFSheet mySheet  = myWorkbook.getSheet("loginData");
	  //then create an object of XSSFRow which goes to the sheet 
	     XSSFRow headerrow =  mySheet.getRow(0);
	   //then create an object of XSSFcell which goes to the sheet 
           int  totalNumberOfCols  = headerrow.getLastCellNum();
         
         
	     int lastRowIndex  =  mySheet.getLastRowNum();        
	      
	     XSSFRow row;
	     XSSFCell cell ;
	     
	     for(int rowIndex = 0;rowIndex<= lastRowIndex;rowIndex++) {
	    	  for(int cellIndex = 0; cellIndex<totalNumberOfCols ;cellIndex++) {
	    		  row = mySheet.getRow(rowIndex);
	    		  cell = row.getCell(cellIndex);
	    		  System.out.print(cell.getStringCellValue()+" ");
	    	  }
	    	  System.out.println("");
	     }
	     
	             
	             
	} 

}
