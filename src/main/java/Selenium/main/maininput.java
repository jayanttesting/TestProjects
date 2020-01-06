package Selenium.main;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Selenium.main.randomGoogleInput;
import Selenium.main.inputdata;

public class maininput {
	randomGoogleInput fill = new randomGoogleInput();
	inputdata id = new inputdata();
	Properties prop = new Properties();
	File file = new File("D:/data/file.txt");
	WebDriver localdriver = randomGoogleInput.driver;
	@BeforeMethod
	public void notedata() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chrome\\chromedriver.exe");
		localdriver = new ChromeDriver();
		localdriver.navigate().to("https://google.co.in");
		localdriver.manage().window().maximize();
	}
		
		@Test
		public void mainmethod()
		{
		fill.gethomepage();
//		localdriver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("email"));
		}
		@AfterMethod
		public void teardown() {
			System.out.println("After method fired");
	
}
	}
