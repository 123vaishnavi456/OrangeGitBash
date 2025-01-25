package UtilityPackage;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DropDownHelper extends BaseClass {
	
	public static void HandleDropdown(List<WebElement> list,String expectedvalue)
	{
	    for(WebElement wb:list)
	    {
	        String actualvalue=wb.getText();
	        
	        if(actualvalue.equalsIgnoreCase(expectedvalue))
	        {
	            wb.click();
	            break;
	        }
	    }
	}

}
