package stepdefinations;

import org.junit.Assert;

import com.pages.FrontDeskLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontDeskLoginSteps {
    
	private static String pageTitle  ;
	
    FrontDeskLoginPage frontDeskLoginPage = new FrontDeskLoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  DriverFactory.getDriver().get("http://phoenix.testautomationacademy.in/sign-in");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
       pageTitle = frontDeskLoginPage.getPageTitle();
       System.out.println("this is the page title"+pageTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String givenPageTitle) {
	 Assert.assertTrue(pageTitle.contains(givenPageTitle));
	}

	@Then("User verifies for username and password text")
	public void user_verifies_for_username_and_password_text() {
	   Assert.assertTrue(frontDeskLoginPage.verifyVisibleTextPassword()); 
	   Assert.assertTrue( frontDeskLoginPage.verifyVisibleTextUserName());
	}

	@Then("User checks validate Sign-in button")
	public void user_checks_SignIn_button() {
	    Assert.assertTrue(frontDeskLoginPage.verifyVisibleTextSignIn()); 
	}

	@When("User enters username {string}")
	public void user_enters_username(String Username) {
	   frontDeskLoginPage.enterUserName(Username);
	}

	@When("User enter password {string}")
	public void user_enter_password(String password) {
       frontDeskLoginPage.enterpasword(password);   
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
	  frontDeskLoginPage.clickOnSignInButton();
	}
    
 
}
