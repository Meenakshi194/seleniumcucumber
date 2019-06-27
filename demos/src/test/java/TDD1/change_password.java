package TDD1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class change_password {
	
	@Given("User enters password {string}")
	public void user_enters_password(String string) {
	    System.out.println(string);
	}

	@When("User re-enters password {string}")
	public void user_re_enters_password(String string) {
		System.out.println(string);
	}

	@Then("password changed")
	public void password_changed() {
		System.out.println("changed");
	}


}
