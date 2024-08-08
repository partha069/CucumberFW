Feature: 32641-Preferred Location on homescreen

  Background:
  Given user launched the Banfield application
  When the user is on Home screen
  
  @sprint7 @32641 @regression @smoke
  Scenario: 25392-Geo Location is off
  When the user has set a preferred location
  Then the user is displayed with Zero Location
  #| Your preferred location | Map icon | Hospital name | Hospital address | Make an appointment CTA | Call CTA|

  @sprint7 @32641 @regression @smoke
  Scenario: 25392-Geo Location is on
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  When the user is displayed with the native Location Pop up to enable geo-location
  Then the Location services is enabled for the Device
  Then the user is displayed with miles Location
  #| Your preferred location | Map icon with miles(underlined) | Hospital name | Hospital address | Make an appointment CTA | Call CTA|