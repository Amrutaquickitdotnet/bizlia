package com.bizlia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;


public class SignUpPage extends CommonActions {

	public SignUpPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement emailAddress;

	@FindBy(id = "country")
	WebElement phonedropdown;

	@FindBy(id = "phoneNumber")
	WebElement phonefield;

	//
	
	
	
	
	@FindBy(name = "password")
	WebElement password;
	
	public String apiKey;

	@FindBy(id = "password-field1")
	WebElement confirmpassword;
	
	
	@FindBy(id = "g-recaptcha-response")
	WebElement captchaField;

	@FindBy(id = "acceptTerms")
	WebElement acceptTerms;

	@FindBy(id = "signupButton")
	WebElement signupButton;

	public void enterfirstName(String value) {

		SetInput(firstName, value, "firstName when value is :" + value);
	}

	public void enterLastName(String value) {

		SetInput(lastName, value, "lastName when value is :" + value);

	}

	public void enterEmail(String value) {

		SetInput(emailAddress, value, "emailaddress when value is :" + value);
	}

	public void phoneentry(String value) {
		SetInput(phonefield, value, "Error in phonefield when value is :" + value);

	}

	public void passwordentry(String value) {

		SetInput(password, value, "password when value is :" + value);
	}

	public void confirmPassword(String value) {

		SetInput(confirmpassword, value, "confirmpassword when value is :" + value);

	}

	public void selectPhoneCountryCode(String countrycode) {
		setDropDownElementByVisibleText(phonedropdown, countrycode);
	}

	public void scrollingvertical() {

		scrollingvertical("div.pagefooter", "300", "900");
	}

	

	public void acceptTermsandConditions() {
		checkCheckbox(acceptTerms);
	}

	public void signupbutton() {
		
		
		clickElementJavaScriptExecutor(signupButton,"When clicking on signup button");
		


	}

	
	public void setEmailCode(String emailCode) {
		// TODO Auto-generated method stub
		for(int i=0;i<emailCode.length();i++) {
			String str=Integer.toString(i+1);
			WebElement ele=	driver.findElement(By.id("email-input-"+str));
			ele.sendKeys(Character.toString(emailCode.charAt(i)));
		}
		
		try {
			Thread.sleep(400);
			driver.findElement(By.id("email-verify-btn")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void setPhoneCode(String emailCode) {
		// TODO Auto-generated method stub
		for(int i=0;i<emailCode.length();i++) {
			String str=Integer.toString(i+1);
			WebElement ele=	driver.findElement(By.id("phone-input-"+str));
			ele.sendKeys(Character.toString(emailCode.charAt(i)));
		}
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("phone-verify-btn")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
