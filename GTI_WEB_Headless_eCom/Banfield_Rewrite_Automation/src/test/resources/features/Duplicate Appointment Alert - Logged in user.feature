Feature: 35727 Duplicate Appointment Alert - Logged in user

@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Vaccination from home screen preffered location and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Vaccination from home screen preffered location and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen



@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Routine visit from chat screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
And Used should able to tap on Make Appointment CTA from Chat
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen

@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Routine visit from chat screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
And Used should able to tap on Make Appointment CTA from Chat
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for injury from upcoming appointment screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for injury from upcoming appointment screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for illness from highlights screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen

@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for illness from highlights screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for comprehensive exam from home screen without preffered location and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
Given the user is on Login screen 
When the User should login and landed to home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And the users is redirected to the next screen when & where
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for comprehensive exam from home screen without preffered location and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
Given the user is on Login screen 
When the User should login and landed to home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for New Patient from Timeline Screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen for duplicate popup
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen


@35727 @sprint11 @regression 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for New Patient from Timeline Screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen for duplicate popup
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen