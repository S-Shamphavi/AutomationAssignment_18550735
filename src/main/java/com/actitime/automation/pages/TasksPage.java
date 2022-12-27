package com.actitime.automation.pages;

import org.openqa.selenium.support.PageFactory;

import com.actitime.automation.base.TestBase;

public class TasksPage extends TestBase {
	public TasksPage() {
		
		PageFactory.initElements(driver, this);
	}
	

}
