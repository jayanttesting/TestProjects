package Selenium.Utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parsing_Json {

	public String getwholejsondata() {

		String filepath = System.getProperty("user.dir") + "//Resources//Addrule.json";
		String jsonValue = null;
		byte[] jsondata = null;

		try {
			jsondata = Files.readAllBytes(Paths.get(filepath));

			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree(jsondata);
			jsonValue = rootNode.toString();
			System.out.println("data after Parsing JSON is ................" + rootNode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonValue;

	}
}
