Feature: 31608-Make Appointment - Logged in user - Step 4A3 : When and where? - Navigation from Reschedule/Cancel

 Background:
 Given user launched the Banfield application
 When User navigated to Home Screen
 Then the user should be redirected to Upcoming appointments screen

 @sprint7 @regression @31608
 Scenario: User wants to schedule a new appointment for a different time - Navigating from Reschedule or Cancel screen
 Then the user taps on Reschedule CTA to get a pop-up message saying
 And the user taps on Yes CTA to get redirected to Reason for visit
 When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
 When the user is displayed with the native Location Pop up to enable geo-location
 Then the Location services is enabled for the Device
 And on the when & where screen the New search CTA will not be displayed
 And by default the Next CTA will be in a disabled state
 And Next CTA is enabled only after selecting the location
 And the user tap on map icon to launch map app with the location pre-pinned
 
 @sprint7 @regression @31608
 Scenario: User wants to schedule a new appointment for a different time - Navigating from Reschedule or Cancel screen
 Then the user taps on Reschedule CTA to get a pop-up message saying
 And the user taps on Yes CTA to get redirected to Reason for visit
 When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
 When the user is displayed with the native Location Pop up to enable geo-location
 Then the Location services is enabled for the Device
 And on the when & where screen the New search CTA will not be displayed
 And Next CTA is enabled only after selecting the location
 And the user is redirected to the next screen when & where