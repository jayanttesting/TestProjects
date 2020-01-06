import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


import Selenium.Utilities.GenerateExtentReports;
import Selenium.Utilities.regex;

public class usingregex {
	WebDriver driver;
	regex reg;
	static Logger log = Logger.getLogger(usingregex.class);

	@Test
	public void usingreg() throws InterruptedException {
		chrome ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("https://qa2012r2-sa3.inqa.soti.net/MobiControl/");

		log.info("Browser initialised");
		Thread.sleep(5000);
		regex reg = new regex();
		WebElement username = driver.findElement(By.id("userName"));
		for (int i = 0; i < 10; i++) {
			String str = reg.getrandomstring();
			username.sendKeys(str);
			System.out.println(str);
			username.clear();
		}
	}

	@SuppressWarnings("unused")
	private void report() {

		GenerateExtentReports rep = new GenerateExtentReports();
		rep.createreport();
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
