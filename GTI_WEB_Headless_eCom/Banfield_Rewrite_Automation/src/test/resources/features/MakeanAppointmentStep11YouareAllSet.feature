Feature: 26253-Make an Appointment Step 11 Youre all set 

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
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 

@32630 @sprint8 @regression
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555 
Then the user should be displayed the Phone number of the user

@26253 @sprint2  @smoke @regression
Scenario: User wants to see the confirmation screen on making an appointment 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen

@26253 @sprint2  @regression
Scenario: User wants to see the confirmation screen on making an appointment
And the user taps on the Add to Calendar CTA to add the appointment to the device calendar

#@26253 @sprint2 @regression @failed >>CR
#Scenario: User wants to see the confirmation screen on making an appointment
#And user taps on X to get redirected to the Welcome Screen