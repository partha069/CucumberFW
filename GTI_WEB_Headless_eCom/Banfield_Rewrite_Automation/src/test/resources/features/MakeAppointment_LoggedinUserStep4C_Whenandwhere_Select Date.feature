Feature: 28795-Make Appointment - Logged in user - Step 4C : when and where ? - Select Date

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

@32630 @sprint8 @regression
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555 
And user wants to verify the phoneno
And user wants to verify the SeeCalendar CTA

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment
And the user should be displayed with the following information
#| Text: Drop Off | New Search CTA  | See calendar CTA  | Day, Mon DD, YYYY (Ex: Today, Jan 3, 2022 ) (If today's date is selected) or Tuesday, Jan 3, 2022 (If any other day is selected from Calendar) |  Map icon (with miles or without miles)| Selected location from the previous steps | Next Available CTA or Next CTA |
#And the Drop off text is displayed on the top if the user has selected Yes option in AM time slots in the previous steps >> CR
And the user can tap on New search CTA to get redirected to FilterScreen

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment
And by default it should display the todays date 
And the user should be displayed with the available doctors name date or time slots for that location

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment
And the user is displayed with the message if there are no slots available for 60 days for that location No available appointments for 2 months
And the Next CTA should be in disabled state if there are no appointments available for 2 months
Then user should be displayed with available slots for that location  
And the user is displayed a message if there are no slots available for thatday No available appointments for today 

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment
And user on clicking on Next available should see the available doctors
And the user should be displayed with the See calendar option 
And the user taps on see calendar option to view the devices default date picker 
And the user can select an alternate date within the next 60 days

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment
And the user taps on < CTA to get redirected to the previous screen 

@sprint6 @regression @28795
Scenario: User wants to see the available dates for appointment 
And the user taps on X to get redirected to the screen the clicked on Make appointment or Make an appointment

#NATC
#And the fifth navigation dot should be highlighted