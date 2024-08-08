 Feature: 36641-Status Update Flags & Treatments - Hospital LocationSearch

 @sprint15 @36641 @regression
 Scenario: User wants to view Status Update Flags & Treatments - Hospital LocationSearch as Logged in User Flow.
 Given user launched the Banfield application
 When User navigated to Home Screen
 And user wants to see Status Update Flags & Treatments - Hospital LocationSearch
 
 @sprint15 @36641 @regression 
 Scenario: User wants to view Status Update Flags & Treatments - Hospital LocationSearch as Guest User Flow. 
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
 And user wants to see Status Update Flags & Treatments - Hospital LocationSearch in when & where
	


 

