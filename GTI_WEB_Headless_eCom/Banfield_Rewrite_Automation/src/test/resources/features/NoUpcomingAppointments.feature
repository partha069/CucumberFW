  Feature: 27844-No Upcoming Appointments
  
  @27844 @sprint7 @regression
  Scenario: When there are no upcoming appointments
  Given user launched the Banfield application
  When user is on the home page
  Then user should be redirected to Upcoming appointments screen
  And the user should be displayed with the static text No upcoming appointments
  And the user should be displayed with the Make an appointment CTA
  And the user taps on Make an appointment CTA to get redirected to Who are we scheduling for logged in scheduler
  #When the user taps on the second bottom navigation from the left