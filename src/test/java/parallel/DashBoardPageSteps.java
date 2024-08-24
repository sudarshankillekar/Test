package parallel;

import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Assert;

import com.pages.DashboardPage;
import com.pages.FrontDeskLoginPage;
import com.pages.RepairJobPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
//	  repairJobPage = frontDeskLoginPage.doLoginWithengg(username, password) ;
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
	public void accounts_sections_count_should_be(Integer expectedCount) throws InterruptedException {
	   Assert.assertTrue(dashboardPage.getNavSectionCount()== expectedCount);
	}
	
	@When("user click on job created today")
	public void user_click_on_job_created_today() throws InterruptedException {
	   dashboardPage.clickOnJobCreatededToday();
	}
	
	@Then("search job number {string}")
	public void search_job_number(String jobNumber) {
	boolean status =   dashboardPage.searchForJob(jobNumber);
	System.out.println(status);
	}
	
	
	@Then("User Goes on Create Job Page")
	public void user_goes_on_create_job_page() throws InterruptedException {
	   dashboardPage.goToCreateJobPage();
	}
	
	
}
