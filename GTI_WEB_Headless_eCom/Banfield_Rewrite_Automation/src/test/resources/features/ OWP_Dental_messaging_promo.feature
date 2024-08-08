 Feature: 35972-OWP Dental messaging promo
  
  @35972 @sprint11 @regression @DentalMessagingPromo @sprint14
  Scenario: User wants to view with the dental promo text in Preventive care screen as Logged in User
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you CTA
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  And And the user will be displayed with message for Dental messaging promo
  And the user can tap on Call a hospital near you CTA to get redirected to Find a location near you screen