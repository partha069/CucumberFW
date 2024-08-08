Feature: 26917-Login-Using login credentials

Background:
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 

@26917 @sprint3 @regression @smoke
Scenario:- Existing User wants to log in with email address and password 
And the screen is displayed with the following fields
And the user if click on Log in CTA without entering email/username & password, it is displayed with tossed error message: Oops! The form could not be processed. Please enter your email and password and try again

@26917 @sprint3 @regression @smoke
Scenario:- Existing User wants to log in with email address and password 
And if the user enter incorrect username or password and click on Login CTA
And the user will tap on 877-656-7146. to launch devices default dialer with phone number pre-filled.

@26917 @sprint3 @regression
Scenario:- Existing User wants to log in with email address and password 
And if the user enter incorrect username or password and click on Login CTA
And the user taps on Okay CTA/ X icon to close the pop-up.

@26917 @sprint3 @regression
Scenario:- Existing User wants to log in with email address and password 
And if the user enter correct username and password and click on Log in, user should be successfully log in with the chosen credentials.

@26917 @sprint3 @regression
Scenario:- Existing User wants to log in with email address and password 
And if the user has more than ten unsuccessful login attempts the user user will be displayed with a pop- up Title Whoops
And the user taps on Okay CTA/ X button to dismiss the pop-up

@26917 @sprint3 @regression @smoke
Scenario:- Existing User wants to log in with email address and password 
And the user taps on Cancel CTA to go back to Welcome screen