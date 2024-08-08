Feature: 32298-View Timeline-Exotics Pets

  Background:
  Given user launched the Banfield application
  #When user tapped on the Login CTA from the login screen and the user credentials are valid
  When User logged in as Exotic Pet
  Then the user should be able to view the no previous record as for exotics pets previous visit is not available
  When the user taps on Timeline Tab

  @sprint7 @regression @32298
  Scenario: User wants to tap on Timeline Tab Exotics Pet
  And the user should be displayed with the
  #| Static Title: Previous visits | Static text: Nothing on file. Please schedule an appointment to see your pet's details.| 
  And the user can tap on the camera icon
  
  @sprint7 @regression @32298
  Scenario: User wants to tap on Timeline Tab Exotics Pet
  And the user will tap on < button to go back to previous screen Home screen