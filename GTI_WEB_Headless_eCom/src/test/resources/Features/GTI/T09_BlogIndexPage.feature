Feature: As a user, I should be able to view Blogs to see list of articles related to it

  Background:
    Given user landed on risecannabis Faq "<url>" website
    #And user clicks on Yes in Age gate screen
    And user clicks on the Accept in cookies gate banner

  @regression  @blog
  Scenario: To verify user is able to see Blogs sub category under Cannabis Insider from global header along with other sub categories
    When user is on the global header
    And user clicks on 'CANNABIS INSIDER' option in the header
    Then user should be able to see Blogs sub category
  @regression  @blog
  Scenario: To verify that user is able to view the Cannabis Insider menu is highlighted and undelined when the user is in the blog index page
    When user is on the global header
    And user clicks on 'CANNABIS INSIDER' option in the header
    And User clicks on the Blogs sub category
    Then user should be able to see the Cannabis Insider menu is highlighted and underlined
  @regression @smoke @blog
  Scenario: To verify that user is redirected to Blogs index Page from from the global header
    When User clicks on Blogs sub category
    Then User lands on the the Blog index page
  @regression @smoke @blog
  Scenario: To verify that user is able to see Hero Article at the top of the page and latest article as part of the hero section by default
    When User is viewing the Blog Index Page
    Then User is able to see Hero Article at the top of the page in BlogIndexPage
    And User is able to see latest article as part of the hero section by default
  @regression @smoke @blog
  Scenario: To verify that a user is able to see Grid Articles with display of remaining blog and recipe articles apart from the one displayed in the hero section
    When User is viewing the Blog Index Page
    Then User is able to see Grid Articles with display of remaining blog and recipe articles apart from the one displayed in the hero section
  @regression @smoke @blog
  Scenario: To verify that a user is able to see Recommended Resources located on the right side of page
    When User is viewing the Blog Index Page
   Then User is able to see Recommended Resources located on the right side of page in BlogIndexPage
  @regression @smoke @blog
  Scenario:To verify that the recommended resources have all the other Cannabis Resources topics than the selected one
    When User is viewing the Blog Index Page
    And User is viewing the recommended resources section
    Then The recommended Resources have all the other Cannabis Resources topics than the selected one in BlogIndexPage
  @regression @smoke @blog
  Scenario: To verify that the user is able to see Localization indicator sticky, Global Header and Footer always along with the page
    When User is viewing the Blog Index Page
    Then User is able to see Localization indicator sticky, Global Header and Footer in BlogIndexPage
  @regression @smoke @blog
  Scenario: To verify that User should be able to view the main title and the overview of a particular article and the image tied to that article
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    Then user should able to view the main title
    And the overview of a particular article
    And the image tied to that article
  @regression @smoke @blog
  Scenario: To verify user is able to view the published date of the article when it got published and in format of MM.DD.YYYY
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    Then user should able to view the published date of the article when it got published and in format of MM.DD.YYYY
  @regression  @blog
  Scenario: To verify that User should be able to see “New” tag assigned  which has less than nor equal to 15 days from published date
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    Then user should able to view “New” tag assigned for the article which has less than nor equal to15 days from published date
  @regression  @blog
  Scenario: To verify user should not be able to view “New” tag assigned for the article which is greater than 15 days from published date
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    #Then user should should not able to view “New” tag for the article which has greater than 15 days from published date(Not feasible)
  @regression @smoke @blog
  Scenario: To verify that User should be able to see “Category“ tag
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    Then user should able to view the Category tag in BlogIndexPage
  @regression @smoke @blog
  Scenario: To verify that User should be able to view the ‘Read more’ CTA
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    Then user should able to view the Read more CTA
  @regression @smoke @blog
  Scenario: To verify that User should navigate to the article content page of that particular article given on clicking Read more CTA
    When User is viewing the Blog Index Page
    And User is viewing the hero article of the Blog Index Page
    And user clicks on Read more CTA
    Then user should be able to navigate to the article content page of that particular article given in BlogIndexPage
  @regression @smoke @blog
  Scenario: To verify that User should be able to view the available categories to be filtered in the pills format along with the number of products/articles falls under that
    When User is viewing the Blog Index Page
    And Filter components are configured
    Then user should be able to view the available categories to be filtered in the pills format along with the number of products or articles falls under that
  @regression  @blog
  Scenario: To verify that User should be view the ‘All’ pill to get highlighted by default
    When User is viewing the Blog Index Page
    And Filter components are configured
    Then User should be view the ‘All’ pill to get highlighted by default
  @regression @smoke @blog
  Scenario: To verify that User should be able to view the pills getting highlighted when selecting them
    When User is viewing the Blog Index Page
    And Filter components are configured
    And User select any of one of the pills Ex: Cannabis
    Then User should be able to view the pills getting highlighted when selecting them
  @regression @smoke @blog
  Scenario:  To verify that User should be able to view the Sort options in a dropdown
    When User is viewing the Blog Index Page
    And Sort  components are configured
    Then User should be able to view the Sort options in a dropdown
  @regression  @blog
  Scenario: To verify that User should be able to view the default sort option
    When User is viewing the Blog Index Page
    And Sort  components are configured
    Then User should be able to view the default sort option
  @regression  @blog
  Scenario: To verify that User should be able to view a tick mark and highlight against the oldest option that has been selected in the dropdown
    When User is viewing the Blog Index Page
    And Sort  components are configured
    And User clicks on oldest option from dropdown
    Then User should be able to view a tick mark and highlight against the option that has been selected in the dropdown
  @regression  @blog
  Scenario: To verify that User should be able to view a tick mark and highlight against the newest option that has been selected in the dropdown
    When User is viewing the Blog Index Page
    And Sort  components are configured
    And User clicks on newest option from dropdown
    Then User should be able to view a tick mark and highlight against the newest option that has been selected in the dropdown
  @regression  @blog
  Scenario: To verify that User should be able to view the dropdown getting closed, when they click anywhere outside the dropdown
    When User is viewing the Blog Index Page
    And Sort  components are configured
    And User clicks anywhere outside the dropdown
    Then User should be able to view the dropdown getting closed
  @regression @smoke @blog
  Scenario: To verify that user should view the image associated with the article, title name, tags and article category label, date in which it got published, brief about the article, Read more’ CTA
    When User is viewing the Blog Index Page
    And user is viewing the grid section in Blog index page
    Then user should view the title text
    And user should view image assosiated with article
    And user should see the new tags, for new articles
    And user should view the categories label
    And user should view the published date
    And user should view the brief about the article
    And user should view the read more cta
  @regression  @blog
  Scenario: To verify user should be able to navigate to the respective article details page when clicking on the read more cta from the grid
    When User is viewing the Blog Index Page
    And user is viewing the article grid section in Blog index page
    And user clicks read more CTA
    Then user should navigate to respective article details page
  @regression @smoke @blog
  Scenario: To verify user should navigate to the respective article details page when clicking on the title from the grid
    When User is viewing the Blog Index Page
    And user is viewing the article grid section in Blog index page
    And user clicks on the title
    Then user should navigate to respective article details page from title
  @regression @smoke @blog
  Scenario: To verify that user is able to view Show more CTA if the article cards in the page is more than 6.
    When User is viewing the Blog Index Page
    And user is viewing the article grid section in Blog index page
    And The articles cards in the page is more than 6.
    Then user is able to view a Show more CTA
  @regression @smoke @blog
  Scenario: To verify that user is able to view the number of cards displayed and total number of cards
    When User is viewing the Blog Index Page
    And user is viewing the article grid section in Blog index page
    And User scrolls down to the bottom of the articles
    Then user should see the number of cards displayed and total number of cards in Showing 6 of 56 format in BlogIndexPage
  @regression @smoke @blog
  Scenario: To verify user is able to view the title, recommended resource name, short description of it, a Read more CTA in the recommended resources section of Blog index page
   When User is viewing the Blog Index Page
   And User is viewing the recommended resources section
   Then  User is able to view the title
   And User is able to view the recommended resource name in BlogIndexPage
   And User is able to view the short description
   And User is able to view a Read more CTA
  @regression @smoke @blog
  Scenario: To verify user should be redirected to the respective index pages on clicking on the ‘Read more’ CTA from the recommended resources
    When User is viewing the Blog Index Page
    And User is viewing the recommended resources section
    And user clicks the read more cta from the description
    Then user should navigate to the respective index page of the particular recommended resource
  @regression @smoke @blog
  Scenario: To verify user should be able to navigate to the respective index pages on clicking on the title from the recommended resources
    When User is viewing the Blog Index Page
    And User is viewing the recommended resources section
    And user clicks the the title from the recommended resources
    Then user should navigate to the respective index page of the particular recommended resource from title

