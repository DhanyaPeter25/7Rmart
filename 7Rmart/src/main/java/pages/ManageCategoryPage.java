package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage 
{
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageCategoryPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class=\"small-box-footer\"]") WebElement moreinfocat;
	@FindBy(xpath = "//a[@onclick=\"click_button(1)\"]") WebElement addnewbtn;
	@FindBy(xpath = "//input[@id='main_img']") WebElement uploadbtn;
	@FindBy(xpath = "//input[@placeholder=\"Enter the Category\"]") WebElement catname;
	@FindBy(xpath = "//button[@name='create']") WebElement save;
	
	public void clickMoreInfo()
	{
		moreinfocat.click();
	}
	public void addNew()
	{
		addnewbtn.click();
	}
	public void enterCategory(String category)
	{
		catname.sendKeys(category);
	}
	public void fileUpload()
	{
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(uploadbtn, Constants.IMAGE);
	}
	public void clickSave()
	{
		PageUtility page=new PageUtility();
		page.javaSriptClick(driver, save);
		//save.click();
	}
	
	
	
	
}
