Feature: 27832-View Highlights

Background:
Given user launched the Banfield application

@27832 @sprint4 @regression @smoke
Scenario: User wants to view the Highlights
When the user is on Home screen
When user is on the pet info screen
When user is on the pet detail screen
When the Highlights Tab is selected by default
Then the user should be displayed with the following sections as accordions
And the default ordering is as described Comprehensive exam, Vaccinations, Dental exam, Parasite control, Weight tracker always on bottom, Shareable records only for dogs, Pet profile
And all the accordions should be collapsed by default 
And the user can tap on any of the accordion to expand/collapse them

@27832 @sprint4 @regression @smoke
Scenario: User wants to view the Highlights
When User navigated to Home Screen
And the Make an appointment CTA should be displayed only if the pet is a Dog or Cat
And the user taps on Make an appointment CTA to get redirected to Reason for visit for logged in user screen 

@27832 @sprint4 @regression
Scenario: User wants to view the Highlights
#When User navigated to Home Screen
When user is on the home scren
And the user is displayed with the OWP widget with Payment details CTA if the pet is an OWP Pet
And the user taps on Payment details CTA to get redirected to Payment details screen OWP 

@27832 @sprint4 @regressions @smoke
Scenario: User wants to view the Highlights
#When User navigated to Home Screen
When the user is on Home screen
And Chat with a vet CTA should be displayed only if the pet is a Dog or Cat
And the user taps on Chat with a vet CTA to open the Vet Chat

@27832 @sprint4 @regression
Scenario: User wants to view the Highlights
When user is on the home page
And the NWP user will not be displayed with OWP widget or Vet Chat component