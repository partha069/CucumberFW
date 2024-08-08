Feature: 28796- Make Appointment - Logged in user - Step 4D: When and where? - Select Time slot 

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

@sprint6 @regression @28796
Scenario: Select Time slot
And user on clicking on Next available should see the available doctors
Then the user is displayed with the following information
#| Doctor Name or Banfield Veterinarian | Date: Month Date, Year available slots (For Ex: January 4, 2022) | Available time slots |  Next CTA |
And the user will be displayed a locum doctor Banfield Veterinarian when the doctor is not assigned for that day
And the user will be displayed a text Your veterinarian will be assigned at least 24 hours before your appointment. when the locum doctors time slots are displayed
And tap on any of the available time slots
And the selected time slot will be highlighted 
And no time slots is selected by default 
And the user can not multi-select the slots
And Next CTA should be disabled by default until the user selects the slot 
And the Next CTA will be enabled once user selects the slot 
And the user taps on the Next CTA to get redirected to everything look okay Screen

#@sprint6 @regression @28796 >> CR 32714
#Scenario: Select Time slot
#And if the user selected Yes in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is true

#@sprint6 @regression @28796 >> CR 32714
#Scenario: Select Time slot
#And if the user selected No in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is false

@sprint6 @regression @28796
Scenario: Select Time slot
And the user taps on < to get redirected to the when and where screen 

@sprint6 @regression @28796
Scenario: Select Time slot 
And user taps on X to get redirected to Have we met page

#NATC
#And the fifth navigational dot is highlighted
#And the time slots should be displayed based on the availability of information received from the hospital system  
#And the availability of doctors will be displayed in order of available doctors and then locum doctors.