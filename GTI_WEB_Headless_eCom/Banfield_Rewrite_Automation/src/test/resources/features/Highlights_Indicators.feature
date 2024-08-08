Feature: 28140 - Highlights - Indicators

#Background:
#Given user launched the Banfield application
#When user is on the pet detail screen
#When they tap to view the highlights tab

#@28140 @sprint5 @regression @failed
#Scenario:- User wants to view the different indicators on the accordions in highlights
#Then the user should be displayed with the indicators on the following accordions
#| Comprehensive exam | Vaccinations | Dental exam | Parasite control | Weight tracker (always on bottom) |
#And the priority of the indicators are as following:
#| Red (Overdue) | Yellow (Due soon)| Green(Current) | Gray(Nothing on file) |
#And the accordions are sorted based on the priority of the Indicators
#And the accordions are sorted by the default order within if there are more than one with same indicator
#( Example: Parasite control and Comprehensive exam are both red/overdue. Comprehensive Exam will display at the top - then Parasite control )
#And the accordions are sorted by the default sorting order if they are Green or Gray
#And the priority of the weight indicators are as following:
#(Green- Ideal, Yellow- Under weight/Overweight , Red - Obese, Gray- Nothing on file ) - [Fetched from an api]
#And the accordion once expanded will display a line underneath the accordion of the status indicator color. (Refer to individual stories about rules related to the accordion)
#And the carrot color is orange if it is enabled, on the accordion
#And the carrot color will be greyed out if it is disabled, on the accordion