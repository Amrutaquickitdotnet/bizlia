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

public class CompanyServicesTabPage extends CommonActions {

	public CompanyServicesTabPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@id='brief_description']")
	WebElement briefDescriptionofBusiness;

	@FindBy(xpath = "//select[@id='nica_codes_primary']")
	WebElement primaryNAICCodes;
	
	
	@FindBy(xpath = "//select[@id='nica_codes']")
	WebElement secondaryNAICCodes;


	@FindBy(xpath = "//button[@id='comp-services-tab']")
	WebElement servicesTab;

	public void serviceTabclick() {
		clickElement(servicesTab, "Clicking on servicesTab");
	}

	

	public void briefDescriptionofBusiness(String value) {
		SetInput(briefDescriptionofBusiness, value, "Entering data inside the briefDescriptionofBusiness");
	}
	
	public void primaryNAICCodes(String value) {
		setDropDownElementByVisibleText(primaryNAICCodes, value, "choosing value for primary NAIC Codes");
	}
	
	public void secondaryNAICsCodes(String value) {
		setDropDownElementByVisibleText(secondaryNAICCodes, value, "choosing value for secondaryNAICCodes");
	}
}
