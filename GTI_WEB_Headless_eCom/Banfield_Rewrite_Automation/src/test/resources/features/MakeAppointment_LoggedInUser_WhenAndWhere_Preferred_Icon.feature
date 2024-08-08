Feature: 32419-Make Appointment - Logged in user-When and where - Preferred icon

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user taps on Pet Card
When User landed to the who are we scheduling page
#When User navigating to who are we scheduling page
#Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

@sprint7 @regression @32419 
Scenario: When the location services is turned on and there is no preferred/last visited location displayed
Then the Location services is enabled for the Device
Then Verify user is able to view Preferred icon

#Geo-Location off >> Issue "33610"
#@sprint7 @regression @31608
#Scenario: When the location services is turned off and only preferred location is displayed
##Then the Location services is enabled for the Device
##Then the user clicks on Dont Allow in the enable location popup
#Then user clicks on Dont Allow in the enable location popup
#When the user is displayed with the preferred location 
#Then the preferred icon (Heart icon) by default should show in red
#And the user cannot deselect the preferred icon

#Geo-Location On#
@sprint7 @regression @32419 
Scenario: When the location services is turned on and there is no preferred/last visited location displayed
Then the Location services is enabled for the Device
Then the user is displayed with the Closest to your location 
And by default the preferred icon will not be selected
And the user can select the preferred icon
And once selected user cannot deselect the preferred icon
And the user can select any other location as preferred location
And user can select only one preferred location
And the selected preferred location will be added on the home screen instantly but not as a preferred card on top

@sprint7 @regression @32419 
Scenario: When the location services is turned on and preferred location is displayed
Then the Location services is enabled for the Device
When the user is displayed with the preferred location and closest to your location 
And the selected preferred location will be added on the home screen instantly but not as a preferred card on top

#Returning from new search / Filter
@sprint7 @regression @32419 
Scenario: When the location is turned off and there is no preferred/last visited location - Returning from Filter screen
Then user clicks on Dont Allow in the enable location popup
When the user has selected a new location from the suggestion list
And the user is displayed with the six closest location 
And by default the preferred icon will not be selected
And the user can select the preferred icon
And once selected user cannot deselect the preferred icon
And the user can select any other location as preferred location
And user can select only one preferred location
And the selected preferred location will be added on the home screen instantly but not as a preferred card on top

@sprint7 @regression @32419
Scenario: When the location is turned off and there is only preferred location - Returning from Filter screen
Then user clicks on Dont Allow in the enable location popup
When the user has selected a new location from the suggestion list
And the user is displayed with the preferred location
And the user is displayed with the six closest location 
And by default the preferred icon will not be selected
And the user can select the preferred icon
And once selected user cannot deselect the preferred icon
And the user can select any other location as preferred location
And user can select only one preferred location
And the selected preferred location will be added on the home screen instantly but not as a preferred card on top



#NATC
#Then the preferred location icon (Heart icon) by default should show in red
#And the user can select preferred icon (red)
#Then the preferred location icon will be displayed in red