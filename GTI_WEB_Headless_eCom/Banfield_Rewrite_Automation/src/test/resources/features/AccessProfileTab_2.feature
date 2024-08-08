Feature: 32426-Access Profile Tab -2

Background:
Given user launched the Banfield application

@sprint7 @regression @32426 @smoke
Scenario: User wants to view their profile 
When User navigated to Home Screen
When the user taps on the profile from bottom navigation
Then the user should be redirected to Hi User name screen
And the screen should display the following : 
#| Your profile CTA |
#| Your pets CTA |
#| Manage Optimum Wellness Plans� CTA (For OWP) |
#| Contact us CTA |
#| Legal stuff CTA |
#| Settings CTA |
And the user taps on Settings CTA
And the user taps on Manage Optimum Wellness Plans CTA to get redirected to device default browser
#And the browser loads the Manage Optimum Wellness Plans� page with the
#URL: https://www.banfield.com/my-banfield/my-account


@sprint7 @regression @32426 @smoke
Scenario: User wants to view their profile
When user is on the home page
When the user taps on the profile from bottom navigation
Then the user should be redirected to Hi User name screen
And the screen should display Explore Optimum Wellness Plans
#| Explore Optimum Wellness Plans� (For NWP) |
And the user taps on Explore Optimum Wellness Plans CTA to get redirected to device default browser
#And the browser loads the Explore Optimum Wellness Plans� page with the
#URL: https://www.banfield.com/products/optimum-wellness-plan

#Regression - Already covered
#And the user taps on "Contact Us" CTA. Refer #25403 
#And the user taps on "Legal Stuff" CTA. Refer #32427 
#And the user taps on "Settings" CTA. Refer #26358 
#And the user taps on Social media links. Refer #25401 
#And the user should be displayed with Static text: "� 2022 Mars or Affiliates"