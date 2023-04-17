package cucumberOptions;

//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import pageObjects.LoginPage;

@CucumberOptions(features="src\\test\\java\\features", glue="stepDefinations", monochrome=true,tags="@tag1")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
//	public static void main(String[] args)
//	{
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(op);
//		LoginPage lp=new LoginPage(driver);
//		
//		driver.get("https://www.ajio.com/");
		
		
		//lp.SignInBtn().click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@target='_self'])[10]")));
//		driver.findElement(By.xpath("(//a[@target='_self'])[10]")).click();
		//alternate solution
//		wait.until(ExpectedConditions. invisibilityOfElementLocated(By.id("overlay element id")));
//		//fix with JavaScript executor
//		WebElement m = driver.findElement(By.xpath("(//a[@target='_self'])[10]"));
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		
//		jse.executeScript("arguments[0].click();", m);
		
//}

}
