package StepDefinition;

import io.cucumber.java.en.*;

public class LoginSetup 
{

	@Given("^user is on login page$")
	public void user_is_on_login_page() 
	{
		System.out.println("Inside code- User on login page");
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() 
	{
		System.out.println("Inside code- user enters username and password");

	}

	@And("^clicks on login page$")
	public void clicks_on_login_page() 
	{
		System.out.println("enters login button");

	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() 
	{
		System.out.println("Inside code- User navigated to home page");

	}


}
