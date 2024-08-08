Feature: 35726 Duplicate Appointment Alert - Guest

@35726 @sprint11 @regression 
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



@35726 @sprint11 @regression 
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
And the user taps on Done to get redirected to the Welcome Screen 

@35726 @sprint11 @regression 
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
Then the Location services is enabled for the Device
And the user taps on a location to select from the list
And the user is redirected to the next screen when & where
When user tapped on Next CTA in when & where screen
Then they are redirected to the Everything look okay Screen
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen

@35726 @sprint11 @regression 
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


@35726 @sprint11 @regression 
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


@35726 @sprint11 @regression 
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
And the user taps on Done to get redirected to the Welcome Screen

@35726 @sprint11 @regression 
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
And the user click on Make appointment CTA 
Then the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,Name of the user who booked the appointment, Phone number of the user, Email of the user 
And the user taps on Done to get redirected to the Welcome Screen

@35726 @sprint11 @regression 
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