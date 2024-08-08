Feature: 28436-View Chat Screen

  Background:
  Given user launched the Banfield application

  #VC
  @regression @sprint7 @28436
  Scenario: User wants to access the  vet chat screen OWP user
  When user login as owp user
  Then the user should be redirected to Chat and more screen
  And if any of the one pet has valid OWP then Vet Chat widget is displayed to the user Dogs and Cat
  And the user should be displayed with the Vet Chat
  #| Text: Vet Chat | As an OWP member, you have access to veterinary advice for 24_7 peace of mind.  | "Chat with a vet" CTA | 
  #| Text: Live chat | Our customer care team are here to answer your questions and help you manage your account and plans.  | "Chat live now" CTA |
  #| Text: Need to visit? | Make an appointment at a nearby location today. | "Make an appointment" CTA |
  And the user taps on Make an appointment CTA to get redirected to Who are we scheduling
  
  #OWP
  @regression @sprint7 @28436  
  Scenario: NWP user Not enrolled in VetChatGo
  When user tapped on the Login CTA from the login screen and the user credentials are valid
  #When User navigated to Home Screen
  Then the user should be redirected to Chat and more screen
  And the user is displayed with OWP widget if they only have exotics pets
  And the user should be displayed with the  Optimum Wellness Plans
  #| Text: Optimum Wellness Plans | Keep your pet happy and healthy with affordable, preventive petcare packages! | "Start enrollment now" CTA |
  #| Text: Live chat   Our customer care team are here to answer your questions and help you manage your account and plans.  | "Chat live now" CTA |
  #| Text: Need to visit?   Make an appointment at a nearby location today.  | "Make an appointment" CTA |
  And the user taps on Make an appointment CTA to get redirected to Who are we scheduling
  
  #OWP
  @regression @sprint7 @28436
  Scenario: NWP user Not enrolled in VetChatGo
  When user tapped on the Login CTA from the login screen and the user credentials are valid
  Then the user should be redirected to Chat and more screen
  And the user taps on Start enrollment now to get redirected to wellnessplans rnroll website
  #"shop.banfield.com/banfield-wellnessplans/enroll"
 
  #VCGO
  @regression @sprint7 @28436
  Scenario: NWP user enrolled in VetChatGo
  When the user is on Home screen
  Then the user should be redirected to Chat and more screen
  And the user should be displayed with the following VetChatGo
  #|Text: VetChatGo™ | Get the answers you need from a vet, 24/7. | Chat with a vet |
  #| Text: Live chat   Our customer care team are here to answer your questions and help you manage your account and plans.  | "Chat live now" CTA |
  #| Text: Need to visit?   Make an appointment at a nearby location today.  | "Make an appointment" CTA |
  And the user taps on Make an appointment CTA to get redirected to Who are we scheduling
  
  @regression @sprint7 @28436  
  Scenario: NWP user enrolled in VetChatGo to go to conversation screen
  When the user is on Home screen
  Then the user should be redirected to Chat and more screen
	And the user should be displayed with the following VetChatGo screen
	Then the user click on chat with a vet to get redirected to vetchatgo screen
  
    @regression @sprint7 @28436 
  Scenario: User wants to access the  vet chat screen OWP user
  When user login as owp user
  Then the user should be redirected to Chat and more screen
  And if any of the one pet has valid OWP then Vet Chat widget in chat and more screen is displayed to the user Dogs and Cat
	Then the user click on chat with a vet to get redirected to vetchat screen for owp user
