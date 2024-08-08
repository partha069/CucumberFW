Feature: 27701- Add a pet - Step 2 - Tell us about your pet

Background:
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user click on Next CTA
When the user will be redirected to Tell us about your pet screen

@sprint8 @regression @32757 
Scenario: User wants validate Date format
And User wants to validate Date Format, Once selected date

@sprint3 @regression @27701 
Scenario: User wants validate Tell us about your pet screen
And the avatar should have the text Name, Age, Gender, Breed
And the user should be able to enter the following in the form Enter your Pets name,Enter pet birthdate,Enter pet weightlbs,Enter pet color  
And all the fields are Mandatory
And the user cannot type more than 30 characters in the Enter your pets name field
And the user can only enter alphabets and numbers in the Enter your pets name field
And the user cannot type any special characters in the Enter your pets name field
And the user is displayed with error message on leaving the field empty Error Message Please enter your pets name
And the user is displayed with the date picker while entering Birthdate
And the user is displayed with error message on leaving the birthdate field empty Error Message Please enter date of birth
And the user can type maximum of 4 digits in the weight field 
And the user cannot type any Special Characters except period '.' in the weight field
And the user cannot type more than one '.'
And the decimal can be used as the first entry but not the last.
And the user enters only a decimal or tries to add a decimal as the last entry show an inline error message: The field weight must be a number 
And the user attempts to add two decimals in succession show an inline error message: The field weight must be a number
And the user is displayed with error message on leaving the weight field empty Error Message Please enter weight
And the user cannot type numbers and special characters in the color field
And the user cannot type more than 20 characters  in the color field
And the user is displayed with error message on leaving the color field empty Error Message Please enter color of your pet
And Next button is enabled after entering all the mandatory fields  
And the user taps on Next button to go to the Tell us about your pet Screen

@sprint3 @regression @27701
Scenario: User wants to veryfy Page Naigation
And the user taps on < at the top to go back to What species is your pet screen

@sprint3 @regression @27701
Scenario: User wants to veryfy Page Naigation
And the user taps on X at the top to go back to Home Screen