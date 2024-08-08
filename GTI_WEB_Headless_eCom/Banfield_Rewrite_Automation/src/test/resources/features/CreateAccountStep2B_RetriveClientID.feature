Feature: 26346-Create Account - Step 2B: Retrieve Client ID

Background:
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID

@32716 @regression @sprint8
Scenario:- User wants to retrieve their Banfield Client ID
And the user is displayed with the error message pop up on entering an unregistered Email ID
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And User wants to verify UI for Need help finding your MyBanfield email

@26346 @regression @sprint2 @regression 
Scenario:- User wants to retrieve their Banfield Client ID 
Then the user enters an Email ID in the field 
And the user cannot enter more than 320 Characters in the Email ID field 
And the user can enter the email only in a valid email ID format 
And the Send my Client ID CTA is enabled only after entering the valid Email ID
And the user taps on Send my Client ID CTA to validate the Email ID entered
#And the user is displayed with the message on pop up on entering a registered Email ID (Step Not Req)
And Looks like you already have an account 
And Log In Now 
And the user taps on Log In Now CTA to get redirected to login page 

@26346 @regression @sprint2
Scenario:- User wants to retrieve their Banfield Client ID 
And the user is displayed with an inline error message Invalid Email on entering an Invalid Email format 

@26346 @regression @sprint2 
Scenario:- User wants to retrieve their Banfield Client ID 
And the user is displayed with the error message pop up on entering an unregistered Email ID 
And Whoops! 
And That email isnt in our system 
And Forgot your MyBanfield email? 
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And Need help finding your MyBanfield email? 
And the user on clicking on support hotline number gets redirected to dialer with the phone number pre-filled

@26346 @regression @sprint2 
Scenario:- User wants to retrieve their Banfield Client ID 
And the user is displayed with the error message pop up on entering an unregistered Email ID
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And the user tap on X on pop up to close the pop up and stay on the same screen

@26346 @regression @sprint2 
Scenario:- User wants to retrieve their Banfield Client ID 
And the user is displayed with the error message pop up on entering an unregistered Email ID
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And the user tap on Okay CTA to dismiss the pop-up and get redirected to the "Sign up for MyBanfield" screen.

@26346 @regression @sprint2 
Scenario:- User wants to retrieve their Banfield Client ID 
And the user taps on < to get redirected to the Have we met screen 

@26346 @regression @sprint2 
Scenario:- User wants to retrieve their Banfield Client ID 
And the user taps on X to get redirected to the Welcome Screen on SignUpForMyBanfield