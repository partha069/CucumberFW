Feature: 27700-Add a pet - Step 1 - What Species is your pet?

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user clicks on Add a new pet CTA

@regression @27700 @sprint3 
Scenario: 27700-User redirectes to What species is your pet page
Then the user will be redirected to What species is your pet page
And the Next CTA will be disabled state by default  
And there will be no options selected by default  
And the user will be displayed with the following species to choose from Dog,Cat,Bird,Guinea Pig,Rabbit,Reptile,Pocket Pets_Mice, gerbils, hamsters...
And the user taps on a pet species to select 
And the selected options will be highlighted
And the user cannot multi select the pet species
And the Next CTA will be enabled only after selecting an option
And the user taps on Next CTA to get redirected to Tell us about your pet screen  

@regression @27700 @sprint3 
Scenario: 27700-Taps on X to get redirected to Home screen
And the user taps on X to get redirected to Home screen