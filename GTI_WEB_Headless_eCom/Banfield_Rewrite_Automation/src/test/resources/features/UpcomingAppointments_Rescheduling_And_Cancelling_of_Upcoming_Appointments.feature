 Feature: 35760-Upcoming Appointments - Rescheduling & Cancelling of Upcoming Appointments

  @35760 @sprint11 @regression
  Scenario: 35760-Verify user wants to view the list of upcoming appointments
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user can tap on the caret icon or View/edit to expand the appointment card
  And the user will be displayed None when there are no available Notes for the vet
  
  @35760 @sprint11 @regression 
  Scenario: 35760-Verify user is able to expand and collapsed
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user can tap on the caret again to collapse the card
  
  @35760 @sprint11 @regression 
  Scenario: 35760-Verify user shoul tap on hospital contact number to open the default dialer with contact number pre-filled
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user can tap on Hospital contact number to open the default dialer with contact number pre-filled
  
  @35760 @sprint11 @regression
  Scenario: 35760-Verify user should tap on the hospital address to open the default map with location pre-pinned
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user can tap on the hospital address to open the default map with location pre-pinned
  
  #Reschedule > Yes
  @35760 @sprint11 @regression
  Scenario: Verify user is able to redirecte Upcoming Appointment
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user should scroll down to Reschedule and Cancel CTA
  Then the user taps on Reschedule CTA to get a pop-up message saying
  And the user taps on Yes CTA to get redirected to Reason for visit
  And user on clicking on Next available should see the available doctors
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  
  #Reschedule > No
  @35760 @sprint11 @regression
  Scenario: Verify user dont want to redirecte Upcoming Appointment
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user should scroll down to Reschedule and Cancel CTA
  Then the user taps on Reschedule CTA to get a pop-up message saying
  And the user tap on No CTA to get a popup message
  And the user tap on Close X icon from the pop-up to remain on the same page Upcoming appointments
  
  #Cancel Upcoming appointments > Yes
  @35760 @sprint11 @regression
  Scenario: Verify user is able to Cancel Appointment
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user should scroll down to Reschedule and Cancel CTA
  Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
  And the user can tap on Cancel to get redirected to the Cancel appointment flow
  And the user taps on the Close X icon to close pop-up and stay on the same screen
  
  #Cancel Upcoming appointments > No
  @35760 @sprint11 @regression
  Scenario: Verify user dont want to Cancel Appointment
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user is displayed with the following information on the appointment card when collapsed
  And the user should scroll down to Reschedule and Cancel CTA 
  Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
  And the user tap on No CTA to get a popup message when dont want to cancel appointments
  
  @35760 @sprint11 @regression
  Scenario: 35760-Verify user wants to view miles when the geolocation is turned on
  Given user launched the Banfield application
  When User navigated to Home Screen
  When User wants to tap on PetCart in Home Screen
  When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
  And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
  And user wants to redirected to when & where Page
  And the user navigate back to home screen
  Then the user should be redirected to Upcoming appointments screen
  And the user will be displayed miles when the geolocation is turned on
  
	#NAT - NA
	#Scenario : For Dental/Hospital scheduled appointments
  #Day, Date, Time ex. (Wed, Aug 29, 2022  8 a.m. )|
  #Petname's visit | 
  #Appointment Type(Preventive care)|
  #Appointment Reason (Comprehensive exam)|
  #Hospital address and miles |
  #Hospital contact number|
  #Doctor name/Banfield Veterinarian |
  #Your information | Name | Contact number | Email address |
  #Certain types of appointments cannot be modified online. Please contact your hospital directly to make changes to your appointment. " | Cancel | #35781 
  #Notes for the vet|

 

