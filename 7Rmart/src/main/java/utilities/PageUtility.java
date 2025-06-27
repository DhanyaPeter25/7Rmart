package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility 
{
	public void click(WebElement element)
	  {
		  element.click();
	  }
	
	public void javaSriptClick(WebDriver  driver,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}

}
