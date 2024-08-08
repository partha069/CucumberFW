Feature: 30207-Access Live Chat

  @sprint7 @regression @30207
  Scenario:- User wants to access the Live chat
  Given user launched the Banfield application
  When User navigated to Home Screen
  And they tap on  Chat from the bottom navigation
  When they are displayed with the chat options
  Then they are displayed with Live chat option on screen
  And they tap on Chat live now CTA to initiate the live chat to get redirected to load URL on browser
  #URL: https://home-c14.incontact.com/inContact/ChatClient/ChatClient.aspx?poc=e16f44b0-470c-4929-9878-46cecdb6cb28&bu=4596685