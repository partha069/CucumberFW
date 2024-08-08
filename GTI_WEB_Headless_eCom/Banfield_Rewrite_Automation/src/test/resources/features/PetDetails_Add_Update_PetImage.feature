Feature: 28139-Pet details - Add/Update Pet image

Background:
Given user launched the Banfield application
When the user is on Home screen
When user is on the pet info screen
When user is on the pet detail screen
When the user taps on the camera icon
Then the user should be redirected to the Pet name screen to change the photo

@28139 @sprint4 @regression 
Scenario:- User wants to add/update the pet image
And the screen should display the following
#| Display pet image (if the pet image is available) or Display pet avatar based on pet species | Change Photo CTA | Done CTA |
And the Done CTA should be enabled by default
And the user should tap on Change photo CTA to add or update Image
And the user is displayed with the a custom pop-up on denying the access
#| Title: Permissions Required  | Text: To use Image Cropper plugin features you need to allow the device Camera and Storage access. | Okay CTA |
And the user tap on Okay CTA to dismiss the pop-up
And the user if tap on Change photo CTA again after denying the access

@28139 @sprint4 @regression 
Scenario:- User wants to add/update the pet image
And the user should tap on Change photo CTA to add or update Image
Then the user should be displayed with the native alert again to allow the access 
And the user is displayed with the a custom pop-up on providing access
#| Static Text: Set Photo | Take Photo CTA | Choose Photo CTA | Cancel CTA |
And the user taps on Cancel CTA to cancel the pop up and stay on the same screen

@28139 @sprint4 @regression 
Scenario:- User wants to add/update the pet image
And the user should tap on Change photo CTA to add or update Image
Then the user should be displayed with the native alert again to allow the access
And the user taps on Choose Photo to launch the device gallery

@28139 @sprint4 @regression 
Scenario:- User wants to add/update the pet image
And the user should tap on Change photo CTA to add or update Image
Then the user should be displayed with the native alert again to allow the access
And the user taps on Take Photo CTA to launch the device camera
#And the user has the ability to crop and resize the image on upload

@28139 @sprint4 @regression 
Scenario:- User wants to add/update the pet image
And the user can tap on the < button to go back to the Pet Details screen
And the user tap on Done CTA to get redirected to the pet info screen 