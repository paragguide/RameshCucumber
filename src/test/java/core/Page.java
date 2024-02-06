package core;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Page 
{
	public static WebDriver driver = null;  // global
	
	public void openBrowser(String browser,String url) // define
	{
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		// driver.get(url); // not prefer - cannot go back / forward
		       // or
		driver.navigate().to(url); // prefer - can go back / forward 
		
		PageFactory.initElements(driver, this);  // external xpath
		 // implicit wait..
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
		 driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
