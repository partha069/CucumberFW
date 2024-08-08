Feature: 27704-Add a pet - Step 4 - What breed are they?

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user is on Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen

@27704 @sprint3 @regression
Scenario: User wants to add details of Pet
And the avatar should have the Name, Age, Gender Spayed or Neutered, Breed
And the user is displayed with search to select Breed where Enter breed is displayed as a placeholder text.
And the user taps on the Search field/icon to expand the search screen What breed are they 2
And the alphanumeric keypad should be displayed when they tap on the search field
And the user can choose a breed from the suggested List by tapping on Next CTA
And the user can tap on Cancel after selecting a breed to restart the search What breed are they 4
And the user tap Next CTA to display Pet Name is a mixed breed What breed are they 5.0

@27704 @sprint3 @regression 
Scenario: User wants to add details of Pet
And the user can tap on the checkbox to confirm Pet Name is a mixed breed What breed are they 5.1
And the checkbox is not a mandatory field

@27704 @sprint3 @regression
Scenario: User wants to add details of Pet
And the Next CTA is enabled after selecting the breed
And the user taps on Next CTA to go to the Lets add their photo screen

@27704 @sprint3 @regression 
Scenario: User wants to taps on < at the top to go back to the previous screen Tell us about your pet
And the user taps on < at the top to go back to the previous screen Tell us about your pet

@27704 @sprint3 @regression 
Scenario: User wants to taps on X at the top to go back to Home Screen
And user is on what breed arethey page and the user taps on X at the top to go back to Home Screen