package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage 
{
	
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageContactPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-contact\" and @class=\" nav-link\"]") WebElement managecntct;
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1\" and @role=\"button\"]") WebElement actionclick;
	@FindBy(xpath = "//input[@id=\"phone\"]") WebElement phone;
    @FindBy(xpath = "//input[@id=\"email\"]") WebElement mail;
    @FindBy(xpath = "//textarea[@placeholder='Enter the Address']") WebElement adrs;
    @FindBy(xpath = "//button[@name='Update']") WebElement update;


public void clickManageContact()
{
	managecntct.click();
}
public void actionClick()
{
	actionclick.click();
}
public void enterPhone(String managepnum)
{
	phone.clear();
	phone.sendKeys(managepnum);
}
public void enterEmail(String email)
{
	mail.clear();
	mail.sendKeys(email);
}
public void enterAddress(String address)
{
	adrs.clear();
	adrs.sendKeys(address);
}
public boolean verifyUpdateIsVisible()
{
	return update.isDisplayed();
}

}
