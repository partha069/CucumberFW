Feature: 28332-Upcoming Appointments-Cancel

 Background:
 Given user launched the Banfield application
 When User navigated to Home Screen
 Then the user should be redirected to Upcoming appointments screen
 
 @28332 @regression @sprint7
 Scenario: When there is an upcoming appointments and user wants to cancel it.
 And the user should be displayed with the list of upcoming appointments
 Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
 #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
 And the user tap on X icon to remain on the same page Upcoming appointments
 
 @28332 @regression @sprint7 
 Scenario: When there is an upcoming appointments and user wants to cancel it.
 Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
 And the user tap on No CTA to get a pop-up message saying
 #| Text Title: No problem | Text message: No changes have been made. We'll see you soon. | Close (X) icon |
 And the user taps on Close X icon to dismiss the pop-up

 @28332 @regression @sprint7
 Scenario: When there is an upcoming appointments and user wants to cancel it.
 Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
 And the user tap on Yes CTA to get a pop-up message saying
 #| Text message: Got it. Would you like to schedule a new appointment for a different time? | Yes CTA | No CTA | Close (X) icon |
 And the user tap on Close X icon to dismiss the pop-up without canceling the appointment
 
 @28332 @regression @sprint7
 Scenario: When there is an upcoming appointments and user wants to cancel it.
 Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
 And the user tap on Yes CTA to get a pop-up message saying
 And the user tap on Yes CTA to get redirected to Reason for visit screen

 @28332 @regression @sprint7
 Scenario: When there is an upcoming appointments and user wants to cancel it.
 Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
 And the user tap on Yes CTA to get a pop-up message saying
 And the user tap on No CTA to get a pop message saying
 #| Text Title: Okay | Text message: We've removed <Petname>'s appointment from our calendar. We hope to see both of you again soon. | Close (X) icon |
 And the user taps on the Close X icon to close pop-up and stay on the same screen