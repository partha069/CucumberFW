Feature: 26207-Access CTAs on Welcome Screen

Background:
Given user launched the Banfield application
Then user is on the welcome screen

@sprint1 @26207 @regression 
Scenario: User wants to tap on "Log in" CTA on the welcome screen. 
When user taps on Log in CTA 
Then the user should be redirected to the Log in screen.

@26207 @regression @sprint1 
Scenario: User wants to tap on "Make appointment as guest" CTA on the welcome screen
When user taps on Make an appointment CTA 
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user should be redirected to the Have we met screen

@26207 @regression @sprint1
Scenario: User wants to tap on New Create account CTA on the welcome screen
When user taps on New Create account CTA 
Then the user should be redirected to the Have we met screen

@26207 @regression @sprint1
Scenario: User wants to tap on "Find a nearby location" CTAs on the welcome screen
When user taps on Find a nearby location CTA 
Then the user should be redirected to the Hospital Locator screen
And the first time user will see a pop up notification to turn on the device's location

@26207 @regression @sprint1
Scenario: User wants to tap on "Build package" CTA on the welcome screen
When user taps on Build packages CTA 
Then the user should be redirected to the URL "https://shop.banfield.com/banfield-wellness-plans/enroll" 

@26207 @regression @sprint1
Scenario: User wants to tap on "Terms of service" CTA on the welcome screen
When user taps on Terms of service CTA 
Then the user should be redirected to the URL "https://www.banfield.com/General/Terms"

@26207 @regression @sprint1
Scenario: User wants to tap on "Privacy policy" CTA on the welcome screen
When user taps on Privacy policy CTA 
Then the user should be redirected to the URL "https://www.mars.com/privacy"