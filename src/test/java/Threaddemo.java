import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class hi extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {

			System.out.println("HI");
			String geckoDriverPath = "//resources//geckodriver.exe";
			System.setProperty("webdriver.firefox.marionette", geckoDriverPath);
			WebDriver driver = new FirefoxDriver();
			driver.get("www.built.io");
			String title = driver.getTitle();
			System.out.println("Title is " + title);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class hello extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.setProperty("webdriver.chrome.driver", "\\Resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class Threaddemo {

	public static void main(String[] args) {

		hi obj1 = new hi();
		hello obj2 = new hello();

		obj1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		obj2.start();

	}

}
