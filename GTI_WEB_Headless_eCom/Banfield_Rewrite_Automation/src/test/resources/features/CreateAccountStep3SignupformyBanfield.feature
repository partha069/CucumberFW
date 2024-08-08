Feature: 26908- Create Account- Step 3: Sign up for MyBanfield

Background:
Given user is on the Sign up for MyBanfield screen 
When the user enters valid client Id and click on Next CTA 

@32716 @regression @sprint8 
Scenario:- User wants to verify their identity 
And User wants to verify UI for Sign up for MyBanfield screen

@26908 @regression @sprint2 
Scenario:- User wants to verify their identity 
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things:
And the Next CTA is by default in disabled state 
And selecting pet name, entering phone number and zip code is mandatory field 
And the user cannot type more than ten digits in the Phone number field 
And the user on entering nine digits or less in the phone number is displayed with an error message:  Invalid phone
And the user cannot type more than five digits in the Zip code field 
And the user on entering four digits or less is displayed with an error message:  Invalid zip code 
And the user will see a pop-up when the two out of three questions are incorrect Title: Whoops! Text:  Thats not right. Check your info and try again. Need help? call our support hotline at 877-656-7146(hyperlink)
#And the user after three incorrect attempts will be locked out and will see a pop-up Title: Whoops! Text: Your account has been locked for suspicious activity. Please call support at 877-656-7146| Okay CTA|"
And the user tap on Okay CTA to get redirected to the welcome screen.

@26908 @regression @sprint2 
Scenario:- User wants to verify their identity 
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things:
And the Next CTA is by default in disabled state 
And selecting pet name, entering phone number and zip code is mandatory field 
And Next CTA is enabled by entering all the mandatory fields 

@26908 @regression @sprint2 
Scenario:- User wants to verify their identity 
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things:
And the Next CTA is by default in disabled state 
And selecting pet name, entering phone number and zip code is mandatory field 
And the user taps on < on welcome to My Banfield Screen to get redirected to the previous screen Sign up for MyBanfield

@26908 @regression @sprint2 
Scenario:- User wants to verify their identity 
Then the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things:
And the Next CTA is by default in disabled state 
And selecting pet name, entering phone number and zip code is mandatory field 
And the user taps on X on welcome to My Banfield Screen to get redirected to the Welcome Screen