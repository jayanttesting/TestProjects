package API;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;

import Selenium.Utilities.Parsing_Json;
import Selenium.Utilities.jsonparsing_keyvalue;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class httppost {
	jsonparsing_keyvalue parsing = new jsonparsing_keyvalue();
	Parsing_Json parsingj = new Parsing_Json();

	public void httppost1() throws Exception {
//		HostnameVerifier allHostsValid = new HostNameVerifier().SSlCerts();
//		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
//		
		BasicLogin_MC base = new BasicLogin_MC();
		String mycookie = base.login();
		String url = "https://qa2012r2-jg1.inqa.soti.net/MobiControl";
		System.out.println(mycookie);
		//base.getHttpUrlConnection(url, mycookie);
		HttpURLConnection conn = new BasicLogin_MC().getHttpUrlConnection(url,mycookie);
		BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));

		out2.write(parsingj.getwholejsondata());
		out2.close();
//
//		JsonObject login = new JsonObject();
//		
//
//		login.addProperty("usename", "administrator");
//		login.addProperty("password", "1");

		RestAssured.baseURI  = url;
		RequestSpecification spec = RestAssured.given();
		spec.body(parsingj.getwholejsondata());

		Response response = spec.post("/Rule/Add");

		String auth = response.getHeader("Authorization");
		int statuscode = response.getStatusCode();

		System.out.println(auth);
		System.out.println(response);
		System.out.println(statuscode);

	}

	public static void main(String[] args) throws Exception {
		httppost ht = new httppost();
		ht.httppost1();
	}
}
