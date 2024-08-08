Feature: 26341-Create account- Without Banfield ID

Background:
Given user is on the welcome screen 
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
And the user is displayed with the following options on the modal, Nearest Banfield ,Okay 

@26341 @regression @sprint2
Scenario: User without Banfield ID wants to create an account and click on Nearest Banfield
And the user taps on Nearest Banfield to get redirected to the Hospital Locator screen.

@26341 @regression @sprint2 
Scenario: User without Banfield ID wants to create an account and click on Nearest Banfield
And the user taps on Nearest Banfield to get redirected to the Hospital Locator screen.

@26341 @regression @sprint2 
Scenario: User without Banfield ID wants to create an account and click on okay
And the user taps on Okay to dismiss the modal to stay on the same screen