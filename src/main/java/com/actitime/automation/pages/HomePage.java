package com.actitime.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.automation.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	

		
		@FindBy(xpath = "//a[@class='content reports']") 
		WebElement reportsLink;
		
		@FindBy(xpath = "//a[@class='content users']") 
		WebElement usersLink;
		
		@FindBy(xpath = "//a[@class='content selected tt']") 
		WebElement timeSheetLink;
		
		@FindBy(xpath = "//div[@id='logo_aT']") 
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//div[@class='weekApprovalStatusControlOuterContainer']") 
		WebElement approvalStatus;
		
		@FindBy(xpath = "//div[@class='tt-table ']") 
		WebElement timeSheetTable;
	
		
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		
		
		public UsersPage clickOnUsersLink() {
			usersLink.click();
			return new UsersPage();
		}
		
		
        public ReportsPage clickOnReportsLink() {
	         reportsLink.click();
	         return new ReportsPage();
		}
        
        
        public HomePage clickOnTimeSheetLink() {
	         timeSheetLink.click();
	         return new HomePage();
		}
        
        
        public Boolean timeSheetTableTest() {
			return timeSheetTable.isDisplayed();
		}
        
        
        
    	public Boolean validateApprovalStatus() {
			return approvalStatus.isDisplayed();
		}
	
}
