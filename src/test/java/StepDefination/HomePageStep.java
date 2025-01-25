package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.Homepage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {

	static Homepage homepage;

	@When("user is on homepage and user validate Logo")
	public void user_is_on_homepage_and_user_validate_logo() {
		homepage = new Homepage();

		Assert.assertEquals(homepage.validateLogo(), true);

	}

	@When("user validate Title")
	public void user_validate_title() {

		Assert.assertEquals(homepage.validateTitle().contains("Orange"), true);
	}

	@When("user click on pimPage link")
	public void user_click_on_pim_page_link() {
		
		homepage.clickOnPimLink();
	}

}
