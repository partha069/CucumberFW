@feature
Feature: As a user, I should be able to see Deals page which helps me know important deals and state discounts accordingly
Background:
        Given user launches risecannabis "<url>" website
#        And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
        And user clicks Shop menu on global header
    @webRegression @mobRegression
    Scenario: To verify user is able to navigate to the State deal page on clicking on the Deals on the expanded navigation
        When user is on the expanded navigation
        And user clicks on the Deals option
        Then user should navigate to the respective Deals Page
#    @webRegression @mobRegression
#    Scenario: To verify that User should be able to see appropriate breadcrumb
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        Then User should be able to see appropriate breadcrumb 'Home > Dispensaries deal > state deal
#    @webRegression @mobRegression
#    Scenario: To verify that User should able to redirect to Dispensaries page on clicking Dispensaries in breadcrumb on deal Page
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User clicks on Dispensaries in Breadcrumb
#        Then User should be able to redirect to Dispensaries page
#    @webRegression @mobRegression
#    Scenario: To verify that User should able to redirected to Home Page on clicking Home icon in breadcrumb on deal Page
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User clicks on Homepage icon in Breadcrumb
#        Then User should be Then User should able to redirect to Homepage
    @webRegression @mobRegression @smoke
    Scenario: To verify user is able to see Hero Content at the top of the page below global header
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        Then user is able to see the Hero Content at the top of the page under global header
        And user should able to see the State dispensary deal information
    @webRegression @mobRegression-2 @smoke
    Scenario: To verify that user is able to view Title Text, Copy Text and Image
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        Then user should able to view the Title Text
        And user should able to view the Copy Text
#        And user should able view the image
    @webRegression @mobRegression-2 @smoke
    Scenario: To verify user should see a Title Text with 1 or 2 lines, when once user is on banner variant C
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner variant C
        Then User should see a Title Text with 1 or 2 lines
        Then User should see a Copy text with 1 or 2 lines
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant C
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner variant C
        Then User should click on CTA on Banner Image
#        And User should see link is open in same tab
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant C
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner variant C
        Then User should click on CTA on Banner Image
#        And User should see link is open in new tab
    @webRegression @mobRegression
    Scenario: To verify user should see a background image in the banner along with background color, when once user is on banner variant C
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner variant C
        And User should click on CTA on Banner Image
        Then User should see a background image in the banner along with background color
    @webRegression @mobRegression
    Scenario: To verify user should see a Logo image on top of the banner, when once user is on banner variant C
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner variant C
        Then User should see a Logo image on top of the banner
    @webRegression @mobRegression
    Scenario: To verify user should be able to view  the heading 'Deals' and see the first 4 deal cards in a row in desktop 1 cards in a row in Mobile
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to Deal section
        Then user should be able to view the Deals header
        And user should be able to view the first 4 deal cards in a row in the section
        And user should be able to view the number of products shown and the total
        And user should be able to see  'Show more' CTA
#        And user should be able to see maximum of 20 cards is displayed
    @webRegression @mobRegression
    Scenario: To verify user should able to see all deal cards when user scroll vertically
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to Deal section
        Then user should able to see all the deal cards
    @webRegression @mobRegression-2 @smoke
    Scenario: To verify user should able to see an image in the card along with background color , see deal type text , see deal card title & description in the card
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to Deal section
        Then user should able to view the image in the card along with background color
#        And user should able to view the deal label
        And user should able to view the deal type text
        And user should able to view the deal card title
        And user should able to view the description in 1 or 2 lines
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective internal page/link when click anywhere on deal card
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to Deal section
        And user click anywhere on deal card
#        Then user should navigate to the respective internal page
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective external page/link when click anywhere on deal cardA
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to Deal section
        And user click anywhere on deal card
#        Then user should navigate to the respective external page in new tab
    @webRegression @mobRegression
    Scenario: To verify user should be able to see Dispensary Events banner with heading
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        Then user should able to see Events Discouns banner with heading
    @webRegression @mobRegression-2 @smoke
    Scenario: To verify user is able to view the heading text,  banner image, title text, copy text & CTA button
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        Then user should able to see Events Discouns banner with heading
        And user should able to see banner image of event discount banenr
        And user should able to see title text of event discount banenr
        And user should able to see copy text of event discount banenr
        And user should able to see CTA button
    @webRegression @mobRegression
    Scenario: To verify user is able to click on Read more CTA and navigate to respective internal link
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user clicks on the Read more CTA from event s discount banner
#        Then user should navigate to the respective internal link
    @webRegression @mobRegression
    Scenario: To verify user is able to click on Read more CTA and navigate to respective external link
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user clicks on the Read more CTA from event s discount banner
#        Then user should navigate to the respective external link in new tab
    @webRegression @mobRegression-1
    Scenario: To verify user should able navigate the banner right arrow on clicking on the arrow
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user clicks on the right arrow
        Then user should able to navigate the banner in right side
    @webRegression @mobRegression
    Scenario: To verify user should able navigate the banner left arrow on clicking on the arrow
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user clicks on the left arrow
        Then user should able to navigate the banner in left side
    @webRegression @mobRegression
    Scenario: To verify user should able to see the left arrows disabled if the carousel displayed the first image
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user is on the first image
        Then user should able to see the left arrow in disabled state
    @webRegression @mobRegression
    Scenario: To verify user should able to see the right arrows disabled if the carousel displayed the last image
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to the Events Discouns section
        And user navigate to the last image of the event discount
        Then user should able to see the right arrow in disabled state for event discount
    @webRegression @mobRegression
    Scenario: To verify user should be able to view the GROUP DISCOUNTS heading and see the 3 cards per row in desktop
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to GROUP DISCOUNTS section in Deals Page
        Then user should be able to view the GROUP DISCOUNTS header
        And user should be able to view the discount cards row in the section
        And user should be able to see maximum of 10 GROUP DISCOUNTS cards is displayed
#        And user should not see any show more cta
    @mobile
    Scenario: To verify user should able to see all deal cards when user scroll vertically
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to GROUP DISCOUNTS section in Deals Page
        Then user scroll the card vertically and able to view all the GROUP DISCOUNTS deal cards
    @webRegression @mobRegression-2
    Scenario: To verify user should able to see image, title text & description in the card
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to GROUP DISCOUNTS section in Deals Page
        Then user should able to view the image
#        And user should able to view the title text
#        And user should able to view the description
#        And user should able to view the 'Get this deal' link
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective internal page/link when click on 'Get this deal' CTA
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to GROUP DISCOUNTS section in Deals Page
        And user click on the Get this deal cta
        Then user should navigate to the respective internal Get this deal page
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective external page/link when click on 'Get this deal' CTA
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And user scroll down to GROUP DISCOUNTS section in Deals Page
        And user click on the Get this deal cta
        Then user should navigate to the respective external Get this deal page in new tab

#        Product card carousel

#    @webRegression @mobRegression
#    Scenario: To verify that user is able to view first 3 product card based on variant used with title text,copy text and CTA
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User Scroll down to the Product Carousel section in deals page
#        Then User should be able to  view title
#        And User should be able to view the copy text at the left side"
#        And User is able to view the CTA
#    @webRegression @mobRegression
#    Scenario: To verify user should be redirected to the linked page by clicking on the CTA
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User Scroll down to the Product Carousel section in deals page
#        And User click on CTA in the product carousel
#        Then User redirected to the linked page
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to move the cards left to right using scrolling indicator
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And user clicks on the right arrow in product list
#        Then user should be able to view the carousel got swipped left to right
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to move the cards right to left using scrolling indicator
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And user clicks on the left arrow arrow in product list
#        Then user should be able to view the carousel got swipped right to left
#    @webRegression @mobRegression
#    Scenario: To verify user should be able to view the product card carousel moves 3 cards per slide
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User Scroll down to the Product Carousel section in deals page
#        Then User viewes the product card carousel moves 3 cards per slide
#    @webRegression @mobRegression
#    Scenario: To verify user should be redirected to the PDP by clicking on the product cards
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User Scroll down to the Product Carousel section in deals page
#        And User clicks on the product cards
#        Then User navigated to the PDP page

    @webRegression @mobRegression
    Scenario: To verify user should see an icon with small text, when once user is on banner variant A
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User scroll downs to banner information in recipe details page for variant A
        And User is on banner information variant A
        Then User should see an icon with small text on banner information variant A
        And User should see a Title Text with 1 or 2 lines for banner information variant A
        And user should be able to view the CTA on banner information variant A

    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tab, if for internal link, when once user is on banner variant A
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User scroll downs to banner information in recipe details page for variant A
        And User should click on CTA on banner information variant A
        Then User should see link is open in same tab from banner information variant A
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant A
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        When User scroll downs to banner information in recipe details page for variant A
        And User should click on CTA on banner information variant A
        Then User should see link is open in new tab from banner information variant A
#
#
#    Information banner variant A internal link to be implemented
#
#    @webRegression @mobRegression
#    Scenario: To verify user should see a background image in the banner along with background color, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#         And User should scroll down to respective banner variant A
#        When User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a background image in the banner along with background color
#    @webRegression @mobRegression
#    Scenario: To verify user should see a small image on top of the banner, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        And user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant A
#        When User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a small image on top of the banner



    @webRegression @mobRegression
    Scenario: To verify user should see an icon with small text, when once user is on banner variant B
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should see an icon with small text on banner information variant B
         And User should see a Title Text with 1 or 2 lines for banner information variant B
         And User should see a copy text with 1 or 2 lines for banner information variant B
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant B
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should click on CTA on banner information variant B
#        And User should see link is open in same tab
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant B
        When user is on the expanded navigation
        And user clicks on the Deals option
        And user should navigate to the respective Deals Page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should click on CTA on banner information variant B
#        And User should see link is open in new tab

#    Information banner variant B internal link to be implemented
#
#    @webRegression @mobRegression
#    Scenario: To verify user should see a background image, when once user is on banner variant B
#        When user is on the Recipe details page
#        And User should scroll down to respective banner information variant B
#        When User is on banner information variant B in any one of the pages
#        And User should click on CTA on banner information variant B
#        Then User should see a background image
#    @webRegression @mobRegression
#    Scenario: To verify user should see small image on top of the background image/banner, when once user is on banner variant B
#        When user is on the Recipe details page
#        And User should scroll down to respective banner information variant B
#        When User is on banner information variant B in any one of the pages
#        And User should click on CTA on banner information variant B
#        Then User should see small image on top of the background image/banner


#    @webRegression @mobRegression
#    Scenario: To verify user should see an icon in the center for banner information, once when user redirected  to particular page
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User scrolls down to Banner section
#        And User is on banner statement
#        Then User should see an icon in the center
#    @webRegression @mobRegression
#    Scenario: To verify user should see an see a Title Text with 3 to 4 lines, once user will see banner image
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        Then User should see a Title Text with 3 to 4 lines
#    @webRegression @mobRegression
#    Scenario: To verify user should click on 'CTA' for internal link to get redirect to respective/link page in same tab
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should click on CTA
#        Then user should able to redirect to respective page/link which opens on same tab always
#    @webRegression @mobRegression
#    Scenario: To verify user should click on 'CTA' for external link to get redirect to respective/link page in new tab
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should click on CTA
#        And user should able  to redirect to respective page/link which opens on new tab always
#    @webRegression @mobRegression
#    Scenario: To verify user should see side small images in the banner
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        Then User should see side small images in the banner for respective page
#    @webRegression @mobRegression
#    Scenario: To verify user should see an icon with small text, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant A
#        And User is on banner variant A
#        Then User should see an icon with small text
#    @webRegression @mobRegression
#    Scenario: To verify user should see a Title Text with 1 or 2 lines, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        Then User should see a Title Text with 1 or 2 lines
#    @webRegression @mobRegression
#    Scenario: To verify user should see CTA on Banner, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        Then User should see CTA on Banner
#    @webRegression @mobRegression
#    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should click on CTA on Banner Image
#        Then User should see link is open in same tab
#    @webRegression @mobRegression
#    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should click on CTA on Banner Image
#        Then User should see link is open in new tab
#    @webRegression @mobRegression
#    Scenario: To verify user should see a background image in the banner along with background color, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant A
#        And User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a background image in the banner along with background color
#    @webRegression @mobRegression
#    Scenario: To verify user should see a small image on top of the banner, when once user is on banner variant A
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant A
#        And User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a small image on top of the banner
#    @webRegression @mobRegression
#    Scenario: To verify user should see an icon with small text, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        Then User should see an icon with small text
#    @webRegression @mobRegression
#    Scenario: To verify user should see a Title Text with 1 or 2 lines, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        Then User should see a Title Text with 1 or 2 lines
#    @webRegression @mobRegression
#    Scenario: To verify user should see a copy text with 1 or 2 lines, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        Then User should see a copy text with 1 or 2 lines
#    @webRegression @mobRegression
#    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        Then User should click on CTA on Banner Image
#        And User should see link is open in same tab
#    @webRegression @mobRegression
#    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        Then User should click on CTA on Banner Image
#        And User should see link is open in new tab
#    @webRegression @mobRegression
#    Scenario: To verify user should see a background image, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a background image
#    @webRegression @mobRegression
#    Scenario: To verify user should see small image on top of the background image/banner, when once user is on banner variant B
#        When user is on the expanded navigation
#        And user clicks on the Deals option
#        user should navigate to the respective Deals Page
#        And User should scroll down to respective banner variant B
#        And User is on banner variant B in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see small image on top of the background image/banner
