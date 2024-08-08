Feature: 26250-Make an Appointment Step 8 when & where screen

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
 
 @32630 @sprint8 @regression 
 Scenario:- User wants to verify See calendar CTA -  Remove grey outline around
 And user wants to verify the SeeCalendar CTA
 
 @sprint2 @regression @26250 
 Scenario: User wants to view message if there are no slots available for 60 days
 And the user is displayed with the message if there are no slots available for 60 days for that location No available appointments for 2 months 
 
 @sprint2 @regression @26250 
 Scenario: User wants to view the next available date
 And the user is displayed with the availability for the chosen date
 And the user taps on see calendar option to view the devices default date picker
 And the user can select an alternate date within the next 60 days 
 
 @sprint2 @regression @26250 
 Scenario: User wants to tap on New search to search for an alternate hospital
 And the user can tap on New search to search for an alternate hospital