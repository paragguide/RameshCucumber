package testcases;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPassword 
{
	public static boolean login = false;
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUid.flag == true)
	    {
	    	login = true;
	    }
	}
	@When("i enter correct password {string}")
	public void i_enter_correct_password(String pwd) 
	{
	    if(login == true)
	    {
	    	Hook.password.sendKeys(pwd);
	    	Hook.submit.click();
	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{
		 try {
	    Hook.err2.getText();
		 }
		 catch(Exception e)
		 {
			 login = true;
		 }
	}
}
