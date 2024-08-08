Feature: 28019-View Timeline

Background:
Given user launched the Banfield application
When the user is on Home screen 

@32717 @sprint8 @regression
Scenario: User wants to verify time format
#When the user is on Home screen 
When user is on the pet info page
When the user taps on Timeline Tab
Then the user should be able to view the time format

@28019 @sprint4 @regression
Scenario: User wants to tap on Timeline Tab
#When the user is on Home screen
When user is on the pet info page
When the user taps on Timeline Tab
Then the user should be able to view the list of Previous visits detail
And the screen should display with the Time HH: MM am/pm, Date Month Date, Year Ex: January 25th, 2022, Reason for visit, Hospital location, Med/Vaccine/Labs
And the Med/Vaccine/Labs will be displayed based on the visit
And the icons are left aligned.
And the user should be displayed with the Static text Nothing on file. Please schedule an appointment to see your pets details. Make an appointment CTA
And if Med Vaccine Labs was not administered the icon will not be shown
And the user will click on Make an appointment CTA to go to Reason for visit screen for logged in user flow.
And the user can tap on the camera icon to Change/update photo 

@28019 @sprint4 @regression @smoke
Scenario: User wants to tap on Timeline Tab
#When the user is on Home screen
When user is on the pet info page
When the user taps on Timeline Tab
And the user should be able to tap on > icon to get redirected to Pet name visit screen as detailed in

@28019 @sprint4 @regression
Scenario: User wants to tap on Timeline Tab
#When the user is on Home screen
And the user should be able to view the no previous record if the previous visit is not available 

@28019 @sprint4 @regression 
Scenario: User wants to tap on Timeline Tab
#When the user is on Home screen
When user is on the pet info page
When the user taps on Timeline Tab
And the user will tap on < button to go back to previous screen Home