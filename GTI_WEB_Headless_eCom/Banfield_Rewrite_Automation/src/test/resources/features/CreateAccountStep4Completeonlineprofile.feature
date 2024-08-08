Feature: 26993-Create Account - Step 4: Complete Online Profile

Background:
Given user is on the Sign up for MyBanfield screen 
When the user enters valid client Id and click on Next CTA 
Then User enter valid credentials and click on next CTA on Step three 

@32716 @regression @sprint8 
Scenario:- User wants to verify static text
And User wants to verify Yes, I would like to receive email offers and reminders

@26993 @regression @sprint2 
Scenario:- User wants to see error message for entering invalid email id
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user should enter email, password and confirm password as these are mandatory fields 
And the user is displayed with an error message on entering invalid email id Error Message:  Invalid email 
And the user should be displayed with a pop-up if the account already exist with the registered email id: Title: Whoops

@26993 @regression @sprint2 
Scenario:- User wants to redirecting to Log in page from Whoops popups
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user should enter email, password and confirm password as these are mandatory fields 
And the user taps on Log in now CTA to get redirected to Log in page

@26993 @regression @sprint2 
Scenario:- User wants to verify error message if the email field is left blank
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user should be displayed with an inline error message if the email field is left blank: Field cannot be blank

@26993 @regression @sprint2 
Scenario:- User wants to displayed with an error message Passwords do not match if confirm password doesnt match with password field
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user should be displayed with an error message Passwords do not match if confirm password doesnt match with password field 

@26993 @regression @sprint2 
Scenario:- User wants to redirected to the previous screen Verify your identity screen
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user taps on < to get redirected to the previous screen Verify your identity screen 

@26993 @regression @sprint2  
Scenario:- User wants to redirected to the Welcome Screen
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen
And the user taps on X in complete online profile screen to get redirected to the Welcome Screen