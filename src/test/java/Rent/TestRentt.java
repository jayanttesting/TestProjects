package Rent;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.velements;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Chrome.chrome;
import Selenium.mainrent.orderpojo;
import junit.framework.Assert;

public class TestRentt {
	public static WebDriver driver;
	orderpojo order;
	ExtentReports extent;
	ExtentTest test;
	velements objelements;

	@BeforeSuite
	public void launchbrowser() {
		chrome ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("https://www.flipkart.com/");
	}

	@BeforeTest
	public void createreport() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/bhmTestreport.html", true);
		extent.addSystemInfo("HostName", "Jayant").addSystemInfo("Enviroment", "QA").addSystemInfo("username", "soti");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/Resources/extent-config.xml"));

	}

	@Test(priority = 0)
	public void orderproduct() throws InterruptedException {
		objelements = PageFactory.initElements(driver, velements.class);
		order = PageFactory.initElements(driver, orderpojo.class);
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		objelements.popupclose();
		Thread.sleep(3000);
		order.getsearch("iphone");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='_1va75j']//a"));
		options.get(1).click();
		order.getclick_search();

		test = extent.startTest("Flip Test Started");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "test case has been PASSED");
		System.out.println("report sent");
	}

	private List<WebElement> Flipfilter(List<WebElement> alllinks) {

		Iterator<WebElement> iterate = alllinks.iterator();
		if (iterate.next().getAttribute("href").contains("Flipkart")) {
			System.out.println(iterate);
			Flipfilter(alllinks);
		}
		return alllinks;

	}

	@Test(priority = 1)
	public void ieratelinks() {
		List<WebElement> Fliplist = driver.findElements(By.xpath("//a"));
		System.out.println(Fliplist.size());

		List<WebElement> list = Flipfilter(Fliplist);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String url = list.get(i).getAttribute("href");
			System.out.println(url);
		}
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}

	@AfterTest
	public void endreport() {
		extent.flush();
		extent.close();
	}

	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
