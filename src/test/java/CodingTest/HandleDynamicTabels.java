package CodingTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTabels {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// *//td[contains(text(),'Alfreds Futterkiste')]
		// *//td[contains(text(),'Centro comercial Moctezuma')]

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("Total number of rows are" + " " + rowcount);

		String beforexpath = "//*[@id='customers']/tbody/tr[";
		String afterxpath = "]/td[1]";

		for (int i = 2; i <= rowcount; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());

			if (ele.getText().equals("Island Trading"))
				;
			{
				System.out.println(
						"Company Name:" + ele.getText() + " " + "is found" + " " + "at position" + " " + (i - 1));

				break;

			}
		}
		driver.quit();
	}
}
