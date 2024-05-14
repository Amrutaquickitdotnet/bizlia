package com.bizlia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;

public class LegalBusinessSignupPage extends CommonActions {

	public LegalBusinessSignupPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "organization_name")
	WebElement organizationName;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSubmitButton;
	
	public void setOrgName(String value) {
		setInput(organizationName,value,"");
	}
	
	public void setOrgSubmit() {
		clickElement(btnSubmitButton,"");
	}




}
