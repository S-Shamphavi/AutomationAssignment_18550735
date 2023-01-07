package com.actitime.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.automation.base.TestBase;
import com.actitime.automation.pages.HomePage;
import com.actitime.automation.pages.LoginPage;
import com.actitime.automation.pages.UsersPage;

public class UsersPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	public UsersPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		usersPage= homePage.clickOnUsersMenu();
		
	}
	
	
	@Test(priority = 1)
	public void usersTableTest() {
		
	boolean flag= usersPage.validateUsersList();
	Assert.assertTrue(flag,"Cannot find the users list");
		
	}
	@Test(priority = 2)
	public void addUserTest() {
		
	usersPage.clickOnAddUser();

		
	}
	
	@Test(priority = 3)
	public void userLinkTest() {
		
	usersPage.clickOnUser();

		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
