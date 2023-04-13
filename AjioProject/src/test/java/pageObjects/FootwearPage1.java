package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootwearPage1 {

	public WebDriver driver;
	public FootwearPage1(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Footwear']") 
	private WebElement footwear;
	
	public WebElement FootWear() 
	{
		 return footwear;
	}
	
	@FindBy(xpath="//span[text()='gender']")
	private WebElement gender;
	
	public WebElement Gender() 
	{
		return gender;
	}
	
	@FindBy(css="label[for='Men']")
	private WebElement men;
	
	public WebElement Men() 
	{
		return men;
	}
	
	@FindBy(css="label[for='Women']")
	private WebElement women;
	
	public WebElement Women() 
	{
		return women;
	}
	
	@FindBy(xpath="//span[text()='category']")
	private WebElement category;
	
	public WebElement Category()
	{
		return category;
	}
	
	@FindBy(css="[class$='Sneakers & Sports Shoes']")
	private WebElement sneakersports;
	
	public WebElement Sneakers_SportShoes()
	{
		return sneakersports;
	}
	
	@FindBy(css="[class$='Casual Shoes']")
	private WebElement casualshoes;
	
	public WebElement CasualShoes()
	{
		return casualshoes;
	}
	
	@FindBy(css="[class$='Formal Shoes']")
	private WebElement formalshoes;
	
	public WebElement FormalShoes()
	{
		return formalshoes;
	}
	
	@FindBy(css="[class$='Slippers']")
	private WebElement flipflopsleeper;
	
	public WebElement Sleepers() 
	{
		return flipflopsleeper;
	}
	
	@FindBy(css="[class$='Sandals']")
	private WebElement sandals;
	
	public WebElement Sandals() 
	{
		return sandals;
	}
	
	@FindBy(xpath="(//div[text()='MORE'])[1]") //tag#id=div#verticalsizegroupformat
	private WebElement moreCategory;
	
	public WebElement MoreCategory()
	{
		return moreCategory;
	}
	
	@FindBy(xpath="//span[text()='price']")
	private WebElement price;
	
	public WebElement Price()
	{
		return price;
	}
	
	
	@FindBy(css="[class$='Rs.500']")
	private WebElement below500;
	
	public WebElement Below500()
	{
		return below500;
	}
	
	@FindBy(css="[class$='1000']")
	private WebElement bet500_1000;
	
	public WebElement Bet500_1000()
	{
		return bet500_1000;
	}
	
	@FindBy(css="[class$='Rs.1001-1500']")
	private WebElement bet1001_1500;
	
	public WebElement Bet1001_1500()
	{
		return bet1001_1500;
	}
	
	@FindBy(css="[class$='Rs.1501-2000']")
	private WebElement bet1501_2000;
	
	public WebElement Bet1501_2000()
	{
		return bet1501_2000;
	}
	
	@FindBy(css="[class$='Rs.2001-2500']")
	private WebElement bet2001_2500;
	
	public WebElement Bet2001_2500()
	{
		return bet2001_2500;
	}
	
	@FindBy(css="[placeholder^='Min']")
	private WebElement minprice;
	
	public WebElement MinPrice() 
	{
		return minprice;
	}
	
	@FindBy(css="[placeholder^='Max']")
	private WebElement maxprice;
	
	public WebElement MaxPrice()
	{
		return maxprice;
	}
	
	@FindBy(xpath="//button[@class='rilrtl-button ic-toparw']")
	private WebElement submitprice;
	
	public WebElement SubmitPrice()
	{
		return submitprice;
	}
	
	@FindBy(xpath="//span[text()='brands']")
	private WebElement brands;
	
	public WebElement Brands()
	{
		return brands;
	}
	
	
	@FindBy(xpath="(//div[text()='MORE'])[2]")
	private WebElement moreBrands;
	
	public WebElement MoreBrands()
	{
		return moreBrands;
	}
	
	@FindBy(xpath="//span[text()='occasion']")
	private WebElement occasion;
	
	public WebElement Occasion()
	{
		return occasion;
	}
	
	@FindBy(css="[class$='Active']")
	private WebElement active;
	
	public WebElement Active()
	{
		return active;
	}
	
	@FindBy(css="[class$='Casual']")
	private WebElement casual;
	
	public WebElement Casual()
	{
		return casual;
	}
	
	@FindBy(css="[class$='Evening']")
	private WebElement evening;
	
	public WebElement Evening()
	{
		return evening;
	}
	
	@FindBy(xpath="(//div[text()='MORE'])[3]")
	private WebElement moreOccasion;
	
	public WebElement MoreOccasion()
	{
		return moreOccasion;
	}
	
	@FindBy(xpath="//span[text()='discount']")
	private WebElement discount;
	
	public WebElement Discount()
	{
		return discount;
	}
	
	@FindBy(css="[class$='0-20%']")
	private WebElement d0_20;
	
	public WebElement Discount0_20()
	{
		return d0_20;
	}
	
	@FindBy(css="[class$='21-30%']")
	private WebElement d21_30;
	
	public WebElement Discount21_30()
	{
		return d21_30 ;
	}
	
	@FindBy(css="[class$='31-40%']")
	private WebElement d31_40;
	
	public WebElement Discount31_40()
	{
		return d31_40;
	}
	
	@FindBy(css="[class$='41-50%']")
	private WebElement d41_50;
	
	public WebElement Discount41_50()
	{
		return d41_50;
	}
	
	@FindBy(css="[class$='51-80%']")
	private WebElement d51_80;
	
	public WebElement Discount51_80()
	{
		return d51_80;
	}
	
	@FindBy(xpath="(//div[text()='MORE'])[4]")
	private WebElement moreDiscount;
	
	public WebElement MoreDiscount()
	{
		return moreDiscount;
	}
	
	@FindBy(xpath="//span[text()='colors']")
	private WebElement colors;
	
	public WebElement Colors()
	{
		return colors;
	}
	
	
	
	@FindBy(xpath="(//div[text()='MORE'])[5]")
	private WebElement moreColors;
	
	public WebElement MoreColors()
	{
		return moreColors;
	}
	
	@FindBy(xpath="//span[text()='size & fit']")
	private WebElement size;
	
	public WebElement Size()
	{
		return size;
	}
	
	@FindBy(css="[class$='UK 7']")
	private WebElement uk7;
	
	public WebElement UK7()
	{
		return uk7;
	}
	
	@FindBy(css="[class$='UK 9']")
	private WebElement uk9;
	
	public WebElement UK9()
	{
		return uk9;
	}
	
	@FindBy(css="[class$='UK 8']")
	private WebElement uk8;
	
	public WebElement UK8()
	{
		return uk8;
	}
	
	@FindBy(css="[class$='UK 6']")
	private WebElement uk6;
	
	public WebElement UK6()
	{
		return uk6;
	}
	
	@FindBy(css="[class$='UK 10']")
	private WebElement uk10;
	
	public WebElement UK10()
	{
		return uk10;
	}
	
	@FindBy(xpath="(//div[text()='MORE'])[6]")
	private WebElement moreSize;
	
	public WebElement MoreSize()
	{
		return moreSize;
	}
	
	@FindBy(css="[class$='arwdwn']")
	private WebElement moreFilters;
	
	public WebElement MoreFilters()
	{
		return moreFilters;
	}
	
	@FindBy(css="[class$='length']")
	private WebElement itemsFound;
	
	public WebElement ItemsFound()
	{
		return itemsFound;
	}
	
	//
	
	@FindBy(css="[class^='three-grid-']")
	private WebElement threegridview;
	
	public WebElement ThreeGridView()
	{
		return threegridview;
	}
	
	@FindBy(css="[class^='five-grid-']")
	private WebElement fivegridview;
	
	public WebElement FiveGridView()
	{
		return fivegridview;
	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public WebElement ()
//	{
//		return ;
//	}
	
}
