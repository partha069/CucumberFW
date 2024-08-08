Feature: 28083 - Highlights - Pet Profile

@28083 @sprint5 @regression @smoke
Scenario: User wants to tap on "Pet profile" from "Highlights" screen
Given user launched the Banfield application
When User navigated to Home Screen
When the user tap on Pet profile accordion to expand
Then the user should be able to view the following details:
#| Species |
#| Breed |
#| Gender |
#| Color |
#| Birthday |
#| Allergies |
#| Medical allergies |
#| Microchip tag 1 |
#| Microchip tag 2 |
#| Rabies tag |
And the user should be able to expand or collapse the details on tap