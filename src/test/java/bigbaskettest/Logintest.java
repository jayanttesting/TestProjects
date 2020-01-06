package bigbaskettest;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Chrome.chrome;
import bigbasket.Login;
import io.restassured.internal.support.FileReader;
import junit.framework.Assert;

public class Logintest {

WebDriver driver;
Login L;
chrome ch;
Login loginb;
	
	@BeforeTest
	public void launchchrome()
	{
		ch = new chrome();
		driver=ch.getDriverINstance();
		ch.test("https://www.bigbasket.com/");
	}
	
	@Test
	public void logintobugbasket() throws InterruptedException
	{
		loginb = PageFactory.initElements(driver, Login.class);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginb.loginbutton();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		String text =driver.switchTo().alert().getText();
//		System.out.println("This is my text"+" "+text);
		loginb.businessuser_click();
		loginb.emailclick();
		loginb.enteremail("khyu.gupta@gmail.com");
		loginb.password_click();
		loginb.enterpassword("Shivam@1993");
		loginb.submittbutton();
		
		WebElement errormessage = driver.findElement(By.xpath("//label[@class='small text-danger ng-binding']"));
		Assert.assertEquals(errormessage.getText(), "Please login using the OTP option");
		System.out.println("This is my text"+""+errormessage.getText());

		
	}
	
	@AfterTest
	public void kill()
	{
		driver.close();
	}
}
