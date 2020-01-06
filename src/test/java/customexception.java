//checked exception
public class customexception extends Exception {

	customexception() {

		super("This is my custom exception");

	}

	customexception(String message) {
		super(message);

	}

	public static void main(String args[]) {
		int age = 17;
		if (age < 18) {
			try {
				throw new customexception();
			} catch (customexception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
