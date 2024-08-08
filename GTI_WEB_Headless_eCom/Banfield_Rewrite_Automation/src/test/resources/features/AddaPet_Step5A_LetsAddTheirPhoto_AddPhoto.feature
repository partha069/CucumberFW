Feature: 27726-Add a pet - Step 5A -  Lets add their photo - Add Photo

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user is on Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user taps on Next CTA

@27726 @sprint4 @regression 
Scenario: User wants to add pets photo
Then the user will be redirected to Lets add their photo screen with Add photo CTA Skip CTA
And if the user selected mixed breed in the previous step Mixed will be displayed on the pet card

@27726 @sprint4 @regression 
Scenario: User wants to add pets photo
And the user will tap on Add photo CTA to add a photo
And the user will be displayed with native alert for the app to access photos on device, if not set already
And the user is displayed with the custom pop-up if access is denied
#20| Title: Permissions Required  | Text: To use Image Cropper plugin features you need to allow the device Camera and Storage access. | Okay CTA |
And the user tap on Okay CTA to dismiss the pop-up
And the user if tap on Add photo CTA again after denying the access

@27726 @sprint4 @regression
Scenario: User wants to add pets photo
And the user will tap on Add photo CTA to add a photo
Then the user should be displayed with the native alert again to allow the access
And the user will be displayed with the custom pop-up to add photo with following options if access is given
#34 Text : Set Photo | Take photo CTA | Choose photo CTA | Cancel CTA |
And the user taps on Take Photo CTA to launch the device camera
#And the user will have the ability to crop and resize the photo before uploading (NATC)
#And the banner image will be replaced by uploaded image on success (NATC)

@27726 @sprint4 @regression
Scenario: User wants to add pets photo
And the user will tap on Add photo CTA to add a photo
Then the user should be displayed with the native alert again to allow the access
And the user will be displayed with the custom pop-up to add photo with following options if access is given
And the user taps on Choose Photo to launch the device gallery

@27726 @sprint4 @regression 
Scenario: User wants to add pets photo
And the user will tap on Add photo CTA to add a photo
Then the user should be displayed with the native alert again to allow the access
And the user will be displayed with the custom pop-up to add photo with following options if access is given
And the user taps on Cancel CTA to cancel the pop up and stay on the same screen

@27726 @sprint4 @regression 
Scenario: User wants to add pets photo
And the Next CTA is only displayed after user uploaded an image else "Skip" CTA will be displayed
And the Next or Skip CTA should be enabled by default
And the user will tap on Skip or Next to go to Your pets screen

@27726 @sprint4 @regression 
Scenario: User wants to add pets photo
And the user will tap on < button to go to What breed are they screen

@27726 @sprint4 @regression
Scenario: User wants to add pets photo
And the user will tap on X to go on the Home Screen