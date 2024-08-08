Feature: 28793-Make Appointment - Logged in user - Step 3C : Preventive care - OWP -What's going on?

Background:
Given user launched the Banfield application
#When user login as owp user
When User navigated to Home Screen
When User navigating to who are we scheduling page
Then user is navigated to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA

@sprint6 @regression @28793
Scenario:User 
And the user should be displayed with the following fields
#| Tell us more. | Options to choose | Notes for the vet |
And the options displayed are Comprehensive exam, Vaccination
And user should see options are not selected by default  
And the user should be able to tap on any one option to select   
And the selected option will be highlighted on select 
And the user can select only one option  

@sprint6 @regression @28793
Scenario: User
And notes for the vet is an optional fields
And User displayed with the Notes for the Vet fields
And user cannot enter more than 255 characters in the notes for vet fields
And Notes for the Vet field will show as a placeholder

@sprint6 @regression @28793
Scenario: User
And the Next CTA should be disabled by default until the user selects the option
And the Next CTA will be enabled once user selects the option
And the user taps on the Next CTA to get redirected to when & where screen  

@sprint6 @regression @28793
Scenario: User wants to select the illness tag and describe the pet symptoms.
And user taps on < to get redirected to the Reason for visit screen

@sprint6 @regression @28793
Scenario: User wants to select the illness tag and describe the pet symptoms.
And user taps on X icon to get redirected to the Home Screen