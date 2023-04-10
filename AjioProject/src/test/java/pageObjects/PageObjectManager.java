package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LoginPage loginpage;
	public FootwearPage1 footwearpage;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage getLoginPage()
	{
		loginpage=new LoginPage(driver);
		return loginpage;
	}
	
	public FootwearPage1 getFootwearPage()
	{
		footwearpage=new FootwearPage1(driver);
		return footwearpage;
	}
	
}
