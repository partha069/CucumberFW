Feature: 28815-Change Password

Background:
Given user launched the Banfield application
When User navigated to Home Page
When the user taps on the Change Password CTA
Then the user should be redirected to Update your password screen

@sprint6 @regression @28815 @smoke
Scenario: User wants to change the password
And the user is displayed with the following static text for reset your password:
#Let's reset your password. Pick something you'll remember, but not a password you've used before.
And the user should be displayed with the all fields:
#| "Current password" Field with hide/unhide option | "New password" Field with hide/unhide option| "Confirm your password" Field with hide/unhide option| "Update" CTA|  
And all the fields Current password New password and Confirm your password are mandatory
And the user taps on Current password field to open alpha-numeric keypad
And the user taps on New password field to open alpha numeric keypad
And the user tap on Confirm your password field to open alpha-numeric keypad

@sprint6 @regression @28815
Scenario: User wants to change the password
And the user on leaving the Current Password field blank should displayed with an inline error message: Field cannot be blank
And the user on leaving Confirm your password field blank should show an inline error message X Passwords do not match
And if the Confirm your password field doesnt match with the New Password field then it should show an inline error message X Passwords do not match
And the user should use at least one lowercase letter to see a green tick mark as an indicator else red cross 
And the user should use at least one numeric value to see a green tick mark as an indicator else red cross 
And the user should use at least one uppercase letter to see a green tick mark as an indicator else red cross 
And the user should use at least one special character to see a green tick mark as an indicator else red cross
And the special characters allowed
#! @ # $ % ^
And the user should enter a password between 9 - 64 characters to see a green tick mark as an indicator else red cross
And the user if entered incorrect password in the Current password field and tapping on Update CTA is displayed this message
#Native pop-up "Sorry, something�s not right. Try again with a different password. | Okay CTA | "
And the user taps on Okay CTA to stay on the same screen
And the user tap on < icon from Update your password screen to go back to the previous Profile screen

#@sprint6 @regression @28815 @Update
Scenario: User wants to change the password
And the Update CTA is enabled only after all the fields are filled and New password and Confirm your password requirements are met, with no inline error messages.
And the user taps on Update CTA to update the password
And the user on successfully updating the password is displayed with a pop-up
#|Text: "Success! Your password has been updated successfully."| Close icon (X) |
And the user taps on the close icon on success pop-up 
# after should be redirected to the login screen if password was updated successfully.

@sprint6 @regression @28815
Scenario: User wants to change the password
And the user  if entered last 10 passwords that does not include the current password in New password field
And the user taps on Update CTA to update the password
And the user cannot use last 10 passwords to update the new password.
And the last 10 passwords does not include the current password.

#And the user can use the current password to update the new password.