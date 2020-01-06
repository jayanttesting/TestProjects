import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Chrome.chrome;
import Selenium.Utilities.GenerateExtentReports;

public class ImplementArray {
	Logger log;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;

	@Test
	public void arrayimplementation() {
		GenerateExtentReports report = new GenerateExtentReports();
		report.createreport();

		extent.startTest("MyTest");
		ArrayClass AC = new ArrayClass();
		AC.getarray();
		log = Logger.getLogger(ImplementArray.class);

		// Initialize chrome
		chrome ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("https://www.google.com/?gws_rd=ssl");
		String title = driver.getTitle();

		Assert.assertTrue(title.contains("Google"));
		log.info("Array Initilaised");
		log.info("message Added");

		// generate Extent reports

	}
}
