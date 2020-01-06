package Selenium.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class textparsing {

	WebDriver driver;

	public String insertdata() throws IOException {

		String filename = "C:/Users/jgupta/Desktop/Automationdata/testdata.txt";
		File file = new File(filename);
		FileReader filereader = null;

		try {
			filereader = new FileReader(file);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader bufferreader = new BufferedReader(filereader);
		String lineText = null;
		
		try {
			while ((lineText = bufferreader.readLine()) != null) {
				driver.get(lineText);
				System.out.println(driver.getTitle());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();

		try {
			bufferreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			filereader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineText;
	}
}
