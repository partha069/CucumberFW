Feature: 26359- Find a nearby Banfield Location

Background:
Given the user is on welcome screen 

@26359 @sprint3 @regression
Scenario: User wants to find a nearby hospital location if Geo location is ON
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
And the user will get the list of 6 nearest Banfield hospitals by default 
And the list is displayed in the order of closest first Find a location near you Screen
And the Hospital Locations will have Hospital Name, Address and following 
And the user taps on the Phone number to launch the Dialer with the phone number pre-filled 

@26359 @sprint3 @regression
Scenario: User wants to find a nearby hospital location if Geo location is ON
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
And the user will get the list of 6 nearest Banfield hospitals by default 
And the list is displayed in the order of closest first Find a location near you Screen
And the Hospital Locations will have Hospital Name, Address and following
And the user taps on the map icon to launch the Map App with the location pre-pinned 

@26359 @sprint3 @regression 
Scenario: User wants to find a nearby hospital location if Geo location is ON
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
And the user taps on < at the top to go back to the previous(welcome/home) screen 

@26359 @sprint3 @regression
Scenario: User wants to find a nearby hospital location if Geo location is ON
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
And the user taps on X at the top to go back to previous(welcome/home) screen 

@26359 @sprint3 @regression
Scenario: User wants to find a nearby hospital location if Geo location is ON
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
And the user will have the option to search by zip or city/state  

@26359 @sprint3 @regression 
Scenario: User wants to find a nearby hospital location if Geo location is ON
When user tapped on the Login CTA from the login screen and the user credentials are valid
When he taps on Find a location near you CTA
Then the user will be redirected to Find a location near you screen
And the user taps on X at the top to go back to previous(welcome/home) screen 

@26359 @sprint3 @regression 
Scenario: User wants to find a nearby hospital location if Geo location is ON
When user tapped on the Login CTA from the login screen and the user credentials are valid
When he taps on Find a location near you CTA
Then the user will be redirected to Find a location near you screen
And the user taps on < at the top to go back to the previous(welcome/home) screen 

@26359 @sprint3 @regression
Scenario:- User wants to find a nearby hospital location if Geo location is OFF
When the user taps on Find a nearby location CTA and location services of the device is OFF for the app 
Then the user will be displayed with the Find a location near you screen with setting and ignore
And the user can tap on Settings CTA go to settings to enable location services

@26359 @sprint3 @regression
Scenario:- User wants to find a nearby hospital location if Geo location is OFF
When the user taps on Find a nearby location CTA and location services of the device is OFF for the app 
Then the user will be displayed with the Find a location near you screen with setting and ignore
And the user can tap on Ignore to go Find a location near you screen 

@26359 @sprint3 @regression
Scenario:- User wants to find a nearby hospital location if Geo location is OFF and User wants to search for a nearby hospital location
When the user taps on Find a nearby location CTA and location services of the device is OFF for the app 
Then the user will be displayed with the Find a location near you screen with setting and ignore
And the user can tap on New search to search for a hospital
Then the user will be displayed with the Search field with placeholder text Search zip or city/state
And the user will enter keywords for the relevant suggestions to appear
And the suggestions are displayed based on the response from the location API