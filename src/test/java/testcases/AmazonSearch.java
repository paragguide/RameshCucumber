package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch 
{
	public static boolean var = false;
	@Given("i am logged in")
	public void i_am_logged_in() 
	{
	    if(AmazonPassword.login == true)
	    {
	    	var = true;
	    }
	}
	@When("^i search product (.*) in price (.*)")
	public void i_search_product_in_price(String product, int price) 
	{
		Hook.searchbox.clear();
	   Hook.searchbox.sendKeys(product+" in range "+price);
	   Actions a = new Actions(Hook.driver);
	   a.sendKeys(Keys.ENTER).perform();
	}
	@Then("i get results")
	public void i_get_results() 
	{
	    
	}



}
