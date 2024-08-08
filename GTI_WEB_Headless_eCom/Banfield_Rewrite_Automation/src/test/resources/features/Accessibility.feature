Feature: 25399-Accessibility screen

  @sprint1 @regression @25399
  Scenario: 25399-Verify that Accessibility screen.
	Given user launched the Banfield application
	When the user is on the Legal Stuff Page 
  And they are displayed with the Accessibility CTA
	When they tap on the Accessibility CTA from the list
#	Then they are redirected to the device default browser
#	And the browser loads the Accessibility page with the following URL "https://www.mars.com/accessibility"