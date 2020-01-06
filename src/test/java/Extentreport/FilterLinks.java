package Extentreport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FilterLinks {
	private static WebDriver driver;

	private static Logger log;
	static {
		log = Logger.getLogger(FilterLinks.class);
		try {
			PropertyConfigurator.configure(
					new FileInputStream(new File(System.getProperty("user.dir") + "//Log4j//log4j.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);

		extent.addSystemInfo("Host Name", "SoftwareTestingMaterial").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Jayant");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/extent.config.xml"));
	}

	@Test(priority = 1)
	public void handlewindow() {
		chrome ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("");
		log.info("test 1 - Browser Inititalized");
		String ActualTitle = "gmail";
		Assert.assertEquals(driver.getTitle(), ActualTitle);
		test = extent.startTest("dropdownlist");
		test.log(LogStatus.PASS, "Test completed successfully");

	}

	private List<WebElement> recursiveFilter(List<WebElement> allLinks) {
		Iterator<WebElement> listIte = allLinks.iterator();
		if (!(listIte.next().getAttribute("href").contains("makemytrip"))) {
			listIte.remove();
			recursiveFilter(allLinks);
		}

		return allLinks;
	}

	@Test(priority = 2)
	public void hyperlink() {
		List<WebElement> lr = driver.findElements(By.xpath("//a"));
		System.out.println(lr.size());

		List<WebElement> list = recursiveFilter(lr);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String url = list.get(i).getAttribute("href");
			System.out.println(url);

		}

	}

	@AfterSuite
	public void terminate() {
		driver.close();
	}
}
