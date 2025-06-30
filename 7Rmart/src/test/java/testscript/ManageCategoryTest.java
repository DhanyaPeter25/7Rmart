package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;


public class ManageCategoryTest extends Base
{
	@Test
  public void fileUpload() throws IOException
  {
	    String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		
		String cat = ExcelUtility.getStringData(0, 0,"managecategory");
		//String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		
		managecategorypage.clickMoreInfo();
		managecategorypage.addNew();
		managecategorypage.enterCategory(cat);
		managecategorypage.fileUpload();
		managecategorypage.clickSave();
  }
	@Test
	public void whetherTheUpdateButtonIsVisible() throws IOException
	{
		 String usr = ExcelUtility.getStringData(1, 0,"loginpage");
			String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsername(usr);
			loginpage.enterPassword(pwd);
			loginpage.clickSignIn();
			
			String cat = ExcelUtility.getStringData(0, 0,"managecategory");
			ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
			managecategorypage.clickMoreInfo();
			managecategorypage.addNew();
			boolean alertmsg=managecategorypage.isAlertMessageIsDisplayed();
	 		Assert.assertTrue(alertmsg);
	}
}

