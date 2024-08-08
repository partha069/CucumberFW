Feature: 28794-Make Appointment - Logged in user - Step 4A1 : When and where? - Geo Location Off

Background:
Given user launched the Banfield application

@sprint8 @regression @32736
Scenario:- User wants to select a Banfield Pet Hospital when the Geo-Location is turned off (only when they havent given permissions/denied permission)
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then the Location services is enabled for the Device
Then the user is displayed with Preferred Location or Last visited location

@sprint8 @regression @32736
Scenario:- User wants to select a Banfield Pet Hospital when the Geo-Location is turned off (only when they havent given permissions/denied permission)
When User navigated to Home Screen
When User navigating to who are we scheduling page
Then user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then the Location services is enabled for the Device
And user will be displayed with Last visited location

@sprint8 @regression @32736
Scenario:- User wants to select a Banfield Pet Hospital when the Geo-Location is turned off (only when they havent given permissions/denied permission)
When User is on Home Page
And user will not be displayed Preferred location and Last visited location
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then the Location services is enabled for the Device
And user will be not displayed with Last visited location


@sprint6 @regression @28794
Scenario:- User wants to select a Banfield Pet Hospital when the Geo-Location is turned off (only when they havent given permissions/denied permission)
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And user is displayed with the when and where screen without any hospitals listed
And the user clicks on Dont Allow in native Location Pop up to be displayed with the following
#| Location services | �Turn on location services to find the nearest Banfield hospital� | Ignore | Settings | New search |
#| A.M time slots | "Looking for morning drop-off times?" (Yes/No options)  |
#| Your preferred location/ Last visited location | 
#And the user is not displayed with list of closest hospitals location by default >> CR

@sprint6 @regression @28794
Scenario:- User wants to select a Banfield Pet Hospital when the Geo-Location is turned off (only when they havent given permissions/denied permission)
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And user is displayed with the when and where screen without any hospitals listed
And the user taps on Ignore CTA to be redirected to Filter page

@sprint6 @regression @28794
Scenario: User wants taps on Ignore CTA to be redirected to Filter page
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And the user can tap on New search CTA to get redirected to Filter 

@sprint6 @regression @28794
Scenario: User wants taps on Settings CTA to be redirected to Filter page
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And the user taps on Settings CTA to get redirected to the native flow to enable geo-location

@sprint6 @regression @28794
Scenario: User wants taps on verify Your preferred location - Hospital
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
#And the user is displayed with the Your preferred location with the following information CR
#| Hospital name | Preferred (Heart) icon (selected) | Contact number (underlined) | Hospital address | Location without miles | 
And the user is displayed with the Last visited location with the following information
#| Hospital name | Hospital address | Location without miles | Contact number (underlined) | Heart icon (deselected ) |
And the user tap on map icon to launch map app with the location pre-pinned

#@sprint6 @regression @28794 >> CR
#Scenario: User wants taps on verify Your preferred location - Hospital
#Then the user clicks on Dont Allow in the enable location popup
#And the user is displayed with the Last visited location with the following information
#And the user can tap on Preferred Heart icon on any location to select it as preferred location
#And the selected preferred location is displayed on the home screen

#@sprint6 @regression @28794 >> CR
#Scenario: User wants taps on verify Your preferred location - Hospital
#Then the user clicks on Dont Allow in the enable location popup
#And the user is displayed with the Last visited location with the following information
#And the user can tap on Preferred Heart icon on any location to select it as preferred location
#And the user can deselect the the Preferred Heart icon to remove the location as preferred
##And once the user deselects the  Preferred Heart icon, the preferred location will be removed from Your preferred location
#And the user tap on map icon to launch map app with the location pre-pinned

@sprint6 @regression @28794
Scenario: User wants taps on verify Your preferred location - Hospital
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And the Next CTA will be in a disabled state
#And the user taps on a location to select from the list
#And when the user is displayed with the location services and AM time slots together the New search CTA will be displayed only on AM time slot >> CR
#And the user taps on Next CTA to get redirected to next when and where screen

#@sprint6 @regression @28794 >> CR
#Scenario: User wants taps on verify Your preferred location - Hospital
#Then the user clicks on Dont Allow in the enable location popup
#And by default Yes will be selected in A.M time slot options >> CR
#And the user can select only one either Yes or No in A.M time slot options >> CR
#And the selected option will be highlighted on the tap >> CR

@sprint6 @regression @28794
Scenario: User wants taps on verify Your preferred location - Hospital
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And the user tap on < icon to go back to previous screen

@sprint6 @regression @28794
Scenario: User wants taps on verify Your preferred location - Hospital
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location

Then the user clicks on Dont Allow in the enable location popup
And the user tap on X close icon to go back to the screen where they clicked on Make appointment or Make an appointment

#@sprint6 @regression @28794 >> CR
#Scenario: User wants taps on verify Your preferred location - Hospital
#And the user is displayed with the "Your preferred location" or "Last visited location" only if it matches the below criteria:
#If the user has 'Preferred location' and no Last visited location the user will be displayed with Preferred location
#If the user has 'Last visited location' and no 'Preferred location' the user will be displayed with  'Last visited location'
#If the user has 'Preferred location' and 'Last visited location'  the user will be displayed with  'Last visited location'
#If the user does not have 'Preferred location' or 'Last visited location' the user will not be displayed 'Preferred location' and 'Last visited location'
#And if the  'Preferred location' and 'Last visited location' are the same , 'Last visited location' will be displayed as the title and heart icon will be selected
#And the user is displayed with the A.M time slot if 'Vaccination' or 'Routine visit' has been selected in the previous steps. Refer #28793 #31233 


 #NATC
 #And the heart icon color will be changed to red when selected