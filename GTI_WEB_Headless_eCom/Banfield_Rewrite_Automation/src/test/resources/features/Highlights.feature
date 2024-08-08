Feature: 32638 - Highlights

Background:
Given user launched the Banfield application

#@32638 @sprint8 @regression //CR
Scenario: User wants to share records with boarders and groomers
When User navigated to Home Screen
When the user taps on Shareable records module
When the user taps on View records CTA

@32638 @sprint8 @regression  
Scenario: User wants to share records with boarders and groomers
When User navigated to Home Screen
And Shareable records are only displayed for Dogs

@32638 @sprint8 @regression 
Scenario: User wants to tap on Pet profile from Highlights screen
When User navigated to Home Screen
When the user tap on Pet profile accordion to expand
And the user taps on Pet profile to go to  