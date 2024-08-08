Feature: 28331-Upcoming Appointments-Reschedule

 Background:
 Given user launched the Banfield application
 When User navigated to Home Screen
 Then the user should be redirected to Upcoming appointments screen

 @28331 @sprint7 @regression
 Scenario: When there is an upcoming appointments and user wants to reschedule it.
 Then the user taps on Reschedule CTA to get a pop-up message saying
 #| Would you like to reschedule this appointment? | Yes CTA | No CTA | Close (X) icon |
 And the user tap on Close X icon from the pop-up to remain on the same screen Upcoming appointments
 
 @28331 @sprint7 @regression
 Scenario: When there is an upcoming appointments and user wants to reschedule it.
 Then the user taps on Reschedule CTA to get a pop-up message saying
 And the user tap on No CTA to get a popup message saying
 #| Text Title: No problem | Text message: No changes have been made. We'll see you soon. | Close (X) icon |
 And the user tap on Close X icon from the pop-up to remain on the same page Upcoming appointments
 
 @28331 @sprint7 @regression
 Scenario: When there is an upcoming appointments and user wants to reschedule it.
 Then the user taps on Reschedule CTA to get a pop-up message saying
 And the user taps on Yes CTA to get redirected to Reason for visit