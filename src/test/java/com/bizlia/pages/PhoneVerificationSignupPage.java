package com.bizlia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;


public class PhoneVerificationSignupPage extends CommonActions {

	public PhoneVerificationSignupPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
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
