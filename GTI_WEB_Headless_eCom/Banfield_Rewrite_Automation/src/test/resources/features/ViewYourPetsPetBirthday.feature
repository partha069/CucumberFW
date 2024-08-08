Feature: 28033- View Your Pets - Pet Birthday

@28033 @regression @sprint3 
Scenario: User wants to view the birthday pet on the list
Given user launched the Banfield application
When user navigated to the home screen
When there is a birthday for a pet
Then the user should be displayed with the Birthday hat on the pet photo
And the Birthday Banner should be displayed on the Home screen if there is a Pet birthday