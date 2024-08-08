Feature: 28500-Create Account- Step 2C: Retrieve Client ID Pop-Up

Background:
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID
Then the user enters an Email ID in the field to get sent popup
And the Send my Client ID CTA is enabled only after entering the valid Email ID
And the user taps on Send my Client ID to get the pop-up message on entering unregistered Email ID

@28500 @sprint3 @regression 
Scenario: User receive a success message in order to retrieve their Banfield Client ID
And the user will tap on Open email CTA to open devices default mail.

@28500 @sprint3 @regression
Scenario: User receive a success message in order to retrieve their Banfield Client ID
And the user tap on close X icon to dismiss the pop-up.


#|Title: Sent! |Text: Look for an email with your Client ID in your inbox soon. | Open Email CTA |