Feature: 26920-Login-Need Help?
Background:
Given the user is on Login screen 
When the user clicks on Need Help? CTA 
Then the user should be redirected to Need help with your password? screen 
And the user is displayed with the following on the screen

@26920 @sprint3 @regression @smoke
Scenario: User wants to reset the password 
And Send my reset link CTA is disabled by default 
And the user on entering invalid email should show an inline error message Invalid Email
And the user on entering the email ID in the Email ID should enable the Send my reset link CTA 
And the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up
And user tap on contact support hyperlink to get redirected to native dialer phone call screen 

@26920 @sprint3 @regression 
Scenario: User wants to reset the password 
And the user on entering the email ID in the Email ID should enable the Send my reset link CTA 
And the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up
And user tap on Okay CTA to exit from the pop-up screen 

@26920 @sprint3 @regression 
Scenario: User wants to reset the password 
And the user on entering the email ID in the Email ID should enable the Send my reset link CTA 
And the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up
And the user tap on X icon to exit from the pop-up message and remain on the same screen 

@26920 @sprint3 @regression
Scenario: User wants to reset the password 
And the user taps on < to get redirected to the Login screen
