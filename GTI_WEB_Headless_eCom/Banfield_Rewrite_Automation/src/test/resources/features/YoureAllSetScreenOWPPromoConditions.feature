 Feature: 36910-Youre all set screen - OWP promo conditions

  #@36910 @sprint13 @OK
  Scenario: User wants to view OWP promo as New patient in Guest User Flow. 
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
  Then the Location services is enabled for the Device
  And the user taps on a location to select from the list
  And the user is redirected to the next screen when & where
  When user tapped on Next CTA in when & where screen
  Then they are redirected to the Everything look okay Screen
  And User tried to created an Appointment as New patient and user tap on Make appointment CTA
  And the user click on Make appointment CTA 
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  #And the user taps on Done to get redirected to the Welcome Screen
  #Just to Cancel Appointment
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled
  
  #@36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Illness in Guest User Flow. 
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And the user tapped on Next for illness
  And the user taps on the Next CTA to get redirected to when & where Page
  Then the user wants to enable Location services for the Device
  And the user taps on a location to select from the list
  And the user is redirected to the next screen when & where
  When user tapped on Next CTA in when & where screen
  Then they are redirected to the Everything look okay Screen
  And the user click on Make appointment CTA 
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  #And the user taps on Done to get redirected to the Welcome Screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled

  #@36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Injury in Guest User Flow. 
  Given user launched the Banfield application
  When User is on the welcome screen
  When user taps on the make an appointment CTA
  Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
  When the user tapped on No, I am New option from the Have we met Screen
  When the user tapped on Next in the Contact Information Screen 
  When the user tapped on Next from the What species is your pet screen
  When user tapped on Next from the Tell us about your pet screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When user selected the Injury option in Reason for visit screen
  And the user tapped on Next for injury
  When they are redirected to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And the user taps on the Next CTA to get redirected to when & where Screen
  Then the user wants to enable Location services for the Device
  And the user taps on a location to select from the list
  And the user is redirected to the next screen when & where
  When user tapped on Next CTA in when & where screen
  Then they are redirected to the Everything look okay Screen
  And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
  And the user click on Make appointment CTA 
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  #And the user taps on Done to get redirected to the Welcome Screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled
  
  
  
  #New patient ??
  @EndToEnd @MakeAppLoggedInUserFlow @FromNewPatient @NewPatient @phase2 
  Scenario: User wants to make an appointment from Highlights Screen using New Patient as a Logged in user make appointment flow.
  Given user launched the Banfield application
  When user tapped on the Login CTA from the login screen and the user credentials are valid
  When User wants to tak on Make an Appointment CTA and navigate to where and where Screen
  Then user avoid duplicate popup if displayed
  And User should be able to choose hospital
  And user on clicking on Next available should see the available doctors
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And User tried to created an Appointment as New patient and user tap on Make appointment CTA
  And the user click on Make appointment CTA 
  #And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Highlights pet profile
  
  
  #_injuryCTA should be "illness" ??
  @EndToEnd @MakeAppLoggedInUserFlow @FromInjury @Injury @phase2  
Scenario: User wants to make an appointment using Injury as a Logged in user make appointment flow.
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
And the users taps on the Next CTA to get redirected to when & where Screen
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location

  @36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Illness in Logged in User Flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the user should be able to tap on any option to select a tags
  And the users taps on the Next CTA to get redirected to when & where Screen
  Then the user click on next available if slot is not available for that day
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  #@36910 @sprint13 @Injury 
  Scenario: User dont wants to view OWP promo as Injury in Logged in User Flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the user should be able to tap on any option to select a tags
  And the users taps on the Next CTA to get redirected to when & where Screen
  Then the user click on next available if slot is not available for that day
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
   
  #@36910 @sprint13 
  Scenario: User dont want to view OWP promo as Vaccination in Logged in User Flow. 
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  When the user is displayed with the native Location Pop up to enable geo-location
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  #And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  @36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Routine Visit in Logged in User Flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location

  @36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Vaccination in Logged in User Flow.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  When the user is displayed with the native Location Pop up to enable geo-location
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  #And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location

  @36910 @sprint13 
  Scenario: User dont wants to view OWP promo as Comprehensive Exam in Logged in User Flow.
  Given user launched the Banfield application
  When User navigated to Home Screen
  And user is able to tap on find a location near you
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
  When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  #And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to CTA
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to the where he initiated the make appointment flow from prefer loc not set
  
  ##@36910 @sprint13  Double
  Scenario: User dont wants to view OWP promo as Routin Visit in Logged in User Flow.
  Given user launched the Banfield application
  When User navigated to Home Screen
  When User wants to tap on PetCart in Home Screen
  When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
  Then user avoid duplicate popup if displayed
  And User should be able to choose hospital as per location
  And user on clicking on Next available should see the available doctors
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  #And the user is redirected to Youre all set screen
  #Just to Cancel Appointment
  And the user wants to view Other CTAs as Call, cancel, add to CTA
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Highlights pet profile
  
 