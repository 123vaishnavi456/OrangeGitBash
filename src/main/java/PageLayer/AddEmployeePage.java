package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityPackage.WebElementHelper;

public class AddEmployeePage extends BaseClass {

	@FindBy(xpath="//a[text()='Add Employee']")
	   private WebElement addEmployeeBtn;
	   
	   @FindBy(name="firstName")
	   private WebElement firstName;
	   
	   @FindBy(name="lastName")
	   private WebElement lastName;
	   
	   @FindBy(xpath="//button[@type='submit']")
	   private WebElement saveButton;
	   
	   public AddEmployeePage()
	   {
	     PageFactory.initElements(getDriver(),this);
	   }
	   
	   public void clickAddEmployeeBtn()
	   {
		   WebElementHelper.click(addEmployeeBtn);
	   }
	   
	   public void addEmployeeFunctionality(String Fname,String Lname)
	   {
		   WebElementHelper.sendKeys(firstName,Fname);
		   WebElementHelper.sendKeys(lastName,Lname);
	   }
	   
	   public void clickOnSaveBtn()
	   {
		   WebElementHelper.click(saveButton);
	   }
	  }
	
