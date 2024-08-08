Feature: 28143 - Highlights - Comprehensive Exam - OWP

Background:
Given user launched the Banfield application
#When User navigated to Home Screen
When user is on the home scren

@28143 @sprint5 @regression
Scenario: OWP user wants to view the Comprehensive exam section and its details
When they tap on the Comprehensive exam accordion to expand
Then they will be displayed with the following information Comprehensive exam, Status indicator, Next exam due date
And the user is displayed with the status of the Comprehensive exam in (red, yellow, green)
And the user will be displayed with the Manage plan CTA in OWP widget with the static text: Included in your plan
And the user taps on the Manage plan CTA to get redirected to the URL on browser in logged in state
#URL:- https://www.banfield.com/my-banfield/my-account
#And the user will be displayed with a indicator line beneath the expanded accordion which will match the Status indicator color
#And the UI will present yellow dot if due date is less than 30 days from current date (Due Soon)
#And the UI will present green dot if due date is more than 30 days from current date (Current)
#And the UI will present red dot if current date is 1 day past the due date (Overdue)
#And the UI will present gray(Nothing is on file) dot if nothing is on file and the accordion will not expand.

@28143 @sprint5 @regression 
Scenario: OWP user wants to view the Comprehensive exam section and its details
When they tap on the Comprehensive exam accordion to expand
And the user taps on the accordion again to collapse the Comprehensive exam accordion