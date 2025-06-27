package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base
{
	@Test
	public void isTheUserAbleToLogOut() throws IOException
	{
		String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		LogOutPage logoutpage = new LogOutPage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();
		boolean signin = logoutpage.verifysignInVisible();
		Assert.assertTrue(signin);	
	}
}
