Feature: 27154-Migrated User flow

Background:
Given the user is on Login screen
When the user has entered the email and password the user taps on Log in CTA for migrated flow
Then the user will be displayed with a pop-up with the following

#@27154 @sprint3 @regression
Scenario: Migrated User wants to reset password or retrieve email
And the Send my reset link CTA will be enabled once the user enters a valid email
And the user will tap on Send my reset link CTA to view a pop-up with following message:- Title Sent
And the user will tap on Open email CTA to open devices default mail.
#And the user will tap on Forgot your MyBanfield email to get redirected to open a pop-up  Title: Need help finding your MyBanfield email >> CR

#@27154 @sprint3 @regression
Scenario: Migrated User wants to reset password or retrieve email
And the user will tap on Forgot your MyBanfield email to get redirected to open a pop-up  Title: Need help finding your MyBanfield email
And the user taps on Support hotline CTA to open the device default dialer

#@27154 @sprint3 @regression
Scenario: Migrated User wants to reset password or retrieve email
And the user will tap on Forgot your MyBanfield email to get redirected to open a pop-up  Title: Need help finding your MyBanfield email
And the user taps on Okay CTA/ X icon to close pop-up

#@27154 @sprint3 @regression
Scenario: Migrated User wants to reset password or retrieve email
And the user will tap on X to stay on the log in screen

#@27154 @sprint3 @regression
Scenario: Migrated User wants to reset password or retrieve email
#And Title : Welcome to your paw-some new MyBanfield experienceText: “Get ready for a new and improved MyBanfield. To start, please quickly reset your password. Just use your MyBanfield email and we’ll send you a link.” | Enter email field | Send my reset link CTA | Forgot your MyBanfield email? CTA
#And the email should be in a valid format username@mail.com
#And the user will see an inline error message when the email is not in valid format Invalid email
#And the Send my reset link will be disabled by default
