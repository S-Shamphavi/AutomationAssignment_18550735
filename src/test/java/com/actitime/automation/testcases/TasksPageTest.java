package com.actitime.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.automation.base.TestBase;
import com.actitime.automation.pages.HomePage;
import com.actitime.automation.pages.LoginPage;
import com.actitime.automation.pages.TasksPage;

public class TasksPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TasksPage tasksPage;
	public TasksPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		tasksPage= homePage.clickOnTasksMenu();
		
	}
	
	@Test(priority = 1)
	public void TaskTableTest() {
		
	boolean flag= tasksPage.validateTasksList();
	Assert.assertTrue(flag,"Cannot find the task list");
		
	}
	@Test(priority = 2)
	public void addTaskTest() {
		
	tasksPage.clickOnAddButton();

		
	}
	
	@Test(priority = 3)
	public void TasksDetailsTest() {
		
	tasksPage.clickOnTask();

		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
