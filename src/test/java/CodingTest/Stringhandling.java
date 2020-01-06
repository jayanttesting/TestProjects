package CodingTest;

import Selenium.main.maininput;

public class Stringhandling {

	public static void main(String[] args) {
		int a = 2, b = 5;

		System.out.println("Output before swaping numbers" + a + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Output after swaping numbers" + a + " " + b);
	}

}
