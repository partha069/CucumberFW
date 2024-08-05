Feature: As a user, I should be able to see Dispensary page which displays dispensary information such as opening hours, directions, promotions, amenities, offers, etc.

  Background:
    Given user landed on risecannabis Faq "<url>" website
#    And user clicks on Yes in Age gate screen
    And user clicks on the Accept in cookies gate banner
    And user clicks on Dispensaries menu from Global header
    And User clicks one of the state
    And user selects Dispensary name from the state
  #Hero Banner
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Hero Dispensary at the top of the page and below global header
    When User is viewing the dispensary page
    Then User is able to see Hero Dispensary at the top of the page
  @regression @smoke @dispensary
  Scenario: To verify user should see breadcrumbs hierarchy structure
    When user on the hero section
    Then user should able to see breadcrumbs hierarchy structure above the hero section
  @regression @smoke @dispensary
  Scenario: To verify user should able navigate to respective page clicking on the breadcrumbs hierarchy structure links
    When user on the hero section
#    And user clicks on the breadcrumbs hierarchy structure link
#    Then user should be navigate to respective page
  @regression @smoke @dispensary
  Scenario: To verify user should able to view  <Dispensary Name> as a Title text & description as a Copy text in the hero section
    When user on the hero section
    Then user should able to view  <Dispensary Name> as a Title text in the hero section
    And user should able to view description as a Copy text in the hero section
  @regression @smoke @dispensary
  Scenario: To verify user is able to view Two Menu CTA buttons if a dispensary has 2 menus.
    When user on the hero section
    And Dispensary has two menus
    Then user should see Two Menu CTA buttons
  @regression @smoke @dispensary
  Scenario: To verify user able to navigate to respective Product Listing Page of the Dispensary when clicking on the menu CTA in hero section
    When user on the hero section
    And User clicks on the menu CTA.
    Then user is redirect to the respective Product Listing Page of the Dispensary
  @regression @smoke @dispensary
  Scenario: To verify user is able ot see the progress bar below the carousel in hero section
    When user on the hero section
    Then user should able to see the progress bar below the carousel in hero section

  #About This Dispensary
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see About This Dispensary
    When User is in the dispensary page
    And user scroll down to the About this Dispensary section
    Then User is able to see About This Dispensary
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see the About this dispensary Title Text
    When User is in the dispensary page
    And  user scroll down to the About this Dispensary section
    Then User is able to  see 'About this dispensary' Title Text
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see About dispensary details as Copy Text
    When user scroll down to the About this Dispensary section
    Then User is able to see About dispensary details as copy text in the About this dispensary section
  @regression @smoke @dispensary
  Scenario: Verify user is able to see clock icon as part of store hours
    When User is in the dispensary page
    And User scrolls down to the store hours section
    Then User can see a clock icon as part of the store hours
  @regression @smoke @dispensary
  Scenario: Verify User is should see expanded store hours with <opening hours> heading text and a timer icon
    When User scrolls down to the store hours section
    Then User can see expanded store hours with <opening hours> heading text
    And User can see a timer icon
  @regression @smoke @dispensary
  Scenario: To verify that User is able to see store hours in <week day 9:00AM - 8:00PM format> Ex: Friday 8:30AM - 7:00PM
    When User scrolls down to the store hours section
    Then User should see see store hours in week day
  @regression  @dispensary
  Scenario: To verify that user should see their respective time zone current day’s weekday and store hours in first row(bold format) and next thesequence should follow
    When User scrolls down to the store hours section
    Then User is able to see their respective time zone current day’s weekday
    And User is able to see their store hours in first row(bold format)
    And User is able to see the sequence of the week follow
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Additional information box with info icon and text, if there are any medical hours that needs a mention
    When User scrolls down to the store hours section
    Then User is able to see Additional information box with info icon
    And  User is able to see Additional information box with text
  @regression @smoke @dispensary
  Scenario: To verify that User is able to  see Phone Number in US format, with Phone Icon and a Call now CTA
    When User scrolls down to the store hours section
    Then User is able to see Phone Number in US format
    And User is able to see Phone Icon
    And User is able to see Call now CTA
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Dispensary Address with Map icon and with View on Maps CTA
    When User scrolls down to the store hours section
    Then User should see Dispensary Address with Map icon
    And User should see View on Maps CTA
  @regression @smoke @dispensary
  Scenario: To verify that user is able to  see Contact us CTA
    When User scrolls down to the store hours section
    Then User should see Contact us CTA
  @regression  @dispensary
  Scenario: To verify that user is able to see caret symbol against CTA if the redirection is an internal link
    When User scrolls down to the store hours section
    Then User should see a caret symbol next to internal links of Call now CTA
    And User should see a caret symbol  next to internal links of contact us CTA
  @regression  @dispensary
  Scenario: To verify that user is able to see a boxed arrow symbol against CTA if the redirection is an external link
    When User scrolls down to the store hours section
    Then User should see a boxed arrow symbol next to external link of View on Maps CTA
  @regression  @dispensary
  Scenario: To verify that user is able to see CTAs underlined on hovering
    When User scrolls down to the store hours section
    And  User hovers overs over the CTAs in the section
    Then User should see CTAs getting underlined
#  #need to check
#  @regression @smoke @dispensary
#  Scenario: To verify that user is getting a mobile prompt by clicking on the Call now CTA
#    When  User scrolls down to the store hours section
#    And User clicks on the Call now CTA
#    Then A mobile prompt should be thrown for desktop(need to check)
  @regression @smoke @dispensary
  Scenario: Verify that the user is redirected to the google maps with location pin in new tab by clicking on the 'View on Maps' CTA
    When User scrolls down to the store hours section
    And User clicks on the View on Maps CTA
    Then A google maps page with location pin should be opened
    And the map should be opened in the new tab
  @regression @smoke @dispensary
  Scenario: To Verify that the user is redirected to the Contact Us Form on clicking on the Contact Us CTA
    When User scrolls down to the store hours section
    And User clicks on Contact Us CTA
    Then User is redirected to the Contact Us from

  #Dispensary Tabs
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view appropriate Title text
    When User scroll down to Dispensary tabs for Variant A.
    Then User is able to view Dispensary tabs
    And User is able to view the appropriate Title text
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the tabs listed out one by one
    When User is viewing dispensary tabs for Variant A.
    Then User is able to view the tabs listed out one by one
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the respective opened tab highlighted accordingly
    When User is viewing dispensary tabs for Variant A.
    And User click on particular tab
    Then User is able to view  the respective opened tab highlighted accordingly
  @regression  @dispensary
  Scenario: To verify user should see the utmost 6 tabs at any given point of time
    When User is viewing the dispensary page
    And User scrolls down to the dispensary tabs section
    Then User is able to see Dispensary Tabs section
    And user should able see tabs with combination of any variants
    # And user should see only maximum of 6 tabs (need to check)
  @regression  @dispensary
  Scenario: To verify user should see the a minimum od 1 tab at any given point of time
    When User is viewing the dispensary page
    And User scrolls down to the dispensary tabs section
    Then User is able to see Dispensary Tabs section
    # And user should able see tabs with combination of any variants(need to check)
    # And user should see a minimum of 1 tab(need to check)
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view the title text,Copy Text, icon and title against each amenity
    When User is viewing Amenities information for Variant A.
    Then User is able to  view the tittle text
    And User is able to  view Copy Text
    And User is able to  view icon against each amenity
    And User is able to  view title against each amenity
  @regression  @dispensary
  Scenario: To verify user should be able to see list of amenities as 2 columns
    When User is viewing Amenities information for Variant A.
    #Then User is able to view list of amenities as 2 columns(Not Feasible)
  @regression  @dispensary
  Scenario: To verify that User sees a tool tip text box with appropriate details about the amenity
    When  User is viewing Amenities information in variant A
    And User hovers on tooltip icon
    Then User should be able to view the Tooltip text box with appropriate details about amenity
#  @regression @smoke @dispensary @Mobile
#  Scenario: To verify  that if user clicks anywhere on the desktop, the tooltip closes
#    When  User is viewing Amenities information in variant A
#    And User click on tooltip icon
#    And User clicks anywhere outside the box
#    Then User should see the tooltip getting closed
  @regression  @dispensary
  Scenario: To verify user is able to view the appropriate title text, copy text, image, CTA button & any clickable link for deals/promotions
    When user is on the any deals & promotional content
    Then user should able to view the appropriate Title text
    And user should able to view the appropriate Copy text
    And user should able to view the appropriate Image
    And user should able to view the appropriate CTA button
    #And user should able to view the clickable link (not avaiable)
  @regression  @dispensary
  Scenario: To verify user is able to view the appropriate valid start date and end date with small icon for deals/promotions
    When user is on the any deals & promotional content
    Then user should able to view the appropriate valid start date
    And user should see an end date
    And user should see a small icon

  #Dispensary Reviews
  @regression @smoke @dispensary
  Scenario: To verify user is able to see the dispensary reviews section
    When user scroll down to the dispensary reviews section
    Then user should able to view the dispensary reviews section
  @regression @smoke @dispensary
  Scenario: To verify user is able to see the dispensary reviews section title text
    When user scroll down to the dispensary reviews section
    Then user should able to view the "What are people saying" title text
  @regression  @dispensary
  Scenario: To verify user is able to see the max of 6 reviews  in the review section of the screen
    When user scroll down to the dispensary reviews section
    #Then user should able to see only max of 6 review in the screen(need to check)
  @regression  @dispensary
  Scenario: To verify user is able to see a minimum of 1 review  in the review section of the screen
    When user scroll down to the dispensary reviews section
    #Then user should able to see a minimum of 1 review in the screen(need to check)
  @regression @smoke @dispensary
  Scenario: To verify user should able to view slider indicating the <no. of review> of <total no. of reviews> in the review section of the screen
    When user scroll down to the dispensary reviews section
    Then user should able to view <no. of review> of <total no. of reviews> in the review section
    #And user should <total no. of reviews> below the review in the section is exact total of review in the section(not feasible)
    #And user should <no. of review> below the review in the section is exact total of review in the section(not feasible)
  @regression  @dispensary
  Scenario: To verify user should be able to view the review section should scroll right to left if user clicks right arrow
    When user scroll down to the dispensary reviews section
    And user clicking on right arrows arrows available in review section
    #Then user should able to see the review carousal is navigate in right side in the hero section(not feasible)
    #And  user should able to see the slider color changes(not feasible)
  @regression  @dispensary
  Scenario: To verify user should be able to view the review section should scroll left to right if user clicks left arrow
    When user scroll down to the dispensary reviews section
    And user clicking on clicking on left arrows available in review section
    #Then user should able to see the review carousal is navigate in left side in the hero section(not feasible)
    #And  user should able to see the slider color changes(not feasible)
  @regression  @dispensary
  Scenario: To verify user able to see the progress bar
    When user scroll down to the dispensary reviews section
    Then user should able to see the progress bar
  @regression @smoke @dispensary
  Scenario: To verify user able to see the progress bar progressing forward with the number getting changed on clicking the right arrow
    When user scroll down to the dispensary reviews section
    And user clicks on right arrow
    Then user should see the slider moving forward
    And number getting changed
  @regression  @dispensary
  Scenario: To verify user able to see the progress bar moving backward with the number getting changed on clicking the left  arrow
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    Then user should see the slider moving backward
    And number getting changed back
  @regression @smoke @dispensary
  Scenario: To verify user able to see rating with stars for each review when click on right arrow
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    Then user should able to see rating with stars for each review
    And user should able to see the rating slider navigating left to right
  @regression @smoke @dispensary
  Scenario: To verify user able to see rating with stars for each review when click on left arrow
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    Then user should able to see rating with stars for each review
    And user should able to see the rating slider navigating right to left
  @regression @smoke @dispensary
  Scenario: To verify user is able to see the dispensary review as copy text with quotation symbol when click on the right arrow for all reviews
    When user scroll down to the dispensary reviews section
    Then user should able to see the dispensary review as copy text with quotation symbol on each review
  @regression  @dispensary
  Scenario: To verify user able to see the dispensary review as copy text with quotation symbol when click on the left arrow for all reviews
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    Then user should able to see the dispensary review as copy text with quotation symbol on each review
  @regression  @dispensary
  Scenario: To verify user able to see the customer name when present when click on the right arrow for all reviews
    When user scroll down to the dispensary reviews section
    And user clicks on right arrow
    Then user should able to see the see customer name when present for each review
  @regression  @dispensary
  Scenario: To verify user able to see the customer name when present when click on the left arrow for all reviews
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    #Then user should able to see the see customer name when present  for each review
  @regression  @dispensary
  Scenario: To verify user is able to see  as anonymous when customer name is not there when click on the right arrow for all reviews
    When user scroll down to the dispensary reviews section
    And user clicks on right arrow
    #Then user should able to see the as anonymous when customer name is not there for each review(Need Check)
  @regression  @dispensary
  Scenario: To verify user is able to see the as anonymous when customer name is not there when click on the left arrow for all reviews
    When user scroll down to the dispensary reviews section
    And user clicks on left arrow
    Then user should able to see the as anonymous when customer name is not there for each review


  #Quick Links
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Quick Links
    When User is viewing the dispensary page
    And User scrolls down to the Quick links section
    Then User is able to see Quick Links
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view 3 cards in a row
    When User is viewing the dispensary page
    And User scrolls down to the Quick links section
    Then User is able to see cards in a row
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the Title text and the copy text
    When User scrolls down to the Quick links section
    Then User is viewing the Quick Links section
    And User is able to view the Title text.
    And User is able to view the copy text.
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the image for each card
    When User scrolls down to the Quick links section
    And User is viewing the Quick Links section
    Then User should be able to view the image for each card
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the clickable title link card.
    When User is on Quick Links section
    Then User should be able to view the clickable title link card.
  @regression @smoke @dispensary
  Scenario: To verify user should be able to redirected to the respective page, if user clicks on the title link card.
    When User is on Quick Links section
    And User clicks on the title link card.
    Then User should be redirected to the respective page
  @regression @smoke @dispensary
  Scenario: To verify user should be able to view the clickable arrow card link.
    When User is on Quick Links section
    And User clicks on the arrow link card.
    Then User should be redirected to the respective page by arrow
  @regression @smoke @dispensary
  Scenario: To verify user should be able to redirected to the respective page, if user clicks on the arrow card link
    When User is on Quick Links section
    And User clicks on the arrow card link
    Then User should be redirected to the respective page

    #Accordion FAQ
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Accordion FAQ related to the dispensary
    When User is viewing the dispensary page
    And User scrolls down to the FAQ section
    Then User is able to see Accordion FAQ related to the dispensary
  #(need to added scenarios for Header and image)
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view FAQ section with answers to each questions marked in an accordion format(when the list is less than 8)
    When User scrolls down to the FAQ section
    And User is able to view less than or equal to 8 set of FAQs under the FAQ section
    Then User should be able to view the FAQ section with answers to each questions marked in an accordion format
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view the full display of the FAQs present(when the list is less than 8)
    When User scrolls down to the FAQ section
    And User is able to view less than or equal to 8 set of FAQs under the FAQ section
    Then User should be able to view the full list of FAQ questions.
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view ‘+’ and ‘-‘ symbols and the accordions should get expanded and collapsed respectively
    When User scrolls down to the FAQ section
    Then User should be able to view ‘+’ and ‘-‘ symbols in dispensary faq
    And On clicking the accordions should get expanded and collapsed respectively in dispensary faq
  @regression @smoke @dispensary
  Scenario: To verify that accordion get expanded on clicking the + icon
    When User scrolls down to the FAQ section
    And user clicks on + icon in dispensary faq
    Then User is able to see the expanded accordion in dispensary faq
  @regression @smoke @dispensary
  Scenario: To verify that accordion get collapsed on clicking the - icon
    When User scrolls down to the FAQ section
    And user clicks on + icon
    And user clicks on - icon
    #Then User is able to see the collapsed icon(not feasible)
  @regression @smoke @dispensary
  Scenario: To verify that One accordion get closed automatically when any other accordion is opened
    When User scrolls down to the FAQ section
    Then User should be able to view ‘+’ and ‘-‘ symbols in dispensary faq
    And One accordion should get closed automatically when any other accordion is opened in dispensary faq
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view the accordion getting expanded on clicking on the whole atom (question part) when the accordion is in the closed state.
    When User scrolls down to the FAQ section
    And User clicks on the question part of a closed accordion
    Then User should be able to view the accordion getting expanded
  @regression @smoke @dispensary
  Scenario: To verify that user is able to view the accordion getting expanded on clicking on the + icon when the accordion is in the closed state.
    When User scrolls down to the FAQ section
    And User clicks on the + icon of a closed accordion
    Then User should be able to view the accordion getting expanded
#
    #Dispensary Cards
  @regression @smoke @dispensary
  Scenario: To verify that user is able to see Dispensaries Cards section which displays maximum 2 cards of nearby locations
    When User is viewing the dispensary page
    And User scrolls down to the Dispensaries card section
    Then User is able to see Dispensaries Cards section
    And user should able to see maximum 2 cards of nearby locations
  @regression @smoke @dispensary
  Scenario: To verify user is able to view the dispensary cards & Dispensaries nearby title text in the section
    When User scrolls down to the Dispensaries card section
    Then User is able to see Dispensaries Cards section
    And user should able to view the dispensaries nearby title text
  @regression @smoke @dispensary
  Scenario: To verify user is able to see dispensary image in each card
    When User scrolls down to the Dispensaries card section
    Then user should able to see dispensary image in each card
  @regression @smoke @dispensary
  Scenario: To verify user is able to see <Dispensary Name> as part of Dispensary Information in each card
    When User scrolls down to the Dispensaries card section
    Then user should able to see respective <Dispensary Name> as part of Dispensary Information in each card
  @regression @smoke @dispensary
  Scenario: To verify user is able to see <Store Hours> with Timer Icon as part of Dispensary Information in each card
    When User scrolls down to the Dispensaries card section
    Then user should able to view the respective dispensary timezone current day for each card
    And user should able to view the store hours for each card
    And user should able to view the clock icon for each card
  @regression @smoke @dispensary
  Scenario: To verify user is able to see <Dispensary Phone Number> in US format with Phone Icon as part of Dispensary Information in each card
    When User scrolls down to the Dispensaries card section
    Then user should able to view the respective dispensary Phone Number in US format for each card
    And user should able to view the Phone icon for each card
  @regression @smoke @dispensary
  Scenario: To verify user is able to see <Dispensary Address> with Map Icon  as part of Dispensary Information for each card
    When User scrolls down to the Dispensaries card section
    Then user should able to view the respective dispensary Address for each card
    And user should able to view the Map icon for each card
#  #not feasible
#  @regression @smoke @dispensary
#  Scenario: To verify the Dispensary Name, Store Hours, Phone Number, Address in Dispensary Information for each card is non-clickable
#    When User scrolls down to the Dispensaries card section
#    Then user sees the Dispensary Name, Store Hours, Phone Number, Address in Dispensary Information for each card is non-clickable
  @regression @smoke @dispensary
  Scenario: To verify user able to see View dispensary CTA with carat symbol which is the only clickable one in this card
    When User scrolls down to the Dispensaries card section
    Then user should able to see the View Dispensary CTA with caret icon button on the each card
    And user verify View Dispensary CTA is the clickable link on the each card
  @regression @smoke @dispensary
  Scenario: To verify user is navigate to respective dispensary location page on clicking on View Dispensary CTA in each card
    When User scrolls down to the Dispensaries card section
    And user clicks on the View Dispensary CTA on any card
    Then user should navigate to respective dispensary location page

    #Banner Information
  @regression @smoke @dispensary
  Scenario: To verify user should see a Title Text with 1 or 2 lines, when once user is on banner variant A
    And User should scroll down to respective banner variant A
    When User is on banner variant A in any one of the pages
    Then User should see a Title Text with 1 or 2 lines in DispensaryPage
  @regression @smoke @dispensary
  Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant A
    And User should scroll down to respective banner variant A
    When User is on banner variant A in any one of the pages
    Then User should click on CTA on Banner Image in DispensaryPage
    And User should see link is open in same tab



















