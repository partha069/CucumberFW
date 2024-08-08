Feature: 33293-Create Account-Lock specific account only

@33293 @regression @sprint8
Scenario:- As a user I want to use the client ID which is not locked so that I can create an account
Given user is on Complete online profile screen
When the user has 3 incorrect attempts
Then the user will be displayed with a pop-up for account has been locked for suspicious activity
#| Title: "Whoops!" Text:" Your account has been locked for suspicious activity. Please call support at 877-656-7146| Okay CTA| Close icon | "
And the user tap on Okay CTA to get redirected to the welcome screen
And the account should be locked for that specific client ID only

@33293 @regression @sprint8
Scenario:- As a user I want to use the client ID which is not locked so that I can create an account
Given user is on the Sign up for MyBanfield screen 
And the user can use the other Client ID to go through the create account process


#NATC
#And the account is locked for 30 min