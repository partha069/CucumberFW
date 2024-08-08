Feature: 28791-Make Appointment - Logged in user - Step 3A : Illness- What's going on?

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen

@sprint6 @regression @28791
Scenario: User wants to select the illness tag and describe the pet symptoms.
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
And the user taps on the Next CTA to get redirected to when & where Page

@sprint6 @regression @28791
Scenario: User wants to select the illness tag and describe the pet symptoms.
And the user taps on < to get redirected to the Reason for visit screen

@sprint6 @regression @28791
Scenario: User wants to select the illness tag and describe the pet symptoms.
And the user taps on X icon to get redirected to the Home Screen

#NATC:
#And the screen should display the Image/Avatar on top of the screen based on the Pet selected with <Pet name> visit
#And the third navigational dot will be highlighted