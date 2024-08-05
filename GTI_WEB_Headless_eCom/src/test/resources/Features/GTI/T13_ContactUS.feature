@feature
Feature: To verify user is able to view contact us page
    Background:
        Given user launches risecannabis "<url>" website
#        And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
        And user scrolls down to the footer section
        And user able to view the customer center
    @webRegression @mobRegression @smoke
    Scenario: To verify User should be able to view the customer center drawer
        When User  clicks  on Customer Center Option
        Then User should be able to view a drawer getting opened from right to left
    @webRegression @mobRegression @smoke
    Scenario: To verify that User should be able to view the title text, copy text,image, close CTA to close the drawer,2 customer center option in CTA Format with a small description text in the drawer
        And User  clicks  on Customer Center Option
        When User is viewing the customer center drawer
        Then User should be able to view the title text
        And User should be able to view the copy text
        And User should be able to view the image
        And User should be able to view the close CTA to close the drawer
        And User should be able to view the 2 customer center options in CTA format with a small description text
    @webRegression @mobRegression
    Scenario: To verify User should be redirected to the Contact Us form on clicking "I would like to receive a message" option
        And User  clicks  on Customer Center Option
        When User is viewing the customer center drawer
        And User is clicking on I would like to receive a message
        Then User should be redirected to the Contact Us form


#        this scenario has been developed, waiting to the AWS integration
#    @webRegression @mobRegression
#    Scenario: To verify that AWS connect chat opens on clicking "I prefer to chat with a person" option
#        And User  clicks  on Customer Center Option
#        When User is viewing the customer center drawer
#        And User is clicking on I prefer to chat with a person
#        Then AWS connect chat opens
    @webRegression @mobRegression
    Scenario: To verify User should be able to close the drawer on clicking on Close icon
        And User  clicks  on Customer Center Option
        When User is viewing the customer center drawer
        And User is clicking on Close icon
        Then user should be able to view the Drawer closes
    @webRegression @mobRegression @smoke
    Scenario: To verify that user is able to view 1 of 3 forms
        And User  clicks  on Customer Center Option
        And User is viewing the customer center drawer
        When User is clicking on I would like to receive a message
        Then User is in the step 1 of ‘Contact us’ form in default state
        And User is able to view the title text
        And User is able to view the copy text
        And User is able to view the logo
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the horizontal bar to show the progress of the steps Ex: Step 1 of 3
        When User is on the step 1 of ‘Contact us’ form in default state
        Then User should be able to view the horizontal bar to show the progress of the steps Ex: Step 1 of 3
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the list of issues type  with the radio button
        When User is on the step 1 of ‘Contact us’ form in default state
        Then User is able to view the list of issues type  with the radio button
    @webRegression @mobRegression
    Scenario: To verify that user should be able to view the ‘Continue’ CTA is in disabled state by default
        When User is on the step 1 of ‘Contact us’ form in default state
        Then The user is able to view the Continue CTA in the disabled state by default
    @webRegression @mobRegression
    Scenario: To verify that user should be able to view the radio buttons corresponding to the list of issues are not multi select
        When User is on the step 1 of ‘Contact us’ form in default state
        Then User is able to view the selection of radio button switches to the last selected one
    @webRegression @mobRegression
    Scenario: To verify that the user is able to view the issue type getting highlighted and the ‘Continue’ CTA being enabled
        When User is on the step 1 of ‘Contact us’ form in default state
        And User selects an issue type: Ex : Dispensaries
        Then User is able to view the issue type is getting highlighted and the ‘Continue’ CTA getting enabled
    @webRegression @mobRegression @smoke
    Scenario: To verify that User is  able to view 2 of 3 forms
        When User is on the step 1 of ‘Contact us’ form in default state
        And User selects an issue type: Ex : Dispensaries
        And User is able to view the issue type is getting highlighted and the ‘Continue’ CTA getting enabled
        And User click on Continue CTA
        Then user is able to view the horizontal bar to show the progress of the steps Ex: Step 2 of 3
        And User is able to view the heading text
        And User is able to view the input text box field has a maximin character limit of 0 to 500 characters to describe the query
        And User is able to view Upload file and an info text next to it
        And User is able to view Back link to go back
        And User is able to view Continue CTA
#    @webRegression @mobRegression
#    Scenario: To verify whether user is unable to upload file rather than "jpg, png, pdf"
#        When User is uploading a file
#        And User tries to upload any file other than "jpg, png, pdf"
#        Then User should see, unable to browse or select any other files or data apart from "jpg, png, pdf"
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view the name and size of the file, a CTA to delete the file that was uploaded
#        When User is uploading a file
#        And User uploads a file successfully
#        Then user is able to view the name of the file
#        And The size of the file should be visible
#        And User is able to view a delete CTA to delete the uploaded file
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view a snackbar with a close icon and the ‘Upload file’ CTA to upload the file after uploading a file
#        When User has uploaded a file
#        And file has uloaded sucessfully
#        Then user is able to view a snackbar with a close icon to close it
#        And An upload file CTA to upload the file again
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view an error message and an ‘Upload file’ CTA to re-upload the file
#        When User is uploading a file
#        And The file upload failed
#        Then user is able to view an error message
#        And User is able to view  an ‘Upload file’ CTA to re-upload the file
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view a snackbar with a close icon and the ‘Upload file’ CTA to upload the file again after clicking on delete CTA
#        When User has uploaded a file
#        And user click on delete CTA
#        Then user is able to view  a snackbar with a close icon to close it
#        And An upload file CTA to upload the file again
#    @webRegression @mobRegression
#    Scenario: To verify whether user is able to upload file (jpg, png, pdf) more than 50 Mb
#        When User is uploading a file more than 50 MB
#        Then User sees an error messge saying "Error Uploading file max file"
    @webRegression @mobRegression @smoke
    Scenario Outline: To verify that user is able to view 3 of 3 forms
        When User is in the Contact information page
        Then user can able to view the horizontal bar to show the progress of the steps Ex: Step 3 of 3
        And User is able to view the heading text
        And User is able to view the fields to enter the "<FirstName>", "<LastName>", "<MobileNumber>", "<Email>"
        And user is able rto see select states, select dispensary
        Examples:
            |FirstName|LastName|MobileNumber|Email|
            | angel | D | 9876543210 | test@gmail.com |

#
#    This will be develoed once the captcha has been disabled
#
#
#    @webRegression @mobRegression
#    Scenario: To verify that all the mandatory fields "First Name , last Name, Email id, Phone Number" should be with marked with asterisk
#        When User is in the Contact information page
#        And User is able to view all the mandatory fields being marked with asterisk (First name, Last Name, Mobile number, Email)
#    @webRegression @mobRegression
#    Scenario: To verify whether user should be able to see error message "Only Letters are Allowed", if user enters special characters/Numbers into First Name text field
#        When User is in the Contact information page
#        And User entered special characters in 'First Name' text field
#        And User Clicks on Submit CTA
#        Then User should see an error message "Only Letters are Allowed"
#    @webRegression @mobRegression
#    Scenario: To verify whether user should be able to see error message "Only Letters are Allowed", if user enters special characters/Number into last Name text field
#        When User is in the Contact information page
#        And User entered special characters in 'Last Name' text field
#        And User Clicks on Submit CTA
#        Then User should see an error message "Only Letters are Allowed"
#    @webRegression @mobRegression
#    Scenario: To verify whether user should be able to see error message "Invalid email", if user enters invalid email id into email address text field
#        When User is in the Contact information page
#        And User entered special characters in 'Email address' text field
#        And User Clicks on Submit CTA
#        Then User should see an error message "Invalid emai"
#    @webRegression @mobRegression
#    Scenario: To verify whether user should be able to see error message "Please enter a valid mobile number", if user enters less than 10 digit phone number into mobile text field
#        When User is in the Contact information page
#        And User entered less than 10 digit in Phone Number text field
#        And User Clicks on Submit CTA
#        Then User should see an error message "Please enter a valid mobile number"
#    @webRegression @mobRegression
#    Scenario: To verify whether user is abe to see "Submit CTA" is disable if user don't enter any one mandatory fields
#        When User is in the Contact information page
#        And User enters valid value under First Name, Last Name and Email id except Mobile number (any one field)
#        Then user should see Submit CTA is disable


    @webRegression @mobRegression
    Scenario: To verify that the user is able to view the dropdown to select the state and a dropdown to select the dispensary according to the state selected
        When User is in the Contact information page
        Then user is able to view the dropdown to select the state
        And User is able to view the dropdown to select the dispensary according to the state selected
#
#    This will be developed once the login function integrated
#
#    @webRegression @mobRegression
#    Scenario: To verify logged in user can able to view the prefilled information for 3rd step of the contact us form
#        And user is logged in already
#        When User is in the Contact information page
#        Then user should be able to view the information should be prefilled for all fields
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to veiw the submit button disabled by default for logged in user
#        And user is logged in already
#        And User is in the Contact information page
#        When user should be able to view the information should be prefilled for all fields
#        Then user should be able to view the submit button should be disabled by default
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to veiw the submit button enabled after the captcha has been provided
#        And user is logged in already
#        And User is in the Contact information page
#        And user should be able to view the information should be prefilled for all fields
#        And user should be able to view the submit button should be disabled by default
#        When user completed the captcha
#        Then user should be able to veiw the submit button enabled
#    @webRegression @mobRegression
#    Scenario: To verify that user is able o view the Confirmation screen after entering all mandatory details
#        When User is in the Contact information page
#        And user should be able to veiw the submit button enabled
#        And user clicks the submit button
#        Then user is able to view the Confirmation screen
#        And user is able to view the title text
#        And user is able to view the copy text
#        And user is able to view the Continue Shopping CTA
#    @webRegression @mobRegression
#    Scenario: To verify that the user is redirected to the PLP by clicking on the  ‘Continue Shopping’ CTA
#        When User is on Confirmation screen
#        And user click on Continue Shopping CTA
#        And user is able to redirect to PLP Page
    @webRegression @mobRegression
    Scenario: To verify user is able to view the Need more help banner section
        When user scroll down to Need more help banner
        Then user should able the view title text
        And user should also see the respective copy text
        And user is able to view the Find dispensary CTA with Map icon
    @webRegression @mobRegression
    Scenario: To verify the user is navigate to the Dispensary list when clicks on Find dispensary CTA
        When user scroll down to Need more help banner
        And user clicks on the Find dispensary button CTA
        Then user should navigate to the Dispensary list screen
    @webRegression @mobRegression
    Scenario: To verify that User should see dispensary information with dispensary image on the Need more banner for geolocated dispensary or user pre-selected home dispensary
        When user scroll down to Need more help banner
        Then user should able to view the Dispensary information with disensary image based on geolocated dispensary or user pre-selected home dispensary
#        And user should able to view the respective dispensary timezone current day
        And user should able to view the clock icon
        And user is able to see the respective dispensary Phone Number in US format with Phone Icon
        And user should see the Call now CTA
        And user is able to see the respective  Dispensary Address with Map icon
        And user should be able to see View on Maps CTA
        And user should be able to view the view dispensary cta
#        And To verify user is able to see the "This dispensary has dedicated hours for med" in the Need more help banner
#        And user should able to see copy text
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to view the external tab by clicking view on map cta
#        And user scroll down to Need more help banner
#        And user should able to view the Dispensary information with disensary image based on geolocated dispensary or user pre-selected home dispensary
#        And user is able to see the respective  Dispensary Address with Map icon
#        And user should be able to see View on Maps CTA with indication for external link
#        When user clicks view on maps cta
#        Then user user should be able to view the maps in next tab
#    @webRegression @mobRegression
#    Scenario: To verify user is navigate to the a mobile prompt in Desktop when click on the Call now CTA
#        When user scroll down to Need more help banner
#        And user clicks on the Call now CTA button
#        Then user should navigate to the a mobile prompt in Desktop
