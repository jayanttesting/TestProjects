import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Chrome.chrome;
import Parsing.dataparsing;

public class Googleinput {

	WebDriver driver;
	chrome ch;

	@BeforeSuite
	public void launch_chrome() {
		ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("https://www.google.com/");
	}

	@Test
	public void googledata() {
		dataparsing parse = new dataparsing();
		String filename = "D:/testdata.txt";
		List<String> str = new ArrayList<>();
		try {
			str=parse.readusingfilereader(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<str.size();i++ ){
			driver.findElement(By.xpath("//input[@title='Search']")).clear();
			System.out.println(str.get(i));
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(str.get(i));
		}
		
		
		
		

		 
	}
}
