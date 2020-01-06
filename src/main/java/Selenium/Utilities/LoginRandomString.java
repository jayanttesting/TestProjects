package Selenium.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.main.randomGoogleInput;

public class LoginRandomString {

	randomGoogleInput google = new randomGoogleInput();

	@BeforeMethod
	public void openbrowser() {
		WebDriver localdriver = randomGoogleInput.driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chrome\\chromedriver.exe");
		localdriver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.dr...................iver",
		// System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		localdriver.navigate().to("https://www.google.co.in/");
		localdriver.manage().window().maximize();
		localdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		randomGoogleInput.driver = localdriver;

	}		
	
	@Test
	public void testexecution() {
		 for (int i = 0; i <2; i++) {
		 System.out.println("random string: " +randomGoogleInput.randomAlphaNumeric(10));
		 try {
		 google.gethomepage();
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		
		 }
	}

	@AfterMethod
	public void teardown() {
		System.out.println("After method fired");

	}
}
