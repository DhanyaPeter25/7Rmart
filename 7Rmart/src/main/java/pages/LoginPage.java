package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage 
{
	public WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Username']") WebElement user;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement alert;
	
public LoginPage(WebDriver driver) 
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void enterUsername(String username)
{
	user.sendKeys(username);
}
public void enterPassword(String password)
{
	pword.sendKeys(password);
}
public void clickSignIn()
{
	//signin.click();
	PageUtility pageutility = new PageUtility();
	pageutility.click(signin);
}
public boolean verifyDashboardIsVisible()
{
	return dboard.isDisplayed();
}
public boolean verifyAlertVisible()
{
	return alert.isDisplayed();
}

}
