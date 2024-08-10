package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CreateJobpage {

	private WebDriver driver ;
	
	private final By Problemsdetails = By.xpath("//strong[contains(text(),\"Problem Details\")]");
	private final By ClickonOEM = By.xpath("//span[contains(text(),\"Select OEM\")]");
	private final By OEM = By.xpath("//span[contains(text(),\" Apple \")]");
	private final By ClickonPRODUCT_NAME = By.xpath("//span[contains(text(),\"Select Product name\")]");
	private final By PRODUCT_NAME = By.xpath("//span[contains(text(),\"IPhone\")]");
	private final By Model_Name = By.xpath("//span[contains(text(),\"Iphone 11\")]");
	private final By ClickonModel_Name = By.xpath("//span[contains(text(),\"Select Model name\")]");
	private final By IMEI_Number = By.xpath("//input[@data-placeholder=\"0123456789\" ]");
	private final By Date_of_Purchase = By.xpath("//input[@data-placeholder=\"dd/mm/yyyy\" ]");
	private final By Watternty_status = By.xpath("//span[contains(text(),\" In Warrenty \" )]");
	private final By ClickonWatternty_status = By.xpath("//span[contains(text(),\"Select Warranty Status\")]");
	private final By ClickonSelectproblem = By.xpath("//span[contains(text(),\"Select Problem\")]");
	private final By Clickonproblem = By.xpath("//span[contains(text(),\"Poor battery life\")]");
	private final By ClickonSelectState = By.xpath("//input[@placeholder = \"Select State\"]");
	private final By SelectState = By.xpath("//span[contains(text(),\"Karnataka\")]");
	private final By ClickonSelectProblem = By.xpath("//span[contains(text(),\"Select Problem\")]");
	private final By SelectProblem = By.xpath("//span[contains(text(),\" MicroSD card is not working on your phone \")]");
	private final By firstName = By.xpath("//input[@id = \"mat-input-6\"]");
	private final By LastName = By.xpath("//input[@id = \"mat-input-7\"]");
	private final By Contact_No = By.xpath("//input[@id = \"mat-input-8\"]");
	private final By email_id = By.xpath("//input[@id = \"mat-input-10\"]");
	private final By Flat_Society = By.xpath("//input[@id = \"mat-input-12\"]");
	private final By Apartment_name = By.xpath("//input[@id = \"mat-input-13\"]");
	private final By LandMark = By.xpath("//input[@id = \"mat-input-14\"]");
	private final By Street_Name = By.xpath("//input[@id = \"mat-input-15\"]");
	private final By Area = By.xpath("//input[@id = \"mat-input-16\"]");
	private final By Pincode = By.xpath("//input[@id = \"mat-input-19\"]");
	private final By Remarks = By.xpath("//input[@id = \"mat-input-21\"]");
	private final By submit = By.xpath("//span[contains(text(),\"Submit\")]");
	
	public CreateJobpage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifycreatejobpage() {
		return driver.findElement(Problemsdetails).isDisplayed();
	}
	
	public void selectOEM() {
	 driver.findElement(ClickonOEM).click();
	 driver.findElement(OEM).click();
	}
	
	public void selectPRODUCT_NAME() {
		 driver.findElement(ClickonPRODUCT_NAME).click();
		 driver.findElement(PRODUCT_NAME).click();
	}
	
	public void selectenterModel_Name() {
		driver.findElement(ClickonModel_Name).click();
		 driver.findElement(Model_Name).click();
	}
	
	public void selectWatternty_status() {
		driver.findElement(ClickonWatternty_status).click();
	    driver.findElement(Watternty_status).click();
	}
	
	public void select_Problem() {
		driver.findElement(ClickonSelectProblem).click();
		driver.findElement(SelectProblem).click();
	}
	
	public void enterIMEI_Number(String Number) {
		driver.findElement(IMEI_Number).sendKeys(Number);
	}
	
	public void Date_of_Purchase(String DATE) {
		driver.findElement(Date_of_Purchase).sendKeys(DATE);
	}
	
	public void Enter_remarks(String remark) {
		driver.findElement(Remarks).sendKeys(remark);
	}
	
	public void selectProblem() {
		driver.findElement(ClickonSelectproblem).click();
	    driver.findElement(Clickonproblem).click();
	}
	
	public void Enter_First_Name(String First_Name) {
		driver.findElement(firstName).sendKeys(First_Name);
	}
	
	public void Enter_LastName(String LastNamee) {
		driver.findElement(LastName).sendKeys(LastNamee);
	}
	
	public void Enter_Contact_No(String Cont_No) {
		driver.findElement(Contact_No).sendKeys(Cont_No);
	}
	
	public void Enter_Email_id(String email) {
		driver.findElement(email_id).sendKeys(email);
	}
	
	public void Enter_flat_no(String FlatNo) {
		driver.findElement(Flat_Society).sendKeys(FlatNo);
	}
	
	public void Enter_ApartName(String ApartName) {
		driver.findElement(Apartment_name).sendKeys(ApartName);
	}
	
	public void Enter_Area(String areaa) {
		driver.findElement(Area).sendKeys(areaa);
	}
	
	public void Enter_LandMark(String LandMarks) {
		driver.findElement(LandMark).sendKeys(LandMarks);
	}
	
	public void Enter_Pincode(String Pincodee) {
		driver.findElement(Pincode).sendKeys(Pincodee);
	}
	
	public void Enter_Street_Name(String SN) {
		driver.findElement(Street_Name).sendKeys(SN);
	}
	
	public void Click_On_Submit()  {
        driver.findElement(submit).click();
	}
	
	public boolean verifySubmitButton() {
		return driver.findElement(submit).isDisplayed();
	}
	
	public void selectState() {
		driver.findElement(ClickonSelectState).click();
	    driver.findElement(SelectState).click();
	}
	
	
	public void fillCreateJobData(String IMIE,String Date,String remarks,String FirstName,String Lastname,String contact_no,String email_id ,String Flat_so_no , String enterAPTName,String landmark,String Streetname,String Area,String Pincode ) throws InterruptedException {
		selectOEM();
		selectPRODUCT_NAME();
		selectenterModel_Name();
		enterIMEI_Number(IMIE);
		Date_of_Purchase(Date);
		selectWatternty_status();
		select_Problem();
		Enter_remarks(remarks);
		Enter_First_Name(FirstName);
		Enter_LastName(Lastname);
		Enter_Contact_No(contact_no);
		Enter_Email_id(email_id);
		Enter_flat_no(Flat_so_no);
		Enter_ApartName(enterAPTName);
		Enter_LandMark(landmark);
		Enter_Street_Name(Streetname);
		Enter_Area(Area);
		selectState();
		Enter_Pincode(Pincode);		
	}
	
}
