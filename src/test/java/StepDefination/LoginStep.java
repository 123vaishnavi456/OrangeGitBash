package StepDefination;

import java.io.IOException;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	static LoginPage loginPage;
	@Given("User should open browser {string}")
	public void user_should_open_browser(String browser) throws IOException {
	   BaseClass.initialization(browser);
	}
	@When("User should be on login page")
	public void user_should_be_on_login_page() {
	 
		String url=getDriver().getCurrentUrl();
		
		Assert.assertEquals(url.contains("login"), true);
	}
	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String Username, String Password) {
		 loginPage = new LoginPage();
		 loginPage.loginDetailsFunction(Username, Password);
	}
	@Then("User should click on login button")
	public void user_should_click_on_login_button() {
	    
		loginPage.loginButtonFunction();
	}
}
