package parallel;

import com.pages.FrontDeskLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EngineerLoginPageSteps {

	 FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
	
	 
		@Given("Engineers is on login page")
		public void user_is_on_login_page() {
		  DriverFactory.getDriver().get("http://phoenix.testautomationacademy.in/sign-in");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	 
	 @When("Engineer enters username {string}")
		public void engineer_enters_username(String Username) {
			frontDeskLoginPage.enterUserName(Username);
		}

		@When("Engineer enter password {string}")
		public void engineer_enter_password(String password) {
			frontDeskLoginPage.enterpasword(password);
		}

		@When("Engineer clicks on Login button")
		public void engineer_clicks_on_login_button() throws InterruptedException {
			Thread.sleep(5000);
			frontDeskLoginPage.clickOnSignInButton();
		}
	
}
