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
		companysettings.doingBusinessAs(alldata.get(vTCName).get("Doing Business As").toString());
	}

	@Then("enter the name in the field of former company Name\\(s)")
	public void enter_the_name_in_the_field_of_former_company_name_s() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.formercompanyname(alldata.get(vTCName).get("Former Company Name(s)").toString());
	}

	@Then("enter the value in the field of Federal Tax ID")
	public void enter_the_value_in_the_field_of_federal_tax_id() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.federalTaxId(alldata.get(vTCName).get("Federal Tax ID").toString());
	}

	@Then("choose State Incorporated dropdown")
	public void choose_state_incorporated_dropdown() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.selectStateIncorporate(alldata.get(vTCName).get("State Incorporated").toString());
	
	}

	@Then("enter the value for Website Address")
	public void enter_the_value_for_website_address() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.websiteAddress(alldata.get(vTCName).get("Website Address").toString());
	}

	@Then("enter the value for Type of Industry")
	public void enter_the_value_for_type_of_industry() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.selectTypeOfIndustry(alldata.get(vTCName).get("Type of Industry").toString());
	}

	@Then("enter the value for How did you hear about us?")
	public void enter_the_value_for_how_did_you_hear_about_us() {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.howDidYouHearAboutUs(alldata.get(vTCName).get("How did you hear about us?").toString());
	}
   
	@Then("Click on save button to save General Information values")
	public void click_on_save_button_to_save_general_information_values() throws InterruptedException {
		CompanySettingsPage companysettings = new CompanySettingsPage(driver, logger);
		companysettings.saveDataGeneralInformation();
	Thread.sleep(5000);

}
}
