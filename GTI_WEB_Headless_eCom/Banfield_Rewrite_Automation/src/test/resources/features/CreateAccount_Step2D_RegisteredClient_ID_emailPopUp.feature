Feature: 28869-Create Account - Step 2D: Registered Client ID/email Pop-up

 Background:
 Given user is on the Sign up for MyBanfield screen

 @32716 @sprint8 @regression 
 Scenario: User wants to verify trademark icon for Banfield text
 And User should able to verify trademark icon for Banfield text

 @28869 @sprint4 @regression
 Scenario: User wants to taps on Log in now CTA in popup to get redirected to Log in page
 When they are displayed with the Client ID field with a placeholder text : Client ID Ex: BNF123B
 Then the user enters the registered Banfield Client ID in the field 
 And user taps on Next CTA to get a pop-up message saying:
 And the user taps on Log in now CTA in popup to get redirected to Log in page
 
 @28869 @sprint4 @regression  
 Scenario: User wants to taps on Close X icon to close the pop-up
 When they are displayed with the Client ID field with a placeholder text : Client ID Ex: BNF123B
 Then the user enters the registered Banfield Client ID in the field 
 And user taps on Next CTA to get a pop-up message saying:
 And the user taps on Close X icon to close the pop-up

 @28869 @sprint4 @regression 
 Scenario: User wants to enter valid email id to get ClientID
 When the user is displayed with the section to retrieve Client ID
 Then the user if enters the registered Banfield email in the field 
 And user taps on Send my clientID CTA to get a pop-up message saying:

 @28869 @sprint4 @regression
 Scenario: User wants to taps on Close X icon to close the popup 
 When the user is displayed with the section to retrieve Client ID
 Then the user if enters the registered Banfield email in the field 
 And user taps on Send my clientID CTA to get a pop-up message saying:
 And the user taps on Close X icon to close the popup