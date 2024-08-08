Feature: 31233-Make Appointment - Logged in user - Step 3D : Preventive Care - NWP -What's going on?

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA

@sprint6 @regression @31233
Scenario: User should able to very all fields
And the user should be displayed with the Tell us more,Options to choose,Notes for the vet fields
#| Tell us more. | Options to choose | Notes for the vet |
And the NWP pet should be displayed with the Routine visit , Vaccination options   
#| Routine visit | Vaccination |
And user should able to see options are not selected by default 
And the user should be able to tap on any one option to select 
And the selected option will be highlighted on select
And the user can select only one option is mandatory

@sprint6 @regression @31233
Scenario: User should validate all fields
And notes for the vet is an optional fields
And User displayed with the Notes for the Vet fields
And user cannot enter more than 255 characters in the notes for vet fields
And Notes for the Vet field will show as a placeholder
 
@sprint6 @regression @31233
Scenario: User should validate Next CTA and should able to redirect to next screen.
And the Next CTA should be disabled by default until the user selects the option
And the Next CTA will be enabled once user selects the option
And the user taps on the Next CTA to get redirected to when & where screen

@sprint6 @regression @31233
Scenario: User should redirected to previous screen. 
And user taps on < to get redirected to the Reason for visit screen

@sprint6 @regression @31233
Scenario: User should redirected to Home screen. 
And user taps on X icon to get redirected to the Home Screen

#NATC
#And the screen should display the Image/Avatar on top of the screen based on the Pet selected with <Pet name> visit
#And the third navigational dot will be highlighted