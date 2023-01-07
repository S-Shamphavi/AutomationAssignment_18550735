package com.actitime.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.automation.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class UsersPage extends TestBase  {
	
	
			@FindBy(xpath = "//div[@class='userListPage']")
			WebElement usersList;
			
			@FindBy(xpath = "(//table[@class='userNameContainer'])[1]")
			WebElement userLink;
			
			@FindBy(xpath = "//div[@class='edit_user_sliding_panel sliding_panel components_panelContainer']")
			WebElement userDetailsPanel;
			
			@FindBy(xpath = "//div[@class='components_button withPlusIcon']")
			WebElement addUserButton;
			
			@FindBy(xpath = "//div[@class='create_user_sliding_panel sliding_panel components_panelContainer']")
			WebElement addUserPanel;
			
						
			public UsersPage() {	
				PageFactory.initElements(driver, this);
			}
			
			
			
			public Boolean validateUsersList() {
				return usersList.isDisplayed();
			}
			
			public boolean clickOnAddUser() {
				userLink.click();
				return userDetailsPanel.isDisplayed();
			}
			
			
			public boolean clickOnUser() {
				userLink.click();
				return addUserPanel.isDisplayed();
			}
			

}
