Feature: 36007 Home screen - Search for a location

Background:
Given user launched the Banfield application
 
@regression  @36007 @sprint11 
Scenario: Location search for a logged in user who has preferred location set up and tap on Find a nearby location to get redirected to Find a location near you screen 
When the user is on Home screen
When the user has set a preferred location
Then the user will be displayed with your preffered location card with preferred location set
# Your preferred location | Hospital Name | Hospital address | Miles | Make an appointment CTA (Remove the call icon) | Find a Banfield Pet Hospital® near you | Find a nearby location CTA | 
And the user can tap on Find a nearby location to get redirected to Find a location near you screen 


@regression  @36007 @sprint11
Scenario: Location search for a logged in user who has preferred location set up and tap on Make an appointment cta to get redirected to Who are we scheduling screen
When the user is on Home screen
When the user has set a preferred location
Then the user will be displayed with your preffered location card with preferred location set
And the user can tap on Make an appointment cta to get redirected to Who are we scheduling screen

@regression  @36007 @sprint11
Scenario: Location search for a logged in user who has preferred location set up and user will not be displayed with the miles when the location services are turned off
When the user is on Home screen
When the user has set a preferred location
Then the user will be displayed with your preffered location card with preferred location set
And the user will not be displayed with the miles when the location services are turned off

@regression  @36007 @sprint11 
Scenario: Location search for a logged in user who has preferred location set up and user can tap on the Map icon to open default map with location pre-pinned
When the user is on Home screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
Then user taps on new patient to go to when and where screen
Then the user is displayed with miles Location
And the user can tap on the Map icon to open default map with location pre-pinned