Feature: 26237-Make an appointment Step 1 Have we met?

  Background:
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed

	@regression @sprint1 @26237
  Scenario: 26237-Verify user can able to redirected to the login page.
  Then the user will be redirected to Have we met page
  And the user will be displayed with Have you been to a Banfield Pet Hospital before
  And If the user choose Yes I have CTA
  And the user will be redirected to the login page.

  @regression @sprint1 @26237
  Scenario: 26237-Verify user can able to back to the Lets get started Screen
  When If the user choose No Im new CTA 
  When the user will be redirected to the Contact information Page
  Then the user taps on < to go back to the Lets get started Screen
  
  @regression @sprint1 @26237
  Scenario: 26237-Verify user can able to back to the Lets get started Screen
  When If the user choose No Im new CTA
  And the user taps on X to go back to Welcome screen