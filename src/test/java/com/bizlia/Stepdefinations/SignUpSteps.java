package com.bizlia.Stepdefinations;

import com.bizlia.pages.LegalBusinessSignupPage;
import com.bizlia.pages.DataBaseConnectorPage;
import com.bizlia.pages.EmailVerificationSignup;
import com.bizlia.pages.PhoneVerificationSignupPage;
import com.bizlia.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps extends BaseTest {

	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {

	}

	@When("I enter valid signup details")
	public void i_enter_valid_signup_details() throws InterruptedException {
		SignUpPage signup = new SignUpPage(driver, logger);
		signup.enterfirstName(alldata.get(vTCName).get("FirstName").toString());
		signup.enterLastName(alldata.get(vTCName).get("LastName").toString());
		signup.enterEmail(alldata.get(vTCName).get("EmailAddress").toString());
		signup.selectPhoneCountryCode(alldata.get(vTCName).get("PhoneNumberCountryCode").toString());
		signup.phoneentry(alldata.get(vTCName).get("PhoneField").toString());
		signup.scrollVertically(2000);
		Thread.sleep(5000);
		signup.passwordentry(alldata.get(vTCName).get("Password").toString());
		Thread.sleep(2000);
		signup.confirmPassword(alldata.get(vTCName).get("ConfirmPassword").toString());

	}

	@When("Check the box for terms and conditions")
	public void check_the_box_for_terms_and_conditions() throws InterruptedException {
		SignUpPage signup = new SignUpPage(driver, logger);
		signup.acceptTermsandConditions();
		Thread.sleep(3000);
	}

	@When("Validate the captcha")
	public void validate_the_captcha() throws Exception {
		SignUpPage signup = new SignUpPage(driver, logger);
		signup.captchaselection();

	}

	@When("I click the signup button")
	public void i_click_the_signup_button() {
		SignUpPage signup = new SignUpPage(driver, logger);
		signup.signupbutton();
	}

	@Then("I should be redirected to two way authentication page to enter verification code for email")
	public void i_should_be_redirected_to_two_way_authentication_page_to_enter_verification_code_for_email() {
		DataBaseConnectorPage db = new DataBaseConnectorPage(driver, logger);
		String emailCode = db.fetchAuthenticationEmailCode(alldata.get(vTCName).get("EmailAddress").toString());

		EmailVerificationSignup verificationemailcode = new EmailVerificationSignup(driver, logger);
		verificationemailcode.setEmailCode(emailCode);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

		}
	}

	@Then("user should land on phone verification page to enter verification code")
	public void user_should_land_on_phone_verification_page_to_enter_verification_code() {
		DataBaseConnectorPage db = new DataBaseConnectorPage(driver, logger);
		String phoneCode = db.fetchAuthenticationPhoneCode(alldata.get(vTCName).get("EmailAddress").toString());
		PhoneVerificationSignupPage verificationPhoneCode = new PhoneVerificationSignupPage(driver, logger);

		verificationPhoneCode.setPhoneCode(phoneCode);

	}

	@Then("enter the company details")
	public void enter_the_company_details() {
		LegalBusinessSignupPage legalbusinessName = new LegalBusinessSignupPage(driver, logger);
		legalbusinessName.setOrgName(alldata.get(vTCName).get("orgName").toString());
		legalbusinessName.setOrgSubmit();
	}

	@Then("user should be land on the dashboard")
	public void user_should_be_land_on_the_dashboard() {

	}

}
