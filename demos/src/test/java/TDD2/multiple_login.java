package TDD2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multiple_login{
	@Given("Enters username {string}")
	 void enters_username(String string) {
	   System.out.println("username:"+string);
	}

	@When("Enters password {string}")
	 void enters_password(String string) {
	    System.out.println("pasword:"+string);
	}

	@Then("Displays homepage")
	 void displays_homepage() {
	    System.out.println("home page displayed");
	}


}
