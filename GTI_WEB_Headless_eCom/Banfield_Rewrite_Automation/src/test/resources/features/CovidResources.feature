Feature: 25398-Covid Resources screen

  @25398 @sprint1 @regression 
  Scenario: 25398-Verify that Covid Resources Screen.
  Given user launched the Banfield application
	When the user is on the Legal Stuff Page
  And they are displayed with the Covid resources CTA  
	When they tap on the Covid resources CTA from the list
#	Then they are redirected to the device default browser for COVID-19
#	And the browser loads the Covid resources page with the following URL "https://www.banfield.com/General/Covid-resource-center"
      
