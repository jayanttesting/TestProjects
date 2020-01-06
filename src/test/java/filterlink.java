import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filterlink {

	public WebDriver driver;
	

	public filterlink(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void filteruser() {
		this.driver = new ChromeDriver();
		List<WebElement> list = driver.findElements(By.tagName("a"));

		for (WebElement link : list) {
			System.out.println(link.getText());
		}

	}

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		filterlink fill = new filterlink(driver);
		fill.filteruser();
		
	}
	public void terminate()
	{
		driver.close();
	}

}
