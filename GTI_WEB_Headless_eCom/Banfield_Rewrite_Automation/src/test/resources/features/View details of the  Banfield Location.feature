Feature: 26360-View details of the  Banfield Location
Background:
Given user is on the Find a location near you screen 
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 

@26360 @sprint3 @regression
Scenario:- User wants to access the Banfield Location details 
And the user taps on the Phone number to launch the Dialer with the phone number pre-filled from location card

@26360 @sprint3 @regression
Scenario:- User wants to access the Banfield Location details 
And the user taps on the map icon to launch the Map App with the location pre-pinned from location card

@26360 @sprint3 @regression
Scenario:- User wants to access the Banfield Location details 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
