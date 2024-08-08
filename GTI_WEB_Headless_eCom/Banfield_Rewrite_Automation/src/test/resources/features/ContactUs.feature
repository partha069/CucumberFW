Feature: 25403-Contact Us screen

   @regression @25403 @sprint1 @smoke
   Scenario: 25403-User wants to see the Contact us page
   Given user launched the Banfield application
   When the user is on the My Profile Tab from the bottom Navigation
   When they are displayed with the Contact Us CTA
   And they tap on the contact us CTA from the list
#  Then they redirected to the device default browser for Contact Us
#  And the browser loads Banfield's Contact us page with the following URL "https://www.banfield.com/about-banfield/Contact-us"