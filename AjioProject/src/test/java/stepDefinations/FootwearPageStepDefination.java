package stepDefinations;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FootwearPage1;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class FootwearPageStepDefination 
{
	public TestContextSetup testContextSetup;
	
	public FootwearPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Given("^User is on Footwear page$")
	public void user_is_on_footwear_page() throws IOException
	{
		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//testContextSetup.tb.webDriverManager();
		testContextSetup.driver.get(testContextSetup.prop.getProperty("url"));
		testContextSetup.driver.manage().window().maximize();
		LoginPage loginPage=testContextSetup.pgx.getLoginPage();
		FootwearPage1 footwearPage=testContextSetup.pgx.getFootwearPage();
		
		Actions act=new Actions(testContextSetup.driver);
		// loginPage.menSection().click();
		
		act.moveToElement(loginPage.menSection()).build().perform();;
		footwearPage.FootWear().click();
	}
	
	@When("^User Selects the Gender Men, Category Formal and & One Brand$")
	public void user_selects_the_gender_men_category_formal_and_one_brand()
	{ 
		
		
	}

	@Then("^Verify all shoes are displayed are of Selected Brand$")
	public void verify_all_shoes_are_displayed_are_of_selected_brand()
	{
		
	}
	
	
	 @When("^User Select Gender Men and Category as Sports$")
	 public void user_select_gender_men_and_category_as_sports()
	 {
	    
	 }

	 @Then("^Verify the sizes are mentioned in Ascending order$")
	 public void verify_the_sizes_are_mentioned_in_ascending_order() 
	 {
		 
	 }

	 @And("^Select Size Chart for particular shoes$")
	 public void select_size_chart_for_particular_shoes()
	 {
		 
	 }
	

}
