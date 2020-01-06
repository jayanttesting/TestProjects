package Selenium.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class inputdata {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			File file = new File("");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileInputStream fileinput = null;
		
		Properties prop = new Properties();
		
		//load property file
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
