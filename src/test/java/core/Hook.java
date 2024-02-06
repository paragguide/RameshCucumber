package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
	public void openBrowser(String browser,String url)
	{
		super.openBrowser(browser, url);
	}
	 // login
  @FindBy(xpath = externalxpath.AmazonProjectXpath.signin)
  public static WebElement signin;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.userid)
  public static WebElement userid;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.ctnbtn)
  public static WebElement ctnbtn;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.password)
  public static WebElement password;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.submit)
  public static WebElement submit;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.err1)
  public static WebElement err1;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.err2)
  public static WebElement err2;
  
  // shop
  @FindBy(xpath = externalxpath.AmazonProjectXpath.searchbox)
  public static WebElement searchbox;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.product)
  public static WebElement product;
  
  @FindBy(xpath = externalxpath.AmazonProjectXpath.addtokart)
  public static WebElement addtokart;
  
}
