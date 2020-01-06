package Selenium.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class chrome {

	WebDriver driver;
@Parameters({"browser"})
	public chrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	public WebDriver getDriverINstance() {
		return driver;
	}

	 public void test(String str) throws InterruptedException{
		 driver.get(str);
		 Thread.sleep(10000);
		 driver.manage().window().maximize();
	 }
}
