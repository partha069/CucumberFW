 Feature: 36008-Not sure call us

  @36008 @sprint11 @regression 
  Scenario: 36008-User wants to verify Not sure Call a hospital near you text in Reason for visit screen from Guest User Flow.
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you screen
  
  @36008 @sprint11 @regression 
  Scenario: 36008-User wants to verify Not sure Call a hospital near you text through illness in Whats going on screen from Guest User Flow.
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user tapped on Next for illness
  Then the user will be redirected to Whats going on screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page
  
  @36008 @sprint11 @regression 
  Scenario: 36008-User wants to verify Not sure Call a hospital near you text through injury in Whats going on screen from Guest User Flow.
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  When user selected the Injury option in Reason for visit screen
  And the user tapped on Next for injury
  Then the user will be redirected to Whats going on screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page
	
  @36008 @sprint11 @regression 
  Scenario: User wants to view Not sure Call a hospital near you cta in Reason for visit screen as Logged in User
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you
  Then the user will be redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you screen
  
  
  @36008 @sprint11 @regression 
  Scenario: User wants to view Not sure Call a hospital near you cta in illness screen as Logged in User
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  Then the user will be redirected to Whats going on screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page
  
  @36008 @sprint11 @regression 
  Scenario: User wants to view Not sure Call a hospital near you cta in illness screen as Logged in User
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you
  And User tap on Next CTA for injury and navigate to whats going on screen
  Then the user will be redirected to Whats going on screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page
  
  @36008 @sprint11 @regression @dfdff 
  Scenario: User wants to view Not sure Call a hospital near you cta in Preventive care screen as Logged in User
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page for Preventive care


  @36008 @sprint11 @regression 
  Scenario: 36008-Logged in user with preferred location
  Given user launched the Banfield application
  When the user is on Home screen
  And the user is on Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled
  
  @36008 @sprint11 @regression 
  Scenario: 36008-Logged in user with preferred location
  Given user launched the Banfield application
  When the user is on Home screen
  And the user is on Reason for visit screen
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  Then the user will be redirected to Whats going on screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled