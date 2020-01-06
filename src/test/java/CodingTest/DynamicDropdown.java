package CodingTest;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {
	static WebDriver driver;
	static String url = "https://www.makemytrip.com/";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(
		// By.xpath("//input[@id='toCity']"))).click();
		// java.util.List<WebElement> myList = new WebDriverWait(driver, 20)
		// .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='toCity']")));
		//
		// for (WebElement element : myList)
		// if (element.getText().contains("Mumbai"))
		// ;
		// System.out.println();
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(dropdown);

		List<WebElement> options = select.getOptions();
		for (WebElement item : options) {
			System.out.println(item.getText());

			if (options.equals("USD")) {
				select.selectByValue("usd");
				System.out.println("dropdown selected");
			}
		}
		driver.close();
	}

}
