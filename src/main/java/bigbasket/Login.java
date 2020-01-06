package bigbasket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
	@FindBy(xpath = "//div[@id='headerControllerId']//a[3]")
	WebElement login;
	
	@FindBy(xpath ="//label[@class='form-control-placeholder'][contains(text(),'Email')]")
	WebElement email;
	
	@FindBy(id="loginemail")
	WebElement enteremail;
	
	@FindBy(id="password")
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='fixed-btn business-user']")
	WebElement businessuser;
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
    WebElement password;
	
	@FindBy(xpath=" //button[@class='btn btn-default login-btn']")
	WebElement submitt;
	
	//Text verification
	@FindBy(xpath="//label[@class='small text-danger ng-binding']")
	WebElement text;
	
	public void loginbutton()
	{
		login.click();
	}
	public void emailclick()
	{
		email.click();
	}
	public void enteremail(String str)
	{
		enteremail.sendKeys(str);
	}
	public void businessuser_click()
	{
		businessuser.click();
	}
	public void password_click()
	{
		password.click();
	}
	public void enterpassword(String str)
	{
		enterpassword.sendKeys(str);
	}
	public void submittbutton()
	{
		submitt.click();
	}
	public void Textverification()
	{
		text.getText();
	}
	
	
}
