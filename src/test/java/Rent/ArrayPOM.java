package Rent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArrayPOM {

	WebDriver driver;
	@FindBy(xpath = "//label[@for='toCity']")
	WebElement tocity;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement options;
	
	@FindBy(id="webklipper-publisher-widget-container-notification-close-div")
	WebElement popup;

	public void clicktocity() {

		if (tocity != null) {
			tocity.click();
		} else {
			System.out.println("OOps... your city is null");
		}
	}

	public void getoptions(String str) {
		options.sendKeys(str);
	}
//	public void closepopup()
//	{
//		popup.click();
//	}

}
