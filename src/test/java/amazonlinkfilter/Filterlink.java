package amazonlinkfilter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Chrome.chrome;

public class Filterlink {
		
		
		chrome ch;
		WebDriver driver;
		
		@BeforeTest
		public void launch()
		
		{
			ch = new chrome();
			driver = ch.getDriverINstance();
			ch.test("https://www.amazon.in/");
		}
		
		@Test
		public void linkfilter()
		{
			List<WebElement> list = driver.findElements(By.tagName("a"));
			
			for(WebElement link : list)
			{
//				System.out.println(link.getText());
				System.out.println(link.getText());
			}
		}
		@AfterTest
		public void terminate()
		{
			driver.quit();
		}
		

	}


