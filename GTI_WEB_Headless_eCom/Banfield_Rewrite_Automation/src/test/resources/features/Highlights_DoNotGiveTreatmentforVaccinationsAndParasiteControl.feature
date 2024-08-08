Feature: 29140 - Highlights - Do not give treatment for Vaccinations and Parasite Control

Background:
Given user launched the Banfield application
#When User Logged in into app Multi Pets >> Vaccination1@int.com,Banfield!123

#@29140 @sprint5 @regression @sprint4test @failed
Scenario: Vaccinations
And the user is on Pet Highlights screen
When the user taps to expand the Vaccinations accordion
Then the user will be displayed with following information Vaccine name
#| Vaccine name - Do not give | N/A |
And if the all the vaccines are Do not give the status accordion will be current as green
And if we have a vaccine with overdue as red then the status of the vaccine accordion will be overdue

#@29140 @sprint5 @regression @sprint4test @failed
Scenario: Parasite control
When the user taps to expand the Parasite control accordion
Then the user will be displayed with following information Medication name
#| Medication name - Do not give | N/A |
And if the all the medications are Do not give the status accordion will be current as green


#And multiple do not give treatments should be ordered alphabetically
#And if the all the vaccines are Do not give the status accordion will be current(green) >> Test Id
#And if the all the medications are Do not give the status accordion will be current(green) >> Test Id
#And if we have a vaccine with due soon(yellow)then the status of the vaccine accordion will be due soon >> Test Id