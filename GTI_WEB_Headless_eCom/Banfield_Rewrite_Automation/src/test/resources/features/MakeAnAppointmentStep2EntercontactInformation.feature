 Feature: 26238-Make an appointment Step 2 Enter contact Information
 
 Background:
 Given user launched the Banfield application
 When User is on the welcome screen
 When user taps on the make an appointment CTA
 Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
 When the user tapped on No, I am New option from the Have we met Screen

 @regression @sprint1 @26238 
 Scenario: 26238-Verify  user can able to enter the contact Information to make an appointment or not
 Then they are displayed with the Contact Information screen 
 Then the user should be displayed with the Contact information form 
 And the user should enter all the fields as they are Mandatory 

 @regression @sprint1 @26238
 Scenario: 26238-Verify  user can able to enter the contact Information to make an appointment or not
 And the user cannot type more than 20 characters in the First name field 
 And the user cannot type any special characters, numbers or spaces in the First name field
 And the user cannot type more than 30 characters in the Last name field 
 And the user cannot type special characters, numbers or spaces in the Last name field
 And the user cannot type more than 10 digits in the Phone number field 
 And the user is displayed with the numeric keypad while entering Phone number 
 Then I should see Invalid Phone Number 
 And the user cannot type more than 320 characters in the email field 
 And the user can type an email only in a valid email format 
 And the user is displayed with error message on entering a wrong email format 
 And I should see Please enter a valid email address
 And the Next button is enabled after entering all the mandatory fields 
 And the user taps on Next button to go to the What species is your pet Screen

 @regression @sprint1 @26238
 Scenario: 26238-Verify  user can able to enter the contact Information to make an appointment or not
 And the user taps on X at the top to go back to Have we met Screen