package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class ManageNewsPage 
{
	//String usr = "admin";
	//String pwd = "admin";
	public WebDriver driver;
    

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'][normalize-space()='More info']") WebElement moreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	@FindBy(id="news") WebElement enternews;
	@FindBy(name="create") WebElement savenews;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickMoreInfo()
	{
		moreinfo.click();
	}
	public void clickNew()
	{
		newbutton.click();
	}
	public void enterNews(String news)
	{
		enternews.sendKeys();
	}
	public void saveNews()
	{
		savenews.click();
	}
	public boolean alertDisplay()
	{
		return alert.isDisplayed();
	}
}
