package parallel;

import com.pages.RepairJobPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RepairJobSteps {
    
	RepairJobPage repairJobPage;
	
	
	@Given("Engineer is on repair job page")
	public void engineer_is_on_repair_job_page() {
	    repairJobPage.verifyrepairJob();
	}

	@Then("Engineer clicks on Repair job")
	public void engineer_clicks_on_create_job() throws InterruptedException {
		Thread.sleep(5000);	   
		repairJobPage.ClickOnRepairJob();
	}
	
	
	
}
