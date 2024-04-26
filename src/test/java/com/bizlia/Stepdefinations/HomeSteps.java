package com.bizlia.Stepdefinations;

import com.bizlia.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomeSteps extends BaseTest {

	
	@Then("click on signup button")
	public void click_on_signup_button() {
		  HomePage home = new HomePage(driver, logger);
		  home.signUp();
	}

}
