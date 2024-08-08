Feature: 32427-Access Legal stuff Tab

  @sprint7 @regression @32427 @smoke
  Scenario: 32427-Verify that Accessibility screen.
  Given user launched the Banfield application
	When the user is on the Legal Stuff Page 
  Then the user will be redirected to Hi username screen
  And the user will be displayed with the following in Legal stuff Page
  And the user can tap  < icon to go back to Hiusername screen