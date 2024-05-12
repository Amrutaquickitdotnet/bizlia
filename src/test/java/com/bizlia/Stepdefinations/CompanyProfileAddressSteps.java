package com.bizlia.Stepdefinations;

import com.bizlia.pages.CompanyProfileAddressTabPage;

import io.cucumber.java.en.Then;

public class CompanyProfileAddressSteps extends BaseTest {
	@Then("Click on address tab located beside general information")
	public void click_on_address_tab_located_beside_general_information() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.clickingonAddressTab();
	}

	@Then("enter the name in the field of owner information full name")
	public void enter_the_name_in_the_field_of_owner_information_full_name() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationFullName(alldata.get(vTCName).get("OwnerInformationFullName").toString());
	}

	@Then("enter the name in the field of owner information Title")
	public void enter_the_name_in_the_field_of_owner_information_title() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationTitle(alldata.get(vTCName).get("OwnerInformationTitle").toString());
	}

	@Then("enter the name in the field of owner information address line one")
	public void enter_the_name_in_the_field_of_owner_information_address_line_one() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationAddressOne(alldata.get(vTCName).get("OwnerInformationAddressOne").toString());
	}

	@Then("enter the name in the field of owner information address line twon")
	public void enter_the_name_in_the_field_of_owner_information_address_line_twon() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationAddressTwo(alldata.get(vTCName).get("OwnerInformationAddressTwo").toString());
	}

	@Then("enter the name in the field of owner information City")
	public void enter_the_name_in_the_field_of_owner_information_city() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationCity(alldata.get(vTCName).get("OwnerInformationCity").toString());
	}

	@Then("enter the name in the field of owner information State")
	public void enter_the_name_in_the_field_of_owner_information_state() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationState(alldata.get(vTCName).get("OwnerInformationState").toString());
	}

	@Then("enter the name in the field of owner information ZipCode")
	public void enter_the_name_in_the_field_of_owner_information_zip_code() {
		CompanyProfileAddressTabPage addresses = new CompanyProfileAddressTabPage(driver, logger);
		addresses.ownerinformationZipCode(alldata.get(vTCName).get("OwnerInformationZipCode").toString());
	}

}
