Feature: Record Center Module

  #Sprint 12

  @36246 @sprint12 @regression
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

	@36247 @sprint12 @regression 
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

	@36247 @sprint12 @regression 
  Scenario: 36247-Verify the Exam & outpatient therapy reports and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled

	@36247 @sprint12 @regression 
  Scenario: 36247-Verify the Exam & outpatient therapy reports and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36249 @sprint12 @regression 
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
	
	@36249 @sprint12 @regression 
  Scenario: 36249-Verify the Invoice records and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled
	
	@36249 @sprint12 @regression 
  Scenario: 36249-Verify the Invoice records and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36251 @sprint12 @regression 
  Scenario: 36251-Verify the Medication history.
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on Medication history
	Then the user will be displayed with the following on Medication history
	#Medication and prescription history | Filter CTA | Download all CTA |
	And the user can tap on download all CTA to download Medication History record
	And the user will be displayed the following on expanding a date
	#Date | Medication name and dosage | Doctor name | Hospital name, state |
	
	@36251 @sprint12 @regression 
  Scenario: 36251-Verify the Medication history and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled
	
	@36251 @sprint12 @regression 
  Scenario: 36251-Verify the Medication history and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36252 @sprint12 @regression 
  Scenario: 36252-Verify the Vaccine history.
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on Vaccine history
	Then the user will be displayed with the following on Vaccine history
	# Vaccine history | Filter CTA | Download all CTA |  
	And the user can tap on Download CTA to download the Vaccine history report
	And the user will receive a native success message once the download is completed
	And the user will be displayed the following on expanding
	#Vaccine name | Doctor name | Hospital name, state |

	@36252 @sprint12 @regression 
  Scenario: 36252-Verify the Vaccine history and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36252 @sprint12 @regression 
  Scenario: 36252-Verify the Vaccine history and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled

	@36248 @sprint12 @regression 
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

	@36248 @sprint12 @regression 
  Scenario: 36248-Verify the Lab records and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36248 @sprint12 @regression 
  Scenario: 36248-Verify the Lab records and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled
	
	#==================================================================================================================================================
	
	#Sprint 13
	
	
	@36626 @sprint13 @regression 
  Scenario: 36626-Verify the Visit Summary and tap on chat live now.
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Visit Summary tab
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap on Chat live now CTA to get redirected to
	#https://home-c14.incontact.com/inContact/ChatClient/index.html
	
	@36626 @sprint13 @regression 
  Scenario: 36626-Verify the Visit Summary and tap on given contact details.
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Visit Summary tab
	And if no records are available for that pet, the user is displayed
	#Exam & outpatient therapy reports | “Nothing on file - Is this an error? Please contact us at 877-656-7146 or Chat live now | 
	And the user can tap given number to open the device default dialer with phone number pre-filled
	
	@36248 @sprint13 @regression 
  Scenario: 36626-Verify the Visit Summary in expanded view.
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on the Visit Summary tab
	Then the user displayed will be displayed with the following on Visit Summary
	#| Visit summaries| Filter CTA | | Date | Hospital name, state | Appointment Type | View icon | 
	And the user can tap on the View icon to open a modal display the following about Visit summary
	#| 'Visit details' | Appointment Reason | Doctor name | 'Date and time' | 'Location' |
	And the user will be displayed with Medical Details section with following 
	#| Medications | Vaccines | Lab results |
	And the user will be displayed with No medications if they did not have any medicines administered and the user will be displayed with Medicine name if administered
	And the user will be displayed with No vaccines if they did not have any vaccines administered and the user will be displayed with Name of vaccine if administered
	And the user will be displayed with No labs if they do not have any labs and the user will be displayed with following if lab records are present
	# | Lab name | Lab results | Lab range |
	
	@37249 @sprint13 @regression @filt
  Scenario: 37249-Verify the Filter screen on the Medication history screen and tap on apply filter
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen 
	And on the Filter screen user is displayed with the following for Medication history
	#| Filter by | 'Clear all' CTA |'Medication name' accordion | 'Date range' accordion|  'Location' accordion | 'Apply filters' CTA | 'Cancel' CTA | 
	And the user can tap on Apply filters to get redirected to the Medication history list view with the selected filters applied
	
	@37249 @sprint13 @regression 
  Scenario: 37249-Verify the Filter screen on the Medication history screen and tap on cancel
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Cancel CTA to to get redirected to the Medication history list view screen without the applied filters
	
	
	@37249 @sprint13 @regression 
  Scenario: 37249-Verify the Filter screen on the Medication history screen and tap on Clear all CTA
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Clear all CTA to clear all the selected choices on the filter screen
	And on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA 
	
	@37249 @sprint13 @regression 
  Scenario: 37249-Verify the Filter screen on the Medication history screen and verify Medication name accordion
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with the Medication name accordion with search bar
	And by default the search bar will have placeholder text Search and the search icon
	And by default user will see the Medication name and dosage in the search list below the search bar
	And the user can tap on the Medication name and dosage from the list to select it
	And the Medication name and dosage will be highlighted on tap
	And the user can deselect the Medication name and dosage by tapping again
	And the user can select more than one Medication name and dosage
	And the user can tap on the Search bar to type the keywords 
	And the close icon will appear in the search bar as the user type the keywords
	And based on the keywords typed in the search bar, the search result from the list will be filtered
	And the user can tap on the close icon to clear the text in the search bar
	And the search result and search bar will be reset again on tap of close icon
	
	@37249 @sprint13 @regression 
  Scenario: 37249-Verify the Filter screen on the Medication history screen and verify Date range accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen  
	And the user in displayed with the Date range accordion 
	And the dates are grouped by year
	And the user will be displayed the number of visits (highlighted in orange) in parenthesis Ex. 2021 (44)
	And the user can select/deselect a checkbox on tap
	And checkbox and year will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37249 @sprint13 @regression 
  Scenario: 37249-Verify the Filter screen on the Medication history screen and verify Location accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Medication history
	Given the user is on Medication history screen
	When the user taps on Filter CTA on Medication history screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with Location accordion
	And the user will be displayed with location checkboxes of the visit for that particular pet only [Ex: Hospital name, state [Burlingame, OR]
	And by default none of the checkbox will be selected
	And the user can select/deselect a checkbox on tap
	And checkbox & location (Ex: Hospital name, state) will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	
	@37250 @sprint13 @regression 
  Scenario: 37250-Verify the Filter screen on the Vaccine history screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen 
	And on the Filter screen user is dis1`played with the following for Vaccine history
	#| Filter by | 'Clear all' CTA| 'Vaccine name' accordion | 'Date range' accordion | 'Location' accordion | 'Apply filters' CTA | 'Cancel' CTA |
	And the user can tap on Apply filters to get redirected to the Vaccine history list view with the selected filters applied
	
	@37250 @sprint13 @regression 
  Scenario: 37250-Verify the Filter screen on the Vaccine history screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Cancel CTA to to get redirected to the Vaccine history list view screen without the applied filters
	
	
	@37250 @sprint13 @regression 
  Scenario: 37250-Verify the Filter screen on the Vaccine history screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Clear all CTA to clear all the selected choices on the filter screen
	And on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA 
	
	@37250 @sprint13 @regression @filter
  Scenario: 37250-Verify the Filter screen on the Vaccine history screen and verify Vaccine name accordion
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with the Vaccine name accordion 
	And by default the search bar will have placeholder text Search and the search icon
	And user will be displayed with the vaccine names in the search list below the search bar
	And the user can tap on the vaccine name from the list to select it
	And the vaccine name will be highlighted on selection
	And the user can deselect the vaccine name by tapping again
	And the user can select more than one vaccines from the list
	And the user can tap in the Search bar to enter keywords 
	And the search results will be filtered based on the keywords entered in the search bar
	And the user can tap on the close icon to clear the text in the search bar
	And the user can tap on the close icon to reset the search result and keywords in the search bar will be reset again on tap of close icon
	
	@37250 @sprint13 @regression 
  Scenario: 37250-Verify the Filter screen on the vaccine history screen and verify Date range accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen  
	And the user in displayed with the Date range accordion 
	And the dates are grouped by year
	And the user will be displayed the number of visits (highlighted in orange) in parenthesis Ex. 2021 (44)
	And the user can select/deselect a checkbox on tap
	And checkbox and year will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37250 @sprint13 @regression 
  Scenario: 37250-Verify the Filter screen on the vaccine history screen and verify Location accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Vaccine history
	Given the user is on Vaccine history screen
	When the user taps on Filter CTA on Vaccine history screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with Location accordion
	And the user will be displayed with location checkboxes of the visit for that particular pet only [Ex: Hospital name, state [Burlingame, OR]
	And by default none of the checkbox will be selected
	And the user can select/deselect a checkbox on tap
	And checkbox & location (Ex: Hospital name, state) will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen 
	And on the Filter screen user is displayed with the following for on Exam & OTR screen
	#| Filter by | 'Clear all' CTA| 'Date range' accordion |'Location' accordion | 'Visit type' accordion | 'Apply filters' CTA | 'Cancel' CTA |
	And the user can tap on Apply filters to get redirected to the on Exam & OTR screen list view with the selected filters applied
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Cancel CTA to to get redirected to the on Exam & OTR screen list view screen without the applied filters
	
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Clear all CTA to clear all the selected choices on the filter screen
	And on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA 
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen and verify Visit type accordion
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with the Visit type accordion 
	And the checkboxes are displayed based on the appointment type in existing Exam and outpatient therapy reports list
	And  none of the checkbox will be selected by default
	And the user can select/deselect a checkbox on tap
	And checkbox and appointment type will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen and verify Date range accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen  
	And the user in displayed with the Date range accordion 
	And the dates are grouped by year
	And the user will be displayed the number of visits (highlighted in orange) in parenthesis Ex. 2021 (44)
	And the user can select/deselect a checkbox on tap
	And checkbox and year will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37322 @sprint13 @regression 
  Scenario: 37322-Verify the Filter screen on the Exam & OTR screen and verify Location accordion 
	Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Exam & outpatient therapy reports
	Given the user is on Exam & OTR screen
	When the user taps on Filter CTA on Exam & OTR screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with Location accordion
	And the user will be displayed with location checkboxes of the visit for that particular pet only [Ex: Hospital name, state [Burlingame, OR]
	And by default none of the checkbox will be selected
	And the user can select/deselect a checkbox on tap
	And checkbox & location (Ex: Hospital name, state) will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes


	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen
	Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen 
	And on the Filter screen user is displayed with the following for Invoice records
	#| Filter by | 'Clear all' CTA| 'Date range' accordion |'Location' accordion | 'Visit type' accordion | 'Apply filters' CTA | 'Cancel' CTA |
	And the user can tap on Apply filters to get redirected to the Invoice records list view with the selected filters applied
	
	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Cancel CTA to to get redirected to the Invoice records list view screen without the applied filters
	
	
	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Clear all CTA to clear all the selected choices on the filter screen
	And on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA 
	
	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen and verify Visit type accordion
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with the Visit type accordion 
	And the checkboxes are displayed based on the appointment type in existing Invoices
	And none of the checkbox will be selected by default
	And the user can select/deselect a checkbox on tap
	And checkbox and appointment type will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen and verify Date range accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen  
	And the user in displayed with the Date range accordion 
	And the dates are grouped by year
	And the user will be displayed the number of visits (highlighted in orange) in parenthesis Ex. 2021 (44)
	And the user can select/deselect a checkbox on tap
	And checkbox and year will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@36691 @sprint13 @regression 
  Scenario: 36691-Verify the Filter screen on the Invoice records screen and verify Location accordion 
	Given user launched the Banfield application
	When the user is on the Record center Screen
	When the user taps on Invoice records
	Given the user is on Invoice records screen
	When the user taps on Filter CTA on Invoice records screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with Location accordion
	And the user will be displayed with location checkboxes of the visit for that particular pet only [Ex: Hospital name, state [Burlingame, OR]
	And by default none of the checkbox will be selected
	And the user can select/deselect a checkbox on tap
	And checkbox & location (Ex: Hospital name, state) will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes	
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen 
	And on the Filter screen user is displayed with the following for Lab records
	#| Filter by | 'Clear all' CTA| 'Test name' accordion |'Date range' accordion | 'Result' accordion | 'Apply filters' CTA | 'Cancel' CTA |
	And the user can tap on Apply filters to get redirected to the Lab records list view with the selected filters applied
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Cancel CTA to to get redirected to the Lab records list view screen without the applied filters
	
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen 
	And the user can tap on Clear all CTA to clear all the selected choices on the filter screen
	And on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA 
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen and verify Test name accordion
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen 
	And the user is displayed with the Test name accordion with search bar 
	And by default the search bar will have placeholder text Search and the search icon
	And by default, the user will see the labs in the search list below the search bar
	And the user can tap on any lab from the list to select it
	And the lab will be highlighted on selection
	And the user can deselect the lab by tapping again
	And the user can select more than one lab  
	And the user can tap on the Search bar to type the keywords 
	And the close icon will appear in the search bar as the user type the keywords
	And based on the keywords typed in the search bar, the search result will be filtered
	And the user can tap on the close icon to clear the text in the search bar
	And the search result and search bar will be reset on tap of close icon
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen and verify Date range accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen  
	And the user in displayed with the Date range accordion 
	And the dates are grouped by year
	And the user will be displayed the number of visits (highlighted in orange) in parenthesis Ex. 2021 (44)
	And the user can select/deselect a checkbox on tap
	And checkbox and year will be highlighted in orange color on the selection 
	And the user can select multiple checkboxes
	
	@37231 @sprint13 @regression 
  Scenario: 37231-Verify the Filter screen on the Lab records screen and verify Result accordion 
  Given user launched the Banfield application
	When the user is on the Record center Screen	
	When the user taps on the Lab records tab
	Given the user is on Lab records screen
	When the user taps on Filter CTA on Lab records screen
	Then the user is displayed with the Filter screen  
	And the user is displayed with Result accordion
	And the user will be displayed with result checkboxes (Ex: Normal, Unknown, Positive, Negative)
	And the user will be displayed the number of labs (highlighted in orange) in that category in parenthesis next to the result categories ; Ex.  Normal (2)
	
	
	
	#Sprint 14
	
	
	@37421 @sprint14 @regression 
	Scenario: 37421-Verify the Filter for visit summaries and verify Result accordion 
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And User is on the Filter screen user is displayed with the UI elements
  #| Filter by | 'Clear all' CTA| 'Date range' accordion |'Location' accordion | 'Visit type' accordion | 'Apply filters' CTA | 'Cancel' CTA |
  #And the user can tap on Apply filters to get redirected to the Visit summaries list view with the selected filters applied with View all CTA
  #And the user can tap on 'Cancel' CTA to to get redirected to the Visit summaries list view screen without the applied filters
	#And the user tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTAs
	
	#@37421 @sprint14 @regression 
	Scenario: 37421-User wants to verify Date range accordion and accordion
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And the user is displayed with the Date range accordion
  #Pending - 43456
	
	
	
	
	@36250 @sprint14 @regression 
	Scenario: 36250-User wants to verify Date range accordion and accordion
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And the user is displayed with the Boarder & groomer records UI
	#| 'Boarder & groomer records' | Download CTA | 'Vaccine history' accordion | 'Parasite control' accordion | 'Parasite tests' accordion |
	And the user can tap on the Download CTA to download the record
	
	@36250 @sprint14 @regression 
	Scenario: 36250-User wants to verify accordions will be in an expanded and collapse accordion
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And the accordions will be in an expanded state by default and vaccine history
  
  @36250 @sprint14 @regression 
	Scenario: 36250-User wants to verify expand and collapse for parasite control and history
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And the user verifies accordions expand and collapse for parasite control and history
  
  @36250 @sprint14 @regression 
	Scenario: 36250-User wants to verify expand and collapse for parasite tests and history
  Given user launched the Banfield application
  And the user navigate into the Record center Screen
  And the user verifies accordions expand and collapse for parasite tests and history
  
  
  
	#Sprint 15
	
	@37885 @sprint15 @regression 
  Scenario: 37885-Verify the Visit Summary and Download functionality
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	When the user taps on the Visit Summary tab
	Then the user will be displayed with the Visit Summary Screen
	#| Visit summaries| Filter CTA | Download CTA |
	And the user can tap on Download CTA to download the record and user will receive a native tossed success message
	
	@37328 @sprint15 @regression 
  Scenario: 37328-Verify the Download functionality for Exam & OTR
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	And the user taps on the Exam and Outpatient tab
	When the user taps on the download CTA Exam & outpatient therapy reports and able to able to download the OTR record
	
	@37328 @sprint15 @regression 
  Scenario: 37328-Verify the Download functionality for Invoice
  Given user launched the Banfield application
	When the user is on the Record center Screen for verifying Records
	And the user taps on the Invoice tab
	Then the user taps on the download CTA from Invoice records and able to download the invoice
	
	
	