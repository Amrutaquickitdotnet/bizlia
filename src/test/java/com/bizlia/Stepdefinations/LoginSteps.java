package com.bizlia.Stepdefinations;

import com.bizlia.pages.DataBaseConnectorPage;
import com.bizlia.pages.EmailVerificationLoginPage;
import com.bizlia.pages.HomePage;
import com.bizlia.pages.LoginPage;
import com.bizlia.pages.PhoneVerificationLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {

	@When("User click on login button from top navigation menu then should land on login page")
	public void user_click_on_login_button_from_top_navigation_menu_then_should_land_on_login_page() {
		HomePage home = new HomePage(driver, logger);
		home.loginnavigationlink();

	}

	@When("User enters Email Address and password")
	public void user_enters_email_address_and_password() {
		LoginPage login = new LoginPage(driver, logger);
		login.enterEmailElement(alldata.get(vTCName).get("Userid").toString());
		login.enterPasswordElement(alldata.get(vTCName).get("Password").toString());
	}

	@When("click on the checkbox given for bot I am not robot")
	public void click_on_the_checkbox_given_for_bot_i_am_not_robot() {
		LoginPage login = new LoginPage(driver, logger);
		login.captchaselection();
	}

	@Then("click on the Login button")
	public void click_on_the_login_button() {
		LoginPage login = new LoginPage(driver, logger);
		login.loginButtonClick();
	}

	

	@Then("after verification of email user should be redirect on phone authentication code")
	public void after_verification_of_email_user_should_be_redirect_on_phone_authentication_code() throws InterruptedException {
		DataBaseConnectorPage db = new DataBaseConnectorPage(driver, logger);
		String phoneCode = db.fetchLoginPhoneCode(alldata.get(vTCName).get("EmailAddress").toString());
		PhoneVerificationLoginPage verificationPhoneCode = new PhoneVerificationLoginPage(driver, logger);

		verificationPhoneCode.setPhoneCode(phoneCode);
		Thread.sleep(5000);
	}

}
