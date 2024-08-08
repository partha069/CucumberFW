 Feature: 36296-Express, Mobile and Pet smart Logo

 @sprint14 @36296 @regression
 Scenario: User wants to view Express, Mobile and Pet smart Logo in Find a location near you as Logged in User Flow.
 Given user launched the Banfield application
 When User navigated to Home Screen
 And user wants to see Express, Mobile and Pet smart Logo
 
 @sprint14 @36296 @regression 
 Scenario: User wants to view Express, Mobile and Pet smart Logo in Find a location near you as Guest User Flow. 
 Given user launched the Banfield application
 When User is on the welcome screen
 When user taps on the make an appointment CTA
 Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
 When the user tapped on No, I am New option from the Have we met Screen
 When the user tapped on Next in the Contact Information Screen 
 When the user tapped on Next from the What species is your pet screen
 When user tapped on Next from the Tell us about your pet screen
 And the user will be displayed Not sure Call a hospital near you at the bottom of the page
 When user is on the when & where page
 And user wants to see Express, Mobile and Pet smart Logo from when & where


 

