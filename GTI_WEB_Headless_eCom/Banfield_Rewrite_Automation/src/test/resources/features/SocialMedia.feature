Feature: 25401-Social Media screen
  Background:
  Given user launched the Banfield application
	When User is on the My Profile page or Legal Stuff Page

  @sprint1 @25401 @regression @smoke
  Scenario: 25401-User wants to be redirected to Banfield Facebook Page.
	And the user is displayed with the social media Links  
	When the user clicks on the Facebook CTA

  @regression @sprint1 @25401 @smoke
  Scenario: User wants to be redirected to Banfield Twitter Page
	When the user clicks on the Twitter CTA

  @regression @sprint1 @25401 @smoke
  Scenario: User wants to be redirected to Banfield Instagram Page
  And the user is displayed with the social media Links  
  When the user clicks on the Instagram CTA
 
  @regression @sprint1 @25401 @smoke
  Scenario: User wants to be redirected to Banfield Youtube Page
  And the user is displayed with the social media Links  
  When the user clicks on the Youtube CTA