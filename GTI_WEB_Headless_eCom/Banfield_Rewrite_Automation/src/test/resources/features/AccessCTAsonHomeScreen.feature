Feature: 27697-Access CTAs on Home Screen

Background:
Given user launched the Banfield application

@regression @27697 @sprint3 
Scenario: 27697-User wants to tap on "See FAQs about COVID-19" CTA 
When the user is on Home screen
And the user is displayed with the COVID19 Banner
When user taps on See FAQs about COVID19 CTA

@regression @27697 @sprint3 
Scenario: 27697-User wants to view Pet details
When the user is on Home screen
When the user taps on Pet Card
Then the user will be redirected to Pet details screen with Highlights and Timeline
And the user taps on Visit Details CTA Clock icon to get redirected to visit details screen for recent visit details

@regression @27697 @sprint3 
Scenario: 27697-User wants to add a new petƒ√
When the user is on Home screen
When the user taps on Add a new pet CTA
Then the user should be redirected to What species is your pet screen

@regression @27697 @sprint3
Scenario: 27697-User redirectes to the Find a location near you on tap
When user tapped on the Login CTA from the login screen and the user credentials are valid
Then the user should be able to view the Find a location near you CTA
When the user has no preferred hospital location
And the user is redirected to the Find a location near you on tap

@regression @27697 @sprint3
Scenario: 27697-User displays with Hospital Name, Hospital Address, Map icon CTA, Call CTA 
When the user is on Home screen
When the user has a preferred hospital location
Then the user should be displayed with Hospital Name, Hospital Address, Map icon CTA, Call CTA 

#@regression @27697 @sprint3 
Scenario: 27697-User taps on the call icon to launch the dialer with number pre-filled
When the user is on Home screen
When the user has a preferred hospital location
And the user should tap on the call icon to launch the dialer with number pre-filled

@regression @27697 @sprint3 
Scenario: 27697-User taps on the map icon to launch the maps app with location pre-pinned
When the user is on Home screen
When the user has a preferred hospital location
And the user should tap on the map icon to launch the maps app with location pre-pinned

@regression @27697 @sprint3 
Scenario: 27697-User redirected to Tell us about your pet screen for logged in user flow
When the user is on Home screen
When the user taps on Make an appointment CTA
Then the user will be redirected to Tell us about your pet screen for logged in user flow

@regression @27697 @sprint3
Scenario: 27697-User wants to tap on Shop Now CTA
When the user is on Home screen
When user taps on Shop Now CTA

@regression @27697 @sprint3
Scenario: 27697-User wants to tap on Donate CTA 
When the user is on Home screen
When user taps on Donate CTA