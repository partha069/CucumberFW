Feature: 28790-Make Appointment - Logged in user - Step 2 : Reason for visit?

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen 

@sprint6 @regression @28790
Scenario: User wants to select the Reason for visit?
And the user is displayed with the following options to choose Reason for visit pet
#| Illness | Injury | Preventive care / New patient | 
And the user is displayed with the New Patient option if the pet has been added by the user in the app and has no visit data. 
And the user is displayed with the Preventive care option if pet is NWP / OWP and the pet has visit data. 
And options are not selected by default 
And user cannot select multiple options
And user should be able to tap on one option to select.
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen 
And if the user selects Injury tapping on Next CTA will redirect to Whats going on screen 
And if the user selects Preventive care tapping on Next CTA will redirect to Whats going on screen 
And if the user selects New patient tapping on Next CTA will redirect to when and where screen 

@sprint6 @regression @28790
Scenario: User wants to select the Reason for visit?
And the Next CTA should be disabled by default until the user select an option  
And the Next CTA will be enabled once the user selects an option  
And the user taps on the Next CTA to get redirected to next screen depending on whatever options they select here

@sprint6 @regression @28790
Scenario: User wants to select the Reason for visit?
And the user taps on < to get redirected to the Who are we scheduling screen  

@sprint6 @regression @28790
Scenario: User wants to select the Reason for visit?
And the user taps on X icon to get redirected to the screen where they clicked on Make appointment or Make an appointment

#NATC
#And the user is displayed with <Petname> visit with an image/avatar of the chosen pet
#And the second navigational dot is highlighted 
#And the remaining options should be greyed out on selecting an option  
#And the remaining options should be greyed out on selecting an option