Feature: As a user, I should be able to view Blogs to see list of articles related to it

  Background:
    Given user landed on risecannabis Faq "<url>" website
    #And user clicks on Yes in Age gate screen
    And user clicks on the Accept in cookies gate banner
    And user clicks on CANNABIS INSIDER menu from Global header
    And User clicks on BLOGS sub catogery

  @regression @smoke @benefitsOfCannabis
  Scenario: To verify that user is able to land on the Benefits of Cannabis article page from the global header
    When user clicks on the whats Right For Me resources blog
    Then User should land on the whats Right For Me resources blog page
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify User should be able to view a Hero section of the Benefits of Cannabis Article Details page
    When User is in the whats Right For Me resources blog page
    Then User should be able to see Hero Article Detail at the top of the page below global header
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To  verify that User should be able to see breadcrumb  ‘Back to Cannabis Insider’ on Banner
    When User is in the whats Right For Me resources blog page
    Then User should be able to see breadcrumb  ‘Back to Cannabis Insider’ on Banner
#    #not developed
#  @regression  @benefitsOfCannabis
#Scenario: To  verify that User should be able to  click on ‘Back to Cannabis Insider’ breadcrumb ink to navigate to respective index page
#  When User is in the Benefits of Cannabis blog page
#  And User clicks on Back to Cannabis Insider breadcrumb link
#  Then User is able to navigate to the respective index page
  #HC-07 Hero Article Detail HC-484
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user is able to view the hero image in background, the Article  title, and the description/copy text / overview of a particular article
    When User is in the whats Right For Me resources blog page
    Then user should able to view the hero image in background in right for me page
    And user should able to view the Article  title in right for me page
    And the overview of a particular article banner in right for me page
    And user should able to view the description or copy text of the article
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify user is able to view the published date of the article when it got published and in format of MM.DD.YYYY
    When User is in the whats Right For Me resources blog page
    Then user should able to view the published date of the article when it got published in right for me page
  #And user should able to view the published date in format of MM.DD.YYYY(not feasible)
  @regression @moke @benefitsOfCannabis
  Scenario: To verify user is able to view “New” tag for the article which has less than or equal to 15 days from published date
    When User is in the whats Right For Me resources blog page
    Then user should able to view “New” tag for the article which has less than nor equal to15 days from published date in right for me page
#  @regression  @benefitsOfCannabis
#Scenario: To verify user should not able to view “New” tag for the article which has greater than days from published date
#  When user is on the Article details page
#  Then user should should not able to view “New” tag for the article which has greater than 15 days from published date
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user is able to view the Category tag as "Cannabis 101"  in the article section
    When User is in the whats Right For Me resources blog page
    Then user should able to view the Category tag as "Cannabis 101"  in the article section in right for me page
    #C-48 Summary - Anchor Links HC-496
  @regression @smoke @benefitsOfCannabis
  Scenario: To verfiy that User should be able to view the table of content on the left side of the page
    When User is in the whats Right For Me resources blog page
    Then User should be able to view the table of content on the left side of the page
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to view the section heading within the page in a link format
    When User is in the whats Right For Me resources blog page
    Then User should be able to view the section heading within the page in a link format
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user should be able to view the links getting highlighted when they click on it
    When User is in the whats Right For Me resources blog page
    And User clicks on the links in right for me page
    Then User should be able to view the links getting highlighted
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to view the link is getting highlighted with a red line on top to indicate the particular section user is seeing
    When User is in the whats Right For Me resources blog page
    And User hovers over the link
    Then User is able to view the link is getting highlighted with a red line on top
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user should be able to navigated to respective section on clicking any link
    When User is in the whats Right For Me resources blog page
    And User should be able to click on any link in benefits TOC in right for me page
    Then User should see the page being navigated to respective section in benefits TOC in right for me page
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify user should be able to view the highlighted link when scrolls down the page and viewing a particular section
    When User is in the whats Right For Me resources blog page
    And User is navigated to respective section on clicking any link in right for me page
    And  User scrolls down the page to view a particular section in right for me page
    Then The Link should also be highlighted
  @regression  @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to see the anchor links/ToC being scrolled in background behind Banner(C09)
    When User is in the whats Right For Me resources blog page
    And User is navigated to any large banner as Banner_C_ZeroNine
    Then User should be able to see the anchor links ToC being scrolled in background behind in right for me page
#    #C-44 Rich Text HC-556
  @regression @smoke
  Scenario: To verify that user is able to view the Title text in bold format and a red line above the title text
    When User is in the whats Right For Me resources blog page
    And User clicks on the links in right for me page
  #Then User is able to view the Title text in bold(not feasible)
  #And User is able be able to view a red line above the title text(not feasible)
  @regression @whatsRightForMe_smoke
  Scenario: To verify that user is able to view the text in paragraph format
    When User is in the whats Right For Me resources blog page
    And User clicks on the links in right for me page
    Then  User is able to view the text in in paragraph format
  @regression @whatsRightForMe_smoke
  Scenario: To verify that user is able to view the text written inside a red color quote symbol
    When User is in the whats Right For Me resources blog page
    And User is viewing the text in a quote in right for me page
    Then : User is able to view the text written inside a quote symbol
  #And Quote symbol is in red in colour(not feasible)
  @regression @smoke
  Scenario: To verify that user is able to view each question with a '+' symbol
    When User is in the whats Right For Me resources blog page
    And User is viewing the accordions
    Then User is able to view the each question with a '+' symbol
  @regression @whatsRightForMe_smoke
  Scenario: To verify that the accordions get expanded on clicking the '+' symbol
    When User is in the whats Right For Me resources blog page
    And User is viewing the accordions
    And  User is able to view the each question with a '+' symbol
    And User clicks on '+' symbol
    Then The accordion expands
  @regression @whatsRightForMe_smoke
  Scenario: To verify that the user is able to see a '-' symbol when the accordion is expanded
    When User is in the whats Right For Me resources blog page
    And User is viewing the accordions
    And User clicks on '+' symbol
    And The accordion expands
    Then User is able to view a '-' symbol
  @regression @smoke
  Scenario: To verify that user should be able to view the big size (1192x606) image along with description
    When User is in the whats Right For Me resources blog page
    Then user should be able to see the big size image in 1192x606 pixel in right for me page
    And user should be able to view the description under the image in right for me page
  @regression @whatsRightForMe_smoke
  Scenario: To verify that user should be able to view the small size (736x368) images
    When User is in the whats Right For Me resources blog page
    Then user should be able to see the small size image in 736x368 pixel in right for me page
  @regression @whatsRightForMe_smoke
  Scenario: To verify that User should be able to view the small images in grid format 3 * X Ex: 3*3, 3*6, 3*9, 3*12 etc.
    When User is in the whats Right For Me resources blog page
    Then user should be able to see the small images in grid format
  @regression @smoke
  Scenario: To verify user should see the image in full screen by clicking the image
    When User is in the whats Right For Me resources blog page
    And user clicks any of the grid image
    Then user should see the image carousel in full screen showcases the images
    And user should see the left and right arrow to scroll the imags
    And user should be able to see "<Image no.> of <Total no. of images>" by seeing on the slider
    And user should see the 'X' icon to close the full screen view
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should scroll the carousel right to left by clicking right arrow
    When User is in the whats Right For Me resources blog page
    And user clicks any of the grid image
    And user should see the image carousel in full screen showcases the images
    And user should see the left and right arrow to scroll the imags
    When user clicks right arrow in the image
    Then user should see the carousel has been scrolled to next image
    And user should see the slider count has been updated accordingly
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should scroll the carousel left to right by clicking left arrow for
    When User is in the whats Right For Me resources blog page
    And user clicks any of the grid image
    And user should see the image carousel in full screen showcases the images
    And user should see the right and left arrow to scroll the imags left to right
    When user clicks left arrow in the image
    Then user should see the carousel has been scrolled to previous image
    And user should see the slider count has been updated accordingly
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should close the full screen view by clicking the 'X' icon
    When User is in the whats Right For Me resources blog page
    And user clicks any of the grid image
    And user should see the image carousel in full screen showcases the images
    And user should see the 'X' icon to close the full screen view
    When user clicks the 'X' icon
    Then user should see the full screen view has been closed
    And user should see the images in grid format
  #C-47 Sources HC-1604
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to see  the source cards in 3*1 matrix for less than or equal to 3 sources
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    Then User should see the source cards
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user should see third party site name as the title text along with external icon (Ex: Weedmaps, pubmed, NCBI, Science direct etc), for less than or equal to 3 sources
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    Then User sees third party site name as the title text along with external icon
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify users should be able to view the copy text with a one line briefing of the redirected external page Ex: The heading or Title  of the redirected page, for less than equal to 3 sources
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    Then  User should be able to view the copy text with a one line  briefing of the redirected external page.
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify user should be able to click the title text and be redirected to respective external site page, for less than equal to 3 sources
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    And User clicks on Title Text for external link.
    Then User redirected to respective external site page in new tab.
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify user should be able to click the title text and be redirected to respective internal site page (Always opens in same tab), for less than equal to 3 sources
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    And User clicks on Title Text for internal link.
    Then User redirected to respective internal site page in same tab.
  @regression @smoke @benefitsOfCannabis
  Scenario: To Verify that User should be able to view the horizontal scroll with a left or right scroll when there are more  than 3 sources cards available.
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    Then User should be able to view the horizontal scroll with a left or right scroll
  @regression @smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to view the sources moves 3 cards per slide on clicking on left/right arrows
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    And User clicks on right arrow
    Then User should be able to view the sources moves 3 cards per slide
  @regression @whatsRightForMe_smoke @benefitsOfCannabis
  Scenario: To verify that User should be able to view the indication of total sources(1-3 of 12)
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Source Section.
    And user clicks on the left arrow
    Then User should be able to view the indication of total sources
    #C-09-C12 Banner variants
  @regression @smoke
  Scenario: To verify user should see an icon with small text, when once user is on banner variant A
    When User is in the whats Right For Me resources blog page
    And User scrolls down to the banner section in right for me page
    And User is viewing variant A of the banner
    Then User should see an icon with small text in benefits
  @regression @smoke
  Scenario: To verify user should see a Title Text with less than or equal to 3 lines for  Banner Image
    When User is in the whats Right For Me resources blog page
    And User scrolls down to the banner section in right for me page
    And User is viewing variant A of the banner
    Then User should see a Title Text less than or equal to 3 lines for a Banner Image
  @regression @smoke
  Scenario: To verify user should see CTA on Banner, when once user is on banner variant A
    When User is in the whats Right For Me resources blog page
    And User scrolls down to the banner section in right for me page
    And User is viewing variant A of the banner
    Then User should see CTA on Banner
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should click on CTA on Banner and open in same tab, if for internal link, when once user is on banner variant A
    When User is in the whats Right For Me resources blog page
    And User scrolls down to the banner section in right for me page
    And User is viewing variant A of the banner
    And User clicks on an internal link CTA
    Then User should see link opening in the same tab
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant A
    When User is in the whats Right For Me resources blog page
    And User scrolls down to the banner section in right for me page
    And User is viewing variant A of the banner
    And User clicks on an external link CTA
    Then User should see link opening in the new tab
  #C-19 Carousel Product Variant A/B HC-814
  @regression @smoke
  Scenario: To verify that user should be able to view Product Carousel
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Product Carousel
    Then User is able to view Product Carousel Section
  @regression @smoke
  Scenario: To verify that  user is able to view the Heading ,CTA Button ,Product cards,navigation control
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Product Carousel
    Then user is able to view the Heading
    And User is able to view the Product cards,
    And User is able to view the navigation control
    And User is able to view the CTA Button
  @regression @whatsRightForMe_smoke
  Scenario: To verify that User should be able to view the first 3 or 4 product cards in a row based on the product carousel variant used
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Product Carousel
    Then User should be able to view the first 3 or 4 product cards in a row based on the product carousel variant used
  @regression @smoke
  Scenario: To verify that User should be able to browse the products using left and right arrows in the slider
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Product Carousel
    Then User should be able to browse the products using left and right arrows in the slider
  @regression @whatsRightForMe_smoke
  Scenario: And User should be redirected to the respective PLP page with the appropriate filters on clicking on see all CTA
    When User is in the whats Right For Me resources blog page
    And User scrolls down to Product Carousel
    And user clicks on see all CTA
    Then User should be redirected to the respective PLP page with the appropriate filters
  # C-16 Article Cards Variant A, B HC-486
  @regression @smoke
  Scenario: To verify user should be able to view the view Title text
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    Then User is viewing view Title text
  @regression @smoke
  Scenario: To verify that User should be able to see latest 3 article cards related to Blogs and Recipe section only
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    Then User should be able to see latest 3 article cards related to Blogs and Recipe section only
  @regression @smoke
  Scenario: To verify user should be able to view the article image for each card
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    And User should be able to view the article image for each card
  @regression @smoke
  Scenario: To verify that User is able to see article card  Article Title, Article Description,Category Tags, New Tags, Date(MM-DD-YYYY),
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    And user should is able to voew the Article title
    And user should be able to view the Article Desription
    And user should be able to view the Category Tags
    And user should be able to view the New Tags
    And user should be able to view the Date in (MM-DD-YYYY) format
  @regression @whatsRightForMe_smoke
  Scenario: To verify that user should  be able to view  the date in which the article got published,
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    Then User should be able to view the date in which article get published
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should be able to view the ‘Read the article’ CTA
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    Then user should be able to view the Read the article CTA
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should be redirected to the respective Blog/Recipe   page by clicking on the Title text
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    And user clicks on title text
    Then user should be redirected to the respective Blog&Recipe page
  @regression @whatsRightForMe_smoke
  Scenario: To verify user should be redirected to the respective Blog/Recipe   page by clicking on the Read article CTA
    When User is in the whats Right For Me resources blog page
    And User scroll down to Article Cards Section
    And user clicks on Read Article CTA
    Then user should be redirected to the respective BlogandRecipe page











