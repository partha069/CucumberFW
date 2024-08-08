Feature: 31428-Make Appointment - Logged in user - Step 4A2 : When and where? - Geo Location On

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

@326300 @sprint8 @regression
Scenario:- User wants to verify Phone Number Formatt - 555-555-5555   
Then the Location services is enabled for the Device
And User wants to verify phone number


@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
And the user clicks on Allow in native Location Pop up to be displayed with the following
#| A.M time slots  "Looking for morning drop-off times?" (Yes/No options) | New search | 
#| Your preferred location/ Last visited location | 
#| "Closest to your location"  | List of six nearest Banfield hospitals | Heart icon(deselected)to select as preferred location |
#And the user is displayed with the A.M time slot if Vaccination or Routine visit has been selected in the previous steps >> CR
#And by default Yes will be selected in A.M time slot options >> CR
#And the user can select only one either Yes or No in A.M time slot options >> CR
#And the selected option will be highlighted on the tap >> CR
#And the user is displayed first with the Your preferred location or Last visited location and then Closest to your location >> CR

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
#And the list of six nearest Banfield hospitals is displayed with preferred Heart icon is deselected >> CR
#And the user is displayed with the Your preferred location with the following informations >> CR
#| Hospital Name| Hospital address | Contact number (underlined) | Map icon with miles | Heart icon (deselected) | 
#And the map icon will be displayed with miles closest to users location on Your preferred location and Closest to your location >> CR
And the user tap on map icon to launch map app with the location pre-pinned

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
And the Next CTA will be in a disabled state
And the user taps on Next CTA to get redirected to next when and where screen

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
And the user can tap on New search CTA to get redirected to Filter screen

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
#And User tap on preferred hospital location >> CR
#And the selecting the preferred Heart icon will change the color to red >> CR
#And the user can select only one preferred location >> CR
#And the selected preferred location is displayed on the home screen >> CR

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
And the user tap on < icon to go back to previous screen

@sprint6 @regression @31428
Scenario:- User wants to select nearest Banfield Pet Hospital location when the Geo-location is turned on   
Then the Location services is enabled for the Device
And the user tap on X close icon to go back to the screen where they clicked on Make appointment CTA

#NATC
#And the "Preferred location or Last visited location" will be displayed on the basis of criteria captured in #28794 
#And the list is displayed in the order of closest first 
#And the fourth navigational dot should be highlighted