Feature: 26251-Make an Appointment Step 9 when & where screen

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
When the user has selected the location for Appointment 
#And the user taps on a Next Available Date for a location 

@26251 @sprint2 @regression
Scenario: User wants to select a timeslot for Appointment 
And no time slots are selected by default
Then user should be displayed with available time slots for that location for that day 
And the user should be displayed with the doctors name and their available slots for the chosen date
And the user will be displayed a locum doctor when the doctor is not assigned for that day
And the user will be displayed a text Your veterinarian will be assigned at least 24 hours before your appointment. when the locum doctors time slots are displayed

@26251 @sprint2 @regression 
Scenario: User wants to view slots and highlighted on tap
And no time slots are selected by default
Then user should be displayed with available time slots for that location for that day 
#And the user can tap on any of the available time slots 
And the time slot chosen will be highlighted on tap 
 
@26251 @sprint2 @regression 
Scenario: User wants to validate multi-select the slots functionality  
And no time slots are selected by default
And the user can not multi-select the slots

@26251 @sprint2 @regression 
Scenario: User wants to see Next CTA will be enabled once user selects the slot
And no time slots are selected by default
And the Next CTA should be disabled by default until the user selects the slot 
And the Next CTA will be enabled once user selects the slot 
And the user taps on the Next CTA to get redirected to everything look okay Screen 

@26251 @sprint2 @regression 
Scenario: User wants to select a timeslot for Appointment 
And the user taps on < to get redirected to the when and where screen 

@26251 @sprint2 @regression
Scenario: User wants to select a timeslot for Appointment 
And the user taps on X to get redirected to Have we met page 