package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;
	
	LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[@title='MEN']")
	private WebElement mens; 
	public WebElement menSection()
	{
		return mens;
	}
	
	@FindBy(css="a[title='WOMEN']")
	private WebElement Womens;
	public WebElement WomensSection()
	{
		return Womens;
	}
	
	@FindBy(css="a[title='KIDS']")
	private WebElement Kids;
	public WebElement kids()
	{
		return Kids;
	}
	
	@FindBy(css="a[title='INDIE']")
	private WebElement Indie;
	public WebElement Indie()
	{
		return Indie;
	}
	
	@FindBy(css="a[title='HOME AND KITCHEN']")
	private WebElement Home_And_Kitchen;
	public WebElement Home_And_Kitchen()
	{
		return Home_And_Kitchen;
	}
	
	@FindBy(css="input[placeholder='Search AJIO']")
	private WebElement Search;
	public WebElement Search()
	{
		return Search;
	}
	
	@FindBy(css=".ic-cart")
	private WebElement Bag;
	public WebElement Bag()
	{
		return Bag;
	}
	
	@FindBy(xpath="(//a[@href='/selfcare'])[1]")
	private WebElement SignInBtn;
	public WebElement SignInBtn()
	{
		return SignInBtn;
	}
	
	
}
