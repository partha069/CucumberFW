Feature: 30959-View Pet Age - 0 to 12 months old

@sprint6 @regression @30959
Scenario: View Pet Age
Given user launched the Banfield application
When User navigated to Home Screen
When user is on the pet info-screen
When user is on the pet detail screen
Then the pets age is displayed on Pet Dashboard screen
And if the pets age is under 1 month Pets age is displayed as 0 months old

#And if the pets age is 1 month , Pet's age is displayed with "1 month old"
#And if the pets age is between 2 - 11 months, Pet's age is displayed with " <pet age> months old"
#And if the pets age is above 11 months , Pet's age is displayed with "1 year old"
#And if the pets age is above 1 year, Pet's age is displayed with "<pet age> years old"