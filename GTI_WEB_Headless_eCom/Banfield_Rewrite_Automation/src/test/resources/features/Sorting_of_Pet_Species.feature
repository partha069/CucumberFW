Feature: 30815-View Pet Age - 0 to 12 months old

@sprint6 @regression @30815
Scenario: Sorting of pet species
Given user launched the Banfield application
When User navigated to Home Screen
When the user clicks on Add a new pet CTA
Then the user will be redirected to What species is your pet page
When the user wants to select a pet species
And the user will be displayed with the following species to choose from Dog,Cat,Bird,Guinea Pig,Rabbit,Reptile,Pocket Pets_Mice, gerbils, hamsters...
#| Dog | Cat | Bird | Guinea Pig | Rabbit | Reptile | Pocket Pets (Mice, gerbils, hamsters...) |
