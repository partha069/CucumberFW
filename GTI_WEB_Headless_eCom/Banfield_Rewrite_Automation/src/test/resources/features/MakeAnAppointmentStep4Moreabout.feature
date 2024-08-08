Feature: 26240-Make an appointment Step 4 Tell us about your pet Screen

  Background:
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  
  @32973 @sprint8 @regression
  Scenario:- User wants to verify PetName 
  When user tapped on Next from the Tell us about your pet screen
  And User wants to verify PetName on Reason for visit Screen
  
  @regression @26240 @sprint1
  Scenario: 26240-Verify user can able vadifate fields
  Then the user is redirected to the Tell us about your pet screen 
  Then the user should be able to enter the following information in the form Pet name, Gender, Spayed or Neutered 
  And the user cannot enter more than 30 characters in the field 
  And the user cannot enter any Special Characters or numbers in the Pet Name field
  And the user enters the Pets name in Enter pet name field 
  And the user is displayed with the following Gender options as tap to select option Female, Male, Unsure
  And the options are not selected by default 
  And the user should be able to tap on one option to select 
  And the user is displayed with the following Spayed or Neutered options as tap to select option Yes, No, Unsure
  And the options are not selected by default 
  And the user should be able to tap on one option to select
  And the Next CTA should be disabled by default until the user selects all options 
  And the Next CTA will be enabled once user enters and selects all the fields 
  And the user taps on the Next CTA to get redirected to Reason for visit Screen

  @regression @26240 @sprint1 
  Scenario: 26240-Verify user can able redirected to the previous Screen 
  And the user taps on < to get redirected to the previous Screen 
  
  @regression @26240 @sprint1 
  Scenario: 26240-Verify user can able redirected to the previous Screen 
  And the user taps on X to get redirected to Have we met Screen