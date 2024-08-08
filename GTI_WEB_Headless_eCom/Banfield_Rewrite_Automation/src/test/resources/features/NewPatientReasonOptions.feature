  Feature: 36295-New Patient Reason Options 

  @36295 @sprint15 @regression @NewPatient
  Scenario: User wants to tap on Need to talk Call your preferred hospital and Tags Operation
  Given user launched the Banfield application
  When the user is on Home screen
  And user wants to navigate to Whats going on Screen as new patient as Loggedin User
  And user wants to see the tags in New Patient Screen  
  #| New pet | Changing vet | Vaccination needed | General health check | Travel health cert | 
  And user wants to verify tags select operations and all the tags are not mandatory
  
  @36295 @sprint15 @regression @NewPatient
  Scenario: User wants to tap on Need to talk? Call your preferred hospital
  Given user launched the Banfield application
  When the user is on Home screen
  And the Logged in user with preferred location will be displayed with Need to talk Call your preferred hospital and Call icon
  And the user can tap on Need to talk Call your preferred hospital and Call icon to open the devices default dialer with the phone number pre-filled 
 
  @36295 @sprint15 @regression @NewPatient
  Scenario: User wants to tap on See official pet travel info CTA and navigate to www.aphis.usda.gov website
  Given user launched the Banfield application
  When the user is on Home screen
  And the Logged in user with preferred location will be displayed with Need to talk Call your preferred hospital and Call icon
  And if the user selects Travel health cert tag  
  Then the user should be displayed with the static text and CTA  
  #| “Health certificates may not be available same day.” | 'See official pet travel info' CTA | 
  And the user can tap on See official pet travel info CTA to get redirected aphis website
  #browser to https://www.aphis.usda.gov/aphis/pet-travel 

  @36295 @sprint15 @regression @NewPatient
  Scenario: User wants to validate notes for vet field
  Given user launched the Banfield application
  When the user is on Home screen
  And user wants to navigate to Whats going on Screen as new patient as Loggedin User
  And the Notes for the vet field will show a placeholder text Any specific concerns or questions 
  And the user cannot enter more than 255 characters in the notes for vet field 
  #existing Scenario

  @36295 @sprint15 @regression @NewPatient 
  Scenario: User wants to redirected earlier screen after tapping on < CTA 
  Given user launched the Banfield application
  When the user is on Home screen
  And user wants to navigate to Whats going on Screen as new patient as Loggedin User
  And the user taps on < to get redirected to the earlier screen 
  
  @36295 @sprint15 @regression @NewPatient 
  Scenario: User wants to redirected to where they clicked on Make appointment after tapping on X icon  as Logged in user
  Given user launched the Banfield application
  When the user is on Home screen
  And user wants to navigate to Whats going on Screen as new patient as Loggedin User
  And the user taps on X icon to get redirected to where they clicked on Make appointment 
  #/ 'Make an appointment' (Logged in user) 

  @36295 @sprint15 @regression @NewPatient
  Scenario: User wants to redirected to where they clicked on Make appointment after tapping on X icon  as Guest User Flow. 
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And user wants to navigate to whats going on Screen as new patient
  And the user can tap on X icon to get redirected to the Have we met screen 
  #(Guest user) 