Feature: As a user, I should be able to view the FAQ page.

  Background:
    Given user landed on risecannabis Faq "<url>" website
    #And user clicks on Yes in Age gate screen
    And user clicks on the Accept in cookies gate banner
    And user scroll down to footer section
    And user clicks on "FAQ" link available in the Footer section

  @regression @smoke @faq
  Scenario: To verify that user is able to view Title Text, Copy Text and Image
    When User is able to view the FAQ header banner already configured the FAQ components of FAQ
    Then User should be able to view Title Text, Copy Text and Image
  @regression @smoke @faq
  Scenario: To verify user should be able to navigated to respective section on clicking any link
    When User is on FAQ page with Table of Contents
    And User should be able to click on any link
    Then User should see the page being navigated to respective section
  @regression @smoke @faq
  Scenario: To verify user should be able to view the FAQs with answers in an accordion format
    When user is viewing FAQ page
    Then user should be able to view the list of FAQs for the selected topic
    And user should be able click the + symbol to expand the answer
    And user should be able to view the answer for the expanded FAQ
  #need revisit
  @regression @smoke @faq
  Scenario: To verify that user is able to view ‘+’ and ‘-‘ symbols and the accordions should get expanded and collapsed respectively
    When User is able to view the FAQ components in the FAQ section
    Then User should be able to view ‘+’ and ‘-‘ symbols
    And On clicking the accordions should get expanded and collapsed respectively
   #need revisit
  @regression @smoke @faq
  Scenario: To verify that user is able to view One accordion should get closed automatically when any other accordion is opened
    When User is able to view the FAQ components in the FAQ section
    Then User should be able to view ‘+’ and ‘-‘ symbols
    And One accordion should get closed automatically when any other accordion is opened
  #need revisit
  @regression @smoke @faq
  Scenario: To verify that user is able to view the accordion getting expanded on clicking on the whole atom (question part) when closed
    When User is able to view the FAQ components in the FAQ section
    Then User should be able to view ‘+’ and ‘-‘ symbols
    And User should be able to view the accordion getting expanded on clicking on the whole atom (question part) when closed.
  @regression @smoke @faq
  Scenario: To verify user is able to see banner section with title text along with copy text
    When User is on banner help variant in the pages
    Then User should see a Title Text
    And User should see a Copy Text
  @regression @smoke @faq
  Scenario: To verify user wants to click on CTA and get redirect to respective page / link
    When User is on banner help variant in the pages
    And User is on banner help variant in any one of the pages
    Then User should see the CTA.
    And User should click on CTA to redirect to contact us page
  @regression @smoke @faq @desktop
  Scenario: To verify user should see the anchor link of topics should stay Fixed in the desktop
    And user sees the FAQ page
    And user should be able to view the Anchor links of topics located on the left side of the page
    When user should be able scroll down the page
    Then user should see the anchor links of topics should stay fixed in the desktop
  @regression @smoke @faq
  Scenario: To verify user should see Banner Help at the end of the accordion FAQ for desktop view
    And user sees the FAQ page
    And user should be able to view the Anchor links of topics located on the left side of the page
    When user should be able scroll down to end of the page
    Then user should see banner help at end of the accordion FAQ
  @regression @smoke @faq
  Scenario: To verify user should see the global header and footer alway along with FAQ page for desktop view
    When user sees FAQ page
    Then user should see the global header
    And user scroll down to the page
    And user should see the footer
#  @regression @smoke @faq @mobile
#  Scenario: To verify user should be able to view the ToC turning into sticky in the FAQ page
#    When User scrolls down to Footer
#    And User clicks on FAQ link page
#    Then User view the FAQ page
#    And User should see the ToC is turning into sticky
#  @regression @smoke @faq @mobile
#  Scenario: To verify user should be able to see the sticky being expanded as a drawer with a close X icon
#    When User on the sticky in the FAQ page
#    And User should be able to tap on sticky
#    And User should see the the sticky being expanded as a drawer with a close X icon
#  @regression @smoke @faq @mobile
#  Scenario: To verify user should be able to see the sticky being closed on tapping the close X icon
#    When User on the sticky expanded draw in the FAQ page
#    And User should be able to tap on close X icon
#    And User should see the the sticky being closed
