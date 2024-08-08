Feature: 36039-Everything look okay screen updates

@36039 @sprint11 @regression 
Scenario: User wants to make an appointment as New patient in Guest User Flow. 
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When user is on the when & where page
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
#And the user click on Make appointment CTA 
#Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#And the user taps on Done to get redirected to the Welcome Screen

@36039 @sprint11 @regression 
Scenario: User wants to make an appointment as Illness as New patient in Guest User Flow.
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
And the user tapped on Next for illness
And the user taps on the Next CTA to get redirected to when & where Page
Then the user wants to enable Location services for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
#And the user click on Make appointment CTA 
#Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#And the user taps on Done to get redirected to the Welcome Screen

@36039 @sprint11 @regression 
Scenario: User wants to make an appointment as Injury as New patient in Guest User Flow.	
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And the user taps on the Next CTA to get redirected to when & where Screen
Then the user wants to enable Location services for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
#And the user click on Make appointment CTA 
#Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#And the user taps on Done to get redirected to the Welcome Screen

#Note > Logged in

#illness & injury
@36039 @sprint11 @regression 
Scenario: User wants to make an appointment using New Patient as a Logged in user make appointment flow.
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tak on Make an Appointment CTA and navigate to where and where Screen
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
#And the user click on Make appointment CTA 
#And the user is redirected to Youre all set screen

#illness & injury
@36039 @sprint11 @regression
Scenario: User wants to make an appointment from Timeline Screen using New Patient as a Logged in user make appointment flow.
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
#And the user click on Make appointment CTA
#And the user is redirected to Youre all set screen