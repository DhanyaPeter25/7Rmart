package testscript;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base
{
	@Test
	public void addNews() throws IOException
	{
			//String usr = "admin";
			//String pwd = "admin";
			String usr = ExcelUtility.getStringData(1, 0,"loginpage");
			String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsername(usr);
			loginpage.enterPassword(pwd);
			loginpage.clickSignIn();
			
			
			String testnews = ExcelUtility.getStringData(0, 0,"managenews");
	
			ManageNewsPage managenewspage = new ManageNewsPage(driver);
			managenewspage.clickMoreInfo();
			managenewspage.clickNew();
			//managenewspage.enterNews(testnews);
			managenewspage.saveNews();
			//boolean alertmsg = loginpage.verifyAlertVisible();
			//Assert.assertTrue(alertmsg);
	}
}
