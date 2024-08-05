Feature: To verify the T24A_Patient Registration Form
    Background:
        Given user launches risecannabis "<url>" website
        #And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
        And user clicks on Dispensaries menu from Global header
        And User is on the expanded DISPENSARIES
        And User should see list of available states like California, Connecticut and so on
        And User clicked  on particular state (Ex:Illinois)
        And User should see llist of avilable dispensaries like RISE Mundelein
        And user selects Dispensary name from the state

    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User is able to view Patient Registration Form
        When User is landed on Dispensary Page
        And User scrolls down to the Quick links section
        And User is viewing the Quick Links section
        And User clicks on Get & Renew medical card title link
        Then User is able to navigate to Patient Registration Form
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that the state should be pre-filled in case it is opened from any state page and the URL should be updated accordingly Ex: mystate=Illinois in URL
        When User is landed on Dispensary Page
        And User is viewing the Quick Links section
        And User click on GET & RENEW MEDICAL CARD
        Then User is able to navigate to Patient Registration Form
        And in step 2 state should be pre-filled
        And the URL should be updated accordingly Ex: mystate=Illinois in URL
        @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to see appropriate breadcrumb
        When User is on of Patient Registration form page
        Then  User is able to see appropriate breadcrumb
            #check
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To  verify that User should see breadcrumbs hierarchy structure with its functionality
        When User is on of Patient Registration form page
        Then  User is able to see appropriate breadcrumb hierarchy
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to see Hero section with Title text, Copy text, Hero Image
        When User is on of Patient Registration form page
        And User is viewing the Hero section of Patient Registration Form
        Then User is able to view the Title text
        And User is able to view the Copy text
        And User is able to view the Hero image
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the Background image ,RISE Logo,description and title text in the left side
        When User is on of Patient Registration form page
        And User is viewing the Left side Title
        Then User should be able to view the Background image ,
        And User is able to view the RISE Logo
        And User is able to view the description
        And user is able to view the title text
#    @T24A_PatientRegistrationForm @regression @smoke
#    Scenario: To verify that User should be able to view the Background image , RISE text logo ,description and title text in the left side for MN Users
#        When User clicks on Dispensaries in the header
#        And User clicks on Minnesota from the state list
#        And User is at the top of the page
#        Then User should see only Minnesota RISE text logo for the white variant"
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the Step number and the total steps present (Ex: Step 1 of 3)
        When User is on of Patient Registration form page
        And User is User is viewing the 'I want Assistance' section
        Then User should be able to view the Step number and the total steps present as Step 1 of 3
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able view the title text of the section
        When User is on of Patient Registration form page
        And User is in the step 1 and viewing "I want assistance section"
        Then User should be able view the title text of the section
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the required fields info under the section title
        When User is on of Patient Registration form page
        And User is in the step 1 and viewing "I want assistance section"
        Then User should be able to view the required fields info under the section title "This is a required step."
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the 3 options to select for the medical card
        When User is on of Patient Registration form page
        And User is in the step 1 and viewing " I want assistance section "
        Then User should be able to view the 3 options to select for the medical card
        And User should able to see Getting A Medical Card option
        And User should able to see Renewing My Medical Card option
        And User should able to see Something Else option
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify User be able to have single select radio button for the options and getting highlighted
        When User is on of Patient Registration form page
        And User is in the step 1 and viewing " I want assistance section "
        And User selects a radio button
        And User selects another radio button
        Then User is able to view the selection of radio button switches to the last selected one
        And the options is  getting highlighted
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the Step number and the total steps present (Ex: Step 2 of 3)
        When User is on of Patient Registration form page
        And User is viewing the Contact Information Section
        Then User should be able to view the Step number and the total steps present (Ex: Step 2 of 3)
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able view the title text of the section
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        Then User should be able view the title text of the section "Contact information"
    @T24A_PatientRegistrationForm @regression
    Scenario: To verify that User should be able to view the required fields info under the section title
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        Then User should be able to view the required fields info under the section title "Required fields are marked with an asterisk."
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be able to view the fields : State, Nearest RISE dispensary, First name, Last name, Mobile number and email
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        Then  User should be able to view the fields for State
        And User should be able to view the fields for RISE dispensary
        And User should be able to view the fields for First name
        And User should be able to view the fields for Last name
        And User should be able to view the fields for Mobile number
        And User should be able to view the fields for email
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that all the mandatory fields "First Name , last Name, Email id, Phone Number,State,Nearest Dispensary" should be with marked with asterisk.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        Then User is able to view all the mandatory fields being marked with asterisk (First name, Last Name, Mobile number, Email, State,Nearest Dispensary ).
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User should be having a dropdown option for the State and Nearest RISE dispensary
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        Then User should be having a dropdown option for the State and Nearest RISE dispensary
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that User shouldn’t be able to click on the Nearest RISE dispensary dropdown until the user has selected the state
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User has not selected a state in dropdown
        Then User shouldn’t be able to click on the Nearest RISE dispensary dropdown
#    @T24A_PatientRegistrationForm @regression @smoke
#    Scenario: To verify that user should be able to view the list of states where the RISE is present except Ohio in dropdown
#        When User is on of Patient Registration form page
#        And User is in the step 2 and viewing the Contact Information Section
#        And User selected a state in dropdown
#        Then user should be able to view the list of states where the RISE is present except Ohio
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify that Nearest RISE dispensary dropdown should get updated dynamically according to the state selected
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User selected a state in dropdown(Ex:Florida)
        Then Nearest RISE dispensary dropdown should get updated dynamically according to the state selected(Ex : Bonita springs)
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see error message with a input field highlighted  if user enters special characters/Numbers into First Name text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User entered special characters in First Name text field.
        Then User should see an error message "Only Letters are Allowed". with the First nmae field getting highlighted
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see error message "Only Letters are Allowed", if user enters special characters/Number into last Name text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User entered special characters in Last Name text field.
        Then User should see an error message "Only Letters are Allowed"
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see error message "Invalid email", if user enters invalid email id (Eg: test@ / @gtigrows.com / test@gtigrows) into email address text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User entered special characters in 'Email address' text field
        And User Clicks on Submit CTA
        Then User should see an error message "Invalid email".
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see error message "Please enter a valid mobile number", if user enters less than 10 digit phone number into mobile text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User entered less than 10 digit in Phone Number text field. (Eg: 8765454)
        And User Clicks on Submit CTA
        Then User should see an error message Please enter a valid mobile number.
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see  appropriate error message in tertiary color against the respective field, if user enters all 10 digit phone number zeros into mobile text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User entered 10 digit in of zero Phone Number text field. (Eg: 0000000000)
        And User Clicks on Submit CTA
        Then User should see an error message "Please enter a valid mobile number".in tertiary color against the Mobile number field
    @T24A_PatientRegistrationForm @regression @smoke
    Scenario: To verify whether user should be able to see error message "Please enter a valid mobile number", if user start entering zero in the 1st and 4th position into mobile text field.
        When User is on of Patient Registration form page
        And User is in the step 2 and viewing the Contact Information Section
        And User start entered zero in the first and fourth position Phone Number text filed.
        And User Clicks on Submit CTA
        Then User should see an error message "Please enter a valid mobile number".in tertiary color against the Mobile number field













