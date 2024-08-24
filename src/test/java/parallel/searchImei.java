package parallel;

import com.pages.EngineerDashBoardPage;
import com.pages.FrontDeskLoginPage;
import com.pages.GlobalList;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class searchImei {
//	 FrontDeskLoginPage frontDeskLoginPage;
	  GlobalList globalList ;
//	  FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
//		private EngineerDashBoardPage engineerDashBoardPage ;
	  
	  
	FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver()); 
	public void useron () {
//	       FrontDeskLoginPage.
	}
	
	@Then(": user seacrhes for device details")
	public void user_seacrhes_for_device_details() throws InterruptedException {
		System.out.println(globalList.getJobDetails());  
	}
	
	
}
