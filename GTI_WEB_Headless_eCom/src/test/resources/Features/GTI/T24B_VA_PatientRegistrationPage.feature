Feature: To verify T24 B (VA) - Patient Registration Form Page


    Background:
      Given user launches risecannabis "<url>" website
      #And user clicks on Yes in Age gate screen
      And user clicks on the Accept in cookies gate banner
      When User Click on Dispensaries in Global Header or taps on the Hamburger Menu
      Then User clicks on DISPENSARIES option in the global header
      And User able to see the list of states
      Then User clicks or taps on Virginia State
      And User sees the list of Dispensaries for Virginia State
      Then User Click on Salem Dispensaries
      And User scroll down to the Quick Link Section
      Then User click on NEW PATIENTS START HERE Link





   @T24B_PatientRegistrationVA @webRegression @mobRegression
   Scenario: To verify that User is able to view appropriate bredcrumb
     And User should be able to see appropriate bredcrumb

   @T24B_PatientRegistrationVA @webRegression @mobRegression
   Scenario: To verify that User is able to view the hero content, Title Text, Copy Text, Image Rise logo, Title text and the Description
     And User is able to view the hero content, Title Text, Copy Text, Image
     And User is able to view the Rise logo, Title text and the Description

  @T24B_PatientRegistrationVA @webRegression @mobRegression
  Scenario: To verify that Your history section and Step number and the total steps present, title text and required fields info under the section title mandatory field is marked with an asterisk
     When User is viewing the Your history section of the Patient pre-Registration Form
     Then User is able to view the Step number and the total steps present
     And User is able to view the title text for Your history section
     And User is able to view the required fields info under the section title mandatory field is marked with an asterisk

  @T24B_PatientRegistrationVA @webRegression @mobRegression
  Scenario: To verify that Your history section and Step number and the
     When User is viewing the Your history section of the Patient pre-Registration Form
     And User is able to view single select options radio buttons
     Then User selects another radio button under are you a reg patient question
     And the options is getting highlighted under are you a reg patient question
     #Then User should be able to select radio button switches to the last selected one
#     And User is able to view option getting highlighted in green when they select a particular option
#     And User is able to view multi-select options with checkboxes for the options
#     And the selected checkbox options in bold

  @T24B_PatientRegistrationVA @webRegression @mobRegression @test12345
  Scenario: To verify whether user is able to view State dropdown with an asterisk * and First Name, Last Name, Email input, Phone Input, Zip input, Patient ID No./Medical Marijuana Card No, Expiration date (MM/DD/YYYY) input textfield with an asterisk as mandatory fields.
    When User is viewing the New patient registration section of the Patient pre-Registration Form
    And User is able to view the State dropdown with an asterisk* is in disabled state
    And User is able to view the asterisk for all mandatory fields

  @T24B_PatientRegistrationVA @webRegression @mobRegression
  Scenario: To verify user is able to view input fields and dropdown option for Nearest RISE dispensary for nearest dispensary dropdown.
    When User is viewing the New patient registration section of the Patient pre-Registration Form
    Then User is able to view the input fields
    And User is able to view a dropdown option for Nearest RISE dispensary
    And User clicks on the nearest dispensary dropdown
    Then User should see only the Virginia dispensaries


  @T24B_PatientRegistrationVA @webRegression @mobRegression
  Scenario: To verify user







