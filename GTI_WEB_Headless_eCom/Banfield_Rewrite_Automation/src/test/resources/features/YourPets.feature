Feature: 28806 - Your pets

@28806 @sprint5 @regression @smoke
Scenario: User wants to hide/unhide pet profile
Given user launched the Banfield application
#When User Logged in into app Multi Pets
When the user is on Home screen
When the user tapped on the profile bottom navigation
When the user taps on the Your pets CTA
Then the user should be redirected to My pets screen
And the user should be displayed with the following text
#| You may select which pets you see on your pet profile dashboard by turning these on or off.  |
And the user is displayed with the list of pets added by them or hospital system
And the user should be able to turn the toggle button on or off
And the user if turn off the toggle button 
#Then the user should not see the pet name on the Home screen (ID Issue)
And the user if turn on the toggle button 
#Then the user should see the pet name on the Home screen (ID Issue)
And by default the toggle button should be enabled
And the user tap on back button to go back to profile screen.