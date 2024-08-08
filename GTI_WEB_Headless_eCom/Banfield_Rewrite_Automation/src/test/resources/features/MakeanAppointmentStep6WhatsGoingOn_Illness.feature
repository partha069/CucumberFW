Feature: 26247-Make an Appointment Step 6 Whats going on Illness

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Illness option in Reason for visit screen
And they are redirected to the Reason for Visit screen
Then the user should be displayed with the following options New Patient, Illness, Injury
And the user cannot select multiple options
And the user tapped on Next for illness

@26247 @sprint2 @regression 
Scenario: - User wants to validate Fields
When they are redirected to Whats going on screen
Then the user should be displayed with the following fields to choose and enter Tell us more,Tags to choose, Notes for the vet
And the user should be displayed with the following tag:Coat/skin Coughing/sneezing/breathing issues, Ear/eye/nose, Seizures, Other/sluggishness, Teeth/mouth, Urinary issues, Vomiting/diarrhea
And the user is displayed with the Notes for the Vet fields
And the user when taps on it, the placeholder text will show as a label name.
And the user cannot enter more than 255 characters in the notes for vet field
And the notes for vet is an optional field
And the tags are not selected by default
And the user should be able to tap on any option to select a tag
And choosing the tags is a Mandatory action
And the selected tag will be highlighted on select
And the user can multiselect the tag
And the user should be able to deselect the tag.
And the Next CTA should be disabled by default until the user selects the tags
And the user taps on the Next CTA to get redirected to the when & where Screen

@26247 @sprint2 @regression
Scenario: - User wants to redirected to the Reason for visit screen
And the user taps on < to get redirected to the Reason for visit screen

@26247 @sprint2 @regression
Scenario: - User wants to redirected to the Reason for visit screen
And the user taps on X to get redirected to Have we met screen when user is in Reason for visit screen