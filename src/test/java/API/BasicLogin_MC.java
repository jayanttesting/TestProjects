package API;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

import APImain.HostNameVerifier;

public class BasicLogin_MC {
	public String cookie =null;
	public String userName = "administrator";
	public String password = "1";
	
	public static void main(String[] args) throws Exception {
		
		BasicLogin_MC loginMC = new BasicLogin_MC();
		
		String mycookie = loginMC.login();
		System.out.println(mycookie);
		loginMC.getHttpUrlConnection("https://qa2012r2-sa.inqa.soti.net/MobiControl/Authorization/LogOn", mycookie);
		
}

	public String login() throws Exception {
		// TODO Auto-generated method stub
		int responseCode=400;
		try{
			String url="https://qa2012r2-jg1.inqa.soti.net/MobiControl/Authorization/LogOn";
			
			String payload = "{\"UserName\":\"%s\",\"Password\":\"%s\"}";
			payload = String.format(payload,userName,password);
			
			HttpURLConnection conn = new BasicLogin_MC().getHttpUrlConnection(url);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			out.write(payload);
			out.close();
			
			responseCode = conn.getResponseCode();
			System.out.println("The written response code is "+responseCode);
			
			if(responseCode/100==2){
				cookie = conn.getHeaderField("Set-Cookie");
				return cookie;
			}else{
				throw new Exception("request didn't return 200 response");
			}
		
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Error occured in Login " + e.getMessage());
		}
	}
		public HttpURLConnection getHttpUrlConnection(String strUrl,String... strCookie ) throws Exception{
			
			// To remove the javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: we have used HostnameVerifier
			HostnameVerifier allHostsValid = new HostNameVerifier().SSlCerts();
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
			
			URL loginUrl = new URL(strUrl);
			HttpsURLConnection con  = (HttpsURLConnection) loginUrl.openConnection();
			con.setDoOutput(true);
			
			System.out.println("Request method set to POST");
			con.setRequestMethod("POST");
			
			con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
			con.setRequestProperty("Content-Type", "application/json");
			
			con.setDoInput(true);
			
			System.out.println("set use of cache as false");
			con.setUseCaches(false);
			
			System.out.println("Allow user interaction to be false");
			con.setAllowUserInteraction(false);
			
			con.setRequestProperty("Content-Language", "en-US");
			
			if(!(strCookie.length == 0)){
				System.out.println();
				con.setRequestProperty("Cookie", strCookie[0]);
			}
			
			return con;
		}
	}
