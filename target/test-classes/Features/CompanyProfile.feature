@SheetCOMPANYPROFILE
Feature: COMPANYPROFILE

@Test
Scenario: TC01_Verification of General Information under Company Profile page
Given User launch application in chrome browser   
When User click on login button from top navigation menu then should land on login page
When User enters Email Address and password
And click on the checkbox given for bot I am not robot 
Then click on the Login button 
Then after verification of email user should be redirect on phone authentication code 
Then click on the company setting arrow placed at the left hand side navigation 
Then click on company profile link from left hand side navigation menu under company settings page
Then enter the name in the field of doing business as 
Then enter the name in the field of former company Name(s)
Then enter the value in the field of Federal Tax ID
Then choose State Incorporated dropdown
Then enter the value for Website Address
Then enter the value for Type of Industry
Then enter the value for How did you hear about us?
Then Click on save button to save General Information values