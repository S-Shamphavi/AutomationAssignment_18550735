package com.actitime.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.automation.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
		@FindBy(xpath = "//div[@id='logo_aT']") 
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//a[@class='content reports']") 
		WebElement reportsMenu;
		
		@FindBy(xpath = "//a[@class='content users']") 
		WebElement usersMenu;
		
		@FindBy(xpath = "//a[@class='content selected tt']") 
		WebElement timeTrackMenu;
		
		@FindBy(xpath = "//a[@class='content tasks']") 
		WebElement tasksMenu;
		
		@FindBy(xpath = "//a[@href='/administration/approve_tt.do']") 
		WebElement approveTTmenu;
		
		@FindBy(xpath = "(//*[@class='selectionCell'])[4]") 
		WebElement checkBox;
		
		@FindBy(xpath = "//*[@id='approveButton']") 
		WebElement approveButton;
		
		@FindBy(xpath = "//*[@id='rejectButton']") 
		WebElement rejectButton;
	
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		
		
		public UsersPage clickOnUsersMenu() {
			usersMenu.click();
			return new UsersPage();
		}
		
		
        public ReportsPage clickOnReportsMenu() {
	         reportsMenu.click();
	         return new ReportsPage();
		}
        
        
        public HomePage clickOnTimeTrackMenu() {
	         timeTrackMenu.click();
	         return new HomePage();
		}
        public TasksPage clickOnTasksMenu() {
			tasksMenu.click();
			return new TasksPage();
		}
        public boolean clickOnApproveTT() {
			approveTTmenu.click();
			checkBox.click();
			return approveButton.isEnabled();
			
		}
        public boolean clickOnRejectTT() {
     			approveTTmenu.click();
     			checkBox.click();
     			return rejectButton.isEnabled();
     			
     		}
 
	
}
