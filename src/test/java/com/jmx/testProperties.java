package com.jmx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class testProperties {
	private static Properties prop;
	
	public static void readProperty(){
		try {
//			String filePath = System.getProperty("C:/Usrs/jgupta/Desktop/MCproperty.properties");
			String filePath = System.getProperty("user.dir")+"\\Resources\\MCproperty.properties";
			FileReader fr = new FileReader(new File(filePath));
			
			prop = new Properties();
			
			prop.load(fr);
			
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String propertyname){
		return prop.getProperty(propertyname);
	}
}
