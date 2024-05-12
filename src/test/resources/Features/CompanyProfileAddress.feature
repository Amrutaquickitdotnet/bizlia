@SheetCOMPANYPROFILEADDRESS
Feature: COMPANYPROFILEADDRESS

@Test
Scenario: TC01_Verification of Addresses tab Information under Company Profile page
Given User launch application in chrome browser   
When User click on login button from top navigation menu then should land on login page
When User enters Email Address and password
And click on the checkbox given for bot I am not robot 
Then click on the Login button 
Then after verification of email user should be redirect on phone authentication code 
Then click on the company setting arrow placed at the left hand side navigation 
Then click on company profile link from left hand side navigation menu under company settings page
Then Click on address tab located beside general information
Then enter the name in the field of owner information full name
Then enter the name in the field of owner information Title
Then enter the name in the field of owner information address line one
Then enter the name in the field of owner information address line twon
Then enter the name in the field of owner information City
Then enter the name in the field of owner information State
Then enter the name in the field of owner information ZipCode

