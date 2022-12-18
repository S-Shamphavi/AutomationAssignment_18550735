package com.actitime.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.automation.base.TestBase;
import com.actitime.automation.pages.HomePage;
import com.actitime.automation.pages.LoginPage;
import com.actitime.automation.pages.ReportsPage;
import com.actitime.automation.pages.UsersPage;

public class ReportsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
    ReportsPage reportsPage;
	public ReportsPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		reportsPage= homePage.clickOnReportsLink();
		
	}
	
	
	@Test(priority = 1)
	public void reportsListTest() {
		
	boolean flag= reportsPage.validateReportsList();
	Assert.assertTrue(flag,"Cannot find the reports list");
		
	}
	
	
	@Test(priority = 2)
	public void reportsListLinkTest() {
		
	reportsPage.clickOnReport();

		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
