package cucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

@CucumberOptions(features="src\\test\\java\\features", glue="stepDefinations", monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests
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
