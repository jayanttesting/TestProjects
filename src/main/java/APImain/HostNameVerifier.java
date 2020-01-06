package APImain;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HostNameVerifier {

	public HostnameVerifier SSlCerts() throws NoSuchAlgorithmException, KeyManagementException {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {

			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				System.out.println("Inside getAcceptedIssuers and returning null.");
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
				System.out.println("Inside checkClientTrusted.");
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
				System.out.println("Inside checkServerTrusted");
			}
		}

		};

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			/*
			 * public boolean verify(String hostname, SSLSession session) {
			 * return true; }
			 */

			public boolean verify(String hostname, SSLSession session) {
				System.out.println("Inside verify.");
				// TODO Auto-generated method stub
				return true;
			}
		};

		return allHostsValid;

	}

	public String getHostFromURI(String strURIString) throws URISyntaxException {
		System.out.println(
				"*********** Inside  getHostFromURI method with  strURIString : " + strURIString + "    ************");
		URI uri = new URI(strURIString);
		String domain = uri.getHost();
		System.out.println("Domain " + domain);
		return domain.startsWith("www.") ? domain.substring(4) : domain;

	}

}
