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

	@FindBy(xpath = "//ul[@id='e-commerce']/li[1]/a")
	WebElement companyProfileLink;

	@FindBy(name = "doingbuzas")
	WebElement companydoingbusiness;

	@FindBy(name = "formercompname")
	WebElement formerCompanyName;

	@FindBy(name = "federaltaxid")
	WebElement federalTaxId;

	@FindBy(name = "websiteurl")
	WebElement WebsiteUrl;

	@FindBy(id = "typeofindustry")
	WebElement typeOfIndustry;

	@FindBy(xpath = "//textarea[@name='howdidhear']")
	WebElement howDidYouHear;

	@FindBy(xpath = "//select[@id='stateincorporated']")
	WebElement stateIncorporated;

	@FindBy(xpath = "//select[@id='typeofindustry']")
	WebElement selectTypeOfIndustry;

	@FindBy(xpath = "//button[@type ='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//input[@id ='comp-misc-info-tab']")
	WebElement addressesTab;

	@FindBy(xpath = "//input[@id ='full_name']")
	WebElement ownerInformationfullName;

	@FindBy(xpath = "//input[@id ='title']")
	WebElement ownerTitle;

	@FindBy(xpath = "//button[@id ='addressone']")
	WebElement owneraddressLineOne;

	@FindBy(xpath = "//button[@id ='addresstwo']")
	WebElement owneraddressLineTwo;

	@FindBy(xpath = "//input[@placeholder ='City']")
	WebElement ownercity;

	@FindBy(xpath = "//input[@placeholder ='State']")
	WebElement ownerstate;

	@FindBy(xpath = "//input[@placeholder ='Zipcode']")
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

	public void companySettingsClick() {
		clickElement(companySettingsmodule, "When companySetting accordion icon is clicked");
	}

	public void companyProfileClick() {
		clickElement(companyProfileLink, "When companyProfileLink is clicked");
	}

	public void doingBusinessAs(String value) {
		SetInput(companydoingbusiness, value, "Entering details under doing business as");
	}

	public void formercompanyname(String value) {
		SetInput(formerCompanyName, value, "Entering details under formercompanyname field");
	}

	public void federalTaxId(String value) {
		SetInput(federalTaxId, value, "Entering details under federalTaxId field");
	}

	public void websiteAddress(String value) {
		SetInput(WebsiteUrl, value, "Entering Website Address");
	}

	public void howDidYouHearAboutUs(String value) {
		SetInput(howDidYouHear, value, "Entering text for How did you hear about us ?");
	}

	public void selectStateIncorporate(String state) {
		setDropDownElementByVisibleText(stateIncorporated, state, "Choosing state Incorporate");
	}

	public void selectTypeOfIndustry(String state) {
		setDropDownElementByVisibleText(selectTypeOfIndustry, state, "Choosing selectTupeOfIndustry");
	}

	public void saveDataGeneralInformation() {
		clickElementJavaScriptExecutor(saveButton,
				"When clicking on save button information get saved for genearl information tab");

	}

	public void clickingonAddressTab() {
		clickElementJavaScriptExecutor(addressesTab, "When clicking on addresses tab from company profile");

	}

	public void ownerinformationFullName(String value) {
		SetInput(ownerInformationfullName, value, "Entering full name under Owner's information");
	}

	public void ownerinformationTitle(String value) {
		SetInput(ownerTitle, value, "Entering Title under Owner's information");
	}

	public void ownerinformationAddressOne(String value) {
		SetInput(owneraddressLineOne, value, "Entering details of address one inside Owner's information");
	}

	public void ownerinformationAddressTwo(String value) {
		SetInput(owneraddressLineTwo, value, "Entering details of address two  under Owner's information");
	}

	public void ownerinformationCity(String value) {
		SetInput(ownercity, value, "Entering city under Owner's information");
	}

	public void ownerinformationState(String value) {
		SetInput(ownerstate, value, "Entering state under Owner's information");
	}

	public void ownerinformationZipCode(String value) {
		SetInput(ownerZipcode, value, "Entering zip code value under Owner's information");
	}

}
