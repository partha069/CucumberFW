Feature: 28142 - Highlights - Dental Exam

Background:
Given user launched the Banfield application

#NWP > Manage Plan >> No Date
@28142 @sprint5 @regression @smoke
Scenario: User wants to view the Dental Exam section and its details
When user login as owp user
When user is on the Highlights Tab
When they tap on the Dental exam accordion to expand
Then they will be displayed with the following information For OWP member 
#| Dental Exam | Status indicator | Dynamic Text: Next exam due Mon DD, YYYY, (Ex, Aug 3, 2021or Aug 23, 2021)| OWP icon | Text: Optimum Wellness Plans�  For the pet you love | Manage plan CTA |
And the user taps on Manage plan CTA to get redirected to URL in the browser in the logged in state
#URL: https://www.banfield.com/my-banfield/my-account

#OWP > Enroll Now >> No Date
@28142 @sprint5 @regression @smoke
Scenario: NWP User wants to view the Dental Exam section and its details
When User navigated to Home Screen
And the user will be displayed with the following information For NWP member
#|Dental exam | Status indicator | Dynamic Text: Next exam due Aug 3, 2021 or Aug 23, 2021 | OWP icon | Text: Optimum Wellness Plans� For the pet you love | Enroll now CTA |
And the user taps on Enroll now CTA to get redirected to URL in the browser
# URL: https://shop.banfield.com/banfield-wellness-plans/enroll

#NWP > Manage Plan >> No Date
@28142 @sprint5 @regression
Scenario: User wants to view the Dental Exam section and its details
#When User navigated to Home Screen
#When user is on the Highlights Tab screen
When user login as owp user
When user is on the Highlights Tab
When User tap on the Dental exam accordion to expand
And the user can expand/collapse the accordion on tap
And for an OWP user, with status indicator as gray the accordion will expand on tap and the user will be displayed with Manage plan promo with Text: For the pet you love and the Next exam due will not be displayed.

#NWP > Enroll Now >> No Date
@28142 @sprint5 @regression
Scenario: NWP User wants to view the Dental Exam section and its details
When User navigated to Home Screen
When user is on the Highlights Tab screen
And for a NWP user, with status indicator as gray nothing on file the accordion will expand and the user will be displayed with 'Enroll now' promo and 'Next exam due' will not be displayed.

#NWP > Enroll Now >> No Date
@28142 @sprint5 @regression
Scenario: NWP User wants to view the Dental Exam section and its details
When User navigated to Home Screen
When user is on the Highlights Tab screen
And for a NWP user new pet, with status indicator as gray nothing on file and no visit history, the accordion will expand and the user is displayed with Enroll now promo and Next exam due will not be displayed.