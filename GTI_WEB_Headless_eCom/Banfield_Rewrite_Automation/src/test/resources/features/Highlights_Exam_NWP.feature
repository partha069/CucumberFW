Feature: 29520-Highlights - Exam NWP

Background:
Given user launched the Banfield application

@sprint6 @regression @29520 @smoke
Scenario: For NWP user
When user is on the home page
When the NWP user is on the Highlights screen
Then the user is displayed with Exam accordion with Status indicator red in place of Comprehensive exam
And the user can tap on the Exam accordion to expand
And the user will be displayed with the following information for Exam
#| Exam | Status indicator  | Next exam due Aug 3, 2021 or Aug 23, 2021
And the user will be displayed with the Enroll now CTA with static text 
#"Optimum Wellness Plans  For the pet you love" 

@sprint6 @regression @29520
Scenario: For NWP user
When user is on the home page
When the NWP user is on the Highlights page
And the user is displayed with the grey color when there is nothing on file
And the user can expand the accordion when there is nothing on file
And the expanded accordion Nothing on file will be displayed with the following information
#| Text: Optimum Wellness Plans "For the pet you love" | Enroll now CTA |
And the user taps on the Enroll now CTA to get redirected to the URL on browser
#URL:- https://shop.banfield.com/banfield-wellness-plans/enroll

@sprint6 @regression @29520
Scenario: For NWP user
When User Log in with valid Credential and displays Home Screen
When NWP user is on the Highlights page
Then the user is displayed with Exam accordion with Status indicator green in place of Comprehensive exam.

#Then the user is displayed with "Exam" accordion with Status indicator yellow in place of Comprehensive exam. >> Test Data
#NON AUTOMATABLE
#And the status indicator will present yellow dot if 'Next exam due' date is less than 30 days from current date (Due Soon)
#And the status indicator will present red dot if current date is 1 day past the 'Next exam due' date (Overdue)
#And the status indicator will present green dot if 'Next exam due' date is more than 30 days from current date (Current)