Feature: 28798-Make Appointment - Logged in user - Step 6 : You're all set!

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
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen

@32630 @sprint8 @regression
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555 
Then the user should be displayed the Phone number of the user

@sprint6 @regression @28798 @smoke
Scenario: User wants to see the confirmation screen on making an appointment 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the Done CTA by default should show in enabled state
And the user taps on Done to get redirected to the screen where they clicked on Make appointment CTA

@sprint6 @regression @28798
Scenario: User wants to see the confirmation screen on making an appointment
And the user taps on Add to Calendar CTA to add the appointment to the device calendar 

@sprint6 @regression @28798
Scenario: User wants to view the appointment confirmation screen
And the user should be displayed with the following Static Text
#Static Text: - "See you soon! Please 'download and complete your forms' [hyperlink] and bring them with you for your appointment. We'll contact you with any updates for your appointment."  
#And the user taps on the "download and complete your forms" CTA to get redirected to the URL on browser
#URL: - https://www.banfield.com/visit-information/Preparing-for-your-visit

#NATC
#And the seventh navigational dot should be highlighted
#And the information should reflect the selections made in the previous steps 
#And when the appointment is added to the calendar it should display the following in the device
# | <Pet name>'s visit | Appointment Time | Hospital name |
#And the appointment will be added as per device timezone
#And after tapping on "Done" CTA  the appointments get added/updated in the list of "Upcoming appointment" screen. Refer #30923 