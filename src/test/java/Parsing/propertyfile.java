package Parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Chrome.chrome;

public class propertyfile {

	public static void main(String[] args) {
		/*
		 * File file = new File(System.getProperty("user.dir") +
		 * "//Resources//dataFile.properties"); FileInputStream stream = null;
		 * 
		 * try { stream = new FileInputStream(file); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } Properties prop = new Properties(); try {
		 * prop.load(stream); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } WebDriver driver; chrome ch; ch =
		 * new chrome(); driver = ch.getDriverINstance();
		 * 
		 * driver.get(prop.getProperty("URL"));
		 * System.out.println("URL"+prop.getProperty("URL"));
		 * System.out.println("Username"+" "+ prop.getProperty("Username"));
		 * 
		 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys(prop.
		 * getProperty("username"));
		 */

		try (InputStream input = new FileInputStream(
				System.getProperty("user.dir") + "//Resources//dataFile.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			/*
			 * System.out.println(prop.getProperty("URL"));
			 * System.out.println(prop.getProperty("Username"));
			 * System.out.println(prop.getProperty("password"));
			 */

			// WebDriver driver;
			// chrome ch;
			// ch = new chrome();
			// driver = ch.getDriverINstance();

			// driver.get(prop.getProperty("URL"));
			// System.out.println("URL"+prop.getProperty("URL"));
			// System.out.println("Username"+" "+ prop.getProperty("Username"));
				
//			Map<String, String> hmap = new HashMap<String, String>();
//			for (Entry<Object, Object> entry : prop.entrySet()) {
//				hmap.put((String) entry.getKey(), (String) entry.getValue());
			
			Map<String, String> hmap = new HashMap<String,String>((Map)prop);
			Set<Map.Entry<String,String>>propset;
			propset = hmap.entrySet();
			for(Map.Entry<String, String> entry : propset)
			{
				System.out.println(entry.getKey());
			}
			
		}
			// driver.findElement(By.xpath("//input[@name='q']")).sendKeys(prop.getProperty("Username"));
 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
}


