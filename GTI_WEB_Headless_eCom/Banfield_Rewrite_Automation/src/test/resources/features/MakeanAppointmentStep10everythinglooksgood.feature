Feature: 26252-Make an Appointment Step 10 everything look Okay

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
#And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen

@32630 @sprint8 @regression 
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555
Then the user should be displayed with the phone number

@26252 @sprint2 @regression 
Scenario:- User wants to redirected to Youre all set screen
Then the user should be displayed with the following information on screen Pet Names appointment Time hh:mm p.m and Date of Appointment Mmm dd,yyyy, Location of Appointment, Your information with name, number, and email 
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen 

@26252 @sprint2 @regression 
Scenario:- User wants to taps on < to get redirected to thethe previous screen 
When the user taps on < to get redirected to thethe previous screen 

@26252 @sprint2 @regression 
Scenario:- User wants to taps on X to get redirected toto Have we met screen
Then the user taps on X to get redirected toto Have we met screen