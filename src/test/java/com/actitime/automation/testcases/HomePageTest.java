package com.actitime.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.automation.base.TestBase;
import com.actitime.automation.pages.HomePage;
import com.actitime.automation.pages.LoginPage;
import com.actitime.automation.pages.UsersPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	public HomePageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the home page Logo");
		
	}
	
	@Test(priority = 2)
	public void usersPageUserLinkTest() {
		
	homePage.clickOnUsersMenu();

		
	}
	
	@Test(priority = 3)
	public void homePageTimeTrackLinkTest() {
		
	homePage.clickOnTimeTrackMenu();

		
	}
	@Test(priority = 1)
	public void approveTimeTrackTest() {
		
	homePage.clickOnApproveTT();

		
	}
	@Test(priority = 1)
	public void rejectTimeTaskTest() {
		
	homePage.clickOnRejectTT();

		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
