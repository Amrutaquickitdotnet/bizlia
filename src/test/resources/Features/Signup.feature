@SheetSIGNUP
Feature: SIGNUP

@Test
Scenario: TC01_Verification of Signup functionality of bizlia
Given User launch application in chrome browser
Then click on signup button           
Given I am on the signup page
When I enter valid signup details
And Check the box for terms and conditions
When Validate the captcha 
And I click the signup button
Then I should be redirected to two way authentication page to enter verification code for email
Then user should land on phone verification page to enter verification code
Then enter the company details 
Then user should be land on the dashboard


