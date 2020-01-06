package Regex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mifmif.common.regex.Generex;

import Chrome.chrome;
import junit.framework.Assert;

public class Testr {
	WebDriver driver;
	chrome ch;

	@BeforeSuite
	public void launchchrome() {
		ch = new chrome();
		driver = ch.getDriverINstance();
		ch.test("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#");
	}

	// @Test
	// public void input()
	// {
	// String title = driver.getTitle();
	// System.out.println("This is my title"+" "+title);
	// driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("$Jayant");
	//
	// String name = "Jayant";
	// String patternstring = ".*$%^#:.*";
	//
	// Pattern pattern = Pattern.compile(patternstring,
	// Pattern.CASE_INSENSITIVE);
	// Matcher matcher = pattern.matcher(name);
	//
	// if(matcher.find())
	// {
	// System.out.println("invalid");}
	// else
	// {
	// System.out.println("valid");}
	//
	//
	//
	// }

	// Generate Regex

	@Test
	public void generater() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Gmail"));
		Generex gen = new Generex("[0-9]([A-Z]|[m-p]{3,9})[a-z]");
		String ranstring = gen.random();
		System.out.println(ranstring);
		
		for(int i=0;i<=10;i++)
		{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(ranstring);
		driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
		}
	}
	@Test
	public void kill()
	{
		driver.close();
	}
}
