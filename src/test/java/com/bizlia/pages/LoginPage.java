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

public class LoginPage extends CommonActions {

	public LoginPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@name ='email']")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@name ='password']")
	WebElement passwordElement;
	
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement LoginButton;

	public void enterEmailElement(String value) {

		setInput(emailElement, value, "When email is entered:" + value);
	}

	public void enterPasswordElement(String value) {

		setInput(passwordElement, value, "when password is entered :" + value);

	}
	
	public void loginButtonClick() {
		clickElementJavaScriptExecutor(LoginButton, "When login button is clicked");
	}

}
