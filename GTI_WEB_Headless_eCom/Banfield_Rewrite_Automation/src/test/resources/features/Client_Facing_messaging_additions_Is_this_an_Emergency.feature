Feature: 36005: Client Facing messaging additions: Is this an Emergency

@36005 @sprint11 @regression 
Scenario: Verify that Client Facing messaging additions: Is this an Emergency for guest user flow
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to have we met screen after clicking on continue


@36005 @sprint11 @regression 
Scenario: Verify that Client Facing messaging additions: Is this an Emergency for guest user flow from find a nearby location screen
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will click on make appointment cta to get redirected to Is this an Emergency popup
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to have we met screen after clicking on continue

@36005 @sprint11 @regression 
Scenario: Choose nearest banfield from create account and make an appointment as guest and get redirected to Is this an Emergency popup
Given user is on the welcome screen 
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to have we met screen after clicking on continue

@36005 @sprint11 @regression 
Scenario: User navigating to Is this an Emergency popup from home screen after clicking on make an appointment cta
Given user launched the Banfield application
When the user is on Home screen
When User navigating to Is this an Emergency popup from home screen after clicking on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to who are we scheduling screen after clicking on continue

@36005 @sprint11 @regression 
Scenario: User navigating to Is this an Emergency popup from Upcoming appointments
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to who are we scheduling screen after clicking on continue

@36005 @sprint11 @regression 
Scenario: User navigating to Is this an Emergency popup from Chat and More Screen
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to who are we scheduling screen after clicking on continue

@36005 @sprint11 @regression
Scenario: User navigating to Is this an Emergency popup while creating appointrment from highlights screen on petcard
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to take on Make an Appointment CTA from highlights screen
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to Reason for visit screen after clicking on continue

@36005 @sprint11 @regression
Scenario: User navigating to Is this an Emergency popup while creating appointrment from timeline screen on petcard
Given user launched the Banfield application
When User navigated to Home Screen for timeline makeappointment
When User wants to tap on PetCart in Home Screen
When User wants to take on Make an Appointment CTA from Timeline screen
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to Reason for visit screen after clicking on continue

@36005 @sprint11 @regression 
Scenario: User navigating to Is this an Emergency popup while creating appointrment from Find Location when Preferred Location Not Set set as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you and navigate to click on make appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
And User is redirected to Reason for visit screen after clicking on continue