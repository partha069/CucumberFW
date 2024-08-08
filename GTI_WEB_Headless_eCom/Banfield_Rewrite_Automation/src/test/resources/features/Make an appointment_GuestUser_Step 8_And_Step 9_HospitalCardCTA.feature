Feature: 29248 - Make an appointment - Guest User - Step 8 and Step 9  : Hospital Card CTA

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
Then the Location services is enabled for the Device
#And the user taps on a location to select from the list

@29248 @sprint5 @regression
Scenario: User wants to validate
When the user is displayed with the Hospital locations
Then the user is displayed with the following
#| Map icon with miles | Hospital name | Hospital address | 
And the user can tap on the Map icon to go to the default map app with location pre-pinned.