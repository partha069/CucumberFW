Feature: 26249-Make an Appointment Step 7 when & where screen

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

@32630 @sprint8 @regressionw
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555
Then the Location services is enabled for the Device for only one time
And user is redirected to the next screen when & where and verify phono number

@26249 @sprint2 @regression 
Scenario: User wants to redirected to the next screen when & where
Then the Location services is enabled for the Device for only one time
Then they tap on New Search CTA
Then the user should be redirected to filter screen
And the user taps on the Search field to enable the search
And the user starts typing in the search field
And the user is suggested with city state based on the keywordZip code they enter
And the user can choose a CityState from the suggested List
And the user taps on Apply after selecting the location
Then the list of Banfield locations for the nearest 6 hospitals of users location is displayed
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where screen

@26249 @sprint2 @regression 
Scenario: User wants to redirected to the next screen when & where
Then the Location services is enabled for the Device for only one time
And the list of Banfield locations for the nearest 6 locations of the chosen city, State/Zip is displayed

@26249 @sprint2 @regression
Scenario: User wants to redirected to the next screen when & where
Then the Location services is enabled for the Device
Then the list of Banfield locations for the nearest 6 hospitals of users location is displayed
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where screen

@26249 @sprint2 @regression
Scenario: User wants taps on Ignore CTA to be redirected to Filter page
Then the user clicks on Dont Allow in the enable location popup
And the user is displayed with the when and where screen without any hospitals listed
And the user is displayed with Ignore and Settings CTA
And the user is displayed with message Turn on location services to find the nearest Banfield hospital
And the user taps on Ignore CTA to be redirected to Filter page

@26249 @sprint2 @regression 
Scenario: User wants taps on Settings CTA to get redirected to the native flow to enable geo-location
Then the user clicks on Dont Allow in the enable location popup
And the user is displayed with the when and where screen without any hospitals listed
And the user is displayed with Ignore and Settings CTA
And the user is displayed with message Turn on location services to find the nearest Banfield hospital
And the user taps on Settings CTA to get redirected to the native flow to enable geo-location