//package parallel;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import java.util.*;
//
//import org.junit.Assert;
//import org.openqa.selenium.interactions.Pause;
//
//import com.pages.EngineerDashBoardPage;
//import com.pages.FrontDeskLoginPage;
//import com.pages.GlobalList;
//import com.qa.factory.DriverFactory;
//public class EngineerDashBoardPageSteps {
//     GlobalList globalList ;
//	FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
//	private EngineerDashBoardPage engineerDashBoardPage ;
//	@Given("Engineer has already logged in to the application")
//	public void engineer_has_already_logged_in_to_the_application(DataTable dataTable) throws InterruptedException {
//	  List<Map<String,String>> credList = dataTable.asMaps();
//	  String username = credList.get(0).get("username");
//	  String password = credList.get(0).get("password");
//	  DriverFactory.getDriver().get("http://phoenix.testautomationacademy.in/sign-in");
//	  Thread.sleep(5000);
//	  
//	  engineerDashBoardPage  =  frontDeskLoginPage.doLoginWithengg(username, password);
////	  globalList =  engineerDashBoardPage.searchForIMEI_Number("122");
//	}
//
//	@Given(": Engineer is on DashBoard")
//	public void engineer_is_on_dash_board() {
//		 String element  =  engineerDashBoardPage.verifyForSearch();
//	     Assert.assertEquals("Job Nummber",element);
//	}
//
//	@Then(": Engineer Verifies for {string} Text on DashBoardPage")
//	public void engineer_verifies_for_text_on_dash_board_page(String string) {
//		String element =  engineerDashBoardPage.verifyForPendingForRepairText(string);
//	 Assert.assertEquals(string, element);
//	}
//    
//	@When(": engineer verifies for repair job option")
//	public void engineer_verifies_for_repair_job_option() throws InterruptedException {
//	  String element  =  engineerDashBoardPage.verifyRepairjob();
//	   Assert.assertEquals("Repair Job", element);
//	}
//	
//	@When(": engineer clicks on pending for Pending for repair")
//	public void engineer_clicks_on_pending_for_pending_for_repair() throws InterruptedException {
////		String element  = engineerDashBoardPage.GetbuttonpforR();
////		Assert.assertEquals("5",element);
//	    engineerDashBoardPage.clickOnPendingForRepair();
//	}
//	
//	@Then(": Engineer clicks on Repair job menu option")
//	public void engineer_clicks_on_repair_job_menu_option() throws InterruptedException {
//	   engineerDashBoardPage.clickOnRepairJob();
//	   Thread.sleep(5000);
//	}
//	
//	@Then("Engineer Begins to repair")
//	public void engineer_begins_to_repair() {
//	  engineerDashBoardPage.EngineerClickOnBeginToRepair();
//	}
//	
//	@Then(": Engineer searches for the {string} to begin repair")
//	public void engineer_searches_for_the_to_begin_repair(String string) throws InterruptedException {
//		engineerDashBoardPage.searchForIMEI_Number(string);
//		Thread.sleep(5000);   
//	}
//	
//	@Then(": Engineer gets data of device")
//	public void engineer_gets_data_of_device() throws InterruptedException {
////	  System.out.println(globalList.getJobDetails());  
//	}
//	
//	
//}
