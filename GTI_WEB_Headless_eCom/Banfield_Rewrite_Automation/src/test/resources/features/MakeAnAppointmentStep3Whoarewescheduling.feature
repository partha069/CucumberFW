 Feature: 26239-Make an appointment Step 3 Who are we schesuling?
 
 Background:
 Given user launched the Banfield application
 When User is on the welcome screen
 When user taps on the make an appointment CTA
 Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
 When the user tapped on No, I am New option from the Have we met Screen
 When the user tapped on Next in the Contact Information Screen 

 @regression @sprint1 @26239
 Scenario: 26239-Verify user can able validate fields
 When the user is redirected to the What species is your pet Screen 
 Then the user will be displayed with two options to choose Dog or Cat
 Then a static text is displayed on the screen for the user Not all locations can handle exotics. You will need to call the hospital to schedule an appointment 
 And the Next CTA will be in disabled state by default 
 And there will be no option selected by default 
 And the user taps on an option to select it 
 And the selected option will be highlighted 
 And the Next CTA will be enabled 
 And the user taps on an option to select it 
 And the user taps on Next CTA to get redirected to the next screen

 @regression @sprint1 @26239
 Scenario: 26239-Verify user can able to get redirected to the previous screen
 And the user taps on < to get redirected to the previous screen 
 
 @regression @sprint1 @26239
 Scenario: 26239-Verify user can able to get redirected to the previous screen
 And the user taps on X to get redirected to Have we met screen