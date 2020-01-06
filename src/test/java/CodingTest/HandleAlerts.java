package CodingTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message is" + " " + alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct Message");
			
		}
		else
		System.out.println("Incorrect error message");

		alert.accept();
		driver.quit();

	}

	
}
