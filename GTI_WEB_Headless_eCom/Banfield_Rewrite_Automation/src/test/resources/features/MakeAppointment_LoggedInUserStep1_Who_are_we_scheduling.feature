Feature: 28783-Make Appointment - Logged in user - Step 1 : Who are we scheduling?

Background:
Given user launched the Banfield application

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Who are we scheduling? screen
And the screen should display the user with the following
#| List of pet cards | +Add a new pet CTA | Next CTA | Close (X) icon |
And the user with a preferred hospital will be displayed with the text
#"Have an urgent request? Need to schedule for an exotic or pocket pet? Call your preferred hospital." 
And the Next CTA will be in a disabled state by default
And the pet will not be selected by default
And the pet card is displayed with
#Petname | ‘Last seen Mon DD, YYYY’ Ex. (Last seen Jan 28, 2022 or Jan 8, 2022)
And the user will tap on the Pet card to select a pet
And the selected pet will have a green check mark indicator on the pet card
And the Next CTA will be enabled once the user selects a pet
And the user taps on Call your preferred hospital. to open a native pop-up with the message 
#Title: Hospital Name Text: Hospital address| Contact Number | Call CTA | Directions CTA | Cancel CTA|
And the user taps on Cancel CTA to dismiss the pop-up and return to the screen
And the user taps on the Next CTA to go to Reason for visit? screen

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Who are we scheduling? screen
And the user taps on Call your preferred hospital. to open a native pop-up with the message 
And the user taps on Call CTA to open the device dialer with preferred hospitals contact number pre-filled

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Who are we scheduling? screen
And the user taps on Call your preferred hospital. to open a native pop-up with the message 
And the user taps on Directions to open Map App with preferred hospitals location pre-pinned

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Who are we scheduling? screen
And the user will tap on Add a new pet CTA to go to What species is your pet screen

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Who are we scheduling? screen
And the user taps on X icon to go to previous screen

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When the user is on Home screen
When User navigating to who are we scheduling page
And the user will tap on Add a new pet CTA to go to What species is your pet screen 

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When User navigated to Home Screen
And the pet card is displayed with the text No visit data on record when the pet has no previous visits on record
When User navigating to who are we scheduling page
And the user cannot multi-select pet from the list
And the user taps on X icon to go to previous screen
And the Hospital name, Hospital address, Contact Number and Location will be of set Preferred hospital 

@sprint6 @regression @28783
Scenario: User is on the "Who are we scheduling?" screen and wants to select the pet to schedule appointment.
When User Logged in with OWP User Dental Up to date status
When User navigating to who are we scheduling screen
And if the user does not have set a preferred hospital, the user will be displayed with the text
#"Have an urgent request? Need to schedule for an exotic or pocket pet? Call your local Banfield pet hospital. " 


#And Call your preferred hospital will be underlined- NATC
#And the user is displayed with the list of pets (Dogs and Cats) that are not hidden in the app Settings- NATC
#And the pet card is displayed with the pet image/avatar- NATC
#And the first navigational dot is highlighted- NATC
#And the pet name displayed is in ellipsis if the pet name is long (dependent on the screen size)-NATC
#And if the user has all pets hidden/ the user only have exotic pets then the user will not be displayed any pets. - NATC