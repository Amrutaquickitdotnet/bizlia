package com.bizlia.Stepdefinations;

import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Common extends BaseTest {
	@Before
	public void getScenario(Scenario scenario) throws InterruptedException {
		// initiation();
		vTCName = scenario.getName();
		Collection<String> tagNames = scenario.getSourceTagNames();
		Iterator<String> itrator = tagNames.iterator();
		while (itrator.hasNext()) {
			String temp = itrator.next();
			System.out.println("I am tag Name" + temp);
			if (temp.startsWith("@Sheet")) {
				tagName = temp.replace("@Sheet", "");
				System.out.println("I am in Sheet" + tagName);
			}
		}
		initiationData();
		logger = extent.createTest(vTCName);

	}

	@After
	public void savereport() {
		// T=

		// logger.addScreenCaptureFromBase64String(tagName);
		extent.flush();
		driver.close();
		driver.quit();
		driver=null;
	}

	@Given("User launch application in chrome browser")
	public void user_launch_application_in_chrome_browser() {

		driver.get(prop.getProperty("AppUrl") + alldata.get(vTCName).get("Url"));

	}

	
	@Then("verify page with resize the login page")
	public void verify_logipage_resize() throws InterruptedException {
		   
		driver.manage().window().minimize();
		System.out.println("I am in start of verify_logipage_resize after maximize");

		logger.pass("window is resize to 50%");
		Thread.sleep(300);
		driver.manage().window().maximize();
		logger.pass("window is resize to 100%");
		Thread.sleep(300);
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		logger.pass("window is resize to 150%");
		System.out.println("I am in start of verify_logipage_resize END");

	}
}
