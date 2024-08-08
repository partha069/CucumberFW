Feature: 28084 - Highlights - Payment details

Background:
Given user launched the Banfield application
#When the OWP user is on the Highlights Tab
#When User navigated to Home Screen
When user login as owp user
When the user taps on Payment details CTA

@28084 @sprint5 @regression @smoke
Scenario: OWP User wants to view the payment details of their plan
Then the user should get redirected to Payment details screen
And the screen should display the following info:
#| Your payment info |
#| Renewal date|
#| Renewal status |
#| Next payment |
#| Last payment |
#| Amount of last payment |
#| Preferred payment day |
#| Manage plan CTA |
And the user taps on Manage plan CTA to get redirected to URL on browser
#URL: https://www.banfield.com/my-banfield/my-account
#And the user will be redirected in Logged in state

@28084 @sprint5 @regression
Scenario: OWP User wants to view the payment details of their plan
And the user should be to click on < icon to go back to Highlights screen