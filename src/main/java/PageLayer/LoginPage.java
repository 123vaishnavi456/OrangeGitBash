package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityPackage.WebElementHelper;

public class LoginPage extends BaseClass {

	@FindBy(name="username")
	private WebElement User;
	
	@FindBy(name="password")
	private WebElement Pass;


	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement LoginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginDetailsFunction(String Username,String Password)
	{
		WebElementHelper.sendKeys(User, Username);
		WebElementHelper.sendKeys(Pass, Password);
	}
	
	public void loginButtonFunction()
	{
		WebElementHelper.click(LoginButton);
	}
}
