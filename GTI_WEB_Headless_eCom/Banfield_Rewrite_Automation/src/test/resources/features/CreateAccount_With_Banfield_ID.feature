Feature: 26342-Create account- With Banfield ID

@26342 @regression @sprint2 
Scenario: User with a Banfield ID wants to create an account 
Given user launched the Banfield application
When user taps on create an account option 
Then the user should be displayed with the Have we met page 
And the user taps on Yes I have option 
Then the user should be redirected to Sign up for MyBanfield screen

    
      
