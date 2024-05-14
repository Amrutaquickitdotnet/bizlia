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

public class CompanyProfileAddressTabPage extends CommonActions {

	public CompanyProfileAddressTabPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id ='comp-misc-info-tab']")
	WebElement addressesTab;

	@FindBy(xpath = "//input[@id ='full_name']")
	WebElement ownerInformationfullName;

	@FindBy(xpath = "//input[@id ='title']")
	WebElement ownerTitle;

	@FindBy(xpath = "//input[@id ='addressone']")
	WebElement owneraddressLineOne;

	@FindBy(xpath = "//input[@id ='addresstwo']")
	WebElement owneraddressLineTwo;

	@FindBy(xpath = "//input[@name ='city_name']")
	WebElement ownercity;

	@FindBy(xpath = "//input[@name ='state_name']")
	WebElement ownerstate;

	@FindBy(xpath = "//input[@id ='zipcode']")
	WebElement ownerZipcode;

	@FindBy(xpath = "//input[@id ='main_phone_number']")
	WebElement ownermainPhoneNumber;

	@FindBy(xpath = "//input[@id ='cell_phone_number']")
	WebElement ownercellPhoneNumber;

	@FindBy(xpath = "//input[@id ='legal_us_citizenship']")
	WebElement ownerCountryofCitizenship;

	@FindBy(xpath = "//input[@id ='ownership_percentage']")
	WebElement ownershipPercentage;

	@FindBy(xpath = "//input[@id ='full_name']")
	WebElement primaryContactFullName;

	@FindBy(xpath = "//input[@id ='title']")
	WebElement primaryContactTitle;

	@FindBy(xpath = "//input[@id ='addressone']")
	WebElement primaryContactAddressOne;

	@FindBy(xpath = "//input[@id ='addresstwo']")
	WebElement primaryContactAddressTwo;

	@FindBy(xpath = "//input[@id ='city_name']")
	WebElement primaryContactCity;

	@FindBy(xpath = "//input[@id ='state_name']")
	WebElement primaryContactState;

	@FindBy(xpath = "//input[@id ='zipcode']")
	WebElement primaryContactZipCode;

	@FindBy(xpath = "//input[@id ='country']")
	WebElement primaryContactCountry;

	@FindBy(xpath = "//div[@role ='combobox']")
	WebElement primaryContactmainPhoneCountryFlag;

	@FindBy(xpath = "//input[@id ='main_phone_number']")
	WebElement primaryContactMailingPhone;

	@FindBy(xpath = "//input[@id ='addresstwo']")
	WebElement mailingAddressTwo;

	@FindBy(xpath = "//input[@id ='city_name']")
	WebElement mailingCity;

	@FindBy(xpath = "//input[@id ='state_name']")
	WebElement mailingState;


	public void setClickingonAddressTab() {
		clickElement(addressesTab, "When clicking on addresses tab from company profile");

	}

	public void setOwnerinformationFullName(String value) {
		setInput(ownerInformationfullName, value, "Entering full name under Owner's information");
	}

	public void setOwnerinformationTitle(String value) {
		setInput(ownerTitle, value, "Entering Title under Owner's information");
	}

	public void setOwnerinformationAddressOne(String value) {
		setInput(owneraddressLineOne, value, "Entering details of address one inside Owner's information");
	}

	public void setOwnerinformationAddressTwo(String value) {
		setInput(owneraddressLineTwo, value, "Entering details of address two  under Owner's information");
	}

	public void setOwnerinformationCity(String value) {
		setInput(ownercity, value, "Entering city under Owner's information");
	}

	public void setOwnerinformationState(String value) {
		setInput(ownerstate, value, "Entering state under Owner's information");
	}

	public void setOwnerinformationZipCode(String value) {
		setInput(ownerZipcode, value, "Entering zip code value under Owner's information");
	}

}
