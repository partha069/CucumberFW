Feature: 27727-Add a pet - Step 6 - Your Pets 

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on the Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user is on Lets add their photo screen
When the user taps on Skip CTA or Next CTA after uploading a photo

@27727 @sprint4 @regression @smoke @iosReal @androidReal
Scenario: User wants to add pets 
Then the user will be redirected to Your pets screen
#And the user will be displayed an avatar/photo of the pet based on the pet selected
And the pet card will have Pet name, Age, Gender, Breed, Trash icon, based on their previous selections
And the user will be displayed with the Add another pet CTA Done CTA
And the Done CTA by default will display as a enabled 
#And the user taps on the Done CTA to go on the Home screen with new Pet added.

@27727 @sprint4 @regression
Scenario: User wants to add pets photo
And the user taps on Trash icon to remove the pet
And the user is displayed with a native pop-up Are you sure you want to remove this pet 
#24 | Delete CTA| Cancel CTA|
And the user taps on Cancel CTA to stay on the same page
And the user taps on Delete CTA to Delete the pet
And if no pet is there user will be displayed with Text Add your pet to get started Add your pet CTA Done CTA
And the user taps on Add your pet CTA to go to What species is your pet screen

@27727 @sprint4 @regression 
Scenario: User wants to add pets photo
And the system replaces the previous pet with the added pet on adding another pet
And the user taps on Delete CTA to Delete the pet
And the user will be displayed with Done CTA in disabled state if they removed all the pets

@27727 @sprint4 @regression
Scenario: User wants to add pets photo
And the user taps on < button to go to Lets add their photo screen

@27727 @sprint4 @regression 
Scenario: User wants to add pets photo
And the user taps on X to go on the Home screen