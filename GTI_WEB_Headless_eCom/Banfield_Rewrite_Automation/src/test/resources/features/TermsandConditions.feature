Feature: 25391-Terms and Conditions screen
 
  @regression @25391 @sprint1
  Scenario: 25391-Verify Terms and Conditions Screen.  
  Given user launched the Banfield application
  When the user is on the Legal Stuff Page
  Then they are displayed with the Terms and Conditions CTA
# And they tap on the Terms and Conditions CTA from the list
# And the browser loads the Terms and Conditions page with the URL "https://www.banfield.com/General/Terms"