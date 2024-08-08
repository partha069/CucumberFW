Feature: End To End Scenarios

@EndToEnd @MakeAppGuestUserFlow @OWPPromoAsNewPatient @NewPatient @phase1 @partha111
Scenario: User wants to make an appointment as New patient in Guest User Flow. 
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
Then the Location services is enabled for the Devices
And the user taps on a location to select from the list
#And the user is redirected to the next screen when & where
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

@EndToEnd @MakeAppGuestUserFlow @phase1 @Illness 
Scenario: User wants to make an appointment as Illness in Guest User Flow. 
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

@EndToEnd @MakeAppGuestUserFlow @phase1 @Injury
Scenario: User wants to make an appointment as Injury in Guest User Flow.
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

@EndToEnd @MakeAppGuestUserFlow @FromCreateAccountClientIDscreen @OWPPromoAsNewPatient @NewPatient @phase2
Scenario: User wants to make an appointment from help with Client ID screen.
Given user launched the Banfield application
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
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

@EndToEnd @MakeAppGuestUserFlow @FromFindaNearbyLocation @Injury @phase2 
Scenario: User wants to make an appointment from Find a nearby location Screen in Guest User Flow.	
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And User should able to redirect to when and where screen
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

@EndToEnd @MakeAppLoggedInUserFlow @FindLocation_HaveWemet_Yes @PreventiveCare_vaccination @phase2 
Scenario: User wants to make an appointment when Preferrer Location Is Not Set form Logged in User Flow
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
And user taps Yes I have option 
When User wants to navigated to Home Screen
When User wants to navigating to who are we scheduling page
Then user is navigated to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And After the appointment is cancelled, user will be redirected to Find a location near you screen with the information prefilled

@EndToEnd @MakeAppLoggedInUserFlow @FindLocation_HaveWemet_Yes @PreventiveCare_vaccination @phase1
Scenario: User wants to make an appointment when Preferrer Location Is Set form Logged in User Flow
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
And user taps Yes I have option
When the User should login and landed to home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
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

@EndToEnd @MakeAppLoggedInUserFlow @FromVaccination @PreventiveCare_vaccination @phase1  
Scenario: User wants to make an appointment using Vaccination as a Logged in user make appointment flow.
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

@EndToEnd @MakeAppLoggedInUserFlow @FromIllness @Illness @phase1
Scenario: User wants to make an appointment using Illness as a Logged in user make appointment flow.
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
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location

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

@EndToEnd @MakeAppLoggedInUserFlow @FromRoutineVisit @phase1 @PreventiveCare_RoutineVisit 
Scenario: User wants to make an appointment using Routine Visit as a Logged in user make appointment flow.
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
#And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location

@EndToEnd @MakeAppLoggedInUserFlow @FromComprehensiveExam @PreventiveCare_ComprehensiveExam @phase1 
Scenario: User wants to make an appointment using Comprehensive Exam as a Logged in user make appointment flow.
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
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to CTA
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to the where he initiated the make appointment flow from prefer loc not set

@EndToEnd @MakeAppLoggedInUserFlow @FromNewPatient @NewPatient @phase2 
Scenario: User wants to make an appointment from Highlights Screen using New Patient as a Logged in user make appointment flow.
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tak on Make an Appointment CTA and navigate to where and where Screen
Then user avoid duplicate popup if displayed
And User taps on new patients
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

@EndToEnd @MakeAppLoggedInUserFlow @FromNewPatient @NewPatient @phase2 
Scenario: User wants to make an appointment from Timeline Screen using New Patient as a Logged in user make appointment flow.
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
And User taps on new patients
And the user should tap on Duplicate Appointment CTA and navigate to when and where screen
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
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from TimeLine pet profile

@EndToEnd @MakeAppLoggedInUserFlow @FromChatAndMoreScreen @PreventiveCare_RoutineVisit @phase1 
Scenario: User wants to make an appointment From Chat and More Screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from chat and more

@EndToEnd @MakeAppLoggedInUserFlow @FromupcomingappointmentScreen @PreventiveCare_RoutineVisit @phase1 
Scenario: User wants to make an appointment From Upcoming appointments Screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Upcoming Appointment Screen

@EndToEnd @MakeApptAsLoggedUser @FromPetCartScreen @PreventiveCare_ComprehensiveExam @phase1 
Scenario: User should able to make appointrment from highlights screen on petcard
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
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to CTA
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Highlights pet profile

@EndToEnd @MakeAppLoggedInUserFlow @FindLocationWhenPreferredLocationNotSet @PreventiveCare_vaccination @phase2 
Scenario: User wants to make an appointment from Find Location when Preferred Location Not Set set as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to CTA
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to the where he initiated the make appointment flow from prefer loc not set

@EndToEnd @LoggedInUserFlow @AddPetLoggedInUser @phase2 
Scenario: User wants to add a Pet
Given user launched the Banfield application
When the user is on Home screen
When the user is on the Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user is on Lets add their photo screen
When the user taps on Skip CTA or Next CTA after uploading a photo
Then the user will be redirected to Your pets screen
And the pet card will have Pet name, Age, Gender, Breed, Trash icon, based on their previous selections
And the user will be displayed with the Add another pet CTA Done CTA
And the Done CTA by default will display as a enabled 
#And the user taps on the Done CTA to go on the Home screen with new Pet added.

@EndToEnd @LoggedInUserFlow @AddPetPhotoLoggedInUser @phase2 
Scenario: User wants to add pets photo from Add a new Pet Flow
Given user launched the Banfield application
When the user is on Home screen
When the user is on What species is your pet screen
When the user is on Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user taps on Next CTA
And the user will tap on Add photo CTA to add a photo
Then the user should be displayed with the native alert again to allow the access
And the user will be displayed with the custom pop-up to add photo with following options if access is given
And the user taps on Take Photo CTA to launch the device camera

@EndToEnd @LoggedInUserFlow @phase1
Scenario:- User wants to Change pets photo from Highlight Screen
Given user launched the Banfield application
When User navigated to Home Screen 
When the user tap on any pet card from the available list of pets
Then the user should be redirected to the pet details screen
Then user wants to change photo

@EndToEnd @LoggedInUserFlow @phase2
Scenario: User wants to Change pets photo from Timeline Screen
Given user launched the Banfield application
When the user is on Home screen
When user is on the pet info page
When the user taps on Timeline Tab
Then user wants to change pet photo

@EndToEnd @LoggedInUserFlow @test @phase2 
Scenario: User wants to add pets and then wants to remove from Add a new Pet Flow
Given user launched the Banfield application
When the user is on Home screen
When the user is on the Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user is on Lets add their photo screen
When the user taps on Skip CTA or Next CTA after uploading a photo
And the user taps on Trash icon to remove the pet
And the user is displayed with a native pop-up Are you sure you want to remove this pet 
And the user taps on Cancel CTA to stay on the same page
And the user taps on Delete CTA to Delete the pet
And if no pet is there user will be displayed with Text Add your pet to get started Add your pet CTA Done CTA
And the user taps on Add your pet CTA to go to What species is your pet screen

@EndToEnd @LoggedInUserFlow @phase1 
Scenario: User wants to Remove pet and then wants to Add Pet again from Add a new Pet Flow
Given user launched the Banfield application
When the user is on Home screen
When the user is on the Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user is on Lets add their photo screen
When the user taps on Skip CTA or Next CTA after uploading a photo
And the user taps on Trash icon to remove the pet
And the user is displayed with a native pop-up Are you sure you want to remove this pet 
And the user taps on Cancel CTA to stay on the same page
And the user taps on Delete CTA to Delete the pet
And if no pet is there user will be displayed with Text Add your pet to get started Add your pet CTA Done CTA
And the user taps on Add your pet CTA to go to What species is your pet screen
When the users is on the Tell us about your pet screen
When the user clicks on Next CTA on Tell us about your pet screen
Then the user will be redirected to What breed are they screen
When user has selected a breed on What breed are they screen
When the user is on Lets add their photo screen
When the user taps on Skip CTA or Next CTA after uploading a photo
Then the user will be redirected to Your pets screen
And the pet card will have Pet name, Age, Gender, Breed, Trash icon, based on their previous selections
And the user will be displayed with the Add another pet CTA Done CTA
And the Done CTA by default will display as a enabled 
#And the user taps on the Done CTA to go on the Home screen with new Pet added.

#Reschedule > Yes Phase1 > 1hr
@EndToEnd @LoggedInUser @RescheduleAppointment @phase1 
Scenario: Verify user is able to redirecte Upcoming Appointment
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user taps on Reschedule CTA to get a pop-up message saying
And the user taps on Yes CTA to get redirected to Reason for visit
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
#And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to CTA
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Upcoming Appointment Screen

#Reschedule > No
@EndToEnd @LoggedInUser @RescheduleAppointment @phase2  
Scenario: Verify user dont want to redirecte Upcoming Appointment
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user taps on Reschedule CTA to get a pop-up message saying
And the user tap on No CTA to get a popup message
And the user tap on Close X icon from the pop-up to remain on the same page Upcoming appointments

#Cancel Upcoming appointments > No 
@EndToEnd @LoggedInUser @CancelAppointments @phase2
Scenario: Verify user dont want to Cancel Appointment
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA 
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user tap on No CTA to get a popup message when dont want to cancel appointments

#Cancel Upcoming appointments > Yes
@EndToEnd @LoggedInUser @CancelAppointment @phase2 
Scenario: Verify user is able to Cancel Appointment
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

#Geolocation > ON
@EndToEnd @LoggedInUser @GeoLocOnMiles @phase2 @CR_Dont_Run_35760
Scenario: 35760-Verify user wants to view miles when the geolocation is turned on
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page
And the user navigate back to home screen
Then the user should be redirected to Upcoming appointments screen
And the user will be displayed miles when the geolocation is turned on

#CR > EDIT 
@EndToEnd @LoggedInUser @VeerifyHighlightsScreen @phase2
Scenario: User wants to view Shareable Records Pet profiletab and Vet CTA in the Highlights Screen
When the user is on Home screen
When user is on the pet info screen
When user is on the pet detail screen
When the Highlights Tab is selected by default
Then the user should be displayed with the following sections as accordions
And the default ordering is as described Comprehensive exam, Vaccinations, Dental exam, Parasite control, Weight tracker always on bottom, Shareable records only for dogs, Pet profile
#And the user should display Shareable Records tab CR
And the user should display Pet profile tab
And Chat with a vet CTA should be displayed only for the pet is a Dog or Cat

#@EndToEnd @LoggedInUser @ShareRecord @phase2  #CR
#Scenario: User wants to view Shareable records and wants to see able to share pdf from the Highlights Screen
#Given user launched the Banfield application
#When the user is on Home screen
#Then the user should be redirected to home screen
#When user is on the pet info page
#And the user scroll to Shareable records module
#When the user taps on View records CTA
#Then the user should be displayed with Shareable records screen
#And the Shareable records screen should display the Petnames boarding and grooming records,Date, Share record CTA
#And the user should be able to tap on Share record CTA to share or download the pdf 

@EndToEnd @LoggedInUser @PaymentDetailsScreen @phase2
Scenario: User wants to verify OWP Payment details screen from the Highlights Screen
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When they tap to view the highlights tab for OWP pet
Then they should be displayed with the OWP Payments details widget below the Preventive Dashboard
And the user is displayed with Optimum Wellness Plans, Active
And the user will be displayed with Payment details CTA
And the user will tap on Payment details CTA to get redirected to Payment details screen 

@EndToEnd @LoggedInUser @Dashboard @phase2
Scenario: User wants to verify Pet Profile from the Highlights Screen
Given user launched the Banfield application
When User navigated to Home Screen
When the user tap on Pet profile accordion to expand
Then the user should be able to view the following details:
And the user should be able to expand or collapse the details on tap

@EndToEnd @LoggedInUser @VetChatCTA @phase2
Scenario: User wants to verify VetChat in Pet Visit Screen from the Timeline Screen
Given user launched the Banfield application
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
And The user wants to tap on VetChat CTA

@EndToEnd @LoggedInUser @PetVisitScreen @phase2
Scenario: User wants to verify Call hospital in Pet Visit Screen from the Timeline Screen
Given user launched the Banfield application
When the user is on Home screen
When User wants to navigate to Pet visit
And the user will tap on Call Hospital CTA to open devices default dialer with hospital number prefilled

@EndToEnd @LoggedInUser @PetVisitScreen @phase2 @issueTimeline
Scenario: User wants to verify visit history and medical details in Pet Visit Screen from the Timeline Screen 
Given user launched the Banfield application
When the user is on Home screen
Then user should be redirected to Pet name visit page
And the user will be displayed with Medicine name if administered
And the user will be displayed with  Name of vaccine if administered
And the user will be displayed with Name of the Test Lab Result Details Lab Range Above below comes from api if administered.

@EndToEnd @RetrieveClientID @phase2
Scenario:- User wants to retrieve their Banfield Client ID 
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID
And the user is displayed with the error message pop up on entering an unregistered Email ID 
And Whoops! 
And That email isnt in our system 
And Forgot your MyBanfield email? 
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And Need help finding your MyBanfield email? 
And the user on clicking on support hotline number gets redirected to dialer with the phone number pre-filled

@EndToEnd @RetrieveClientID @phase2
Scenario:- User wants to close the pop up and stay on the same screen
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID
And the user is displayed with the error message pop up on entering an unregistered Email ID
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And the user tap on X on pop up to close the pop up and stay on the same screen


@EndToEnd @RetrieveClientID @phase2
Scenario: User wants retrive client ID
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID
And the user is displayed with the error message pop up on entering an unregistered Email ID
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And the user tap on Okay CTA to dismiss the pop-up and get redirected to the "Sign up for MyBanfield" screen.

@EndToEnd @RetrieveClientID @phase2
Scenario:- User wants to create account with unregistered Client ID.
Given user is on the Sign up for MyBanfield screen
When the user is displayed with the section to retrieve Client ID
And the user is displayed with the error message pop up on entering an unregistered Email ID 
And Whoops! 
And That email isnt in our system 
And Forgot your MyBanfield email? 
And the user taps on Forgot your MyBanfield email? CTA to get displayed a pop up with message 
And Need help finding your MyBanfield email? 
And the user on clicking on support hotline number gets redirected to dialer with the phone number pre-filled

##@EndToEnd @RetrieveClientID @phase1
Scenario:- User wants to create account with unregistered Client ID.
Given user is on the notification pop-up screen
When the user click on Skip or Yes CTA 
Then the user should should redirected to the enable location pop-up screen
And the user should be displayed with the following on the pop-up screen
And the user click on Skip CTA to get redirected to Home screen

@EndToEnd @HomeScreen @phase2
Scenario: User wants to verify see faq about covid shop now and Donate
Given user launched the Banfield application
When the user is on Home screen
And User wants to verify Changes - See FAQs about COVID-19 , Add TradeMark in Shop now after Banfield, Add TradeMark in Donate after Banfield Foundation

@EndToEnd @HomeScreen @phase2
Scenario: User wants to login and view visit history from petcard.
Given user launched the Banfield application
When the user is on Home screen
When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
Then the user should be redirected to Pet name visit screen
And the user will be displayed with Documents section with the Invoice CTA 
And the user will tap on Invoice CTA to be redirected to Invoice screen 
And the user will be displayed with Medical Details section with the Medicine, Vaccines, Labs 

@EndToEnd @HomeScreen @phase2
 Scenario: User wants to preferred location module if they have set the preferred location
 Given user launched the Banfield application
 When the user is on Home screen
 And the user should be displayed with the preferred location module if they have set the preferred location.Text Your preferred location,Hospital Name and address,Map icon CTA,Phone CTA,Make an appointment CTA
 
@EndToEnd @HomeScreen @phase2
 Scenario: User wants to preferred location module if they have not set the preferred location
 Given user launched the Banfield application
 When User navigated to Home Screen
 And if the user has no preferred location the user will be displayed with Find a location near you module.Text Your preferred location, Adding a location to your favorites can help make scheduling appointments faster and easier,Find a location near you CTA
 
@EndToEnd @HomeScreen @phase2 
 Scenario: Login and verify the preferred location (Geo Location is off)
 Given user launched the Banfield application
 When the user is on Home screen
 When the user has set a preferred location
 Then the user will be displayed with your preffered location card with preferred location set
 Then the user is displayed with Zero Location
 And the user can tap on Find a nearby location to get redirected to Find a location near you screen 

 @EndToEnd @HomeScreen @phase2 
 Scenario: Login and verify the preferred location (Geo Location is on)
 Given user launched the Banfield application
 When the user is on Home screen
 When User wants to tap on PetCart in Home Screen
 When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
 Then user taps on new patient to go to when and where screen
 Then the user is displayed with miles Location
 
 @EndToEnd @HomeScreen @phase2 
 Scenario: User wants to view the Welcome Screen on Launch
 Given user launched the Banfield application
 Then the user should be displayed with the Welcome Screen
 And the screen should display the Sign in CTAs
 And the screen should display the Make appointment as guest CTAs
 And the screen should display the New Create account CTAs
 And the screen should display the Find a nearby location CTAs
 And the screen should display the Enroll now CTAs
 And the screen should display the Terms of service CTAs
 And the screen should display the Privacy policy CTAs
  
@EndToEnd @Login @phase2 
Scenario:- Existing User wants to log in with email address and password 
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 
And if the user enter correct username and password and click on Log in, user should be successfully log in with the chosen credentials.

@EndToEnd @Login @phase2 
Scenario:- Existing User wants to log in with invalid credentials
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 
And if the user enter incorrect username or password and click on Login CTA
And the user taps on Okay CTA/ X icon to close the pop-up.
And the user taps on Cancel CTA to go back to Welcome screen

@EndToEnd @Login @phase2
Scenario:- Account locked with 10 incorrect credentials and log with another account.
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 
And if the user has more than ten unsuccessful login attempts the user user will be displayed with a pop- up Title Whoops
And the user taps on Okay CTA/ X button to dismiss the pop-up

@EndToEnd @Login @phase2
Scenario: Existing User wants to log in with username and password 
Given user launched the Banfield application
When the user click on Log in CTA 
Then the user should be redirected to login screen 
When the user enters the correct username or email address and password
Then the user should successfully log in

@EndToEnd @Login @phase2
Scenario: Migrated User wants to reset password or retrieve email
Given the user is on Login screen
When the user has entered the email and password the user taps on Log in CTA for migrated flow
Then the user will be displayed with a pop-up with the following
And the Send my reset link CTA will be enabled once the user enters a valid email
And the user will tap on Send my reset link CTA to view a pop-up with following message:- Title Sent
And the user will tap on Open email CTA to open devices default mail for migrated user

@EndToEnd @Login @phase2
Scenario: User wants to reset the password 
Given the user is on Login screen 
When the user clicks on Need Help? CTA 
Then the user should be redirected to Need help with your password? screen 
And the user is displayed with the following on the screen
And Send my reset link CTA is disabled by default 
And the user on entering invalid email should show an inline error message Invalid Email
And the user on entering the email ID in the Email ID should enable the Send my reset link CTA 
And the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up
And user tap on contact support hyperlink to get redirected to native dialer phone call screen 

@EndToEnd @Login @phase2
Scenario:- Verify as logged in user starting from Make appointment as guest (choosing yes option in have we met screen)
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
#Then the user will be redirected to Have we met page
And the user will be displayed with Have you been to a Banfield Pet Hospital before
And If the user choose Yes I have CTA
And the user will be redirected to the login page.
And if the user enter correct username and password and click on Log in, user should be successfully log in with the chosen credentials.

@EndToEnd @MakeAppGuestUserFlow @NewPatient @phase2  
Scenario: Choose nearest banfield from create account and make an appointment as guest.
Given user is on the welcome screen 
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#Just to Cancel Appointment
And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled

@EndToEnd @chatandmore @phase2 
Scenario:- User wants to access the Live chat
Given user launched the Banfield application
When User navigated to Home Screen
And they tap on  Chat from the bottom navigation
When they are displayed with the chat options
Then they are displayed with Live chat option on screen
And they tap on Chat live now CTA to initiate the live chat to get redirected to load URL on browser

@EndToEnd @chatandmore @phase2 
Scenario: NWP user Not enrolled in Optimum Wellness Plans
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
Then the user should be redirected to Chat and more screen
And the user is displayed with OWP widget if they only have exotics pets
And the user should be displayed with the  Optimum Wellness Plans

@EndToEnd @chatandmore @phase2
Scenario: NWP user enrolled in VetChatGo
Given user launched the Banfield application
When the user is on Home screen
Then the user should be redirected to Chat and more screen
And the user should be displayed with the following VetChatGo screen
Then the user click on chat with a vet to get redirected to vetchatgo screen

@EndToEnd @chatandmore @phase2
Scenario: User wants to access the chat screen OWP user(vetchat)
When user login as owp user
Then the user should be redirected to Chat and more screen
And if any of the one pet has valid OWP then Vet Chat widget in chat and more screen is displayed to the user Dogs and Cat
Then the user click on chat with a vet to get redirected to vetchat screen for owp user

@EndToEnd @profile @phase2
Scenario: Update password from profile screen.
Given user launched the Banfield application
When User navigated to Home Screen
When the user is on Hi Username screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user taps on Change password CTA to get redirected to Update your password

@EndToEnd @profile @phase2 
Scenario: User dont want to delete Banfield account Screen from profile screen.
Given user launched the Banfield application
When User navigated to Home Screen
When the user is on Hi Username screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user taps on No Never Mind CTA on the Delete online account Screen and dont want to delete account

@EndToEnd @profile @phase2 @iosCLIENTID
Scenario: User want to delete Banfield account Screen from profile screen.
Given user is on the Complete online profile screen
When the user clicks on Next CTA on the Complete online profile screen
Then the user should be redirected to pop-up screen with the following information:
And the user should be able to tap on Skip CTA to get redirected to next pop-up screen 
Then the user should be able to tap on Skip CTA to get redirected to next to next pop-up screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user cannot edit the Name,Client ID,Email,Mobile,Work and Address
And the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA
And the user wants to Delete account and taps on Yes delete my account CTA

@EndToEnd @profile @phase2 
Scenario: Update profile from profile screen.
Given user launched the Banfield application
When User navigated to Home Screen
When the user is on Hi Username screen
When the user taps on Your profile CTA
Then the user should be redirected to Profile screen
And the user taps on Update profile CTA to get redirected to URL in the browser in logged in state

@EndToEnd @profile @phase2 
Scenario: User wants to hide/unhide pet profile
Given user launched the Banfield application
When the user is on Home screen
When the user tapped on the profile bottom navigation
When the user taps on the Your pets CTA
Then the user should be redirected to My pets screen
And the user should be displayed with the following text
And the user is displayed with the list of pets added by them or hospital system
And the user should be able to turn the toggle button on or off
And the user if turn off the toggle button 
And the user if turn on the toggle button 
And by default the toggle button should be enabled
And the user tap on back button to go back to profile screen.

@EndToEnd @profile @phase2 
Scenario: 32427-Verify that Legal stuff screen.
Given user launched the Banfield application
When the user is on the Legal Stuff Page 
Then the user will be redirected to Hi username screen
And the user will be displayed with the following in Legal stuff Page
And the user can tap  < icon to go back to Hiusername screen

@EndToEnd @profile @phase2 
Scenario: User wants to verify settings screen
Given user launched the Banfield application
When the user is on the My Profile Tab from the bottom Navigation 
When the user clicks on Settings CTA 
Then the user is redirected to Settings Page 
And the user will be displayed with the Log out CTA 
And the user will click on Log out CTA to log out of the app 
And the user will be redirected to login screen on logout

@EndToEnd @profile @phase2 
Scenario: User wants to verify push notification popup
Given user launched the Banfield application
When the user is on the My Profile Tab from the bottom Navigation 
When the user clicks on Settings CTA 
Then the user is redirected to Settings Page 
And the user is displayed with the options to enable or disable the following 

@EndToEnd @profile @phase2
Scenario: User wants to be redirected to Banfield Facebook Page.
Given user launched the Banfield application
When User is on the My Profile page or Legal Stuff Page
And the user is displayed with the social media Links  
When the user clicks on the Facebook CTA

@EndToEnd @profile @phase2
Scenario: User wants to be redirected to Banfield Twitter Page
Given user launched the Banfield application
When User is on the My Profile page or Legal Stuff Page
When the user clicks on the Twitter CTA

@EndToEnd @profile @phase2 
Scenario: User wants to be redirected to Banfield Instagram Page
Given user launched the Banfield application
When User is on the My Profile page or Legal Stuff Page
And the user is displayed with the social media Links  
When the user clicks on the Instagram CTA
 
@EndToEnd @profile @phase2
Scenario: User wants to be redirected to Banfield Youtube Page
Given user launched the Banfield application
When User is on the My Profile page or Legal Stuff Page
And the user is displayed with the social media Links  
When the user clicks on the Youtube CTA

@EndToEnd @Guest_duplicate_Appointment @Illness @phase3 
Scenario: Verify that Duplicate Appointment Alert for guest user flow and click on cancel cta on duplicate popup
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user tapped on Next for illness
And the user taps on the Next CTA to get redirected to when & where Page
Then the user wants to enable Location services for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user taps on the make an appointment CTA
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user tapped on Next for illness
And the user taps on the Next CTA to get the duplicate popup after selecting visit type
Then Verify the Duplicate Popup and click on cancel cta to get redirected to Lets get started screen in prefilled information

@EndToEnd @Guest_duplicate_Appointment @Illness @phase3 
Scenario: Verify that Duplicate Appointment Alert for guest user flow and create additional appointment from duplicate popup
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user tapped on Next for illness
And the user taps on the Next CTA to get redirected to when & where Page
Then the user wants to enable Location services for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user taps on the make an appointment CTA
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
And the user tapped on Next for illness
And the user taps on the Next CTA to get the duplicate popup after selecting visit type
Then Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen
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

@EndToEnd @Guest_duplicate_Appointment @NewPatient @phase3 
Scenario: User wants to make an appointment from help with Client ID screen and create additional appointment from duplicate popup
Given user launched the Banfield application
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
Then User is on reason for visit screen, user select new patient and click on next to navigate to duplicate popup
Then Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen
#Then the Location services is enabled for the Device //This Step Is Not Required
And the user taps on a location to select from the lists
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

@EndToEnd @Guest_duplicate_Appointment @NewPatient @phase3 
Scenario: User wants to make an appointment from help with Client ID screen and click on cancel cta on duplicate popup
Given user launched the Banfield application
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
Given user is on the Sign up for MyBanfield screen 
When they are displayed with the Need more information CTA 
And the user taps on Need more information CTA 
Then the user is redirected to Help with Client IDs screen
And the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met? screen 
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
Then User is on reason for visit screen, user select new patient and click on next to navigate to duplicate popup
Then Verify the Duplicate Popup and click on cancel cta to get redirected to Lets get started screen in prefilled information

@EndToEnd @Guest_duplicate_Appointment @Injury @phase3 
Scenario: User wants to make an appointment from Find a nearby location Screen in Guest User Flow and click on cancel cta on duplicate popup	
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And User should able to redirect to when and where screen
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And User should able to redirect to duplicate popup before getting when and where screen
Then Verify the Duplicate Popup and click on cancel cta to get redirected to Lets get started screen in prefilled information

@EndToEnd @Guest_duplicate_Appointment @Injury @phase3 
Scenario: User wants to make an appointment from Find a nearby location Screen in Guest User Flow and create additional appointment from duplicate popup
Given user launched the Banfield application
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And User should able to redirect to when and where screen
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user should taps on Find a nearby location CTA
Then the user will be redirected to Have we met screen
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
When they are redirected to Whats going on screen
And the Next CTA will be enabled once user will selects the respective tag
And User should able to redirect to duplicate popup before getting when and where screen
Then Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#And the user taps on Done to get redirected to the Welcome Screen
#Just to Cancel Appointment Extra Steps
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled

@EndToEnd @Guest_duplicate_Appointment @NewPatient @phase3 
Scenario: Choose nearest banfield from create account and make an appointment as guest and create additional appointment from duplicate popup
Given user is on the welcome screen 
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
Then User is on reason for visit screen, user select new patient and click on next to navigate to duplicate popup
Then Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
#And the user taps on Done to get redirected to the Welcome Screen
#Just to Cancel Appointment Extra Steps
And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled

@EndToEnd @Guest_duplicate_Appointment @NewPatient @phase3 
Scenario: Choose nearest banfield from create account and make an appointment as guest and click on cancel cta on duplicate popup
Given user is on the welcome screen 
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user is on the when & where page
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen withoutverifytest
When user taps on create an account option 
Then the user should be displayed with the Have we met page
And user taps on No I am new option 
And the user should be displayed with the message on the Modal pop up
Then user click on location popup
And they have the list of locations in the screen
When they tap on a location name/address 
Then they should be redirected to the selected locations detail Find a location near you screen 
And the screen should display the following information 
And the hours of operation should be displayed based on the response from hospital system 
And the user taps on the Make appointment CTA to get redirected to the Make appointment flow
When the user tapped on No, I am New option from the Have we met Screen
When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
Then User is on reason for visit screen, user select new patient and click on next to navigate to duplicate popup
Then Verify the Duplicate Popup and click on cancel cta to get redirected to Lets get started screen in prefilled information

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_vaccination @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Vaccination from home screen preffered location and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to the who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
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

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_vaccination @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Vaccination from home screen preffered location and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then user avoid duplicate popup if displayed
Then the user click on next available if slot is not available for that day
And the users is redirected to the next screen when & where
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to the who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the user is displayed with the native Location Pop up to enable geo-location
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_RoutineVisit @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Routine visit from chat screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
And Used should able to tap on Make Appointment CTA from Chat
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from chat and more

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_RoutineVisit @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for Routine visit from chat screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
And Used should able to tap on Make Appointment CTA from Chat
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
And Used should able to tap on Make Appointment CTA from Chat
Then the user is redirected to Reason for visit screen
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @loggedin_duplicate_Appointment @Injury @phase3  
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for injury from upcoming appointment screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen

@EndToEnd @loggedin_duplicate_Appointment @Injury @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for injury from upcoming appointment screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
And User should able to redirect to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
And User should able to redirect to when and where screen
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Other CTAs as Call, cancel, add to
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Upcoming Appointment Screen

@EndToEnd @loggedin_duplicate_Appointment @Injury @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for injury from upcoming appointment screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
And User should able to redirect to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
Then the user should be redirected to Upcoming appointments screen and click on make an appointment cta
Then the user is redirected to Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
And the user should be able to tap on any option to select a tags
And User should able to redirect to when and where screen
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @loggedin_duplicate_Appointment @Illness @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for illness from highlights screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
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

@EndToEnd @loggedin_duplicate_Appointment @Illness @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for illness from highlights screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to tap on PetCart in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And if the user selects Illness tapping on Next CTA will redirect to Whats going on screen
And user wants to redirected to when & where Page after selecting tag for illness
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_RoutineVisit @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for comprehensive exam from home screen without preffered location and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
Given the user is on Login screen 
When the User should login and landed to home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
And the users is redirected to the next screen when & where
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

@EndToEnd @loggedin_duplicate_Appointment @PreventiveCare_RoutineVisit @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for comprehensive exam from home screen without preffered location and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
Given the user is on Login screen 
When the User should login and landed to home screen
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then user avoid duplicate popup if displayed
And the users is redirected to the next screen when & where
Then the user click on next available if slot is not available for that day
And user should able to select available slots
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user click on Make appointment CTA 
And the user is redirected to Youre all set screen for duplicate popup
When User navigating to who are we scheduling page
Then the user is redirected to Reason for visit screen
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @loggedin_duplicate_Appointment @NewPatient @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for New Patient from Timeline Screen and click on make additional appointment cta on duplicate popup
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen for duplicate popup
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen
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
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from TimeLine pet profile

@EndToEnd @loggedin_duplicate_Appointment @NewPatient @phase3 
Scenario: Verify that Duplicate Appointment Alert for Logged in user flow for New Patient from Timeline Screen and click on edit existing appointment cta on duplicate popup
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
When User wants to tap on PetCart in Home Screen
When the user taps on Timeline Tab
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then user avoid duplicate popup if displayed
And User should be able to choose hospital
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen for duplicate popup
And the user should tap on Make an appointment CTA and navigate to when and where screen
Then User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen
#Just to Cancel Appointment Extra Steps
And the user is displayed with the following information on the appointment card when collapsed
And the user should scroll down to Reschedule and Cancel CTA
Then the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying
And the user can tap on Cancel to get redirected to the Cancel appointment flow
And the user taps on the Close X icon to close pop-up and stay on the same screen

@EndToEnd @NotSureCallaHospitalNear @phase3 
Scenario: User wants to verify Not sure Call a hospital near you text in Reason for visit screen from Guest User Flow.
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

@EndToEnd @NotSureCallaHospitalNear @phase3 
Scenario: User wants to verify Not sure Call a hospital near you text through illness in Whats going on screen from Guest User Flow.
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
  
@EndToEnd @NotSureCallaHospitalNear @phase3 
Scenario: User wants to verify Not sure Call a hospital near you text through injury in Whats going on screen from Guest User Flow.
Given user launched the Banfield application
When User is on the welcome screen
When user taps on the make an appointment CTA
Then User should be displayed with Is this an Emergency popup and click on continue cta to proceed
When the user tapped on No, I am New option from the Have we met Screen
#When the user tapped on Next in the Contact Information Screen 
When the user tapped on Next from the What species is your pet screen
When user tapped on Next from the Tell us about your pet screen
When user selected the Injury option in Reason for visit screen
And the user tapped on Next for injury
Then the user will be redirected to Whats going on screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page

@EndToEnd @NotSureCallaHospitalNear @phase3 
Scenario: User wants to view Not sure Call a hospital near you cta in Reason for visit screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you
Then the user will be redirected to Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you screen

@EndToEnd @NotSureCallaHospitalNear @phase4 
Scenario: User wants to view Not sure Call a hospital near you cta in illness screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
Then the user will be redirected to Whats going on screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page
  
@EndToEnd @NotSureCallaHospitalNear @phase4 
Scenario: User wants to view Not sure Call a hospital near you cta in illness screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you
And User tap on Next CTA for injury and navigate to whats going on screen
Then the user will be redirected to Whats going on screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen
And the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page

@EndToEnd @NotSureCallaHospitalNear @phase4 
Scenario: User should tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled from Reason for visit screen
Given user launched the Banfield application
When the user is on Home screen
And the user is on Reason for visit screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
And the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled
  
@EndToEnd @NotSureCallaHospitalNear @phase4 
Scenario: User should tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled from Whats going on screen
Given user launched the Banfield application
When the user is on Home screen
And the user is on Reason for visit screen
And if the users selects Injury tapping on Next CTA will redirect to Whats going on screen
Then the user will be redirected to Whats going on screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
And the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled

@EndToEnd @DentalPromoText @phase4 
Scenario: User wants to view with the dental promo text in Preventive care screen as Logged in User
Given user launched the Banfield application
When User navigated to Home Screen
And user is able to tap on find a location near you
When the user with OWP or NWP pet selects Preventive care and taps on Next CTA
And And the user will be displayed with message for Dental messaging promo
And the user can tap on Call a hospital near you CTA to get redirected to Find a location near you screen

#Logged in User - Youare All Set Screen
@EndToEnd @LoggedinUserYouareAllSetScreen @Injury @phase4 
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
And the user is redirected to Youre all set screen
And the user wants to view Other CTAs as Call, cancel, add to
##And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
And the user will not be displayed the Notes for the vet if the user has not provided any notes.
#Don't Want to Cancel Appointment
And User should able to see Cancel UI Popups
#| Are you sure you'd like to cancel this appointment? | Yes CTA | No CTA | X icon |
And the user tap on No CTA to get a pop-up message 
#| Text Title: No problem | Text message: No changes have been made. We'll see you soon. | Close (X) icon |
And the user taps on Close icon to dismiss the popup
#Just wanted to Cancel Appointment
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
@EndToEnd @LoggedinUserYouareAllSetScreen @Illness @phase4 
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
And the user is redirected to Youre all set screen
And the user wants to view Other CTAs as Call, cancel, add to
##And the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to
And the user can tap on Reschedule CTA to get redirected on when and where screen with available time slots for that day or Next available date
#Just to Cancel Appointment
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location
  
#Guest User - Youare All Set Screen
@EndToEnd @LoggedinUserYouareAllSetScreen @Illness @phase4 
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
And the user wants to view Other CTAs as Call, cancel, add to
#And the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to
And the user will not be displayed the Notes for the vet if the user has not provided any notes.
And the user taps on Add to calendar CTA to add the appointment to the device calendar
#Just to Cancel Appointment
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled

@EndToEnd @owpBadge @phase3 @runagaintest @Raised_Issue_37680_Dont_Run_Now 
Scenario: User wants to verify Owp Badge on Pet Image in Home Screen, Everything look okay Screen, Youre all set screen
Given user launched the Banfield application
When User navigated to Home Screen
When User wants to see Owp Badge on Pet Image in Home Screen
When User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen
And the user will be displayed Not sure Call a hospital near you at the bottom of the page
When the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit
Then user avoid duplicate popup if displayed
And User should be able to choose hospital as per location
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And the user should see Owp Badge on Pet Image in everything look okay Screen
And the user click on Make appointment CTA 
#And the user is redirected to Youre all set screen
#Just to Cancel Appointment
And the user wants to view Owp Badge on Pet Image in Youre all set screen
And User should able to see Cancel UI Popups
And the user tap on Yes CTA to get a pop-up message
And the user taps on Close icon to dismiss the pop-up
And after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Highlights pet profile

#@EndToEnd @AdoptedPetExam @NewPatient @phase3 All latest records are displaying below
Scenario: User wants to see New patient and Adopted pet exam in Upcoming appointments Screen as Logged in User
When the user is on Home screen
When User navigating to who are we scheduling page
Then the user is redirected to the Reason for visit screen
Then user avoid duplicate popup if displayed
And user on clicking on Next available should see the available doctors
And the user taps on the Next CTA to get redirected to everything look okay Screen
And User tried to created an Appointment as New patient and user tap on Make appointment CTA
And the user click on Make appointment CTA
And the user is redirected to Youre all set screen for duplicate popup
And the user should tap on Upcoming appointments CTA
And the user is displayed with the following information on the appointment card when collapsed
And the user should see New patient and Adopted pet exam

@EndToEnd @recordcenter @phase4 
Scenario: 36246-Verify that Record center module.
Given user launched the Banfield application
When the user is on the Record center Screen
Then they are displayed with the Record center sub module
#Medical summary reports - MVP+ (Will not show for MVP)
#	Visit summaries
#	Exam and outpatient therapy reports
#	Invoice records
#	Lab records
#	Medication history
#	Vaccine history
#	Boarder and groomer records

@EndToEnd @recordcenter @phase4 
Scenario: 36247-Verify the Exam & outpatient therapy reports
Given user launched the Banfield application
When the user is on the Record center Screen for verifying Records
When the user taps on Exam & outpatient therapy reports
Then the user will be displayed with the following on Exam outpatient therapy report
#Exam & outpatient therapy reports | Filter CTA | 
#And the user will be displayed the following for each available record
#Date | Hospital name, state | Appointment Type | Download CTA |
And the user can tap on Download CTA to download the Exam outpatient therapy report
And the user will receive a native success message once the download is completed
	
@EndToEnd @recordcenter @phase4 
Scenario: 36247-Verify the Exam & outpatient therapy reports and tap on given contact details.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Exam & outpatient therapy reports
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap given number to open the device default dialer with phone number pre-filled

@EndToEnd @recordcenter @phase4 
Scenario: 36247-Verify the Exam & outpatient therapy reports and tap on chat live now.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Exam & outpatient therapy reports
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap on Chat live now CTA to get redirected to
#https://home-c14.incontact.com/inContact/ChatClient/index.html
		
@EndToEnd @recordcenter @phase4 
Scenario: 36249-Verify the Invoice records.
Given user launched the Banfield application
When the user is on the Record center Screen for verifying Records
When the user taps on Invoice records
Then the user will be displayed with the following on Invoice records
#Invoices | Filter CTA | List of invoices |
#And the list will display : 
#Date of visit | Hospital name, State | Appointment type | Download CTA |
And the user can tap on Download CTA to download the Invoice records report
And the user will receive a native success message once the download is completed	

@EndToEnd @recordcenter @phase4 
Scenario: 36249-Verify the Invoice records and tap on given contact details.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Invoice records
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap given number to open the device default dialer with phone number pre-filled
	
@EndToEnd @recordcenter @phase4 
Scenario: 36249-Verify the Invoice records and tap on chat live now.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Invoice records
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap on Chat live now CTA to get redirected to
#https://home-c14.incontact.com/inContact/ChatClient/index.html	
	
@EndToEnd @recordcenter @phase3 
Scenario: 36251-Verify the Medication history.
Given user launched the Banfield application
When the user is on the Record center Screen for verifying Records
When the user taps on Medication history
Then the user will be displayed with the following on Medication history
#Medication and prescription history | Filter CTA | Download all CTA |
And the user will be displayed the following on expanding a date
#Date | Medication name and dosage | Doctor name | Hospital name, state |
And the user can tap on download all CTA to download Medication History record
	
@EndToEnd @recordcenter @phase4 
Scenario: 36251-Verify the Medication history and tap on given contact details.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Medication history
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap given number to open the device default dialer with phone number pre-filled	
	
@EndToEnd @recordcenter @phase4 
Scenario: 36251-Verify the Medication history and tap on chat live now.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Medication history
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap on Chat live now CTA to get redirected to
#https://home-c14.incontact.com/inContact/ChatClient/index.html	
	
@EndToEnd @recordcenter @phase4 
Scenario: 36252-Verify the Vaccine history.
Given user launched the Banfield application
When the user is on the Record center Screen for verifying Records
When the user taps on Vaccine history
Then the user will be displayed with the following on Vaccine history
# Vaccine history | Filter CTA | Download all CTA |  
And the user will receive a native success message once the download is completed
And the user will be displayed the following on expanding
#Vaccine name | Doctor name | Hospital name, state |
And the user can tap on Download CTA to download the Vaccine history report

@EndToEnd @recordcenter @phase4 
Scenario: 36252-Verify the Vaccine history and tap on chat live now.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Vaccine history
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap on Chat live now CTA to get redirected to
#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
@EndToEnd @recordcenter @phase4 
Scenario: 36252-Verify the Vaccine history and tap on given contact details.
Given user launched the Banfield application
When the user is on the Record center Screen
When the user taps on Vaccine history
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap given number to open the device default dialer with phone number pre-filled
	
@EndToEnd @recordcenter @phase4 
Scenario: 36248-Verify the Lab records in expanded view.
Given user launched the Banfield application
When the user is on the Record center Screen for verifying Records
When the user taps on the Lab records tab
Then the user displayed will be displayed with the following on Lab records
When the user taps on no_of_test tests CTA
Then the user is displayed with the following on expanding lab records
# "All tests" CTA | Date (Ex. October 5, 2021) | Name of the test | Results | Range | Value | "Load more +" CTA |
And the user can tap on All tests CTA to go back to the list of tests displayed
Then the user displayed will be displayed with the following on Lab records
#Laboratory tests | Filter CTA| Download all CTA | List of all grouped date entries |
And the user can tap on download all CTA to download Lab records

@EndToEnd @recordcenter @phase4 
Scenario: 36248-Verify the Lab records and tap on chat live now.
Given user launched the Banfield application
When the user is on the Record center Screen	
When the user taps on the Lab records tab
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap on Chat live now CTA to get redirected to
#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
@EndToEnd @recordcenter @phase4 
Scenario: 36248-Verify the Lab records and tap on given contact details.
Given user launched the Banfield application
When the user is on the Record center Screen	
When the user taps on the Lab records tab
And if no records are available for that pet, the user is displayed
#Exam & outpatient therapy reports | �Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
And the user can tap given number to open the device default dialer with phone number pre-filled
	
	
############################################### Please Add the Sprint Script's Above This ####################################################
#Temporarily Implemented
@CancelAppo1 @vcg6User
Scenario: User wants to Cancel All Upcoming appointments 1st
Given user launched the Banfield application
When the user is on Home screen
Then the user should be redirected to Upcoming appointments screen
And Cancel users all appointments as a logged in user

#Temporarily Implemented
@CancelAppo @automationUser
Scenario: User wants to Cancel All Upcoming appointments 2nd
Given user launched the Banfield application
When User navigated to Home Screen
Then the user should be redirected to Upcoming appointments screen
And Cancel users all appointments as a logged in user

#Temporarily Implemented
@CancelAppo @parthadeyUser
Scenario: User wants to Cancel All Upcoming appointments 3rd
Given user launched the Banfield application
When user tapped on the Login CTA from the login screen and the user credentials are valid
Then the user should be redirected to Upcoming appointments screen
And Cancel users all appointments as a logged in user