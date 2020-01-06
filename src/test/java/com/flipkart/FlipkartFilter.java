package com.flipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlipkartFilter {
	velements objelements;

	WebDriver driver;
	WebDriverWait wait;
	chrome ch;
	Logger Log = Logger.getLogger(FlipkartFilter.class.getName());

	@BeforeSuite
	public void setup() {
		ch = new chrome();
		driver = ch.getDriverINstance();
	}

	@Test(priority = 0)
	public void testcase_flipkart() {
		ch.test("https://www.flipkart.com/");

		// Print Logs

		Log.info("Test is starting");
	}

	@Test
	public void testfilter() {
		objelements = PageFactory.initElements(driver, velements.class);
		objelements.popupclose();
		Log.info("Pop is closed");

		// print logs

		velements.entertext("Apple iPhone X");
		Log.info("Input is ipho");
		velements.click_button();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("((//div[contains(text(),'iPhone')])[4]//parent::div)[1]/../..")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		// System.out.println("Size of Autosuggest box is" + options.size());
		// Log.info("print the size of elemnts in textbox");
		// for (WebElement a : options) {
		// System.out.println("values are:" + a.getText());
		// }
		Log.info("printing text in textbox");

		System.out.println(driver.getWindowHandles());
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		velements.placeorder();
		velements.enteremail("jayant.gupta93@ymail.com");
		velements.continueclick();
		// Logs

		// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		// options.get(4).click();
		//
		// objelements.iphone();
		// ArrayList<String> tab1 = new
		// ArrayList<String>(driver.getWindowHandles());
		// driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		// driver.switchTo().window(tab1.get(4));
		// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		// objelements.cart();

	}

	// @AfterSuite
	// public void terminate() {
	// driver.quit();
}
