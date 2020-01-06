package Selenium.Utilities;

public class RandomStringGenerator {

	public void randomgenerator()
	{
		System.out.println("Generate random String" +randomAlphaNumeric(10));
	}
	
	private static final String ALPHA_NUMERIC_STRING = "BCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
