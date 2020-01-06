package Selenium.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class randomGoogleInput {

	public static WebDriver driver = null;
	// locators
	By signInLink = By.xpath("//input[@id='lst-ib' and @title='Search']");
	By googlesearch_tb = By.id("lst-ib");
	By email = By.id("identifierId");
	By googlesearch = By.xpath("//input[@value='Google Search']");
	By framelocator = By.xpath("//input[@name='username']");

	// Methods
	public void gethomepage() {
		for (int i = 0; i < 10; i++) {
			
//			WebElement element = Login.driver.findElement(googlesearch_tb);
			driver.findElement(googlesearch_tb).sendKeys(randomAlphaNumeric(10));
			driver.findElement(googlesearch).click();
			driver.navigate().back();

		}

		// random string
	}
public void click_frameLocator(){
driver.findElement(framelocator).click();
}
	
	private static final String ALPHA_NUMERIC_STRING = "BCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	public void getdata() {
		randomGoogleInput.driver.findElement(signInLink).click();
		randomGoogleInput.driver.findElement(googlesearch).click();

	}

}
