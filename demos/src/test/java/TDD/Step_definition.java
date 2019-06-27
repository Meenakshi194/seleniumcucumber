package TDD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition {
	@Given("User enters username")
	public void user_enters_username() {
	    System.out.println("enters username");
	}

	@When("User enters password")
	public void user_enters_password() {
	   System.out.println("enters password");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		 System.out.println("login is clicked");
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		 System.out.println("home page displayed");
	}

	@When("User enters incorrect password")
	public void user_enters_incorrect_password() {
	    System.out.println("incorrect password");
	}

	@Then("error message is displayed")
	public void error_message_is_displayed() {
	   System.out.println("error message");
	}
	@Given("click on logout link")
	public void click_on_logout_link() {
		System.out.println("logout link clicked");
	}

	@Then("user logged out")
	public void user_logged_out() {
		System.out.println("logged out");
	}






}
