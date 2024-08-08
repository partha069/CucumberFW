Feature: 27110-Create Account-Step 5 Receive Notification

Background:
Given user is on the Complete online profile screen
When the user clicks on Next CTA on the Complete online profile screen
Then the user should be redirected to pop-up screen with the following information:

#Skip > Skip > Home Screen
@27110 @regression @sprint2 
Scenario: User wants to get notify on their next appointment scheduled, treatments or vaccines.
And the user should be able to tap on Skip CTA to get redirected to next pop-up screen 
Then the user should be able to tap on Skip CTA to get redirected to next to next pop-up screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user wants to Delete account and taps on Yes delete my account CTA

#Yes > Yes > Home Screen
@27110 @regression @sprint2 @phase2 @ios
Scenario: User wants to get notify on their next appointment scheduled, treatments or vaccines.
And the user should be able to tap on Yes CTA to get the native notification pop-up screen
And the user should be able to tap on Yes CTA to get the native next notification pop-up screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user wants to Delete account and taps on Yes delete my account CTA

#Skip > Yes > Home Screen
@27110 @regression @sprint2 @phase2 @ios
Scenario: User wants to get notify on their next appointment scheduled, treatments or vaccines.
And the user should be able to tap on Skip CTA to get redirected to next pop-up screen 
And the user should be able to tap on Yes CTA to get the native next notification pop-up screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user wants to Delete account and taps on Yes delete my account CTA

#Yes > Skip > Home Screen
@27110 @regression @sprint2 @phase2 @ios
Scenario: User wants to get notify on their next appointment scheduled, treatments or vaccines.
And the user should be able to tap on Yes CTA to get the native notification pop-up screen
Then the user should be able to tap on Skip CTA to get redirected to next to next pop-up screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user wants to Delete account and taps on Yes delete my account CTA