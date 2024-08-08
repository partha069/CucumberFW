Feature: 28792-Make Appointment - Logged in user - Step 3B : Injury-What's going on?

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen

@sprint6 @regression @28792
Scenario: User wants to select the injury tag and describe the pet symptoms.
When they are redirected to Whats going on screen
Then the user should be displayed with the following fields to choose and enter Tell us more,Tags to choose, Notes for the vet
And the user should be displayed with the following tag: Lameness,Other traumatic injury, Wound
And the user is displayed with the Notes for the Vet fields
And the user cannot enter more than 255 characters in the notes for vet fields
And the Notes for the Vet field will show as a placeholder text.
And tags are not selected by default
And the user should be able to tap on any option to select a tags
And choosing the tags is a Mandatory action.
And the selected tag will be highlighted on each select
And the user should be able to deselect the tags.
And the Next CTA should be disabled by default until the user selects the tags
And the Next CTA will be enabled once user will selects the respective tag
And the notes for the vet is an optional field
And the user taps on the Next CTA to get redirected to when & where Screen

@sprint6 @regression @28792
Scenario: User wants to select the illness tag and describe the pet symptoms.
And the user taps on < to get redirected to the Reason for visit screen

@sprint6 @regression @28792
Scenario: User wants to select the illness tag and describe the pet symptoms.
And the user taps on X icon to get redirected to the Home Screen

#NATC
#And the screen should display the Image/Avatar on top of the screen based on the Pet selected with <Pet name> visit
#And the third navigational dot should be highlighted