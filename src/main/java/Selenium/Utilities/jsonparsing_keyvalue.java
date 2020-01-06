package Selenium.Utilities;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonparsing_keyvalue {

	public String getjsondata(String key) {
		String filepath = System.getProperty("user.dir") + "//Resources//Addrule.json";
		byte[] jsonData = null;
		JsonNode keyVal = null;
		try {
			jsonData = Files.readAllBytes(Paths.get(filepath));

			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree(jsonData);

			System.out.println("Root node is **********************************" + rootNode);
			keyVal = rootNode.path("Rule").path("RuleId");
			System.out.println("Keyval:" + keyVal);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return keyVal.asText();

	}

	public String getRandomUsernameFromJson() {
		return generex.randomiser(getjsondata("username"));

	}

}
