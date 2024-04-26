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

public class CompanySettingsPage extends CommonActions {

	public CompanySettingsPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//ul[@class='list-sidebar bg-defoult']/li[3]/a")
	WebElement companySettingsmodule;
	
	
	@FindBy(xpath = "//ul[@id='e-commerce']")
	WebElement companyProfileLink;
	
		
	public void companySettingsClick() {
		clickElement(companySettingsmodule, "When companySetting accordion icon is clicked");
	}

	
	public void companyProfileClick() {
		clickElement(companyProfileLink, "When companyProfileLink is clicked");
	}

}
