package stepdefinations;

import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Assert;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashBoardPageSteps {

	FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
	private DashboardPage dashboardPage ;
	
	@Given("user has already logged in to the application")
	public void user_has_already_logged_in_to_the_application(DataTable dataTable) throws InterruptedException {
	   List<Map<String,String>> credList = dataTable.asMaps();
	  String username =  credList.get(0).get("username");
	  String password = credList.get(0).get("password");
	  
	  DriverFactory.getDriver().get("http://phoenix.testautomationacademy.in/sign-in");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  dashboardPage = frontDeskLoginPage.doLoginWith(username, password);
	}

	@Given("User is on dashbaord page")
	public void user_is_on_dashbaord_page() {
	 Assert.assertTrue(dashboardPage.VerifyForJobCreatedTodayField());
	}

	@Then("User gets the Nav options")
	public void user_gets_the_nav_options(DataTable NavSectionList) {
	   List<String> expAccountSectionList = NavSectionList.asList();
	   System.out.println("expected NavSectionList"+ expAccountSectionList);
	   List<String> actualAccountSectionList = dashboardPage.getAccountsSectionList();
	   System.out.println("actual NavSectionList"+actualAccountSectionList);
	   Assert.assertTrue(expAccountSectionList.containsAll(actualAccountSectionList));
			   
		
		
	}

	@Then("Nav sections count should be {int}")
	public void accounts_sections_count_should_be(Integer expectedCount) {
	   Assert.assertTrue(dashboardPage.getNavSectionCount()== expectedCount);
	}
	
	@Then("User Goes on Create Job Page")
	public void user_goes_on_create_job_page() throws InterruptedException {
	   dashboardPage.userClicksOnCreateJob();
	}
	
}
