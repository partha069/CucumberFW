Feature: 28082 - Highlights - Shareable records

Background:
Given user launched the Banfield application

@28082 @sprint5 @regression @smoke
Scenario: User wants to share records with boarders and groomers
When User navigated to Home Screen
When the user taps on Shareable records module
When the user taps on View records CTA
Then the user should be displayed with Shareable records screen
And the Shareable records screen should display the Petnames boarding and grooming records,Date, Share record CTA
And the user should be able to tap on Share record CTA to share or download the pdf 

@28082 @sprint5 @regression 
Scenario: User wants to share records with boarders and groomers
When User navigated to Home Screen
When the user taps on Shareable records module
When the user taps on View records CTA
And the user is displayed with the following Vaccines, Vaccine name, Last date given, Due date
And the Last date given and Due date format is Mon DD, YYYY Parasite control Category,Medication name with dosage,Last date given,Due date 
And if the Last date given for Vaccinations and Parasite control is null the user is displayed with Never
And if the due date for Vaccinations and Parasite control is null the user is displayed with NA
And the user taps < icon on Shareable records screen to go back to the Highlights screen
And if the response of the Range/Result for parasite control is null it will be displayed empty

@28082 @sprint5 @regression 
Scenario: User wants to share records with boarders and groomers
When User navigated to Home Screen
And If the response is no records/null, the user will not see Shareable records module on Highlights screen
And the shareable records module is only applicable for Dogs

#@28082 @sprint5 @regression @sprint5test @failed1 
#Scenario: Shareable records - Do not give >> Vaccination1@int.com,Banfield!123
#When User Logged in into app Multi Pets
#When the user is on Shareable records screen
#Then the user is displayed with the following Vaccine name - Do not give, Parasite control medication - Do not give 