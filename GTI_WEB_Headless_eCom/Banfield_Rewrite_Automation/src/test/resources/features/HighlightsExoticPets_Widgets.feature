Feature: 30549 - Highlights - Exotic Pets - Widgets

Background:
Given user launched the Banfield application

@30549 @sprint5 @regression @smoke
Scenario: Exotic pet
When User login as Multi VetChatGo Plan
When a user has opted for multiple VetChatGo plans
And the pet will not be displayed with Vet Chat component when the user is on Exotic pet Highlights
And the user will not be displayed with VetChatGo component when the user is on Exotic pet Highlights

@30549 @sprint5 @regression @smoke
Scenario: Exotic pet
When user is logged into the app as Exotic Pet
And the pet will not be displayed with an OWP Payments details widget  if the user is on the Exotic Pet Highlights