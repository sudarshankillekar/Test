//package stepdefinations;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//
//import com.pages.CreateJobpage;
//import com.pages.DashboardPage;
//import com.pages.FrontDeskLoginPage;
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CreateJobPageSteps {
//
//	FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
//	private DashboardPage dashboardPage;
//	private CreateJobpage createJobpage;
//	
//		
//	@Given(":User has already Logged into the application")
//	public void user_has_already_logged_into_the_application(DataTable dataTable) throws InterruptedException {
//		   List<Map<String,String>> credList = dataTable.asMaps();
//			  String username =  credList.get(0).get("username");
//			  String password = credList.get(0).get("password");
//			  DriverFactory.getDriver().get("http://phoenix.testautomationacademy.in/sign-in");
//			  try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			  dashboardPage = frontDeskLoginPage.doLoginWith(username, password);
//			  createJobpage =  dashboardPage.goToCreateJobPage();
//			}
//			
//
//
//	@Given(":User is on the Create job page")
//	public void user_is_on_the_create_job_page() {
//	   Assert.assertTrue(createJobpage.verifycreatejobpage());
//	}
//
//	@When(": User enters the following details")
//	public void user_enters_the_following_details(DataTable dataTable) throws InterruptedException {
//		Thread.sleep(5000);
//		 List<Map<String,String>> credList = dataTable.asMaps();
//		  String IMEI_Number = credList.get(0).get("Field"); 
//		  String Date_of_purchase = credList.get(1).get("Field"); 
//		  String Remarks = credList.get(2).get("Field"); 
//		  String First_Name = credList.get(3).get("Field"); 
//		  String Last_Name = credList.get(4).get("Field"); 
//		  String Contact_No = credList.get(5).get("Field"); 
//		  String Email_Id = credList.get(6).get("Field"); 
//		  String FlatSocietyNo = credList.get(7).get("Field"); 
//		  String Apartment_Name = credList.get(8).get("Field"); 
//		  String Landmark = credList.get(9).get("Field"); 
//		  String StreetName = credList.get(10).get("Field"); 
//		  String Area = credList.get(11).get("Field"); 
//		  String Pincode = credList.get(12).get("Field");
//	 	  createJobpage.selectOEM();
//	 	  createJobpage.selectPRODUCT_NAME();
//	 	  createJobpage.selectenterModel_Name();
//		  createJobpage.enterIMEI_Number(IMEI_Number);
//		  createJobpage.Date_of_Purchase(Date_of_purchase);
//		  createJobpage.selectWatternty_status();
//		  createJobpage.select_Problem();
//		  createJobpage.Enter_remarks(Remarks);
//		  createJobpage.Enter_First_Name(First_Name);
//		  createJobpage.Enter_LastName(Last_Name);
//		  createJobpage.Enter_Contact_No(Contact_No);
//		  createJobpage.Enter_Email_id(Email_Id);
//		  createJobpage.Enter_ApartName(Apartment_Name);
//		  createJobpage.Enter_LandMark(Landmark);
//		  createJobpage.Enter_Area(Area);
//		  createJobpage.selectState();
//		  createJobpage.Enter_Pincode(Pincode);
//		  createJobpage.Enter_Street_Name(StreetName);	
//		  createJobpage.Enter_flat_no(FlatSocietyNo);
//	}
//
//	@Then(": User clicks on Submit button")
//	public void user_clicks_on_submit_button() throws InterruptedException {
//		Thread.sleep(5000);
//		createJobpage.Click_On_Submit();
//	}
//		
//	
//}
