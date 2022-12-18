package com.actitime.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.actitime.automation.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class LoginPage extends TestBase {
	
	
	
	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement userName;
	
	
	@FindBy(xpath = "//input[@name='pwd']")
	WebElement passWord;
	
	@FindBy(xpath = "//*[@id='loginButton']")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='remember']")
	WebElement keepmeLoggedinCheckBox;
	
	@FindBy(xpath = "//a[@id='toPasswordRecoveryPageLink']")
	WebElement forgotYourPasswordLink;
	
	
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement actiTimeLogo;
	
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	

	
	public Boolean validateActiTimeLogo() {
		return actiTimeLogo.isDisplayed();
		
	}
	
	public HomePage loging(String user, String pwd) {
		
		userName.sendKeys(user);
		passWord.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
		
	}
}
