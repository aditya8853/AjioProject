package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class TestNGRunner 
{
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		LoginPage lp=new LoginPage(driver);
		
		driver.get("https://www.ajio.com/");
		
		lp.SignInBtn().click();
		
	}

}
