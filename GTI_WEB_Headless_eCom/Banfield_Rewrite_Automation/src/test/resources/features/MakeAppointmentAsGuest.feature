Feature: Make Appointment AS Guest Flow

#@smoke @regression  @sprint1 @guesttest @sprintcycle
Scenario: User wants to Make Appointment AS Guest
  Given user launched the Banfield application
  When User Click on Make Appointment AS Guest button
  Then the user should be displayed with the Have we met page
  And the user click on No i am new button
  Then User should be Navigated to with Lets get started Page
  When User provide all the valid details, next button should be clickable
  Then User should be navigated to What_species_is_your_pet Page
  When User select the species and Click on Next button
  Then User should be navigated to Tell_us_about_your_pet Page
  When User provide pet name and gender, next button should be clickable
  Then User Should be navigated to VisitType Page

