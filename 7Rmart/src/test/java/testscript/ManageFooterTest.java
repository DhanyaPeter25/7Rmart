package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base
{
	@Test
 public void addNewCategory() throws IOException
 {
	 	String usr = ExcelUtility.getStringData(1, 0,"loginpage");
		String pwd = ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usr);
		loginpage.enterPassword(pwd);
		loginpage.clickSignIn();
		
		ManageFooterPage managefooterpage = new ManageFooterPage(driver);
		managefooterpage.clickMoreInfo();
		managefooterpage.addNew();
		
 }
}
