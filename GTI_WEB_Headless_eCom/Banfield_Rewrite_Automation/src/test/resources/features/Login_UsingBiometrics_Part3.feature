Feature: 30759-Login- Using Biometrics (Part 3)

#@sprint @regression @30759
Scenario:  1 A Biometric after Reset Password with Remember me(with Face id and finger print)
#Given the user has reset the password
When the has checked Remember me previously
#Then the user returns to the login page after resetting password
#And the user attempts to login using biometrics without entering new credentials
#And the user is displayed with the pop-up
#"Whoops! That's not right. Check your info and try again. Need help? Call our support hotline at 877-656-7146"
#And the user taps on 877-656-7146 to open device's default dialer with phone number pre-filled.
#And the user enters their email and password to enable biometrics.
#And the user taps on Okay CTA to dismiss the pop-up.

#@sprint @regression @30759
Scenario: 1B Biometric after Reset Password (with Face id and finger print)
#Given the user has reset the password
#When the user goes back to the login page
#And the user attempts to login using biometrics which was set previously
#And the remember me was not set up previously
#And the user attempts to login using biometrics without entering new credentials
#And the user is displayed with the pop-up
#"Whoops! That's not right. Check your info and try again. Need help? Call our support hotline at 877-656-7146" | Okay CTA|
#And the user taps on 877-656-7146 to open device's default dialer with phone number pre-filled.
#And the user enters their email and password to enable biometrics.
#And the user taps on Okay CTA to dismiss the pop-up.

#@sprint @regression @30759
Scenario: 2 Users device has both fingerprint and face id
#Given the user is on the login screen
#When the user has enabled fingerprint and face id on device
#Then the default biometrics for the device will be selected for the app 

#@sprint @regression @30759
Scenario: 3 Migrated user clicks on fingerprint icon
#Given the migrated user is on the login page
#When the migrated user enters email and password taps on the greyed out biometric icon
#Then the migrated user will be displayed a pop-up 
#Title : “Welcome to your paw-some new MyBanfield experience”
#Text: “Get ready for a new and improved MyBanfield. To start, please quickly reset your password. Just use your MyBanfield email and we’ll send you a link.” | Enter email field | Send my reset link CTA | Forgot your MyBanfield email? CTA

#@sprint @regression @30759
Scenario: 4 User will be updated with their new password
#Given the user has reset the password
#When the user returns to the login page
#Then the user has to enter email and new password 
#And tap on log in CTA to log in the app
#And once the user has logged in the biometrics will be updated with their new password.

#@sprint @regression @30759
Scenario: 5 (Face Id and Fingerprint)
#Given the user Logs out
#When the user lands on the login page
#Then the user will not be displayed with the Biometrics pop-up automatically to Login
#And the user will tap on the Biometrics icon to Login

#@sprint @regression @30759
Scenario: 6 Facial recognition to log in the app
#Given the user minimizes the app
#When the session times out and user lands on the login page
#Then the user will be displayed with the an automatic Biometrics pop-up to Login
#And the the user will scan fingerprint/use facial recognition to log in the app


