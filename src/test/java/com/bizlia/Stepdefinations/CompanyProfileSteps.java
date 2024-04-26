package com.bizlia.Stepdefinations;

import com.bizlia.pages.CompanySettingsPage;

import io.cucumber.java.en.Then;

public class CompanyProfileSteps extends BaseTest {

	@Then("click on the company setting arrow placed at the left hand side navigation")
	public void click_on_the_company_setting_arrow_placed_at_the_left_hand_side_navigation() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.companySettingsClick();
	}

	@Then("click on company profile link from left hand side navigation menu under company settings page")
	public void click_on_company_profile_link_from_left_hand_side_navigation_menu_under_company_settings_page() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.companyProfileClick();		
	
	}

	@Then("enter the name in the field of doing business as")
	public void enter_the_name_in_the_field_of_doing_business_as() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		
	}

	@Then("enter the name in the field of former company Name\\(s)")
	public void enter_the_name_in_the_field_of_former_company_name_s() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("enter the value in the field of Federal Tax ID")
	public void enter_the_value_in_the_field_of_federal_tax_id() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("choose State Incorporated dropdown")
	public void choose_state_incorporated_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("enter the value for Website Address")
	public void enter_the_value_for_website_address() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("enter the value for Type of Industry")
	public void enter_the_value_for_type_of_industry() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("enter the value for How did you hear about us?")
	public void enter_the_value_for_how_did_you_hear_about_us() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Click on save button to save General Information values")
	public void click_on_save_button_to_save_general_information_values() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
