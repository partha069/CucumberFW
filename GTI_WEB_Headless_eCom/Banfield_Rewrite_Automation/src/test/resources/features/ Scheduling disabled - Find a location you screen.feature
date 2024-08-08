Feature: 36331:  Scheduling disabled - Find a location you screen

#This Story is not working in INT env, but works fine in prod env.



@36331 @sprint11 @regression 
Scenario: User wants to verify that express location is shown without make an appointment cta from welcome screen
Given user launched the Banfield application
When he taps on Find a nearby location CTA 
Then the user will be redirected to Find a location near you screen
Then User search for express location and navigate to find a location near you with hours of operation


@regression  @36331 @sprint11 
Scenario: User wants to verify that express location is shown without make an appointment cta from home screen when preffered location is set
When the user is on Home screen
When the user has set a preferred location
Then the user will be displayed with your preffered location card with preferred location set
# Your preferred location | Hospital Name | Hospital address | Miles | Make an appointment CTA (Remove the call icon) | Find a Banfield Pet Hospital® near you | Find a nearby location CTA | 
And the user can tap on Find a nearby location to get redirected to Find a location near you screen
Then User search for express location and navigate to find a location near you with hours of operation


@regression  @36331 @sprint11 
Scenario: User wants to verify that express location is shown without make an appointment cta from home screen when preffered location is not set
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then User search for express location and navigate to find a location near you with hours of operation
