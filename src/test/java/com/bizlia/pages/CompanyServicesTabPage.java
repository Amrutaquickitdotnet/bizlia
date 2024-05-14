package com.bizlia.pages;

import java.util.List;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//select[@id='nica_codes_primary']/../div/ul")
	WebElement primaryNAICCodes;
	
	@FindBy(xpath = "//select[@id='nica_codes_primary']/../div/ul/li//input")
	WebElement primaryNAICCodesInput;
	
	
	@FindBy(xpath = "//select[@id='nica_codes']/../div/ul")
	WebElement secondaryNAICCodes;
	
	@FindBy(xpath = "//select[@id='nica_codes']/../div/ul/li//input")
	WebElement secondaryNAICCodesInput;


	@FindBy(xpath = "//button[@id='comp-services-tab']")
	WebElement servicesTab;

	public void serviceTabclick() {
		clickElement(servicesTab, "Clicking on servicesTab");
	}

	

	public void setBriefDescriptionofBusiness(String value) {
		setInput(briefDescriptionofBusiness, value, "Entering data inside the briefDescriptionofBusiness");
	}
	
	public void setPrimaryNAICCodes(String value,String valueWithCode) {
		try {
			clickElement(primaryNAICCodes,"choosing value for primary NAIC Codes");
			setInput(primaryNAICCodesInput,value,"choosing value for primary NAIC Codes");			 
		   // clickElement(driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]/a")),"choosing value for primary NAIC Codes");
		    //html/body/div[3]/ul/li[1]/a/span[contains(text(),`Pharmaceutical and Medicine Manufacturing`)]
			
			int i=0;
		    List<WebElement> elements =driver.findElements(By.xpath("/html/body/div[3]/ul/li"));
		    for (WebElement webElement : elements) {
				String text= webElement.getText();
				if(text.equalsIgnoreCase(valueWithCode)) {
					clickElement(webElement,"choosing value for primary NAIC Codes");
					break;
				}
			}
		}catch(Exception ex) {
			System.out.println("In Error");
			ex.printStackTrace();
		}
		}
	
	public void setSecondaryNAICsCodes(String value,String valueWithCode) {
		//setDropDownElementByVisibleText(secondaryNAICCodes, value, "choosing value for secondaryNAICCodes");
		
		try {
			clickElement(secondaryNAICCodes,"choosing value for secondaryNAICCodes");
		 	setInput(secondaryNAICCodesInput,value,"choosing value for secondaryNAICCodes");
		 	
		 	List<WebElement> elements =driver.findElements(By.xpath("/html/body/div[3]/ul/li"));
			 for (WebElement webElement : elements) {
				String text= webElement.getText();
				if(text.equalsIgnoreCase(valueWithCode)) {
					clickElement(webElement,"choosing value for primary NAIC Codes");
					break;
				}
			}
		}catch(Exception ex) {
			System.out.println("In Error");
			ex.printStackTrace();
		}
		}
	}

