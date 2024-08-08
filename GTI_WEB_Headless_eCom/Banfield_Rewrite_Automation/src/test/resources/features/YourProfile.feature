Feature: 28805-Your Profile

Background:
Given user launched the Banfield application
When User navigated to Home Screen
When the user is on Hi Username screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen

@28805 @sprint5 @regression @smoke
Scenario: User wants to view their profile UI
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user taps on Change password CTA to get redirected to Update your password

@28805 @sprint5 @regression
Scenario: User wants to taps on Update profile CTA to get redirected to URL in the browser
And the user taps on Update profile CTA to get redirected to URL in the browser in logged in state
#URL: https://www.banfield.com/my-banfield/my-account

@28805 @sprint5 @regression 
Scenario: User wants to tap on back button to go back to previous screen
And the user tap on back button to go back to previous screen.

@28805 @sprint5 @regression 
Scenario: User wants to taps on Delete CTA to get redirected to Delete online account Screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user taps on Delete CTA to get redirected to Delete online account Screen

@28805 @sprint5 @regression @smoke
Scenario: User wants to taps on No Never Mind CTA on the Delete online account Screen and dont want to delete account
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user taps on No Never Mind CTA on the Delete online account Screen and dont want to delete account