package com.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class velements {

	// public WebDriver driver = null;

	// Locators
	// By searchfilter = By.xpath("//input[@type='text' and @name='q']");
	// By searchbutton = By.xpath("//button[@type='submit' and
	// @class='vh79eN']");
	// By iphone7_rosegold = By.xpath("//div[@class='_3wU53n']");
	// By Addtocart = By.xpath("//button[@class='_2AkmmA _1wk2G8 _2HNZdt
	// _7UHT_c']");

	@FindBy(name = "q")
	static WebElement framelocator;

	@FindBy(xpath = "//button[@type='submit' and @class='vh79eN']")
	WebElement searchbutton;

	@FindBy(className = "_3wU53n")
	WebElement iphone_rosegold;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement Addtocart;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement popup;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	static WebElement order;

	@FindBy(xpath = "//button[@class='vh79eN']")
	static WebElement button;

	@FindBy(xpath = "//input[@class='_2zrpKA _14H79F']")
	static WebElement email;

	@FindBy(xpath = "//button[@class='_2AkmmA _1poQZq _7UHT_c']")
	static WebElement continuebutton;
	// Method - search
	// public void searchbox(String str)
	// {
	// driver.findElement(searchfilter).sendKeys(str);
	// }

	// public void flipkart(WebDriver driver)
	// {
	// this.driver=driver;
	//
	//// PageFactory.initElements(driver, this.getClass());
	// }

	// Enter text in to searchfilter
	public static void entertext(String str) {
		framelocator.sendKeys(str);
	}

	public static void click_button() {
		button.click();
	}

	public void searchbutton() {
		searchbutton.click();
	}

	public void iphone() {
		iphone_rosegold.click();
	}

	public void cart() {
		Addtocart.click();
	}

	public void popupclose() {
		popup.click();
	}

	public static void placeorder() {
		order.click();
	}

	public static void enteremail(String str) {
		email.sendKeys();
	}

	public static void continueclick() {
		continuebutton.click();
	}

	//// Method - Google chrome
	//
	// public void launchchrome()
	// {
	// System.setProperty("webdriver.chrome.driver",
	//// System.getProperty("user.dir"+"//Resources//chromedriver.exe"));
	// driver = new ChromeDriver();
	// driver.navigate().to("https://www.flipkart.com/");
	// }
	// public WebDriver getinstance()
	// {
	// return driver;
	// }

}
