package Selenium.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class csvparsing {

	@Test
	public void csvreader() {
		System.out.println(getData(2, "username"));
		System.out.println(getData(1, "username"));
		System.out.println(getData(1, "password"));
	}

	/**
	 * 
	 * @return
	 */
	private List<Map<String, String>> returnData() {
		List<Map<String, String>> resultData = new ArrayList<Map<String, String>>();
		try {

			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(
					new java.io.FileReader(new File(System.getProperty("user.dir") + "//Resources//datap.csv")));
			String line = null;
			String[] header = br.readLine().split(",");

			while ((line = br.readLine()) != null) {
				Map<String, String> map = new LinkedHashMap<String, String>();
				String[] dataRowArray = line.split(",");
				for (int i = 0; i < header.length; i++) {
					map.put(header[i], dataRowArray[i]);
				}
				resultData.add(map);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultData;
	}

	/**
	 * 
	 * @param rowNumber
	 * @param columnName
	 * @return
	 */
	private String getData(int rowNumber, String columnName) {
		List<Map<String, String>> dataList = returnData();

		return dataList.get(rowNumber - 1).get(columnName.toLowerCase());
	}
}
