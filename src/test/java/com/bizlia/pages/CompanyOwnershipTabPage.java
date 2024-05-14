package com.bizlia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;

public class CompanyOwnershipTabPage extends CommonActions  {
	public CompanyOwnershipTabPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='comp-ownership-tab']")
	WebElement ownerShipTabPage;
	
	
//	@FindBy(xpath = "//button[@id='comp-ownership-tab']")
//	WebElement ownerShipTabPage;
//	
//	
//	@FindBy(xpath = "//button[@id='comp-ownership-tab']")
//	WebElement ownerShipTabPage;
//	
	
}
