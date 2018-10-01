package script;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestDemo extends BaseTest{
	@Test
	public void testA() {
		
		
		LoginPage page = new LoginPage(driver);
		
		String name = Utility.getXLData(INPUT_PATH, "sheet1", 1, 0);
		String pass = Utility.getXLData(INPUT_PATH, "sheet1", 1, 1);
		
		page.setUserName(name);
		page.setPassword(pass);
		page.clickLogin();
		HomePage homePage = new HomePage(driver);
		homePage.clickLogout();
		//Reporter.log("Data:"+data,true);
		
		int r = Utility.getXRowCount(INPUT_PATH, "sheet1");
		Reporter.log("Row:"+r,true);
		
		//Assert.fail();
		
//		String p = Utility.getPhoto(driver, PHOTO_PATH);
//		Reporter.log("Photo:"+p,true);
		
		
		
	}
	
	

}
