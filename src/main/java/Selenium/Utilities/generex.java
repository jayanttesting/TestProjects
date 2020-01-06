package Selenium.Utilities;
import com.mifmif.common.regex.Generex;

public class generex {

	
	public static String randomiser(String regEx) {
		Generex generator = new Generex(regEx);
		String randomValue = generator.random();
		return randomValue;
	}
}
