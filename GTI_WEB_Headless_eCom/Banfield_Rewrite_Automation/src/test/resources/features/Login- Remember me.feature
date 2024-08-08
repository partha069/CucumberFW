Feature: 26918-Login- Remember me

@26918 @regression @sprint3
Scenario: User wants to remember the password 
Given the user is on Login screen 
When the user click on Remember me check box 
Then the Remember me check box should he highlighted 
When the user successfully logs in
Then the next time the come to the login page
And the checkbox must be pre-selected with email/username and password will be pre-filled.