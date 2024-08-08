Feature: 27703 - Add a pet - Step 3 - Tell us about your pet

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user is on Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen

@27703 @sprint3 @regression
Scenario: User wants see Name,Age,Gender, Breed
Then the user will be redirected to Tell us about your pet screen
And the avatar should have the Name,Age,Gender, Breed 
And the user should be displayed the following in the form Gender,Spayed or Neutered
And the user should be displayed with the below option in the Gender option Male,Female,Unsure
And the user should be displayed with the below tag in the Spayed or Neutered option Yes,No,Unsure  
And no options are not selected by default
And the user should be able to tap on any option to select it choosing the options is a Mandatory action
And the selected option will be highlighted on tap
And the user cannot multiselect the options
And the Next CTA should be disabled by default
And the Next button is enabled after selecting the gender and Spayed/Neutered option
And the user taps on Next button to go to the What breed are they Screen 

@27703 @sprint3 @regression 
Scenario: User wants to veryfy Page Naigation
And the user taps on back at the top to go back to the previous screen Tell us about your pet

@27703 @sprint3 @regression 
Scenario: User wants to veryfy Page Naigation
And the user taps on close CTA at the top to go back to Home Screen