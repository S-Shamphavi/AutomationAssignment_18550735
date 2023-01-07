package com.actitime.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.automation.base.TestBase;

public class TasksPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='taskListBlock']")
	WebElement taskList;
	
	@FindBy(xpath = "(//*[@class='taskRowCellWrapper'])[1]")
	WebElement task;
	
	@FindBy(xpath = "//*[@class='edit_task_sliding_panel sliding_panel components_panelContainer']")
	WebElement taskDetail;
	
	@FindBy(xpath = "//*[@class='addNewButton']")
	WebElement addButton;
	
	@FindBy(xpath = "//*[@class='item createNewTasks']")
	WebElement addTaskOption;
	public TasksPage() {
		
		PageFactory.initElements(driver, this);
	}
	public Boolean validateTasksList() {
		return taskList.isDisplayed();
	}
	public boolean clickOnAddButton() {
		addButton.click();
		return addTaskOption.isDisplayed();
	}
	public boolean clickOnTask() {
		task.click();
		return taskDetail.isDisplayed();
	}

}
