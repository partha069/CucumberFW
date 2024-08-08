Feature: 28145 - Highlights - Vaccinations

Background:
Given user launched the Banfield application


#@28145 @sprint5 @regression @failed
#Scenario:- User wants to view the vaccinations section and its details
#When the OWP user is on the Highlights Tab
#When they tap on the Vaccinations accordion to expand
#And if the vaccine was never administered but added to the plan then the user will be displayed with the following:
#| Vaccine | Last date given - Never | Due date - N/A | 
#Then they will be displayed with the following information
#| Vaccinations | Status indicator | Vaccine type | Last date given| Due date with status indicator |
#And the Vaccinations accordion status indicator will be displayed  in (red, green, yellow, gray)
#And the Due date will be displayed in 'Mon DD, YYYY' (Ex. Feb 3, 2022 or Feb 23, 2022)
#And the Due date will have a status indicator 
#And the Due date status indicator can be Red, Yellow or green
#And the Due date status indicator will be in green if the due date is current.
#And the Due date status indicator will be in yellow if the due date is due soon.
#And the Due date status indicator will be in red if the due date is past due.
#And the  Due date status indicator will present yellow dot if due date is less than 30 days from current date (Due Soon)
#And the  Due date status indicator will present green dot if all due date is more than 30 days from current date (Current)
#And the  Due date status indicator will present red dot if current date is 1 day past the due date (Overdue)
#And if the status of the Due date is red then the overall status will change to red(Overdue)
#And if the status of the Due date is yellow then the overall status will change to yellow(Due soon)
#And if the status of all Due dates is green then the overall status will be green(Current)
#And the vaccines given will be sorted by due date soonest first
#And the vaccines history should display all records on file

#And the user will be displayed with a indicator line beneath the expanded accordion which will match the Status indicator color

#And the user taps on the accordion again to collapse it.


#@28145 @sprint5 @regression
#Scenario:- User wants to view the vaccinations section and its details if there is nothing on file
#And the vaccine accordion will not expand if there is nothing on file
