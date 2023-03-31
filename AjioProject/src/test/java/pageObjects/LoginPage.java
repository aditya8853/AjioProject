package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	
	LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By men=By.xpath("//a[@title='MEN']");
	private By Womenen=By.cssSelector("a[title='WOMEN']");
	private By kids=By.cssSelector("a[title='KIDS']");
	private By Indie=By.cssSelector("a[title='INDIE']");
	private By Home_And_Kitchen=By.cssSelector("a[title='HOME AND KITCHEN']");
	private By Search=By.cssSelector("input[placeholder='Search AJIO']");
	private By Bag=By.cssSelector(".ic-cart");
	private By SignInBtn=By.xpath("(//a[@href='/selfcare'])[1]");
	
	
	
}
