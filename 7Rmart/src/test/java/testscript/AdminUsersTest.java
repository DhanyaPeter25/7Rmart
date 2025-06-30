package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base
{
	@Test
  public void whetherTheUserIsableToCreateaNewUser() throws IOException
  {
	    String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		
		AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage.clickMoreInformationAdmin();
		adminuserspage.clickNewButton();
		
		String adminusername = ExcelUtility.getStringData(0, 0, "adminuser");
		String adminpassword = ExcelUtility.getStringData(1, 0, "adminuser");
		
		adminuserspage.enterUserName(adminusername);
		adminuserspage.enterPassword(adminpassword);
		adminuserspage.selectUserType();
		adminuserspage.saveAdminUsers();
  }

	@Test
	public void whetherTheUserIsAbleToUpdateTheUser() throws IOException
	{
		String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		
		AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage.clickMoreInformationAdmin();
		adminuserspage.editAdminUsers();
		adminuserspage.editAdminUsers();
		adminuserspage.updateAdminUsers();
		
		boolean alert=adminuserspage.displayAlert();
		Assert.assertTrue(alert);
	}
}
