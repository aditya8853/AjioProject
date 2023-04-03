package utils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pgx;
	public TestBase tb;
	public Properties prop;
	
	
	public TestContextSetup() throws IOException
	{
		tb=new TestBase();
		driver=tb.webDriverManager();
		prop=tb.prop;
		pgx=new PageObjectManager(driver);
		
	}
	
}
