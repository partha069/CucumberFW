Feature: 27694-View Home Screen

 Background:
 Given user launched the Banfield application
 
 #@regression  @32718 @sprint8 //CR
 Scenario: 32718- User wants to verify Changes - See FAQs about COVID-19 , Add � in Shop now after Banfield, Add � in Donate after Banfield Foundation
 When the user is on Home screen
 Then the user should be redirected to home screen 
 And User wants to verify Changes - See FAQs about COVID-19 , Add TradeMark in Shop now after Banfield, Add TradeMark in Donate after Banfield Foundation
 
 @regression  @27694 @sprint3 
 Scenario: 27694-User wants to view the home screen on login
 When the user is on Home screen
 Then the user should be redirected to home screen 
 And the home screen is displayed with the Hi Users name bhere for pets. Were here to help.See FAQs about COVID19 CTA, Your pets, Add a new pet CTA, Your preferred location,Map icon CTA,Phone CTA,Make an appointment CTA,Shop now,Donate,VetChatGo

 @regression @27694 @sprint3
 Scenario: 27694-User wants to tap on the call icon to launch the dialer with number pre-filled
 When the user is on Home screen
 Then the user should be redirected to home screen
 And the user should tap on the call icon to launch the dialer with number pre-filled
 
 @regression @27694 @sprint3 
 Scenario: 27694-User wants to tap on the map icon to launch the maps app with location pinned
 When the user is on Home screen
 Then the user should be redirected to home screen
 And the user should tap on the map icon to launch the maps app with location pinned
 
 @regression @27694 @sprint3 
 Scenario: 27694-User wants to validate Donate, Banfield 
 When the user is on Home screen
 And the user will be displayed Shop Banfield module Text: Shop Banfield,Youre one stop shop for pet products, medications and treats, Shop now CTA
 And the user will be displayed with Donate module Text : Want to help, Every donation helps Banfield Foundation support pets and people who need it most, Donate CTA 
 And the user should be displayed with the preferred location module if they have set the preferred location.Text Your preferred location,Hospital Name and address,Map icon CTA,Phone CTA,Make an appointment CTA
 
 @regression  @27694 @sprint3 
 Scenario: 27694-User wants to varify if VetChatGo visible
 When user tapped on the Login CTA from the login screen and the user credentials are valid
 And the user will not be displayed VetChatGo if they have not opted for it.
 
 @regression  @27694 @sprint3
 Scenario: 27694-User wants to varify if VetChatGo visible
 When user tapped on the Login CTA from the login screen and the user credentials are valid
 And if the user has no preferred location the user will be displayed with Find a location near you module.Text Your preferred location, Adding a location to your favorites can help make scheduling appointments faster and easier,Find a location near you CTA
 
 @regression  @27694 @sprint3 
 Scenario: 27694-User wants to view Text: Single Logo,VetChatGo,Pets: Pet name,Start Date,Expiration,Total amount,Status
 When the user is on Home screen
 And the user will be displayed VetChatGo if the user purchased the vet chat go plan
 And the user for a single pet will be displayed with  Text: Single Logo,VetChatGo,Pets: Pet name,Start Date,Expiration,Total amount,Status
 
 @regression @27694 @sprint3 
 Scenario: 27694-User wants to view Text: Multi Logo,VetChatGo,Pets: Pet name,Start Date,Expiration,Total amount,Status
 When User login as Multi VetChatGo Plan
 And the user for a multiple pet will be displayed with  Text MULTI Logo, VetChatGo, Pet name, Start Date, Expiration, Total amount, Status