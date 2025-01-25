package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityPackage.PropertiesClass;

public class BaseClass {
	
	protected static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
	
	 public static WebDriver getDriver()
	 {
		 return td.get();
	 }
	public static void initialization(String BrowserName) throws IOException
	{
		  if(BrowserName.endsWith("chrome"))
		  {
			  WebDriver driver = new ChromeDriver();
			  td.set(driver);
		  }
		  
		  else if(BrowserName.endsWith("edge"))
		  {
			  WebDriver driver = new EdgeDriver();
			  td.set(driver);
		  }
		  
		  else
		  {
			  System.out.println("enter the valid Browser Name");
		  }
		  
		  getDriver().manage().window().maximize();
		  
		  getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		  
		  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  
		  getDriver().get(PropertiesClass.getPropertyM("SIT_URL"));
		  
		
		
		
	}

}
