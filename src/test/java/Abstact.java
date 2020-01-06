import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Chrome.chrome;

public class Abstact
{

	WebDriver driver;
	chrome ch;
	public void main(String str[])
	{
		ch.test("https://www.go-ferry.com/ferry-athens-santorini.html?gclid=EAIaIQobChMIs5LG547v3wIVFCQrCh3cZwWqEAAYASAAEgLc_fD_BwE");
		driver.findElement(By.id("WFF_TripCategory"));
		WebElement element = driver.findElement(By.id("WFF_TripCategory"));
		Select select = new Select(element);
		List<WebElement> array = select.getOptions();
		
		System.out.println(array);
		
	}
	
	
	

	
}
