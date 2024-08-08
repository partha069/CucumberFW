Feature: 26343-Create Account - Step 1: View "Sign up for MyBanfield" screen

Background:
Given user is on the Sign up for MyBanfield screen
Then the user should be displayed with the section to enter Client ID to sign up 
And the user is displayed with the section to retrieve Client ID
And the greyed out text in Enter email field : Enter email
And the user is displayed with the Need more information? CTA 

@26343 @regression @sprint2 
Scenario: User wants to view and access the CTAs on the MyBanfield screen and user taps on Help with Client IDs hyperlink
And the user taps on Help with Client IDs hyperlink to get redirected to Help with Client IDs screen

@26343 @regression @sprint2
Scenario: User wants to view and access the CTAs on the MyBanfield screen and user taps on the Need more information CTA
And the user taps on the Need more information CTA to invoke the Help with Client ID's screen