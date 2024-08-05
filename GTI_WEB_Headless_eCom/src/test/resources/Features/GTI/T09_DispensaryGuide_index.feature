@feature
Feature: As a user, I should be able to view Blogs to see list of articles related to it
    Background:
        Given user launches risecannabis "<url>" website
#        And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
#    @webRegression @mobRegression
#    Scenario: To  verify that User should be able to see appropriate breadcrumb
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When User is on the Dispensary guide index page
#        Then User should be able to see appropriate bredcrumb
    @webRegression @mobRegression @smoke
    Scenario: To verify that User should be able to view the main heading and description dispensary guide index page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is on the Dispensary guide index page
        Then User is able to view the main heading of dispensary guide index page
        And User is able to view the main description of dispensary guide index page
    @webRegression @mobRegression @smoke
    Scenario: To verify that user is able to see Hero Article at the top of the page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is on the Dispensary guide index page
        Then User is able to see Hero Article at the top of the page
    @webRegression @mobRegression
    Scenario: To verify that user is able to see latest article as part of the hero section by default
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is on the Dispensary guide index page
        Then User is able to see Hero Article at the top of the page
        And user should be able to view the title of the hero article
        And user should be able to view the overview the perticular article
        And user should be able to view the readmore cta under the overview of the article


#    @webRegression @mobRegression
#    Scenario: To verify that User should be able to see “New” tag assigned  which has less than nor equal to 15 days from published date
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When User is viewing the hero article of the Dispensary guide Page
#        Then user should able to view “New” tag assigned for the article which has less than nor equal to15 days from published date
#    @webRegression @mobRegression
#    Scenario: To verify user should not be able to view “New” tag assigned for the article which is greater than 15 days from published date
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When User is viewing the hero article of the Dispensary guide Page
#        Then user should should not able to view “New” tag for the article which has greater than 15 days from published date

    @webRegression @mobRegression
    Scenario: To verify that User should navigate to the article content page of that particular article given on clicking Read more CTA
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is able to see Hero Article at the top of the page
        And user clicks on Read more CTA from the hero article
        Then user should be able to navigated to the perticular dispensary details page
#
#
#    Geo location is not integrated
#
#    @webRegression @mobRegression
#    Scenario: To verify that a user is able to see respective geolocated resources article for the dispensary guide index pages
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When User is viewing the state laws Page
#        Then user is able to view respective geolocated resources article for the dispensary guide index pages
#    @webRegression @mobRegression
#    Scenario: To verify that a user is able to see a default Illinois specific dispensary guide index page if at all there is no content for the geolocated state
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When User clicks on the Dispensary guide sub category
#        And No dispensary guide index exists for the geolocated state
#        Then user is able to view a default Illinois specific dispensary guide index page

    @webRegression @mobRegression @smoke
    Scenario: To verify that user should view the image associated with the grid articles, title name, tags and Resources label, date in which it got published, brief about the article, Read more’ CTA
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is on the Dispensary guide index page
        Then user should be able to view the grid article section
        Then user should view the title text of the articles under the grid section
        And user should view the brief about the article for a articles under the grid section
        And user should view image assosiated with article under the grid section
        And user should see the new tags for a articles under the grid section
#        And user should view the categories label for a articles under the grid section
#        And user should view the published date for a articles under the grid section
        And user should view the read more cta for a articles under the grid section
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view a new tag for the the articles which are less than 15 days
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When user should be able to view the grid article section
##        And The articles is published within last 15 days
##        Then  user is able to view a new tag in the article
#    @webRegression @mobRegression
#    Scenario: To verify that user view the article card in grid format without new tag if the article is published greater than or equal to 15 days
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When user should be able to view the grid article section
##        And The published date of article has crssed 15 days
##        Then  user is not able to view a new tag in the article
    @webRegression @mobRegression @smokes
    Scenario: To verify user should be able to navigate to the respective article details page when clicking on the read more cta from the grid
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When user should be able to view the grid article section
        And user clicks read more CTA of articles from grid articles section
        Then user should be able to navigated to the perticular dispensary details page
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective article details page when clicking on the title from the grid
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When user should be able to view the grid article section
        And user clicks on the title of articles from grid articles section
        Then user should be able to navigated to the perticular dispensary details page
#    @webRegression @mobRegression
#    Scenario: To verify that user is able to view Show more CTA if the article cards in the page is more than 6
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When user is viewing the article grid section in Dispensary guide page
#        And The articles cards in the page is more than 6.
#        Then  user is able to view a Show more CTA
#    @webRegression @mobRegression
#    Scenario: To verify user shouldn't view Show more CTA if article cards are less than 6
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Dispensary guide sub category
#        When user is viewing the article grid section in Dispensary guide page
#        And The articles cards in the page is less than 6.
#        Then  user should not be able to view the Show more CTA
    @webRegression @mobRegression
    Scenario: To verify that user is able to view the number of cards displayed and total number of cards
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When user should be able to view the grid article section
        And User scrolls down to the bottom of the grid articles
        Then user should see the number of cards displayed and total number of cards in Showing 6 of 56 format

    @webRegression @mobRegression
    Scenario: To verify that user is able to view the Grid Articles with display of remaining state laws apart from the one displayed in the hero section
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When user should be able to view the grid article section
        Then user should not able to view the article in grid article which is displayed in hero article
    @webRegression @mobRegression @smoke
    Scenario: To verify that a user is able to see Recommended Resources located on the right side of page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is on the Dispensary guide index page
        Then User is able to see Recommended Resources located on the right side of page
    @webRegression @mobRegression
    Scenario: To verify that User should be able to view the title heading "recommended resource "and short description of it
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is able to see Recommended Resources located on the right side of page
        Then User is able to view view the title heading "recommended resource"
        And User is able to view short description for recommended resources header
    @webRegression @mobRegression
    Scenario: To verify that the recommended resources have all the Cannabis Resources topics than the selected one
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is able to see Recommended Resources located on the right side of page
        Then The recommended Resources have all the other Cannabis Resources topics than the selected one
    @webRegression @mobRegression
    Scenario: To verify user is able to view the title, recommended resource name, short description of it, a Read more CTA in the recommended resources section of Dispensary guide page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is able to see Recommended Resources located on the right side of page
        Then  User is able to view the recommended resource name
        And User is able to view the short description of recommended resource
        And User is able to view a Read more CTA of recommended resource
    @webRegression @mobRegression
    Scenario: To verify user should be redirected to the respective index pages on clicking on the ‘Read more’ CTA from the recommended resources
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When User is able to see Recommended Resources located on the right side of page
        And user clicks the read more cta from the description of recommended resources
        Then user should navigate to the respective index page of the particular recommended resource
    @webRegression @mobRegression
    Scenario: To verify user should be able to navigate to the respective index pages on clicking on the title from the recommended resources
        And User clicks on Cannabis Insider from global header
        And User clicks on the Dispensary guide sub category
        When  User is able to see Recommended Resources located on the right side of page
        And user clicks the title from the recommended resources
        Then user should navigate to the respective index page of the particular recommended resource
