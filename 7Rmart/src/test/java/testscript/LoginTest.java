package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	//(retryAnalyzer=retry.Retry.class)
	@Test
	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException
	{
		
		String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		boolean dashboard = loginpage.verifyDashboardIsVisible();
		Assert.assertTrue(dashboard);		
	}
	@Test
	public void verifyTheUserIsAbleToLoginWithInvalidUsername() throws IOException
	{
		String usr = ExcelUtility.getStringData(2, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(2, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		boolean alert= loginpage.verifyAlertVisible();
		Assert.assertTrue(alert);	
	}
	@Test
	public void verifyTheUserIsAbleToLoginWithInvalidPassword() throws IOException
	{
		String usr = ExcelUtility.getStringData(3, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(3, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		boolean alert= loginpage.verifyAlertVisible();
		Assert.assertTrue(alert);	
		
	}
	@Test
	public void verifyTheUserIsAbleToLoginWithInvalidCredentials() throws IOException
	{
		String usr = ExcelUtility.getStringData(4, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(4, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		boolean alert= loginpage.verifyAlertVisible();
		Assert.assertTrue(alert);	
	}
}
