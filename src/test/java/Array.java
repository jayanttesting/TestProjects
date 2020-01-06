import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Chrome.chrome;
import Rent.ArrayPOM;

public class Array {
	WebDriver driver;
	// load make my trip and get options from dropdown menu
	chrome ch;

	@BeforeSuite
	public void setup() {
		ch = new chrome();
		driver = ch.getDriverINstance();
	}

	@Test
	public void mmt() throws InterruptedException {

		ch.test("https://www.makemytrip.com/");

		ArrayPOM pom = PageFactory.initElements(driver, ArrayPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.switchTo()
//				.frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-container")));
//		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
//		driver.switchTo().defaultContent();
		//driver.findElement(By.cssSelector("a.close")).click();
		try{
			driver.findElement(By.cssSelector("a.close")).click();
//			JavascriptExecutor jse  = (JavascriptExecutor)driver;
//			jse.executeScript("document.getElementById('webklipper-publisher-widget-container-notification-close-div').click();");
		}catch(Exception e){
			e.printStackTrace();
		}
		pom.clicktocity();

		pom.getoptions("udaipur");

	}

	// @Test
	// public void kill()
	// {
	// driver.close();
	// }

}
