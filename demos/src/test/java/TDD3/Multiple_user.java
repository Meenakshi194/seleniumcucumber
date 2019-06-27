package TDD3;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiple_user {
	
	
	@Given("I want to create account")
	public void i_want_to_create_account() {
	    System.out.println("to create account");
	}

	@When("i want to enter credentials")
	public void i_want_to_enter_credentials(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> list= dataTable.asMaps(String.class,String.class);
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).get("username"));
		   System.out.println(list.get(i).get("password"));
	   }
	}

	@Then("account should be created")
	public void account_should_be_created() {
	  System.out.println("account created");
	}




}
