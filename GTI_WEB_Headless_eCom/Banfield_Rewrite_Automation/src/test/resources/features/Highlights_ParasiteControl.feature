Feature: 28144 - Highlights - Parasite control

Background:
Given user launched the Banfield application
When the OWP user is on the Highlights Tab
When they tap on the Parasite control accordion to expand

#@28144 @sprint5 @regression @failed
#Scenario:- User wants to view the Parasite control section and its details
#Then the user will be displayed with the following information
#| Parasite control | Status indicator | Category name | Medication name and Dosage | Last date given| Due date with Status indicator |
#And the user is displayed with the status of the Parasite control in red, green, yellow and gray
#And the Due date will have a status indicator 
#And the Due date status indicator can be Red, Yellow or green
#And the Due date status indicator will be in green if the due date is current.
#And the Due date status indicator will be in yellow if the due date is due soon.
#And the Due date status indicator will be in red if the due date is past due.
#And Due date status indicator will present yellow dot if due date is less than 30 days from current date (Due Soon)
#And Due date status indicator will present green dot if due date is more than 30 days from current date (Current)
#And Due date status indicator will present red dot if current date is 1 day past the due date (Overdue)
#And if one of the status indicator for Due date is red, the accordion status will change to red
#And if one of the status indicator for Due date is yellow, the accordion status will change to yellow
#And if the status of all Due dates is green then the overall status will be green(Current)
#And the user will be displayed with a indicator line beneath the expanded accordion which will match the Status indicator color
#And the parasite control drugs given will be sorted by due date soonest first
#And the parasite control history should display all records on file.
#And the user should be able to tap on Order parasite control CTA to get redirected to URL on Browser in logged in state
#URL:- https://shop.banfield.com/
#And for an OWP user, with Parasite control accordion status gray(nothing on file) the accordion will not expand (no promo, no CTA)
#And for a NWP user, with  Parasite control accordion status gray(nothing on file) the accordion will not expand (no promo, no CTA)
#And for a new pet, the  Parasite control accordion will not expand (no promo, no CTA)

#@28144 @sprint5 @regression @failed
#Scenario:- User wants to view the Parasite control section and its details and ability to collapse by tapping accordian
#And the user has the ability to tap on the accordion again to collapse it