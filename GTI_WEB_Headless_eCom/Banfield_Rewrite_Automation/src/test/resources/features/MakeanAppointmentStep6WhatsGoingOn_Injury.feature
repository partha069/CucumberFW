Feature: 26248-Make an Appointment Step 6 Whats going on Injury

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury

@26248 @sprint2 @regression 
Scenario: - User wants to enter more information on choosing Injury
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

@26248 @sprint2 @regression
Scenario: - User wants to enter more information on choosing Injury
And the user taps on < to get redirected to the Reason for visit screen

@26248 @sprint2 @regression
Scenario: - User wants to enter more information on choosing Injury
And the user taps on X to get redirected to Have we met screen when user is in Reason for visit screen