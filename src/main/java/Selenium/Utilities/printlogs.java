package Selenium.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class printlogs {

	WebDriver driver;

	private static Logger log;
	{
		log = Logger.getLogger(printlogs.class);
		try {
			PropertyConfigurator.configure(
					new FileInputStream(new File(System.getProperty("user.dir") + "//Log4j//log4j.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	private void handlelist() {
		GenerateExtentReports myreport = new GenerateExtentReports();
		myreport.createreport();
		chrome ch = new chrome();
		ch.getDriverINstance();
		

		LoggerClass.info("chrome iitialized");
	}

	private List<WebElement> recursivefilter(List<WebElement> allLinks) {

		Iterator<WebElement> iteratelist = allLinks.iterator();
		iteratelist.remove();
		recursivefilter(allLinks);
		return allLinks;

	}

	@Test
	public void hyperlink() {
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		System.out.println(list.size());

		List<WebElement> list1 = recursivefilter(list);
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			String URL = list.get(i).getAttribute("href");
			System.out.println(URL);
		}

	}
}
