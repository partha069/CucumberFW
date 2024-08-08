Feature: 28138- View Pet details

Background:
Given user launched the Banfield application
When User navigated to Home Screen 
When the user tap on any pet card from the available list of pets

@28138 @sprint3 @regression 
Scenario:- User wants to view the pet details for a specific pet
Then the user should be redirected to the pet details screen
And the pet details screen should display with the Pet image/avatar based on pet selected Pet name,Pet age years old, Highlights Tab,Timeline Tab
And the Highlights Tab should be selected by default

@28138 @sprint3 @regression 
Scenario:- User wants to view the pet details for a specific pet
And the image section should display a camera icon to add/update image on Highlights and Timeline tab

@28138 @sprint3 @regression 
Scenario:- User wants to view the pet details for a specific pet
And the user should tap on back to get redirected to the previous screen Home