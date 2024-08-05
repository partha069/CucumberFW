Feature: To verify the Header Components


    Background:
        Given user launches risecannabis "<url>" website
    #And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner


    @Header @webRegression @mobRegression
    Scenario: To verify user should see white color variant global header with RISE Logo and Text
        When User is at the top of the page
        Then User should see white color variant global header with RISE Logo and Text

    @Header @webRegression @mobRegression
    Scenario: To verify user should see stacked green color variant global header with only RISE logo when scrolls down and the color variant should change back to white when scrolls to top again
        When User scrolls downwards
        Then User should see stacked green color variant global header with only RISE logo
    #And The color variant should change back to white and the user goes to top again

    @Header @webRegression @mobRegression
    Scenario: To verify user should see only Minnesota RISE text logo for the white color variant header
        When user clicks the dispensaries option from the global header
        And User clicks on Minnesota from the state list
        And User is at the top of the page
        Then User should see only Minnesota RISE text logo for the white variant

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see only Minnesota RISE text logo stacked green color variant when scrolls down and the color variant should change back to white when scrolls to top again
    #And User scrolls downwards
    #Then User should see stacked green color variant header with only Minnesota  RISE text logo
    #And The color variant should change back to white and the user goes to top again

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should navigated to Sign in form if user is a guest for the white variant header
    #And user can see white variant header by default
    #When user clicks user icon from the white variant header
    #Then user should be able to see the Sign in form

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should navigated to Sign in form if user is a guest for the Green variant header
    #And user scroll down the screen to see the green variant header
    #When user clicks user icon from the Green variant header
    #Then user should be able to see the Sign in form

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should be able to see the My Account Overview Screen if user logged in for the Green variant header
    #And user scroll down the screen to see the green variant header
    #When user clicks user icon from the Green variant header
    #Then user should be able the My Account Overview Screen

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the no. of items indicated on the cart, if user added any item's in the cart
    #When User sees cart item with items
    #Then User should see the no. of items indicated on the cart

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the respective cart icon variant as white header variants, if user added item in cart
    #When User already added some items in cart
    #Then User should see the respective cart icon variant as white header variants

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the respective cart icon variant as green header variants, if user added item in cart and scroll it down to bottom
    #When User already added some items in cart
    #And User scroll it down
    #Then User should see the respective cart icon variant as green header variants

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the respective cart icon variant as white header variants, if user did not any added item in cart
    #When User did not added any item in the cart
    #Then User should see the respective cart icon variant as white header variants

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the respective cart icon variant as green header variants, if user did not added any items in cart and scroll it down to bottom
    #When User already added some items in cart
    #And User scroll it down to bottom.
    #Then User should see the respective cart icon variant as green header variants

    @Header @webRegression @mobRegression
    Scenario: To verify user is redirect to RISE Home Page when clicking on logo in the header
        And user is on any page expect Minnesota dispensary
        When user clicks on the Rise logo from the global header
        Then user should be navigate to the Rise Homepage

    @Header @webRegression @mobRegression
    Scenario: To verify user is redirect to RISE Home Page when clicking on logo in the footer
        And user is on any page expect Minnesota dispensary
        And user scrolls down to the footer section
        When user clicks on the Rise logo from the footer
        Then user should be navigate to the Rise Homepage

    @Header @webRegression @mobRegression
    Scenario: To verify user is redirect to RISE Home Page when clicking on logo in the header
        And user clicks the dispensaries option from the global header
        And User clicks on Minnesota from the state list
        When user is on Minnesota dispensary page
        And user on the global header
        And user clicks on the Rise logo from the global header
        Then user should be navigate to the Rise Homepage

    @Header @webRegression @mobRegression
    Scenario: To verify user should see list of available sub-categories under shop for all states other than Ohio
        When User is on the expanded SHOP menu
        Then User should see list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS
        And User should also see Full RISE logo with RISE logo and text

    @Header @webRegression @mobRegression
    Scenario: To verify user should see the list of available sub-categories for Cannabis insider
        When user is on the expanded Cannabis insider menu
        Then user should be able to view the subcategories like DISPENSARY GUIDES, GET A MEDICAL CARD, STATE LAWS, RECIPES, BLOGS

    @Header @webRegression @mobRegression
    Scenario: To verify user should see the list of available dispensary list while clicking the dispensaries
        When user clicks the dispensaries option from the global header
        Then user should view the list of dispensaries
        And User should see an image in the Desktop

    @Header @webRegression @mobRegression
    Scenario: To verify user should see "Usages" hidden in the list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS for state Ohio
        And user clicks the dispensaries option from the global header
        And User clicks on OHIO from the state list
        And User is on the expanded SHOP menu
        Then User should not see "USAGES" in the list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS
        And User should also see Full RISE logo with RISE logo and text

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should redirect to Geolocated state deals page on clicking Deals
    #When User clicks on DEALS sub category with no further sub-level menus
    #Then User should redirect to Geolocated state deals page

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should redirect to Geolocated Product Listing page on All Products
    #When User clicks on ALL PRODUCTS sub category with no further sub-level menus
    #Then User should redirect to Geolocated Product Listing page

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the list of available locations/ dispensaries under each state, 10 listings in each columns, image beside columns state name with circled back arrow
    #When User clicks on any one of the states
    #Then User should see list of available locations/dispensaries under each state
    #And User should be seeing 10 listings for each column
    #And User should see an image beside the columns in Desktop which is state specific
    #And User should see 'State Name' with circled back arrow to go back or see state list again at any point of time

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should see the list of available locations/ dispensaries under each state and 10 listings in each columns with a horizontal scroll when >=3
    #When User clicks on any one of the states to view list of available locations/dispensaries under each state
    #Then User should be seeing 10 listings for each column
    #And A horizontal scroll should be enabled if the no. of columns become >=3

    #@Header @webRegression @mobRegression
    #Scenario: To verify user should redirected to respective Dispensary/Location page when clicked on any dispensary name
    #When User clicks on any 'Dispensary Name'
    #Then User should be redirected to respective Dispensary/Location page
