Feature: 29042 - View Highlights - Exotic Pets

@29042 @sprint5 @regression
Scenario: User wants to view the Highlights of exotic 
Given user launched the Banfield application
When user is logged into the app as Exotic Pet
When the pet user is on the pet detail screen
When user is on the pet detail screen
When the Highlights Tab is selected by default
Then the user should be displayed with the following sections as accordions Pet Profile
And user is displayed with a static text Not all locations can handle exotics. You will need to call the hospital to schedule an appointment