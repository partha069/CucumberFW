Feature: User verify T17 State Page

     Background:
     Given user lands on risecannabis website
     #And user clicks on Yes in Age gate screen
     And user clicks on the Accept in cookies gate banner
     When User Click on Dispensaries in Global Header or taps on the Hamburger Menu
     Then User clicks on DISPENSARIES option in the global header
     And User able to see the list of states
     And User clicks on Illinois state
     And User able to see a list of Dispensaries
     And User clicks on RISE Mundelein Dispensary
     And User navigate to Dispensary Page
     Then User should be able to see appropriate breadcrumb
     Then User clicks on State link in the breadcrumb from dispensary page


     @webRegression @mobRegression @C02. @StatePageDesktop @StatePageMobile @smoke @statetest
     Scenario: User should be able to see Hero section with Title text, Copy text, Hero Image details
     When User is viewing the State Page
     Then User should be able to view the Title Text
     And User should be able to view the Copy Text in State Page
     And User should be able to view the Hero Image

     @webRegression @statestest @C64. @rundemopage1deals
     Scenario: User should able to see map section, Dispensary section and hovers over the dispensares list and dispensary name getting bold, dispensary icons and delivery zone.
     When User is viewing the Dispensary map section
     Then User hovers over the dispensares list and dispensary name getting bold
     ##And User is able to view a color  change in the delivery zone
     Then User is able to see dispensary map next to the dispensary list
     And User is able to view dispensary icons that represent each dispensaries location
     Then User is able to see delivery zone legend if the delivery zone is present within respective state boundaries

     @webRegression @statestest @C64. @mobileState
     Scenario: User should able to see map section, Dispensary section and hovers over the dispensares list and dispensary name getting bold, dispensary icons and delivery zone.
     When User is viewing the Dispensary map section
     Then User hovers over the dispensares list and dispensary name getting bold
     #And User is able to view a color  change in the delivery zone
     #ThenUser is able to see dispensary map next to the dispensary list
     #AndUser is able to view dispensary icons that represent each dispensaries location
     Then User is able to see delivery zone legend if the delivery zone is present within respective state boundaries
     ############################Demo############################
     And User clicks on the + CTA to expand the accordion of a dispensary
     And User clicks on the Contact Us CTA in dispensary Location
     Then User is redirected to the PLP and the geolocation updates accordingly

     @webRegression @statestest @C64.E @mobileState
     Scenario: User should
     When User is viewing the Dispensary map section
     And User clicks on the + CTA to expand the accordion of a dispensary
     Then User is able to see delivery zone legend if the delivery zone is present within respective state boundaries
     And User clicks on the Contact Us CTA in dispensary Location
     Then User is navigated to the Contact us page
     Then User is redirected to the PLP and the geolocation updates accordingly

     @webRegression @statestest @rundemopage
     Scenario: User should
     When User is viewing the Dispensary map section
     And User clicks on the + CTA to expand the accordion of a dispensary
     And User clicks on the Contact Us CTA in dispensary Location
     Then User is navigated to the Contact us page
     Then User is redirected to the PLP and the geolocation updates accordingly

     @webRegression @statestest @C64.E @mobileState
     Scenario: User should Click on Shop this dispensary CTA to redirected to PLP Page
     When User is viewing the Dispensary map section
     And User clicks on the + CTA to expand the accordion of a dispensary
     Then User is able to see delivery zone legend if the delivery zone is present within respective state boundaries
     And User clicks on the Shop this dispensary CTA in dispensary Location
     #Then User is navigated to the PLP with the default menu opened and the geolocation updated automatically   //Page Not Linked

     @webRegression @statestest @C64.E @rundemopage
     Scenario: User should Click on Shop this dispensary CTA to redirected to PLP Page
     When User is viewing the Dispensary map section
     And User clicks on the + CTA to expand the accordion of a dispensary
     And User clicks on the Shop this dispensary CTA in dispensary Location
     #Then User is navigated to the PLP with the default menu opened and the geolocation updated automatically   //Page Not Linked






     #@webRegression @statestest @C64
     Scenario: User Scroll
          When User is viewing the Dispensary map section
          Then User is able to view an additional scroll bar in a container
     #And: User scrolls along the dispansaries list till the last dispensary comes //R&D
     #Then: User is able to see the fading effect //R&D

     @webRegression @statestest @C64
     Scenario: User should see Dispensary name, Phone number, Address, Contact us CTA, Shop this dispensary CTA as per dispensary list
          When User is viewing the Dispensary map section
          And User clicks on the dispensary icon on the map
          Then User is able to see the Dispensary name
          And User is able to see the Phone number
          And User is able to see the Address
          And User is able to see the Contact us CTA
          And User is able to see the Shop this dispensary CTA
          When User is on expanded accordion of the dispensary list
          And User clicks on Shop this dispensary CTA
     #Then User is redirected to the PLP and the geolocation updates accordingly

     @webRegression @statestest @C64
     Scenario: User should able to click on another another dispensary icon to see the pop-up displaying the new dispensary information
          And User clicks on a dispensary icon on the map
          And User clicks on another dispensary icon
          Then User is able to see the pop-up displaying the new dispensary information replacing the older one

     @webRegression @statestest @C64
     Scenario: User should able to click on another dispensary location from list to see the pop-up displaying the new dispensary information
          And The dispensary list accordions are collapsed default state
          And User clicks on a dispensary icon on the map
          And User expands another dispensary location from list
     #Then: user is able to see the pop-up displaying the new dispensary information replacing the older one








     @webRegression @statestest @C64. @rundemopage @mobileState
     Scenario: User should see + CTA expanded accordion, Store hours with a downward arrow, Phome Number, Address, Contact Us CTA and navigation
          When User is viewing the Dispensary map section
          And User clicks on the + CTA to expand the accordion of a dispensary
          Then User is able to view Store hours with a downward arrow
          And User is able to view Phone number
          And User is able to view Address
          And User is able to view Contact us CTA
     #And User is able to view Shop this dispensary CTA
          Then User Clicks on Contact Us CTA

     @webRegression @statestest @C64
     Scenario: User should able to click on X CTA to close dispensary icon on the map and clicking on X CTA , pop-up gets dismissed
          And User clicks on the dispensary icon on the map
          And User clicks on the X icon on the right top
     #Then The pop-up gets dismissed.

     @webRegression @statestest @C64.
     Scenario: User should see dispensary icon on the map, Contact Us CTA and clicking on Contact Us CTA, navigated to the Contact us page
          And The dispensary list accordions are collapsed default state
          And User clicks on the dispensary icon on the map
          And User clicks on the Contact Us CTA in dispensary Location
          Then User is navigated to the Contact us page

     @webRegression @statestest @C64
     Scenario: User should see dispensary icon on the map and clicking on Shop this dispensary CTA, navigated to the PLP with the default menu opened
          And The dispensary list accordions are collapsed default state
          And User clicks on the dispensary icon on the map
          And User clicks on the Shop this dispensary CTA in dispensary Location
          Then User is navigated to the PLP with the default menu opened and the geolocation updated automatically

     @webRegression @statestest @C64
     Scenario: User should see dispensary icon on the map and respective dispensary accordion on the list
          And The dispensary list accordions are collapsed default state
          And User clicks on the dispensary icon on the map
     #Then User is able to see the respective dispensary accordion on the list view is expanded and scrolled to the top position on the list

     @webRegression @statestest @C64
     Scenario: User should see list accordions are collapsed default state and clicks on the dispensary icon, respective dispensary
          And The dispensary list accordions are collapsed default state
          And User clicks on the dispensary icon on the map
      #Then: User is able to see the respective dispensary icon is enlarged

     @webRegression @mobRegression @C02. @StatePageDesktop @StatePageMobile
     Scenario: User Sould be able to see heading Deals, banner image, title text, CTA, Show More CTA and remaining cards number
          When user scroll down to Deal Card section
          Then user should be able to view the heading Deals
          And user should able to see banner image of Deals
          And user should able to see title text of Deals
          And user should able to see copy text of Deals
          And User should able to view the label tag and with deal type text
     #(E.g: 50% Off) & (ex: ‘Special deal’)
     #Then user should able to view the image in the card along with background color

     @webRegression @C02 @StatePageDesktop
     Scenario: User should be able to view the first 4 deal cards in a row in the section
          When user scroll down to Deal Card section
          Then User is able to view the first 4 deal cards in a row in the section

     @webRegression @C02 @StatePageDesktop
     Scenario: User should be able to see 4 deals cards in row once click on Show More CTA
          When user scroll down to Deal Card section
          And User clicks on Show More CTA of Deals
          Then User should be able to see Show Less CTA with the remaining cards number
          And User should be able to view the number of products shown and the total like
     #Eg: ’Showing 4 of 20’)
          And User is able to view more than 4 deal cards in a row in the section

     @webRegression @mobRegression @C02 @StatePageDesktop @StatePageMobile
     Scenario: Use should able to navigate to respective page after clicking or tapping on internal page on same tab.
          When user scroll down to Deal Card section
          And User click anywhere on deal card
     ##Then user should navigate to the respective internal page

     @webRegression @mobRegression @C02 @StatePageDesktop @StatePageMobile
     Scenario: Use should able to navigate to respective page after clicking or tapping on external page on new tab.
          When user scroll down to Deal Card section
          And User click anywhere on deal card
     #Then user should navigate to the respective external page/link in new tab

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should be able to see heading text, banner image, title text, copy text, CTA Button.
          When User scroll down to the Dispensary Events Discount banner
          Then User should able to see heading text
          And User should able to see banner image
          And User should able to see title text
          And User should able to see copy text
          And User should able to see CTA button
     #Then user should navigate to the respective internal link

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should navigate to the respective internal link in same tab
          When User scroll down to the Dispensary Events Discount banner
          And User clicks on the Read more CTA
     #Then user should navigate to the respective internal link

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should navigate to the respective external link in new tab
          When User scroll down to the Dispensary Events Discount banner
          And User clicks on the Read more CTA
     #Then user should navigate to the respective external link in new tab

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should be able to view navigation control, horizontal indicator and see arrows button
          When User scroll down to the Dispensary Events Discount banner
          Then user should not able to see the navigation control
          And user should not able to see horizontal indicator
          And user should not able to see arrows button

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should see total number of carousel banners, maximum of 10 banners, Right & Left arrows and click operation for < > arrow
          When User scroll down to the Dispensary Events Discount banner
          Then User should be able to view the horizontal scroll with the total number of carousel banners
     #(Ex : 1 of 3)
          And User should able to see the maximum of 10 banners
          And User should able to see the the Left arrows
          And User should able to see the the Right arrows
          And User clicks on the right arrow
          Then User should able to navigate the banner in right side
          And User clicks on the left arrow
          Then User should able to navigate the banner in left side

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should see first image user should able to see the left arrow in disabled state
          When User scroll down to the Dispensary Events Discount banner
          Then user is on the first image user should able to see the left arrow in disabled state
          And user should not able to click on the left arrow

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario: User should see the right arrow in disabled state
          When User scroll down to the Dispensary Events Discount banner
          And User clicks on the right arrow
          And user navigate to the last image
          Then user should able to see the right arrow in disabled state
          And user should not able to click on the right arrow

     @webRegression @mobRegression @C74 @StatePageDesktop @StatePageMobile
     Scenario: User should able to see iew the GROUP DISCOUNTS header,  deal cards, images, title, description, link
          When user scroll down to GROUP DISCOUNTS section
          Then User should be able to view the GROUP DISCOUNTS header
          Then User should able to see all the deal cards
          Then User should able to view the image
          And User should able to view the title text
          And User should able to view the description
          And User should able to view the link

     @webRegression @mobRegression @C74 @StatePageDesktop @StatePageMobile
     Scenario: User should able to navigate to respective internal page/link, after tapping on Deals Card Link
          When user scroll down to GROUP DISCOUNTS section
          And User click on the Deals Card Link
     #Then User should navigate to the respective internal page or link

     @webRegression @mobRegression @C74. @StatePageDesktop @StatePageMobile
     Scenario:  User should able to navigate to respective internal page/link, after tapping on Link
          When user scroll down to GROUP DISCOUNTS section
          And User click on the Link
     #Then User should navigate to the respective external page or link in new tab

     @webRegression @mobRegression @C19 @StatePageDesktop @StatePageMobile
     Scenario: User should be able to see Product Carousel section along with title text, copy text, CTA, Cards and 3 cards per slide
          When User Scroll down to the Product Carousel section
          And User should be able to view title text, copy text, CTA, Cards
          And User views the product card carousel moves 3 cards per slide
          And User views the scrolling indicator to show the maximum number of cards available
          And User click on CTA
     #Then User redirected to the linked PLP page

     @webRegression @mobRegression @C19 @StatePageDesktop11 @StatePageMobile
     Scenario: User should be able to click on product cards to get redirected to
          When User Scroll down to the Product Carousel section
          And User clicks on the product cards
      #Then User navigated to the PDP page

     @webRegression @mobRegression @C42. @StatePageDesktop @StatePageMobile
     Scenario: User should see Title text, copy text, image for each card and  caret circle arrow clickable for each card
          When User scroll down to Quick Links section
          Then User is viewing the Quick Links section
          And User should be able to view the Title text for Quick Links section
          And User should be able to view the copy text for Quick Links section
          And User should be able to view image for each card
          And User should be able to caret circle arrow clickable for each card

     @webRegression @mobRegression @C42. @StatePageDesktop @StatePageMobile
     Scenario: User should see Clickable title link clickable
          When User scroll down to Quick Links section
          And User should be able to view Clickable title link for each card

     @webRegression @mobRegression @C42 @StatePageDesktop @StatePageMobile
     Scenario: User redirected to respective internal site page on same tab
          When User scroll down to Quick Links section
          Then User clicks on the title link card
     #And User should be redirected to respective internal site page (Always opens in same tab,

     @webRegression @mobRegression @C42 @StatePageDesktop @StatePageMobile
     Scenario: User redirected to respective external site page on new tab
          When User scroll down to Quick Links section
          Then User clicks on the title link card
     #And User should be redirected to respective external site page (Always opens in new tab,

     @webRegression @mobRegression @C42 @StatePageDesktop @StatePageMobile
     Scenario: User redirected to respective internal site page in same tab
          When User scroll down to Quick Links section
          Then User clicks on the circle arrow
     #And User should be redirected to respective internal site page (Always opens in same tab,

     @webRegression @mobRegression @C42. @StatePageDesktop @StatePageMobile
     Scenario: User redirected to respective external site page in new tab
          When User scroll down to Quick Links section
          Then User clicks on the circle arrow
     #And User should be redirected to respective external site page (Always opens in new tab,

     @webRegression @mobRegression @C42 @StatePageDesktop @StatePageMobile
     Scenario: User should be able to Quick Links section for All States, Get or renew a med card and see image for each card
          When User scroll down to Quick Links section
     #Then User is viewing the Quick Links section for All States
     #And User should be able to view Get or renew a med card
          And User should be able to view image for each card

     @webRegression @statestest @StatePageDesktop @StatePageMobile
     Scenario: User should be able to see Title Text, Copy Text, Accordions with + , - icon , accordions get expanded
          When User scroll down to FAQ section of State Page
          And User should be able to view Title Text
          And user should be able to view Copy Text
          And user should be able to view Image
          And User should be able to view + and - symbols
          And User click on + Symbol
          And User click on + Symbol
          And User should able to view the accordions get expanded
          Then User should be able to see and click on Show More button to show the entire set of FAQs
          Then User should be able to see and click on Show less button replacing show more button if entire set of FAQs are displayed
          And User should be able to return to original state and the button changes back to show more
     #(eg: ‘Showing 4 of 8’)

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: User should able to see icon with small text, Title Text with <=3 lines, CTA,  if internal link its always opens on same tab.
          When User scroll downs to banner section in State page for variant A
          And User is on banner variant A
          Then User should see an image in the banner
          Then User should see an icon with small text for Banner variant A
          And User should see a Title Text with <=3 lines
          Then User should see a CTA
          And User should click on CTA to redirect to respective page or link which opens on same tab always

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: redirect to respective page/link which opens on new tab always
          When User scroll downs to banner section in State page for variant A
          And User should click on CTA to redirect to respective page or link which opens on new tab always

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: User should see icon with small text, Title Text, Copy Text, Text and primary Button, if internal link its always opens on same tab.
          When User is on banner variant A Text and primary Button for C09
          Then User should see a CTA on banner for variant A Text and primary Button
          Then User should see an icon with small text for variant A Text and primary Button
          And User should see a Title Text with <=2 lines
          And User should see Copy Text with <=2 lines
          And User should see a CTA on any one of the page for variant A Text and primary Button
          Then User should see a CTA on banner
          And User should click on CTA to redirect to respective page or link which opens on same tab always for variant A Text and primary Button

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: User should see background colors of the banner and click on CTA to redirect to respective page and link which opens on new tab
          And User should see appropriate background colors of the banner
          And User should click on CTA to redirect to respective page and link which opens on new tab always for variant A Text and primary Button

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: User should see icon with small text, Title Text with <=4 lines, CTA
          When User is on banner variant B for C09
          Then User should see an image in the banner for variant B
          And User should see an icon with small text for variant B
          And User should see a Title Text with <=4 lines
          And User should see a CTA for variant B
          Then User should click on CTA to redirect to respective page or link which opens on same tab always for variant B banner

     @webRegression @statestest @C09 @StatePageDesktop @StatePageMobile
     Scenario: User should see background colors of the banner and
          When User is on banner variant B for C09
          And User should see appropriate background colors of the banner for variant B banner
          Then User should click on CTA to redirect to respective page or link which opens on new tab always for variant B banner

          #53  Scenario >>  14 major scenario
