Feature: 28146 - Highlights - Weight tracker

Background:
Given user launched the Banfield application

@28146 @sprint5 @regression @smoke
Scenario:- User wants to view the Weight tracker section and its details
When User navigated to Home Screen
When the user taps on the Weight tracker accordion to expand
Then they will be displayed with the following information Status indicator, Body condition score, Weight chart, Weight history
And the user will be displayed with the status green- ideal

@28146 @sprint5 @regression 
Scenario:- User wants to view the Weight tracker section as Underweight status
When User Logged in app as Weight Tracker Underweight status
And the user will be displayed with the status yellow- under weight

@28146 @sprint5 @regression 
Scenario:- User wants to view the Weight tracker section and its details
When User Logged in app as Weight Tracker Overweight status
And the user will be displayed with the status yellow- under overweight

@28146 @sprint5 @regression 
Scenario:- User wants to view the Weight tracker section and its details
When User Logged in app as Weight Tracker Obese status
And the user will be displayed with the status  red - obese 
And the user taps on the accordion again to collapse it



#And the Weight tracker module will not be displayed if there is nothing on file
#And the weight history will be sorted by recorded date recent first
#And the date will be displayed as Mon DD, YYYY