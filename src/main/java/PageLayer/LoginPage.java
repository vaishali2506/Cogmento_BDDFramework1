package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserEnterValidUsernameAndPassword(String Uname, String Pass)
	{
		 Wait.sendKeys(Email, Uname);
		 Wait.sendKeys(Password, Pass);
	}
	
	public void UserClickOnLoginButton()
	{
		Wait.click(LoginButton);
	}
}
