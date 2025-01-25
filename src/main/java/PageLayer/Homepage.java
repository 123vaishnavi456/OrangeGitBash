package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityPackage.WebElementHelper;

public class Homepage extends BaseClass {
	@FindBy(xpath="//div[@class='oxd-brand-banner']")
    private WebElement logo;
    
    @FindBy(xpath="//span[text()='PIM']/parent::a")
    private WebElement pimpagelink;
    
    public Homepage()
    {
        PageFactory.initElements(getDriver(),this);
    }
    
    public boolean validateLogo()
    {
        return logo.isDisplayed();
    }
    
    public String validateTitle()
    {
        return getDriver().getTitle();
    }
    
    public void clickOnPimLink()
    {
        WebElementHelper.click(pimpagelink);
    }
}

