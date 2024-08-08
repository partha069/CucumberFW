Feature: 31812-Login - Using username

Background:
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 

@31812 @sprint7 @regression
Scenario: Correct username/email address and password
When the user enters the correct username or email address and password
Then the user should successfully log in

@31812 @sprint7 @regression
Scenario: Incorrect username/email address and password
When the user enters the incorrect username or email address or password
Then the user should be displayed with a pop-up
#Title : Whoops!
#Text : "That's not right. Check your info and try again. Need help? Call our support hotline at 877-656-7146.  | Okay CTA |
And the user will tap on 877-656-7146 to launch devices default dialer with phone number pre-filled
And the user taps on Okay CTA/ X icon to close the pop-up.

@31812 @sprint7 @regression
Scenario: The field is left empty
When the user leaves the username or password field empty
#Then the user should be displayed with a pop-up
#Title : Whoops!
#Text:  "The form could not be processed. Please enter your email and password and try again." |Okay CTA|
And the user taps on Okay CTA to close the pop-up.

@31812 @sprint7 @regression
Scenario: The field is left empty
When the user leaves the username or email address or password field empty
#Then the user should be displayed with a pop-up
#Title : Whoops!
#Text:  "The form could not be processed. Please enter your email and password and try again." |Okay CTA|
And the user taps on Okay CTA to close the pop-up.