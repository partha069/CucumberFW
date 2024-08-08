Feature: 26352-Access Bottom Navigation

Background:
Given user launched the Banfield application

@26352 @sprint2 @regression 
Scenario:- User wants to navigate across the app through bottom navigation
When the user is successfully logged in
And the user should be able to access the bottom Navigation through following tabs Home, Appointments, Chat, Profile 
And the user will be landing on the Home Tab by default 
And the user taps on Appointments to get redirected to the Appointments screen 
And the user taps on Chat to get redirected to the Chat Screen 
And the user taps on Profile to get redirected to the Profile screen 
#And the selected tab should be highlighted on redirecting the user to that screen
