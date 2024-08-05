Feature:  As a user, I should be able to view the drawer to signup/sign in when I click on the profile icon.

  Background:
    Given user landed on risecannabis Faq "<url>" website
    #And user clicks on Yes in Age gate screen
    And user clicks on the Accept in cookies gate banner

  @regression @userAuthentication @smoke
Scenario: To verify User should be able to view logo/icon, close CTA stick as a header in drawer
  When user clicked on the profile icon in the header
  Then User should be able to view the drawer getting opened from the right side of the screen
  And User should be able to view the title
  And User should be able to view the profile icon at the top
  And User should be able to view the close icon to close the drawer
  And User should be able to view the field to enter the mobile number with an assistive text within the field
  And User should be able to view the CTA to get the OTP
  And User should be able to view the CTA in disabled state in default
  And User should be able to view the highlighted copy text at the bottom

  @regression @userAuthentication
 Scenario: To verify user is able to fill in with 10 digits mobile number
    When user clicked on the profile icon in the header
    Then User should be able to view the field to enter the mobile number with an assistive text within the field
    And User should be able to fill in with 10 digits mobile number

  @regression @userAuthentication
  Scenario: To verify user should be able to view the assistive text changing to zeros with number of valid digits
    When user clicked on the profile icon in the header
    Then User should be able to view the field to enter the mobile number with an assistive text within the field

  @regression @userAuthentication @smoke
  Scenario: To verify user should be able to view the CTA getting in enabled state
    When user clicked on the profile icon in the header
    Then User should be able to view the field to enter the mobile number with an assistive text within the field
    And User fills mobile number with valid number of digits
    And User should be able to view the CTA getting in enabled state

  @regression @userAuthentication @smoke
  Scenario: To verify User should be able to view an error message
    When user clicked on the profile icon in the header
    And User starts entering on the field
    Then User should be able to view an error message
    And User should be able to view the CTA in disabled state until the user enters mobile number with valid number of digits
#
#  @regression @userAuthentication @smoke
#  Scenario: To verify User is able to view the ‘Enter OTP’ screen
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    Then User should be able to view the title in Enter OTP screen
#    And User should be able to view a copy text with entered mobile number
#    And User should be able to view the fields to enter the OTP
#    And User should be able to view the CTA to submit the OTP
#    And User should be able to view the CTA in disabled state until user enters all the fields
#    And User should be able to view the CTA to resend the OTP
#
#  @regression @userAuthentication
#  Scenario: To verify user should be able to view the ‘Resend’ CTA to be disabled for the next 30 seconds from the triggering of the OTP
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    Then User should be able to view the title
#    And User should be able to view the ‘Resend’ CTA to be disabled for the next 30 seconds from the triggering of the OTP
#
#  @regression @userAuthentication
#  Scenario: To verify user should be able to view the ‘Resend OTP’ CTA getting enabled after 30 seconds from the triggering of the OTP
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    Then User should be able to view the title
#    And User should be able to view informatory text
#    And User should be able to view the ‘Resend OTP’ CTA getting enabled
#
#  @regression @userAuthentication @smoke
#  Scenario: To verify user is able to view the Sign-up drawer
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    And User enter the valid otp
#    And user click on the Submit button
#    Then User should be able to see logo & icon at the top center of the drawer
#    And User should be able to see close CTA
#    And User should be able to see the title and description text
#    And User should be able to see mandatory fields to be filled
#    And User should be able to see a checkbox
#    And User should be able to see ‘Show more’ CTA with downward arrow icon facing downwards to collapse details if necessary
#    And User should be able to see the ‘Submit’ button sticky at the bottom of the page in disabled state as default
#
#  @regression @userAuthentication @smoke
#  Scenario: To verify user should be able to view a pop-up for confirmation to exit on clicking on the 'X' icon
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    And User enter the valid otp
#    And user click on the Submit button
#    And User should be able to see logo & icon at the top center of the drawer
#    And User clicks on the close icon
#    Then User should be able to view a pop-up for confirmation to exit
#
#  @regression @userAuthentication
#  Scenario: To verify User should be able to see ‘Show less’ CTA with arrow facing upwards once the full details is displayed
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    And User enter the valid otp
#    And user click on the Submit button
#    And User should be able to see logo & icon at the top center of the drawer
#    And User clicks on the Show more cta
#    Then User should be able to see ‘Show less’ CTA with arrow facing upwards once the full details is displayed
#
#  @regression @userAuthentication @smoke
#  Scenario: To verify User should be able to view confirmation screen upon successful submission of the Form
#    When user clicked on the profile icon in the header
#    And User fills mobile number with valid number of digits
#    And User click on the CTA to get the OTP
#    And User enter the valid otp
#    And user click on the Submit button
#    And user wnter all valid details in the form
#    And user clicks on the submit button
#    Then User should be able to view confirmation screen upon successful submission of the Form
#    And User should be able to view the image in UserAuthentication
#    And User should be able to view a copy text with entered email address
#    And User should be able to view the ‘Skip and continue shopping’ CTA
#    And User should be able to view the ‘Finish’ CTA to submit the OTP
















