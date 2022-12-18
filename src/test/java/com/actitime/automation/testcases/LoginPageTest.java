package com.actitime.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actitime.automation.base.TestBase;
import com.actitime.automation.pages.HomePage;
import com.actitime.automation.pages.LoginPage;
import com.actitime.automation.util.TestUtil;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	String sheetName = "Users";
	TestUtil testUtil;
	
	
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	
	@Test(priority = 1)
	public void loginPageLogoTest() {
		
	boolean flag= loginPage.validateActiTimeLogo();
	Assert.assertTrue(flag);
		
	}
	
	
	@DataProvider
	
	public Object[][] getactiTimeTestData() {
		Object data[][]=testUtil.getTestData(sheetName);
		
		return data;
		
		
		
	}
	@Test(priority = 2,dataProvider="getactiTimeTestData")
	public void LoginTest(String userName, String password) {
		
		
		homePage = loginPage.loging(userName, password);
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
