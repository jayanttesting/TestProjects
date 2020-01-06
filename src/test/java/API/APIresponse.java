package API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class APIresponse {

	
	@Test
	public void restassured()
	{
		RestAssured.baseURI = "https://qa2012r2-tk.inqa.soti.net/MobiControl/oauth/logon";
		RequestSpecification https =RestAssured.given();
		io.restassured.response.Response response = https.get("/username");
		response.getBody();
		
	}
	}
