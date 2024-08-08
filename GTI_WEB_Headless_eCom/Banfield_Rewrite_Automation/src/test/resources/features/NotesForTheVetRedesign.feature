 Feature: 37726-Notes for the vet - Redesign

  @37726 @sprint15 @regression @NewPatient
  Scenario: User wants to verify Notes for the vet UI in New Patient Flow as Guest User Flow. 
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And user wants to verify Notes for the vet in New Patient

  @37726 @sprint15 @regression @Illness
  Scenario: User wants to verify Notes for the vet UI in Illness Flow as Guest User Flow. 
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user tapped on Next for illness
  And user wants to verify Notes for the vet in Illness

  @37726 @sprint15 @regression @Injury
  Scenario: User wants to verify Notes for the vet UI in Injury Flow as Guest User Flow.
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When user selected the Injury option in Reason for visit screen
  And the user tapped on Next for injury
  And user wants to verify Notes for the vet in injury
   
  @37726 @sprint15 @regression @PreventiveCare_vaccination
  Scenario: User wants to verify Notes for the vet UI in Preventive Care Screen from Logged in User Flow
  Given user launched the Banfield application
  When user should taps on Find a nearby location CTA
  Then the user will be redirected to Have we met screen
  And user taps Yes I have option 
  When User wants to navigated to Home Screen
  When User wants to navigating to who are we scheduling page
  Then user is navigated to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user verify Notes for the vet in Preventive Care Screen
  
  @37726 @sprint15 @regression @Illness 
  Scenario: User wants to make an appointment using Illness as a Logged in user make appointment flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And user wants to verify Notes for the vet in Illness Screen as Loggedin User

  @37726 @sprint15 @regression @Injury
  Scenario: User wants to make an appointment using Injury as a Logged in user make appointment flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And user wants to verify Notes for the vet in Injury Screen as Loggedin User

  @37726 @sprint15 @regression @NewPatient
  Scenario: User wants to make an appointment from Highlights Screen using New Patient as a Logged in user make appointment flow.
  Given user launched the Banfield application
  When user tapped on the Login CTA from the login screen and the user credentials are valid
  And user wants to verify Notes for the vet in New Patient Screen as Loggedin User