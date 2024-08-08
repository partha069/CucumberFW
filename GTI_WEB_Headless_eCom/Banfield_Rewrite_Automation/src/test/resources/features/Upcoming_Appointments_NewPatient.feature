  Feature: 36858-Upcoming appointments - New Patient

  @36858 @sprint12 @regression
  Scenario: User wants to see New patient and Adopted pet exam in Upcoming appointments Screen as Logged in User
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to the Reason for visit screen
  Then user avoid duplicate popup if displayed
  #And User should be able to choose hospital
  And user on clicking on Next available should see the available doctors
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And User tried to created an Appointment as New patient and user tap on Make appointment CTA
  And the user click on Make appointment CTA
  And the user is redirected to Youre all set screen for duplicate popup
  #And the user tap on Done CTA
  And the user should tap on Upcoming appointments CTA
  And the user is displayed with the following information on the appointment card when collapsed
  And the user should see New patient and Adopted pet exam