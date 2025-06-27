package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogOutPage 
{
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public LogOutPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']") WebElement user;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dboard;
	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") WebElement admin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']//parent::div") WebElement logout;
	
	public void clickAdmin()
	{
		pageutility.click(admin);
	}
	public void clickLogout()
	{
		pageutility.click(logout);
	}
	public boolean verifysignInVisible()
	{
		return signin.isDisplayed();
	}
}
