package bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Driverrs {

	WebDriver driver;

	@Parameters({ "browser" })
	public void chrome() {
		System.setProperty("wedriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();
	}

	public WebDriver gerdriverinstance() {
		return driver;
	}

	public void test(String str) {
		driver.get(str);
		driver.manage().window().maximize();
	}
}
