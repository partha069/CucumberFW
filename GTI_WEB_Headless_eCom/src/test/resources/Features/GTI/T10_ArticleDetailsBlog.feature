   Feature: Verify As a user, I should be able to see Article Details Blog Page.


    Background:
    Given user lands on risecannabis website
      #And user clicks on Yes in Age gate screen
      #And user cliclks  on the Accept in cookies gate banner
      And user clicks on the Accept in cookies gate banner
      And Scrolls down to Article section
      And Clicks on any Article Card

   #@webRegression @mobRegression @smoke
   Scenario: User should able to refreshing page and see page is loaded
   And User is viewing the page loaded once refresh page
   Then User should be able to see Hero Article Detail at the top of the page below global header

    @webRegression @mobRegression
    Scenario: User should be able to view a Hero Article Details page & ‘Back to Cannabis Insider’ on Banner.
    Then User should be able to see Hero Article Detail at the top of the page below global header
    Then User should be able to see breadcrumb Back to Cannabis Insider on Banner
    And User clicks on Back to Cannabis Insider breadcrumb link
    #Then User is able to navigate to the respective index page

    @webRegression @mobRegression @smoke
    Scenario: User is able to view the hero image in background, the Article  title, and the description/copy text/overview of a particular article
    Then User should able to view the hero image in background
    And User should able to view the Article title and the overview of a particular article
    And User should able to view the description or copy text or overview of the article

    @webRegression @mobRegression
    Scenario: User should be able to see date format as MM.DD.YYYY, New tag and Cannabis 101
    Then User should able to view the published date of the article when it got published
    And User should able to view the published date in format
    Then User should able to view New tag for the article which has less than nor equal to15 days from published date
    Then User should able to view the Category tag as Cannabis 101 in the article section
    Then User should able to view the estimated time along with timer icon

    @webRegression @mobRegression
    Scenario: User should be able to view the Title text in bold, red line above the title text, section heading within the page in a link format, line on top to indicate the particular section
    Then User is able to view the Title text in bold
    And User is able be able to view a red line above the title text
    Then User should be able to view the section heading within the page in a link format
    And User clicks on the links
    Then User views the link is getting highlighted with a red line on top to indicate the particular section user is seeing

    @webRegression
    Scenario: User should be able to view, clicking on any link user will be taking to the respective section (Desktop)
    Then User is able to view the Title text in bold
    And User should be able to click on any link user should see the page being navigated to respective section

    @mobRegression
    Scenario: User should be able to view, clicking on any link user will be taking to the respective section (Mobile)
    Then User is able to view the Title text in bold
    And User should be able to click on any link user should see the page being navigated to respective section for Mobile

    @webRegression
    Scenario: User should be able to reach to particular section by scrolling down and for same Link should also be highlighted
    When User scrolls down the page to view a particular section then The Link should also be highlighted

    @mobRegression
    Scenario: User should be able to reach to particular section by scrolling down and for same Link should also be highlighted For Mobile
    When User scrolls down the page to view a particular section then The Link should also be highlighted For Mobile

    #@regression @blog //Partially - ToC being scrolled in background behind (need to Add from CMS) >> 11 (Manual Team Bucket for Now)
    Scenario: User should be navigated Large Banner Section C09
    When User is navigated to any large banner as Banner C09
    Then User should be able to see the anchor links or ToC being scrolled in background behind for C09

    #@regression @blog //Partially - ToC being scrolled in background behind (need to Add from CMS) (Manual Team Bucket for Now)
    Scenario: User should be navigated large banner as Sources C47
    And User is navigated to any large banner as Sources C47
    Then User should be able to see the anchor links or ToC being scrolled in background behind

    #@regression @blog //Partially - ToC being scrolled in background behind (need to Add from CMS) (Manual Team Bucket for Now)
    Scenario: User should be navigated Product Carousel C18
    And User is navigated to any large banner as Product Carousel C18
    Then User should be able to see the anchor links or ToC being scrolled in background behind for Product Carousel C18

    #@mobileRegression @webRegression @blog //Partially - ToC being scrolled in background behind (need to Add from CMS) (Manual Team Bucket for Now)
    Scenario: User should be navigated Related articles C16
    And User is navigated to any large banner as Related articles C16
    Then User should be able to see the anchor links or ToC being scrolled in background behind for Related articles C16

    @webRegression @mobRegression
    Scenario: User is able to view the text written inside a quote symbol
    Then User is able to view the text written inside a quote symbol
    #And Quote symbol is in red in colour

    @webRegression @mobRegression
    Scenario: user is able to view each question with a '+' & '-' symbol and its functionality
    When User is viewing the accordions
    Then User is able to view the each question with a '+' symbol
    And User click on + Symbol
    And User should able to view the accordions get expanded
    And User click on - Symbol
    And User should able to view the accordions get collapsed

    #@regression @blog //For Colour R&D
    Scenario: User should be able to see text with bullet points
    Then User is viewing the text in bullet points with title
    Then User is able to see the numbering points in leaf color


     #Scenario: User should be able to view the big size image along with description  // Not Developed
     #When User navigates to the articles page
     #Then user should be able to see the big size image in 1192x606 pixel
     #And user should be able to view the description under the image
     #Then user should be able to see the small size image in 736x368 pixel
     #Then user should be able to see the small images in grid format 3 x 'X'"
     #When user clicks any of the grid image
     #Then user should see the image carousel in full screen showcases the images
     #And user should see the left and right arrow to scroll the imags
     #And user should be able to see "<Image no.> of <Total no. of images>" by seeing on the slider
     #And user should see the 'X' icon to close the full screen view

    @webRegression @mobRegression
    Scenario:To verify that User should be able to see embedded video
    When User is on an article details page
    And User should see embedded video
    Then User should be able to play video
    #And User should be able to view teh description under the video

    #C-08, C-09, 10 and C12 Banner variants - in Manual Bucket

     @webRegression @mobRegression
     Scenario: User wants to verify Article Cards Section
     When User scroll down to Article Cards Section
     Then User is viewing view Title text
     Then User should be able to see latest 3 article cards related to Blogs and Recipe section only
     And user should is able to view the Article title
     And User should be able to view the Article Description
     And user should be able to view the Category Tags
     #And user should be able to view the New Tags
     And user should be able to view the Date in MM-DD-YYYY format
     #Then User should be able to view the date in which article git published // Automation Cannot Check for the exact date when its published
     #Then user should able to view the overriden published date in Article with the format of MM.DD.YYYY // Automation Cannot validate date format
     Then user should be able to view the Read the article CTA

     @webRegression @mobRegression
     Scenario: User wants to verify Blog or Recipe page clicking / tapping on Article Cards Section or Read Article CTA
     When User scroll down to Article Cards Section
     And user clicks on title text
     Then user should be redirected to the respective Blog or Recipe page
     When User scroll down to Article Cards Section
     And user clicks on Read Article CTA
     #Then user should be redirected to the respective Blog or Recipe page
     #When User scroll down to Article Cards Section
     #Then user should be able to see CTA to see all results
     #And user clicks on See al results CTA
     #Then user should be redirected to the respective Blog Index Page // Link or Navigation not developed yet