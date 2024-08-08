  Feature: 36492-Global Back button functionality with Find a location near you functionality

  #Guest user
  @36492 @sprint15 @regression
  Scenario: User wants to tap on back and close button so that will take to the previous screen from Reason for Visit Screen Guest user.
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on back button from Find a location near you screen to go back to the previous screen
  And the user can tap on the close icon to back to the initial screen where they started the flow
  #(in this case the initial screen is reason for visit)

  #Guest user
  @36492 @sprint15 @regression
  Scenario: User wants to tap on back button so that I can go to the previous screen from Whats going on screen as Guest user.
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
  And the user can tap on back button from Find a location near you screen to go back to the previous screen from whats going on screen
  And the user can tap on the close icon to back to the initial screen where they started the flow from whats going on screen


  #Logged in user without preferred location
  @36492 @sprint15 @regression
  Scenario: User wants to tap on back and close button so that will take to the previous screen from Reason for Visit Screen logged-in user.
  Given user launched the Banfield application
  When user should taps on Find a nearby location CTA
  Then the user will be redirected to Have we met screen
  And user taps Yes I have option 
  When User wants to navigated to Home Screen
  When User wants to navigating to who are we scheduling page
  Then user is navigated to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on back button from Find a location near you screen to go back to the previous screen
  And the user can tap on the close icon to back to the initial screen where they started the flow

  #Logged in user without preferred location
  @36492 @sprint15 @regression
  Scenario: User wants to tap on back button so that I can go to the previous screen from Whats going on screen as logged-in user.
  Given user launched the Banfield application
  When user should taps on Find a nearby location CTA
  Then the user will be redirected to Have we met screen
  And user taps Yes I have option 
  When User wants to navigated to Home Screen
  When User wants to navigating to who are we scheduling page
  Then user is navigated to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user tapped on Next for illness
  And the user can tap on back button from Find a location near you screen to go back to the previous screen from whats going on screen
  And the user can tap on the close icon to back to the initial screen where they started the flow from whats going on screen

  #@36492 @sprint15 @regression
  #Scenario: Global Back button functionality
  #Given the user has launches the app
  #When the user taps on the back icon from any screen
  #Then the user should be redirected to the previous screen.