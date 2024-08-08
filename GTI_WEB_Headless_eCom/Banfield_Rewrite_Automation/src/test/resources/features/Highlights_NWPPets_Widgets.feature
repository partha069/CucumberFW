Feature: 30548 - Highlights - NWP Pets Widgets

Background:
Given user launched the Banfield application

@30548 @sprint5 @regression @smoke
Scenario: User wants to validate NWP pet Dog/Cat
When user is on the home page
When the NWP user is on the pet detail screen
When they tap to view the highlights tab
Then they should not be displayed with the OWP Payments details widget below the Preventive Dashboard
And the VetChat widget wont be displayed if the user has no OWP Plan for any of their pets in the clients account Dog or Cat
And If the user has no active VetChatGo plans or no pet is enrolled in OWP the pet will not be displayed with any widgets below the preventive dashboard.

@30548 @sprint5 @regression
Scenario: User wants to validate NWP pet Dog/Cat
When the user is on Home Screen
And for an NWP pet, If the user has a pet on the account enrolled in OWP, the NWP pet will be displayed with Vet Chat widget.
And the user taps on Chat with a vet CTA on  Vet Chat widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK

@30548 @sprint5 @regression 
Scenario: User wants to validate NWP pet Dog/Cat
When User Login into the Home Screen with SINGLE Multi VCGO
And the VetChatGo widget will be displayed for any dog or cat who have an Active VetChatGo plan
And the user taps on Chat with a vet CTA on VetChatGo widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK