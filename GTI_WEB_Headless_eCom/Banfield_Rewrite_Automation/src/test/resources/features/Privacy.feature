Feature: 25392-Privacy screen

  @regression @sprint1 @25392
  Scenario: 25392-Verify that Privacy screen.
  Given user launched the Banfield application
	When the user is on the Legal Stuff Page
	And they are displayed with the Privacy policy CTA  
	When they tap on the Privacy policy CTA from the list
#	Then they are redirected to the device default browser
#	And the browser loads the Privacy policy page with the following URL "https://www.mars.com/privacy"