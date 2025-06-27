package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base
{
	@Test
	public void isTheUserAbleToClickManageContact() throws IOException
	{
	String usr = ExcelUtility.getStringData(1, 0,"loginpage");
	String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(usr);
	loginpage.enterPassword(pwd);
	loginpage.clickSignIn();
	
	ManageContactPage managecontactpage = new ManageContactPage(driver);
	managecontactpage.clickManageContact();
	managecontactpage.actionClick();
	
	String managepnum = ExcelUtility.getIntegerData(1, 1, "managecontact");
	String manageemail = ExcelUtility.getStringData(2, 1, "managecontact");
	String manageaddress = ExcelUtility.getStringData(3, 1, "managecontact");
	
	managecontactpage.enterPhone(managepnum);
	managecontactpage.enterEmail(manageemail);
	managecontactpage.enterAddress(manageaddress);
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
		
		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage.clickManageContact();
		managecontactpage.actionClick();
		
		boolean updatebutton = managecontactpage.verifyUpdateIsVisible();
		Assert.assertTrue(updatebutton);
	}
	
	
}
