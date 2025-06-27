package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage
{

	public WebDriver driver;
	public ManageFooterPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add' and @onclick=\"click_button(1)\"]") WebElement addnew; 
	@FindBy(xpath = "//input[@placeholder=\"Enter the Category\"]") WebElement category;
	//@FindBy(xpath = "")WebElement 
	public void clickMoreInfo()
	{
		moreinfo.click();
	}
	public void addNew()
	{
		addnew.click();
	}
}
