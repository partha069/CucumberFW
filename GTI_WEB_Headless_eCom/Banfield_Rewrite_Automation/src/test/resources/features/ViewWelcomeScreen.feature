Feature: 26193-View Welcome Screen

   @regression @smoke @26193 @sprint1
   Scenario: 26193-User wants to view the Welcome Screen on Launch
   Given user launched the Banfield application
   Then the user should be displayed with the Welcome Screen
   And the screen should display the Sign in CTAs
   And the screen should display the Make appointment as guest CTAs
   And the screen should display the New Create account CTAs
   And the screen should display the Find a nearby location CTAs
   And the screen should display the Enroll now CTAs
   And the screen should display the Terms of service CTAs
   And the screen should display the Privacy policy CTAs

    


