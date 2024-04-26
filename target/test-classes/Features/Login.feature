@SheetLogin
Feature: LOGIN

@Test
Scenario: TC01_Verification of Login functionality of bizlia
Given User launch application in chrome browser   
When User click on login button from top navigation menu then should land on login page
When User enters Email Address and password
And click on the checkbox given for bot I am not robot 
Then click on the Login button 
Then after verification of email user should be redirect on phone authentication code 
   