Feature: 31588-What species is your pet - Make appointment flow

 Background:
 Given user launched the Banfield application
 When the user is on Home screen
 When User navigating to who are we scheduling page
 And the user will tap on Add a new pet CTA to go to What species is your pet screen

 @sprint6 @regression @31588
 Scenario: Make appointment flow
 Then the user is redirected to What species is your pet screen
 Then the user will be displayed with two options to choose Dog or Cat
 Then a static text is displayed on the screen for the user Not all locations can handle exotics. You will need to call the hospital to schedule an appointment 
 And the Next CTA will be in disabled state by default 
 And there will be no option selected by default 
 And the user taps on an option to select it 
 And the selected option will be highlighted 
 And the Next CTA will be enabled 
 And the user taps on an option to select it 
 And the user taps on Next CTA to get redirected to the next screen
 
 @sprint6 @regression @31588
 Scenario: 26239-Verify user can able to get redirected to the previous screen
 And the user will click on < to get redirected to Who are we scheduling screen
 And the added pet will be displayed on the Who are we scheduling screen and on Dashboard once the pet is added
 

 #NATC 
 #And the user will be landing on 'Who are we scheduling' screen after completing the process of adding a new pet.


