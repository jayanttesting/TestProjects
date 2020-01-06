import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Extentreport.FilterLinks;
import Selenium.Utilities.LoggerClass;

public class printlogs {

	static // initializing Logs
	WebDriver driver;

	@SuppressWarnings("unused")
	private static Logger log;
	{

		log = Logger.getLogger(FilterLinks.class);

		try {
			PropertyConfigurator.configure(
					new FileInputStream(new File(System.getProperty("user.dir") + "//Log4j//log4j.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void makelist() {

		chrome ch = new chrome();
		ch.getDriverINstance();
		ch.test("");
		LoggerClass.info("chrome initialized part 1");

		String ActualTitle = "makemytrip.com";
		Assert.assertEquals(driver.getTitle(), ActualTitle);
		LoggerClass.info("This is my title :");

	}

	@SuppressWarnings("unused")
	private List<WebElement> recursivefilter(List<WebElement> allLinks) {
		Iterator<WebElement> listite = allLinks.iterator();
		if (listite.next().getAttribute("href").contains("makemytrip")) {
			listite.remove();
			recursivefilter(allLinks);
			System.out.println(allLinks);
		}
		return allLinks;

	}

}
