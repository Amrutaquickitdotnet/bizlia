package com.bizlia.Stepdefinations;

import com.bizlia.pages.CompanyServicesTabPage;

import io.cucumber.java.en.Then;

public class CompanyServicesSteps extends BaseTest {

	@Then("click on the services tab")
	public void click_on_the_services_tab() {
		CompanyServicesTabPage services = new CompanyServicesTabPage(driver,logger);
		services.serviceTabclick();
	}

	@Then("enter the details for the Brief Description of Business")
	public void enter_the_details_for_the_brief_description_of_business() {
		CompanyServicesTabPage services = new CompanyServicesTabPage(driver,logger);
		services.setBriefDescriptionofBusiness(alldata.get(vTCName).get("Brief Description of Business").toString());
	}

	@Then("enter the details for the Primary NAICs Codes")
	public void enter_the_details_for_the_primary_nai_cs_codes() {
		CompanyServicesTabPage services = new CompanyServicesTabPage(driver,logger);
		String value=alldata.get(vTCName).get("Primary NAICs Text").toString();
		String valueWithCode=alldata.get(vTCName).get("Primary NAICs Text And Codes").toString();
		services.setPrimaryNAICCodes(value,valueWithCode);
	}

	@Then("enter the details for the Secondary NAICs Codes")
	public void enter_the_details_for_the_secondary_nai_cs_codes() throws InterruptedException {
		CompanyServicesTabPage services = new CompanyServicesTabPage(driver,logger);
		String value=alldata.get(vTCName).get("Secondary NAICs Text").toString();
		String valueWithCode=alldata.get(vTCName).get("Secondary NAICs Text And Codes").toString();
		//services.secondaryNAICsCodes(alldata.get(vTCName).get("Secondary NAICs Codes").toString());
		services.setSecondaryNAICsCodes(value,valueWithCode);
		
		 value=alldata.get(vTCName).get("Secondary NAICs Text 2").toString();
		 valueWithCode=alldata.get(vTCName).get("Secondary NAICs Text And Codes 2").toString();
		//services.secondaryNAICsCodes(alldata.get(vTCName).get("Secondary NAICs Codes").toString());
		services.setSecondaryNAICsCodes(value,valueWithCode);
		Thread.sleep(30000);
		
	}

}
