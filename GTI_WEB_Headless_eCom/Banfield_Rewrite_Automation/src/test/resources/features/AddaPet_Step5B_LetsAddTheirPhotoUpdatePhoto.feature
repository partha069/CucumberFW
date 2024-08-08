Feature: 28086-Add a pet - Step 5B - Lets add their photo - Update Photo

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user is on Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user taps on Next CTA
When the user taps on Change photo CTA
Then the user will be displayed with the custom pop-up with following options
#11 Text : Set Photo | Take photo CTA | Choose photo CTA | Cancel CTA |

@28086 @sprint4 @regression 
Scenario: User wants to change the pets photo
And the user will tap on Take photo CTA to open device Camera

@28086 @sprint4 @regression 
Scenario: User wants to change the pets photo
And the user will tap on Choose photo CTA to open device gallery
#And the user will have the ability to crop and resize the photo on upload (NATC)
#And the user should be displayed with the updated photo on successful upload (NATC)

@28086 @sprint4 @regression
Scenario: User wants to change the pets photo
And the user will tap on Cancel CTA to return to the same screen