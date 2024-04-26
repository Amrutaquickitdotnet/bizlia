package com.bizlia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.bizlia.common.CommonActions;


public class EmailVerificationLoginPage extends CommonActions {

	public EmailVerificationLoginPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
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

}
