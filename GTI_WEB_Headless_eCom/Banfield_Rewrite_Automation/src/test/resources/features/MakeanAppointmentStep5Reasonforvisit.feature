Feature: 26246-Make an Appointment Step 5 Reason for visit

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And they are redirected to the Reason for Visit screen
Then the user should be displayed with the following options New Patient, Illness, Injury

@26246 @sprint2 @regression
Scenario: 26246-User wants to taps on the Next CTA After selecting Illness to get redirected to next screen
And the options are not selected by default.
And the user should be able to tap on one option to select.
And the user cannot select multiple options
And the remaining options should be greyed out on selecting an option
And the Next CTA should be disabled by default until the user select any options
And the Next CTA will be enabled once user selects an option
And the user taps on the Next CTA After selecting Illness to get redirected to next screen

@26246 @sprint2 @regression
Scenario: 26246-User wants to taps on the Next to get redirected to Whats going on Screen
And If they choose Injury  option then the user taps on the Next to get redirected to Whats going on Screen

@26246 @sprint2 @regression
Scenario: 26246-User wants to redirected to when and Where Screen on selecting New Patient option
When Else they will be redirected to when and Where Screen on selecting New Patient option

@26246 @sprint2 @regression
Scenario: 26246-User wants to get redirected to the Tell us about your pet Screen page
And the user taps on < to get redirected to the Tell us about your pet Screen page

@26246 @sprint2 @regression
Scenario: 26246-User wants to get redirected to the Tell us about your pet Screen page
And the user taps on X on Reason for Visit page to get redirected to Have we met screen