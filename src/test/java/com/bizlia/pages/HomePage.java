package com.bizlia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;




public class HomePage extends CommonActions {

	public HomePage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//nav[@id='navbar']/ul[2]/li[2]") // these all are locators
	WebElement signUpButton;
	
	@FindBy(linkText = "Log in") // these all are locators
	WebElement loginLink;

	

	public void signUp() {
		signUpButton.click();
	}
	
	public void loginnavigationlink() {
		loginLink.click();
	}

	
	
	


	

}
