Feature: 29451 - View Home Screen-Display card for multiple set of plans

Background:
Given user launched the Banfield application

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When user is on the home scren
Then the user is displayed with 2 VetChatGo modules on the Home screen

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When user is on the home scren
And if user has purchased more than one multi-pet plan, then 2 Multi status modules will display

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When the user is on Home screen
And the VetChatGo module will display if user has purchased the Single Pet VetChatGo Plan

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When User login as Multi VetChatGo Plan
And the VetChatGo module will display if user has purchased the Multi-Pet VetChatGo Plan 

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When User Login into the Home Screen with SINGLE Multi VCGO
And if user has purchased a Single pet VetChatGo plan and a Multi pet VetChatGo plan, then both status modules will be displayed

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When User Login into the Home Screen with SINGLE SINGLE VCGO
And if user has purchased more than one single pet plan, then 2 Single status modules will display

@29451 @sprint5 @regression 
Scenario: User wants to view multiple cards for VetChatGo plans on Home screen.
When User Login into the Home Screen with SINGLE Multi VCGO
And the most recently purchased plan should be displayed first 
And the Start date format will be Mon, DD, YYYY
And the Expiration date format will be Mon DD, YYYY
And the user should be displayed with Total amount