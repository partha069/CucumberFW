 Feature: 25400-About Mars screen

  @25400 @sprint1 @regression @smoke @parthaTest
  Scenario: 25400-Verify that About Mars screen.
  Given user launched the Banfield application
	When the user is on the Legal Stuff Page
  And they are displayed with the About Mars CTA
	And they tap on the About Mars CTA from the list
# Then they redirected to the device default browser for About Mars
# And the browser loads Mars website with the following URL "https://www.mars.com/"
  
  @access
  Scenario: 25400-Verify that About Mars screen.
  And they are displayed with the About Mars CTA


 

