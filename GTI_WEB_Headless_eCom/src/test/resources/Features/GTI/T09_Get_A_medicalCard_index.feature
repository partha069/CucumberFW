@feature
Feature: As a user, I should be able to view Get a medical cards to see list of articles related to it
Background:
        Given user launches risecannabis "<url>" website
#        And user clicks on Yes in Age gate screen
        And user clicks on the Accept in cookies gate banner
    @webRegression @mobRegression
    Scenario: To verify user is able to see Get a medical cards sub category under Cannabis Insider from global header along with other sub categories
        When user on the global header
        And User clicks on Cannabis Insider from global header
        Then user should be able to see get a medical card as sub category
    @webRegression @mobRegression
    Scenario: To verify that user is redirected to Get a medical cards index Page from from the global header
        And User clicks on Cannabis Insider from global header
        When User clicks on the Get a medical cards sub category
        Then User lands on the the Get a medical card page
    @webRegression @mobRegression @smoke
    Scenario: To verify that user is able to see Hero Article at the top of the page as part of the hero section by default
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User lands on the the Get a medical card page
        Then User is able to see Hero Article at the top of the page
        And user should be able to view the title of the hero article
        And user should be able to view the overview the perticular article
        And user should be able to view the readmore cta under the overview of the article
        And user should able to view the published date of the article when it got published and in format of MMDDYYYY
        And user should able to view the Category tag

    @webRegression @mobRegression @smoke
    Scenario: To verify that a user should not able to view the article in grid article which is displayed in hero article
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User lands on the the Get a medical card page
        Then user should not able to view the article in grid article which is displayed in hero article
    @webRegression @mobRegression @smoke
    Scenario: To verify that a user is able to see Recommended Resources located on the right side of page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User lands on the the Get a medical card page
        Then User is able to see Recommended Resources located on the right side of page
        Then User is able to view view the title heading "recommended resource"
        And User is able to view short description for recommended resources header
    @webRegression @mobRegression
    Scenario: To verify that the recommended resources have all the other Cannabis Resources topics than the selected one
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Recommended Resources located on the right side of page
        Then The recommended Resources have all the other Cannabis Resources topics than the selected one
    @webRegression @mobRegression
    Scenario: To verify that the user is able to see Localization indicator sticky, Global Header and Footer always along with the page
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User lands on the the Get a medical card page
        Then User is able to see Localization indicator sticky, Global Header and Footer

#    @webRegression @mobRegression
#    Scenario: To verify that User should be able to see “New” tag assigned  which has less than nor equal to 15 days from published date
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When User is viewing the hero article of the Get a medical card page
#        Then user should able to view “New” tag assigned for the article which has less than nor equal to15 days from published date
#    @webRegression @mobRegression
#    Scenario: To verify user should not be able to view “New” tag assigned for the article which is greater than 15 days from published date
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When User is viewing the hero article of the Get a medical card page
#        Then user should should not able to view “New” tag for the article which has greater than 15 days from published date

    @webRegression @mobRegression @smoke
    Scenario: To verify that User should navigate to the article content page of that particular article given on clicking Read more CTA
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Hero Article at the top of the page
        And user clicks on Read more CTA in the hero banner
        Then user should be able to navigate to the article content page of that particular article given


    @webRegression @mobRegression @smoke
    Scenario: To verify that user should view the grid article section with details
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When user should be able to view the grid article section
        Then user should view the title text of the articles under the grid section
        And user should view the brief about the article for a articles under the grid section
        And user should view image assosiated with article under the grid section
        And user should see the new tags for a articles under the grid section
        And user should view the categories label for a articles under the grid section
        And user should view the published date for a articles under the grid section
        And user should view the read more cta for a articles under the grid section
#    @webRegression @mobRegression
#    Scenario: To verify that the user is able to view a new tag for the the articles which are less than 15 days
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When user should be able to view the grid article section
#        And The articles is published within last 15 days
#        Then  user is able to view a new tag in the article
#    @webRegression @mobRegression
#    Scenario: To verify that user view the article card in grid format without new tag if the article is published greater than or equal to 15 days
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When user should be able to view the grid article section
#        And The published date of article has crssed 15 days
#        Then  user is not able to view a new tag in the article
    @webRegression @mobRegression
    Scenario: To verify user should be able to navigate to the respective article details page when clicking on the read more cta from hero article
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Hero Article at the top of the page
        And user clicks on Read more CTA from the hero article
        Then user should be able to navigate to the article content page of that particular article given
    @webRegression @mobRegression
    Scenario: To verify user should be able to navigate to the respective article details page when clicking on the read more cta from the grid
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When user should be able to view the grid article section
        And user clicks read more CTA of articles from grid articles section
        Then user should be able to navigate to the article content page of that particular article given
    @webRegression @mobRegression
    Scenario: To verify user should navigate to the respective article details page when clicking on the title from the grid
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When user should be able to view the grid article section
        And user clicks on the title of articles from grid articles section
        Then user should be able to navigate to the article content page of that particular article given
#    @webRegression @mobRegression
#    Scenario: To verify that user is able to view Show more CTA if the article cards in the page is more than 6
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When user should be able to view the grid article section
#        And The articles cards in the page is more than 6
#        Then  user is able to view a Show more CTA
#    @webRegression @mobRegression
#    Scenario: To verify user shouldn't view Show more CTA if article cards are less than 6
#        And User clicks on Cannabis Insider from global header
#        And User clicks on the Get a medical cards sub category
#        When user should be able to view the grid article section
#        And The articles cards in the page is less than 6
#        Then  user should not be able to view the Show more CTA
    @webRegression @mobRegression
    Scenario: To verify that user is able to view the number of cards displayed and total number of cards
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When user should be able to view the grid article section
        And User scrolls down to the bottom of the grid articles
        Then user should see the number of cards displayed and total number of cards in Showing 6 of 56 format
    @webRegression @mobRegression
    Scenario: To verify user is able to view the recommended resources with the details
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Recommended Resources located on the right side of page
        Then User is able to view the title for recommended resources
        And User is able to view the recommended resource name
        And User is able to view the short description of recommended resource
        And User is able to view a Read more CTA of recommended resource
    @webRegression @mobRegression
    Scenario: To verify user should be redirected to the respective index pages on clicking on the ‘Read more’ CTA from the recommended resources
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Recommended Resources located on the right side of page
        And user clicks the read more cta from the description of recommended resources
        Then user should navigate to the respective index page of the particular recommended resource
    @webRegression @mobRegression
    Scenario: To verify user should be able to navigate to the respective index pages on clicking on the title from the recommended resources
        And User clicks on Cannabis Insider from global header
        And User clicks on the Get a medical cards sub category
        When User is able to see Recommended Resources located on the right side of page
        And user clicks the title from the recommended resources
        Then user should navigate to the respective index page of the particular recommended resource
