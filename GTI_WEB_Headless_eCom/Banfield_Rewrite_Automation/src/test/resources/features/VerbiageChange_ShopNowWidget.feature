Feature: 31266-Verbiage Change - Shop Now Widget

@sprint6 @regression @31266
Scenario: Verbiage Change - Shop Now Widget 
Given user launched the Banfield application
When User Log in with valid Credential and displays Home Screen
When the user is displayed with the Shop Banfield Widget
Then the user is displayed with the ShopBanfield 
#| Shop Banfield | "Your one-stop shop for medications." | 'Shop now' CTA |
#And the user taps on 'Shop now' to get redirected to URL:- https://shop.banfield.com/