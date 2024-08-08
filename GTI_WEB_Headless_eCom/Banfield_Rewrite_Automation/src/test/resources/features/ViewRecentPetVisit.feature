Feature: 27721- View recent pet visit

Background:
Given user launched the Banfield application

@32717 @sprint8 @regression
Scenario: User wants to verify Available 24/7 & Vet Chat
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
And the user wants to verify Vet Chat Available 24_7

@327251 @sprint8 @regression
Scenario: VetChatGo enabled account will always allow the user to initiate a chat from the visit summary 'Concerns' section.
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
And The user wants to tap on VetChat CTA

@27721 @sprint4 @regression
Scenario: User wants to see Pets visit details
#When User navigated to Home Screen
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
Then the user should be redirected to Pet name visit screen
And the user will be displayed with the Visit Details Date and Time and Location
And the user will be displayed with Concerns section with the Vet Chat Available 247 CTA Call Hospital CTA
And the user will tap on Vet Chat Available 247 CTA to launch the vet chat

@27721 @sprint4 @regression
Scenario: User wants to see Pets visit details
#When User navigated to Home Screen
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
Then the user should be redirected to Pet name visit screen
And the user will be displayed with the Visit Details Date and Time and Location
And the user will be displayed with Concerns section with the Vet Chat Available 247 CTA Call Hospital CTA
And the user will tap on Call Hospital CTA to open devices default dialer with hospital number prefilled

@27721 @sprint4 @regression 
Scenario: User wants to see Pets visit details
#When User Login into the app
When User navigated to Home Screen
And the NWP user_exotic pets owner on tapping Vet Chat Available 24_7 CTA will be displayed a native pop-up 
# "<Pet name> is not currently eligible for Vet Chat™. For on demand access to chat with a veterinarian 24/7, sign pet name up for an Optimum Wellness Planï¿½" |Okay CTA|
And the user will tap on Okay CTA to close pop-up

@27721 @sprint4 @regression 
Scenario: User wants to see Pets visit details
#When User navigated to Home Screen
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
Then the user should be redirected to Pet name visit screen
And the user will be displayed with Documents section with the Invoice CTA 
And the user will tap on Invoice CTA to be redirected to Invoice screen 
And the user will be displayed with Medical Details section with the Medicine, Vaccines, Labs 

@27721 @sprint4 @regression
Scenario: User wants to see Pets visit details
#When User navigated to Home Screen
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
Then the user should be redirected to Pet name visit page
And the user will be displayed with Medicine name if administered
And the user will be displayed with  Name of vaccine if administered
And the user will be displayed with Name of the Test Lab Result Details Lab Range Above below comes from api if administered.

@27721 @sprint4 @regression
Scenario: User wants to see Pets visit details
#When User Login into the app
#When the user is on Home screen
When User navigated to Home Screen
And the user will be displayed with No medications if they did not have any medicines administered
And the user will be displayed with No vaccines if they did not have any vaccines administered
And the user will be displayed with No labs if they do not have any labs
And the user will tap on < button to go back to previous screen