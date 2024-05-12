@SheetCOMPANYSERVICES
Feature: COMPANYSERVICES

@Test
Scenario: TC01_Verification of company services tab under Company Profile page
Given User launch application in chrome browser   
When User click on login button from top navigation menu then should land on login page
When User enters Email Address and password
And click on the checkbox given for bot I am not robot 
Then click on the Login button 
Then after verification of email user should be redirect on phone authentication code 
Then click on the company setting arrow placed at the left hand side navigation 
Then click on company profile link from left hand side navigation menu under company settings page
Then click on the services tab 
Then enter the details for the Brief Description of Business
Then enter the details for the Primary NAICs Codes
Then enter the details for the Secondary NAICs Codes