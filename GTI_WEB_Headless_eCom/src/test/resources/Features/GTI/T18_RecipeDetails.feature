Feature: User should be abe to view a Recipe page
Background:
        Given user launches risecannabis "<url>" website
#        And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
        And User clicks on Cannabis Insider from global header
        And user clicks recipes from subcategories to navigate into the recipe index page
        And user click anyof the recipe from the grid article
    @webRegression @mobRegression @test-123 @smoke
    Scenario: To verify user is able to view the hero image in background, the Article  title, and the description of a particular article
        When user is on the Recipe details page
        Then user should able to view the hero image in background
        And user should able to view the Article  title and the overview of a particular article
        And user should able to view the description of the article
    @webRegression @mobRegression
    Scenario: To verify user is able to view the published date of the article when it got published and in format of MMDDYYYY
        When user is on the Recipe details page
        Then User should able to view the published date in format
    @webRegression @mobRegression
    Scenario: To verify user is able to view “New” tag for the article which has less than or equal to 15 days from published date
        When user is on the Recipe details page
        Then User should able to view New tag for the article which has less than nor equal to15 days from published date
    @webRegression @mobRegression @test-123 @smoke
    Scenario: To verify user is able to view the Category tag as "Recipes"  in the article section
        When user is on the Recipe details page
        Then user should able to view the Category tag as "Recipes"  in the article section
#
    @webRegression @mobRegression
    Scenario: To verify user able to view the estimated cooking time as label in article section
        When user is on the Recipe details page
        Then User should able to view the estimated cooking time as label

#    Banner statement to be added to the recipe details page

#    @webRegression @mobRegression
#    Scenario: To verify user should see an icon in the center, once when user redirected  to particular page
#        When User scrolls down to Banner statement
#        Then User should see an icon in the center
#        And User should see a Title Text with 3 to 4 lines
#    @webRegression @mobRegression
#    Scenario: To verify user should click on 'CTA' for internal link to get redirect to respective/link page in same tab
#        When User scrolls down to Banner statement
#        And User is on banner statement
#        And User should click on CTA to redirect to respective page/link which opens on same tab always
#    @webRegression @mobRegression
#    Scenario: To verify user should click on 'CTA' for external link to get redirect to respective/link page in new tab
#        When User scrolls down to Banner statement
#        And User is on banner statement
#        And User should click on CTA to redirect to respective page/link which opens on new tab always


    @webRegression @mobRegression
    Scenario: To verify user should see an icon with small text, when once user is on banner variant A
        When user is on the Recipe details page
        And User scroll downs to banner information in recipe details page for variant A
        And User is on banner information variant A
        Then User should see an icon with small text on banner information variant A
        And User should see a Title Text with 1 or 2 lines for banner information variant A
        And user should be able to view the CTA on banner information variant A

    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tab, if for internal link, when once user is on banner variant A
        When user is on the Recipe details page
        And User scroll downs to banner information in recipe details page for variant A
        And User should click on CTA on banner information variant A
        Then User should see link is open in same tab from banner information variant A
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant A
        When user is on the Recipe details page
        When User scroll downs to banner information in recipe details page for variant A
        And User should click on CTA on banner information variant A
        Then User should see link is open in new tab from banner information variant A


#    Information banner variant A internal link to be implemented

#    @webRegression @mobRegression
#    Scenario: To verify user should see a background image in the banner along with background color, when once user is on banner variant A
#        And User should scroll down to respective banner variant A
#        When User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a background image in the banner along with background color
#    @webRegression @mobRegression
#    Scenario: To verify user should see a small image on top of the banner, when once user is on banner variant A
#        And User should scroll down to respective banner variant A
#        When User is on banner variant A in any one of the pages
#        And User should click on CTA on Banner Image
#        Then User should see a small image on top of the banner


    @webRegression @mobRegression
    Scenario: To verify user should see an icon with small text, when once user is on banner variant B
        When user is on the Recipe details page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should see an icon with small text on banner information variant B
         And User should see a Title Text with 1 or 2 lines for banner information variant B
         And User should see a copy text with 1 or 2 lines for banner information variant B
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant B
        When user is on the Recipe details page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should click on CTA on banner information variant B
#        And User should see link is open in same tab
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant B
        When user is on the Recipe details page
        And User should scroll down to respective banner information variant B
        When User is on banner information variant B in any one of the pages
        Then User should click on CTA on banner information variant B
#        And User should see link is open in new tab

#    Information banner variant B internal link to be implemented

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


    @webRegression @mobRegression
    Scenario: To verify user should see a Title Text with 1 or 2 lines, when once user is on banner variant C
        When user is on the Recipe details page
        And User should scroll down to respective banner variant C
        Then User should see a Title Text with 1 or 2 lines
        Then User should see a Copy text with 1 or 2 lines
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in same tap, if for internal link, when once user is on banner variant C
        When user is on the Recipe details page
        And User should scroll down to respective banner variant C
        Then User should click on CTA on Banner Image
#        And User should see link is open in same tab
    @webRegression @mobRegression
    Scenario: To verify user should click on CTA on Banner and open in new tap, if for external link, when once user is on banner variant C
        When user is on the Recipe details page
        And User should scroll down to respective banner variant C
        Then User should click on CTA on Banner Image
#        And User should see link is open in new tab
    @webRegression @mobRegression
    Scenario: To verify user should see a background image in the banner along with background color, when once user is on banner variant C
        When user is on the Recipe details page
        And User should scroll down to respective banner variant C
        And User should click on CTA on Banner Image
        Then User should see a background image in the banner along with background color
    @webRegression @mobRegression
    Scenario: To verify user should see a Logo image on top of the banner, when once user is on banner variant C
        When user is on the Recipe details page
        And User should scroll down to respective banner variant C
        Then User should see a Logo image on top of the banner

#    @webRegression @mobRegression
#    Scenario: To verify that user is able to view each question with a '+' symbol
#        When User is viewing the accordions
#        Then User is able to view the each question with a '+' symbol
#    @webRegression @mobRegression
#    Scenario: To verify that the accordions get expanded on clicking the '+' symbol
#        When User is viewing the accordions
#        And  User is able to view each question with a '+' symbol
#        And User clicks on '+' symbol
#        Then The accordion expands
#        And User is able to view appropriate answer with proper format
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to see a '-' symbol when the accordion is expanded
#        When User is viewing the accordions
#        And User clicks on '+' symbol
#        And The accordion expands
#        Then User is able to view a '-' symbol
#    @webRegression @mobRegression
#    Scenario: To verify that the accordions gets collapsed on clicking the '-' symbol
#        When User is viewing the accordions
#        And User clicks on '+' symbol
#        And The accordion expands
#        And User is able to view a '-' symbol
#        Then Accordion gets collapsed
#    @webRegression @mobRegression
#    Scenario: To verify that one accordion is getting  closed automatically when any other accordion is opened
#        When User is viewing the accordions section
#        And User expands an accordion
#        And User expands another accordion
#        Then User is able to view the first  accordion getting  closed automatically when any other accordion is opened
#    @webRegression @mobRegression
#    Scenario: To verify that user is able to see the text in red color bullet poi   xnts with title listed one by one
#        When User is viewing the text in bullet points witth title
#        Then User is able to view the text  in bullet points listed one by one
#        And User is able to see the bullet points in red color
#    @webRegression @mobRegression
#    Scenario: To verify that user is able to see the numbering points in leaf green color listed one by one
#        When User is viewing the text in numbering points
#        Then User is able to view the text  in numbering points listed one by one
#        And User is able to see the numbering points in leaf color
#    @webRegression @mobRegression
#    Scenario: To verify user should see the image in full screen by clicking the image
#        And user navigates to the Recipe details page
#        When user clicks any of the grid image
#        Then user should see the image carousel in full screen showcases the images
#        And user should see the left and right arrow to scroll the imags
#        And user should be able to see "<Image no> of <Total no of images>" by seeing on the slider
#        And user should see the 'X' icon to close the full screen view
#    @webRegression @mobRegression
#    Scenario: To verify user should scroll the carousel right to left by clicking right arrow
#        And user navigates to the Recipe details page
#        And user clicks any of the grid image
#        And user should see the image carousel in full screen showcases the images
#        And user should see the left and right arrow to scroll the imags
#        When user clicks right arrow in the image
#        Then user should see the carousel has been scrolled to next image
#        And user should see the slider count has been updated accordingly
#    @webRegression @mobRegression
#    Scenario: To verify user should scroll the carousel left to right by clicking left arrow for
#        And user navigates to the Recipe details page
#        And user clicks any of the grid image
#        And user should see the image carousel in full screen showcases the images
#        And user should see the right and left arrow to scroll the imags left to right
#        When user clicks left arrow in the image
#        Then user should see the carousel has been scrolled to previous image
#        And user should see the slider count has been updated accordingly
#    @webRegression @mobRegression
#    Scenario: To verify user should close the full screen view by clicking the 'X' icon
#        And user navigates to the Recipe details page
#        And user clicks any of the grid image
#        And user should see the image carousel in full screen showcases the images
#        And user should see the 'X' icon to close the full screen view
#        When user clicks the 'X' icon
#        Then user should see the full screen view has been closed
#        And user should see the images in grid format
    @webRegression @mobRegression
    Scenario: To verfiy that User should be able to view the table of content on the left side of the page
        When user is on the Recipe details page
        Then User should be able to view the table of content on the left  side of the page
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the section heading within the page in a link format
        When user is on the Recipe details page
        Then User should be able to view the section heading within the page in a link format
    @webRegression @mobRegression
    Scenario: To verify user should be able to view the links getting highlighted when they click on it
        When user is on the Recipe details page
        And User clicks on the links
        Then User should be able to view the links getting highlighted
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the link is getting highlighted with a red line on top to indicate the particular section user is seeing
        When user is on the Recipe details page
        And User clicks on the links
        Then view the link is getting highlighted with a red line on top to indicate the particular section user is seeing
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the link is getting highlighted with a red line on top to indicate the particular section user is seeing
        When user is on the Recipe details page
        And User clicks on the links
        Then view the link is getting highlighted with a red line on top to indicate the particular section user is seeing
    @webRegression @mobRegression
    Scenario: To verify user should be able to navigated to respective section on clicking any link
        When user is on the Recipe details page
        And User should be able to click on any link
        Then User should see the page being navigated to respective section

