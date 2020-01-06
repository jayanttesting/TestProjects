package Parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class csvparsing {

	
	public void csvread()
	{
		System.out.println(getdata(2, "username"));
	}
	
	private List<Map<String,String>> returndata()
	{
	List<Map<String, String>> returnresult = new ArrayList<Map<String,String>>(); 
	try
	{
	@SuppressWarnings("resource")
	BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+"//Resources//datap.scv")));
		String line = null;
		String [] header = reader.readLine().split(",");
			while ((line = reader.readLine()) != null)
			{
				Map<String, String> map = new LinkedHashMap<String, String>();
				String[] datarow = line.split(",");
			for(int i=0;i<header.length;i++)
			{
				map.put(header[i], datarow[i]);
			}
			returnresult.add(map);
			
			
			
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnresult;
	}
	private String getdata(int rownumber,String columnname)
	{
		List<Map<String, String>> datalist = returndata();
		return datalist.get(rownumber - 1).get(columnname.toLowerCase());
		
	}
}
	
