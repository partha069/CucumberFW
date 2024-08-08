  Feature: 36040-Youre all set screen updates
  
  @36040 @sprint11 @regression @smoke @LoggedinUserYouareAllSetScreen
  Scenario: User should able to see Reason Type and Note in Youare All Set Screen as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  #| displayed with the following:
  #| Appointment type (Illness) | Appointment reason (Diarrhea) | Notes for the vet: | Have you checked out our affordable, high-quality Optimum Wellness Plans®? Ask your veterinary team what's right for your pet! | 'See everything you get >' CTA 
  #| Call CTA | Reschedule CTA | Cancel CTA | Add to calendar CTA |
  #| OWP Promo messaging is conditional, The promo messaging will only be displayed for NWP pets
  #| the user will tap on 'See everything you get >' CTA to get redirected to the browser to https://www.banfield.com/products/optimum-wellness-plan
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen
  Scenario: User should tap on Call CTA to open the default dialer with Hospital phone number pre-filled as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And the user can tap on Call CTA to open the default dialer with Hospital phone number pre-filled
  
  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen @runfixed
  Scenario: User wants to taps on Add to calendar CTA to add the appointment to the device calendar as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And the user taps on Add to calendar CTA to add the appointment to the device calendar
  #Existing Rules for Add to calendar :
  #The user can click on Add to Calendar CTA for the first time to be displayed with the following text:
  #| "Appointment added to your calendar! " | Okay CTA | 
  #The user can click on Add to Calendar CTA for the second time to be displayed with the following text:
  #| "Appointment already added to calendar! " | Okay CTA |
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen
  Scenario: User wants to cancel appointment from Youare All Set Screen as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on Yes CTA to get a pop-up message
  #| Text Title: Okay | Text message: We've removed <Petname>'s appointment from our calendar. We hope to see both of you again soon. | Close (X) icon |
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen
  Scenario: User dont wants to cancel appointment from Youare All Set Screen as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  #Don't Want to Cancel Appointment
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on No CTA to get a pop-up message 
  #| Text Title: No problem | Text message: No changes have been made. We'll see you soon. | Close (X) icon |
  And the user taps on Close icon to dismiss the popup
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen
  Scenario: User wants to tap on Close X icon to remain on the same page Youre all set screen as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
  And the Next CTA will be enabled once user will selects the respective tag
  And User should able to redirect to when and where screen
  Then user avoid duplicate popup if displayed
  Then the user click on next available if slot is not available for that day
  And the users is redirected to the next screen when & where
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on X icon to remain on the same page Youre all set screen
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  #And the user tap on Done CTA
  #Then the user should be redirected to Upcoming appointments screen
  #And Cancel users all appointments as a logged in user

  @36040 @sprint11 @regression @LoggedinUserYouareAllSetScreen
  Scenario: User wants to Reschedule Appointment from Youare All Set Screen as a Logged in user.
  Given user launched the Banfield application
  When the user is on Home screen
  When User navigating to who are we scheduling page
  Then the user is redirected to Reason for visit screen
  And the user will be displayed Not sure Call a hospital near you at the bottom of the page
  And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
  And user wants to redirected to when & where Page
  Then the user click on next available if slot is not available for that day
  And user should able to select available slots
  And the user taps on the Next CTA to get redirected to everything look okay Screen
  And the user click on Make appointment CTA 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
  And the user can tap on Reschedule CTA to get redirected on when and where screen with available time slots for that day or Next available date
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
  #Starting Guest User
  @36040 @sprint11 @regression @smoke @GuestUserYouareAllSetScreen
  Scenario: User should wants to verify UI and tapping on Call CTA to open the default dialer with Hospital phone number pre-filled in Youare All Set Screen as a Guest User.
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
  And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
  And the user click on Make appointment CTA
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And the user can tap on Call CTA to open the default dialer with Hospital phone number pre-filled
  
  @36040 @sprint11 @regression @GuestUserYouareAllSetScreen
  Scenario:  User wants to taps on Add to calendar CTA to add the appointment to the device calendar as Guest User Flow. 
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
  And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
  And the user click on Make appointment CTA
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And the user taps on Add to calendar CTA to add the appointment to the device calendar
  #Existing Rules for Add to calendar :
  #The user can click on Add to Calendar CTA for the first time to be displayed with the following text:
  #| "Appointment added to your calendar! " | Okay CTA | 
  #The user can click on Add to Calendar CTA for the second time to be displayed with the following text:
  #| "Appointment already added to calendar! " | Okay CTA |
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on Yes CTA to get a pop-up message
  #| Text Title: Okay | Text message: We've removed <Petname>'s appointment from our calendar. We hope to see both of you again soon. | Close (X) icon |
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled
  
  @36040 @sprint11 @regression @GuestUserYouareAllSetScreen
  Scenario: User wants to cancel appointment from Youare All Set Screen as Guest User Flow. 
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
  And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
  And the user click on Make appointment CTA
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on Yes CTA to get a pop-up message
  #| Text Title: Okay | Text message: We've removed <Petname>'s appointment from our calendar. We hope to see both of you again soon. | Close (X) icon |
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled
  
  @36040 @sprint11 @regression @GuestUserYouareAllSetScreen
  Scenario: User dont wants to cancel appointment from Youare All Set Screen as a Guest user.  
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
  And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
  And the user click on Make appointment CTA
  Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
  And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
  And the user will not be displayed the Notes for the vet if the user has not provided any notes.
  And User should able to see Cancel UI Popups
  #| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
  And the user tap on No CTA to get a pop-up message 
  #| Text Title: No problem | Text message: No changes have been made. We'll see you soon. | Close (X) icon |
  And the user taps on Close icon to dismiss the popup
  #Just To Cancel Appointment
  And User should able to see Cancel UI Popups
  And the user tap on Yes CTA to get a pop-up message
  And the user taps on Close icon to dismiss the pop-up
  And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled
  
   
  #NATC
  #And the user will tap on 'See everything you get >' CTA to get redirected to https://www.banfield.com/products/optimum-wellness-plan
  #The added appointment should display the following in the device:
  #| <Pet name>'s visit | Appointment Time | Hospital name |
  #And the appointment will be added as per device's timezone