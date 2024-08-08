Feature: 28087-View Pet visit - Invoice

 Background:
 Given user launched the Banfield application
 When the user is on Home screen
 When the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline
 Then the user should be redirected to Pet name visit page
 And the user will be displayed with Documents section with the Invoice CTA 
 When they tap on the invoice CTA from the documents section

@32717 @sprint8 @regression
Scenario:- User wants to view and download the invoice
Then they are redirected to the Invoice screen

@280871 @sprint4 @regression @smoke
Scenario:- User wants to view and download the invoice
And they are displayed with the invoice details for the pet with following
#| Date and Time| Invoice for "Pet name" |Hospital Location| Hospital Name |Hospital address with Phone number| Description | Regular fee |Your fee | Total |
And the user taps on the Share PDF CTA to download/share the invoice (as native to the device).