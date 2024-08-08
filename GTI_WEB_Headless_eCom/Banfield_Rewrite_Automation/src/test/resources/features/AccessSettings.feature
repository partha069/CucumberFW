Feature: 26358-Access Settings

@sprint6 @regression @26358
Scenario: User wants to enable/disable settings 
Given user launched the Banfield application
When the user is on the My Profile Tab from the bottom Navigation 
When the user clicks on Settings CTA 
Then the user is redirected to Settings Page 
And the user is displayed with the options to enable or disable the following 
#| Push notifications | Allow biometrics | Build No | 
And the user will be displayed with the Log out CTA 
And the user will click on Log out CTA to log out of the app 
And the user will be redirected to login screen on logout


#NATC
#And the Biometrics will be enabled if the user opted to enable in login 
#And the Biometrics will be disabled if the user opted not to enable in login
#And the user can enable/disable the toggle options after login
#And the Biometrics option will not be displayed for the devices that does not support biometrics


