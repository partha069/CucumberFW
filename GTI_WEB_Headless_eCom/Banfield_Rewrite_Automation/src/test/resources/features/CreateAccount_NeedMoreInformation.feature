Feature: 26349-Create Account - Need more information
Background:
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen 
And the user is displayed with the following on screen Need help with your Client ID? ,
And the user is displayed with the Make an appointment CTA on Help with Client IDs screen 

@32716 @regression @sprint8
Scenario:- User wants to verify Help with Client IDs Screen
And User wants to verify Help with Client IDs Page

@26349 @regression @sprint2 
Scenario:- User is looking for more information on Client IDs 
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 

@26349 @regression @sprint2 
Scenario:- User wanted to see open devices default dialer is open after tapping on phonenumber
And the user taps on 877-656-7146 hyperlink to open devices default dialer

@26349 @regression @sprint2 
Scenario:- User wants to go back to the previous screen 
And the user taps on < to get redirected to the previous screen  on Help with Client IDs screen

@26349 @regression @sprint2 
Scenario:- User wants to close the current screen and go back to the welcome screen
And the user taps on X to get redirected to the Welcome screen on Help with Client IDs screen