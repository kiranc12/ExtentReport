package script;



import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestLoginLogout extends BaseTest{
	@Test(priority=1,groups= {"login","smoke"})
	public void testLoginLogout() {
		
		
		LoginPage page = new LoginPage(driver);
		String sheet="TestLoginLogout";
		String name = Utility.getXLData(INPUT_PATH, sheet, 1, 0);
		String pass = Utility.getXLData(INPUT_PATH, sheet, 1, 1);
		
		page.setUserName(name);
		page.setPassword(pass);
		page.clickLogin();
		
		HomePage homePage = new HomePage(driver);
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		homePage.clickLogout();
		//Reporter.log("Data:"+data,true);
		
		int r = Utility.getXRowCount(INPUT_PATH, sheet);
		Reporter.log("Row:"+r,true);
		
		//Assert.fail();
		
//		String p = Utility.getPhoto(driver, PHOTO_PATH);
//		Reporter.log("Photo:"+p,true);		
	}
}
