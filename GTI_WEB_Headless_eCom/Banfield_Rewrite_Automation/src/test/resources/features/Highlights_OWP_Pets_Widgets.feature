Feature: 29041 - Highlights - OWP Pets -Widgets 

Background:
Given user launched the Banfield application
#When User navigated to Home Screen
When user login as owp user
When the OWP pet user is on the pet detail screen

@29041 @sprint5 @regression @smoke
Scenario: OWP pet Dog/Cat
When they tap to view the highlights tab for OWP pet
Then they should be displayed with the OWP Payments details widget below the Preventive Dashboard
And the user is displayed with Optimum Wellness Plans, Active
And the user will be displayed with Payment details CTA
And the user will tap on Payment details CTA to get redirected to Payment details screen 

@29041 @sprint5 @regression @smoke
Scenario: OWP pet Dog/Cat
When they tap to view the highlights tab for OWP pet
And the VetChat widget is displayed with Text As an OWP member, you have access to veterinary advice for 24_7 peace of mind. Chat with a vet CTA
And the user will tap on Chat with a vet CTA to launch the Vet chat window HELPSHIFT SDK

@29041 @sprint5 @regression 
Scenario: OWP pet Dog/Cat
And the pet with an OWP plan will always see an OWP widget and Vet Chat widget

@29041 @sprint5 @regression 
Scenario: OWP pet Dog/Cat
And the OWP plan name will be dynamic Active Care Plus