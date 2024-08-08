Feature: 33265-Appointment-When and where - Time slot -Time sensitive rule

Background:
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where 
When the user has selected the location for Appointment 

@33265 @sprint8 @regression  
Scenario: User wants to select a timeslot for Appointment 
And the user remains idle on the screen or takes more than 5 min to book the appointment
And the user can select the time slots 
And the user taps on the Next CTA to get redirected to everything look okay Screen 
#And the user taps on Make appointment CTA on Everything look okay? screen to book the appointment
#And the user is displayed with a native pop-up if the user remains idle or difference is more than 5 min 
##(From the time we showed this information till the time user take to book)
#And the native pop-up message is:
##| "Refreshing available time slots." | Okay CTA |
#And the user tap on 'Okay' CTA to get redirected back to "When and where" screen 
#And the screen gets refreshed and displayed with the updated time slots.