Feature: 27707-View Your Pets

Background:
Given user launched the Banfield application

@277071  @sprint3 @regression 
Scenario:- User wants to view their pets on the home
When user tapped on the Login CTA from the login page and user credentials are valid
And the screen will display with the text: Please add a pet to your dashboard.

@277071  @sprint3 @regression 
Scenario:- User wants to view their pets on the home
When the user is on Home screen
Then the user is displayed with their pets under Your pets section

@277071  @sprint3 @regression 
Scenario:- User wants to view their pets on the home
#When user tapped on the Login CTA from the login screen and the user credentials are valid
When user is on the home scren
And longer pet names should be displayed with ellipses 

@277071  @sprint3 @regression 
Scenario:- User wants to view their pets on the home
When user tapped on the Login CTA from the login page and user credentials are valid
And the user will not be displayed with deceased pets 

@27707 @sprint3 @regression 
Scenario:- User wants to view their pets on the home
When User Login into app
And each pet card should have the following Pet name,Photo/Icon,Last Visit,Visit Details CTA Clock icon
And the Visit detail should display the last visited date
And the visit detail icon Clock icon will be disabled if there are no visit history for the pet