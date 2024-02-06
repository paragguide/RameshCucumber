package testcases;

import org.junit.Assert;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUid extends Hook
{
	public static boolean flag = false;
	@Given("I want to open {string} and get url {string}")
	public void i_want_to_open_and_get_url(String browser, String url) throws Exception 
	{
		utility.Report.generateReport("AmazonUid");
	    openBrowser(browser,url);
	    utility.Report.test.log(LogStatus.PASS, "browser open..");
	}
	@Given("i click on signin link")
	public void i_click_on_signin_link() 
	{
	    signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String uid) 
	{
	    userid.sendKeys(uid);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    ctnbtn.click();
	}
	@Then("I get password textbox")
	public void i_get_password_textbox() 
	{
		 try {
	  System.out.println(  err1.getText() );
	  Assert.fail("userid is valid but not accepting");
	  utility.ScreenShot.takeScreenShot("uiderror");
		 }
		 catch(Exception e)
		 {
			 System.out.println("user id is valid..");
			 utility.Report.test.log(LogStatus.PASS, "uid is valid..");
			 flag = true;
		 }
	}
	@Then("does not get error")
	public void does_not_get_error() 
	{ 
		try {
			  System.out.println(  err1.getText() );
				 }
				 catch(Exception e)
				 {
					 flag = true;
				 }
	    utility.Report.closeReport();
	}

}
