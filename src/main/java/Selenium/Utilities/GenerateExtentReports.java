package Selenium.Utilities;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReports {
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void createreport() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/Myreports.html", true);
		extent.addSystemInfo("HostName", "Jayant").addSystemInfo("Enviroment", "QA").addSystemInfo("username", "soti");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/Resources/extent-config.xml"));

	}

	@Test
	public void demoreportpass() {
		test = extent.startTest("Test started For Level 1");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert Pass as condition is true");

	}

	@Test
	public void demoreportfail() {
		test = extent.startTest("test started for level 2");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert Pass as condition is false");
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

}
