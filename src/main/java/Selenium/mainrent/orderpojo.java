package Selenium.mainrent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderpojo {

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement search;

	@FindBy(className = "vh79eN")
	WebElement click_search;

	WebDriver driver;

	// public orderpojo(WebDriver driver){
	// this.driver = driver;
	// PageFactory.initElements(driver, orderpojo.class);
	// }

	public void getsearch(String str) {
		search.sendKeys(str);
	}

	public void getclick_search() {
		click_search.click();
	}
}
