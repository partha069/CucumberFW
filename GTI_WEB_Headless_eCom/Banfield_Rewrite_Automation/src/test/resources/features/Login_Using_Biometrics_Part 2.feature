Feature: 29967-Login- Using Biometrics (Part 2)

#@sprint @regression @29967
#Scenario: The user has enabled biometrics in the app (Touch ID)

#Given the user has enabled biometrics in the app
#When the user is returning to the Login screen
#Then the user is displayed with the native pop-up automatically with 
#Title : Sign in with your biometric (Touch the biometric sensor) 
#Text: Scan your fingerprint | Cancel CTA|
#And the user scans the fingerprint icon to log in the app
#And the user taps on Cancel CTA to dismiss the native pop-up and stay on Log in screen.

#Scenario: The user has enabled biometrics in the app (Face ID)
#Given the user has enabled biometrics in the app
#When the user is returning to the Login screen
#Then the user is displayed with the native pop-up for Face ID automatically
#And the device uses facial recognition to log in the user

#Scenario: The user has disabled biometrics in the app (Device must be supporting the biometric capabilities)
#Given the user is on Log in screen
#When the user has disabled biometrics in the app (in Settings) or they have not set it up
#Then the user will be displayed with a greyed out fingerprint icon on the login screen
#And the user has entered correct email/username and password
#And the user can tap on the fingerprint icon again to see a pop-up
#"Would you like to enable biometrics to sign in? | Skip | Enable |"
#And the user enables biometrics in the app to see the fingerprint icon in orange when they return back to login screen

Scenario: Device does not have biometrics
#Given the user is on the Login screen
#When the device does not have biometric capabilities
#Then the user will not be displayed with fingerprint icon
#And the user will not be displayed with the toggle to enable/disable biometrics in app Settings

Scenario: The user has biometrics on device and has not enabled it in app
#Given the user is on the login screen
#When the user has not enabled biometrics in the app 
#Then the user will be displayed with a greyed out fingerprint icon on the login screen
#And the user has not entered email/username and password
#And the user can tap on the biometric icon to see a pop-up
#Text: "To use the biometric sign in feature, please fill in your email or username. |Okay CTA|"
#And the user taps on 'Okay CTA' to stay on the login screen


Scenario: The user has enabled biometrics and not clicked on Remember me
#Given the user is on the login screen 
#When the user has already enabled biometrics in settings
#And the user has not clicked on Remember me
#Then the user can log in with biometrics
#And the user logs out to return to the login page
#And the user will be displayed with the email/username pre-filled.



