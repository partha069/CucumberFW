Feature: 26344-Create Account - Step 2A: Enter a Banfield Client ID

Background:
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Client ID field with a placeholder text : Client ID Ex: BNF123B

@26344 @regression @sprint2
Scenario:- User enters a  Valid Banfield Client ID to create an account 
Then the user enters the Banfield Client ID in the field 
And the user cannot enter more than ten characters in the Client ID field 
And the user cannot enter any special characters in the client ID field 
And the Next CTA is enabled only after entering the Banfield ID 
And the user taps on Next CTA to validate the Banfield ID entered 
And the user is redirected to the next screen Sign up for MyBanfield on entering a valid Banfield ID 

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and click X on error Popup 
And the user is displayed with the error message pop up on entering an Invalid Banfield ID 
And the user taps on X on pop up to close the pop up and stay on the same screen

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and taps on Help with Client IDs
And the user is displayed with the error message pop up on entering an Invalid Banfield ID 
And the user taps on Help with Client IDs to get redirected to the Help with Client IDs screen on Pop up Message 
And the user taps on X on pop up to go back to welcome screen

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and taps on Help with Client IDs
And the user is displayed with the error message pop up on entering an Invalid Banfield ID 
And the user taps on Help with Client IDs to get redirected to the Help with Client IDs screen on Pop up Message 
And the user taps on < to get redirected to the previous screen Sign up for MyBanfield

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and user taps on Make an appointment
And the user is displayed with the error message pop up on entering an Invalid Banfield ID 
And the user taps on Help with Client IDs to get redirected to the Help with Client IDs screen on Pop up Message 
And the user is displayed with the Make an appointment CTA 
And the user taps on Make an appointment CTA to get redirected to Have we met? screen

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and user taps on Make an appointment
And the user taps on X to get redirected to the Welcome Screen 

@26344 @regression @sprint2 
Scenario:- User enters a Invalid Banfield Client ID to create an account and user taps on Make an appointment
And the user taps on < to get redirected to the Have we met screen