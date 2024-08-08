Feature: 28797-Make Appointment - Logged in user - Step 5 : Everything look okay?

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then the Location services is enabled for the Device
And the Next CTA is enabled only after selecting location from the list  of  six nearest Banfield location
And the user is redirected to the next screen when & where
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen

@32630 @sprint8 @regression
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555 
Then the user should be displayed with the phone number

@sprint6 @regression @28797
Scenario: Step 5 Everything look okay
Then the user should be displayed with the following information on screen Pet Names appointment Time hh:mm p.m and Date of Appointment Mmm dd,yyyy, Location of Appointment, Your information with name, number, and email 
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen

@sprint6 @regression @28797
Scenario:- User wants to taps on < to get redirected to thethe previous screen 
When the user taps on < to get redirected to thethe previous screen 

@sprint6 @regression @28797
Scenario:- User wants to taps on X to get redirected toto Have we met screen
Then the user taps on X to get redirected to the screen the clicked on Make appointment CTA

#NATC
##And the user is displayed with Pet picture or avatar
#And the information should reflect the selections made in the previous steps  
#And the sixth navigational dot should be highlighted