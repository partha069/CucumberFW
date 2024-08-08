Feature: 31269-Make Appointment - Logged in user - Step 4B : When and where ? - Filter Screen

Background:
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then the user clicks on Dont Allow in the enable location popup
And the user taps on Ignore CTA to be redirected to Filter page

@sprint6 @regression @31269
Scenario: - User wants to search & select Banfield Pet Hospital location for Appointment Filter screen
Then the user should be redirected to filter page
And the user can tap on New search CTA to get redirected to Filter screen
And the user taps on the Search field to enable the search
And the user starts typing in the search field
And the user is suggested with city state based on the keywordZip code they enter
And the user can choose a CityState from the suggested List
And the Cancel CTA will be enabled when the user enters a keyword in the search field
And the user taps on Cancel CTA to restart the search and empty the search field
And the user is suggested with city state based on the keywordZip code they enter
And the user can choose a CityState from the suggested List
And the Apply CTA gets enabled only after the user selects a location from the list
And the user taps on Apply after selecting the location
And the user taps on Apply CTA to get redirected to when and where screen 

@sprint6 @regression @31269
Scenario: - User wants to search & select Banfield Pet Hospital location for Appointment Filter screen
And the user is suggested with city state based on the keywordZip code they enter
And the user can choose a CityState from the suggested List
And the Apply CTA gets enabled only after the user selects a location from the list
And the user taps on Apply after selecting the location
And the user taps on Apply CTA to get redirected to when and where screen 
#And the user will be displayed with Last visited location or Your preferred location >> CR
And the user is displayed with the six nearest Banfield location based on the chosen city state or zip is displayed 
And the Next CTA is enabled only after selecting location from the list  of  six nearest Banfield location
And the user taps on Next CTA to get redirected to the next screen when & wherew screen

@sprint6 @regression @31269
Scenario: - User wants to search & select Banfield Pet Hospital location for Appointment Filter screen
And the user taps on < from Filter screen  to get redirected to previous when and where screen

@sprint6 @regression @31269
Scenario: - User wants to search & select Banfield Pet Hospital location for Appointment Filter screen
And the user taps on X from Filter screen to get redirected to previous when and where screen

#NATC
#And the list is displayed in the order of closest first  from the selected location 