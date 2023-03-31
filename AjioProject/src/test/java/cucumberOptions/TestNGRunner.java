package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class TestNGRunner 
{
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		LoginPage lg=new LoginPage(driver);
		
		lg.SignInBtn().click();
		
	}

}
