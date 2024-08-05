Feature: Verify the user should lands on rewards page and verify page.


    Background:
    Given user lands on risecannabis website
      #And user clicks on Yes in Age gate screen
      #And user clicks on the Accept in cookies gate banner
      And User clicks on Rewards option from global header

    @webRegression @mobRegression @smoke
    Scenario: User should able to view the Hero banner with the title text, Copy text,image ,RISE Rewards Logo and Join Now CTA
        When User is viewing the Rewards Hero Banner
        Then User should able to view Title Text
        And User should able to view Copy Text
        And User should able to view image
        And User should able to view RISE Rewards Logo
        And User should be able to view the ‘Join now’ CTA

    #@smoke
    Scenario: User should able to refreshing page and see page is loaded
        And User is viewing the page loaded once refresh page
        When User is viewing the Rewards Hero Banner

    #@Dispensaries is not devolved yet
    #Scenario: user should able to view the Hero banner with the title text, Copy text,image ,RISE Rewards Logo and Join Now CTA ( For MN, it should be Text logo)
       #When User clicks on Dispensaries in the header
       #And User clicks on Minnesota from the state list
       #And User is at the top of the page
       #And user clicks on 'REWARDS' option  from global header
       #Then User should be able to view the Hero banner
       #And User should able to view Title Text
       #And User should able to view Copy Text
       #And User should able to view image
       #And User should able to view RISE Rewards Logo
       #And User should be able to view the ‘Join now’ CTA

    @webRegression @mobRegression
    Scenario: User is able to view the Member Benefit section along with the  title and copy text
        When User scroll down to the Member Benefit section
        Then User is able to view the Member Benefit Section
        And User should be able to view the section Title Text
        And User should be able to view the section Copy Text

    @webRegression @mobRegression
    Scenario: User is able to view the benefit cards with the benefit name along with the benefit icon
        When User scroll down to the Member Benefit section
        Then User should be able to view the Benefit Card
        And User should be able to view the Benefit name along with the benefit icon

    @webRegression @mobRegression
    Scenario: User should be able to view the number of cards that have been scrolled (( eg: 1-4 of 6)
        When User scroll down to the Member Benefit section
        And User is able to view less than or equal to 4 benefits card
        And User should not be able to view the horizontal scroll with left or right scroll

    @mobRegression
    Scenario: User should be able to view the number of cards that have been shown (eg: Showing 4 of 6)
        When User scroll down to the Member Benefit section
        Then User is able to view more than 4 benefits cards
        And User should be able to view the number of cards that have been shown

    @mobRegression
    Scenario: User should be able to view the Show more CTA with the number of benefit cards that are yet to be displayed
        When User scroll down to the Member Benefit section
        Then User is able to view more than 4 benefits cards
        And User should be able to view the the Show more CTA with the number of benefit cards that are yet to be displayed

    @mobRegression
    Scenario: User tapping on show more should display all the member benefit cards
        When User scroll down to the Member Benefit section
        Then User should be able to view all the remaining benefit cards

    @webRegression @mobRegression
    Scenario: User is able to view the banner image matrix with the points division
        When User scroll down to the Point Matrix section
        Then User is able to view the Point matrix with points division Banner image

    @webRegression @mobRegression
    Scenario: User is able to view the Title text,Copy Text and join now CTA,banner image
        When User scroll down to the Point Matrix section
        Then User should be able to view the Title text
        And User should be able to view the Copy Text
        And User should be able to view the Join now CTA
        And User should be able to view the Banner image

    @mobRegression
    Scenario: User is able to view the How it work section along with Title Text
        When User scroll down to the How it works section
        Then User is able to view the How its work Section
        And User should be able to view the section Title Text for How its work

    @mobRegression
    Scenario: User is able to view the images,image tittle text,image Copy Text,tooltip icon against the Image title
        When User scroll down to the How it works section
        Then User should be able to view the images
        And User should be able to view the  image title text
        And User should be able to view the  image Copy Text
        And User should be able to view the tooltip icon against the image title

    @webRegression
    Scenario: User is able to view Tooltip text box with relevant copy text when hovers on tooltop
        When User scroll down to the How it works section
        And User hovers on tooltip icon
        Then User should be able to view the Tooltip text box with relevant copy text

    @mobRegression
    Scenario: User is able to view Tooltip text box with relevant copy text when  tapping on tooltiop
        When User scroll down to the How it works section
        And User taps on Tooltip text box icon
        Then User is able to view Tooltip text box with relevant copy

    @mobRegression
    Scenario: User is able to close the tooltip text box after tapping on the close icon in the tooltip text box
        When User scroll down to the How it works section
        And User taps on Tooltip text box icon
        And User taps on the close icon
        #Then User should be able to close the tooltip text box

    @webRegression @mobRegression @rewardstest
    Scenario: User wants to see banner variant A, Text and  primary Button on the same page with small text along with icon
        When User scrolls down to the Banner Variant A
        Then User is on banner variant A Text and primary Button
        And User should see an icon with small text
        And User should be able to view the image title text with primary button
        And User should see a copy text

    @webRegression @mobRegression @rewardstest
    Scenario: User can see 'CTA' available in the banner variant A Text + primary Button.
        When User scrolls down to the Banner Variant A
        And User should see a CTA on any one of the page.

    #@regression @rewards
    #Scenario: User can click on CTA for internal link to get redirect to respective/link page in same tab.
        #When User scrolls down to the Banner Variant A
        #And User should click on CTA
        #And User should  redirect to respective page/link which opens on same tab always.

    #@regression @rewards
    #Scenario: User can click on 'CTA' for external link to get redirect to respective/link page in new tab.
        #When User scrolls down to the Banner Variant A
        #And User should click on CTA
        #And User should  redirect to respective page/link which opens in new tab always.

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view Title Text, Copy Text and Image for FAQ page
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        And User should be able to view Title Text
        And user should be able to view Copy Text
        And user should be able to view Image

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view ‘+’ and ‘-‘ symbols
        When User scroll down to the FAQ Component section
        And User should be able to view the FAQ Section
        And User should be able to view + and - symbols

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view the accordions should get expanded on click ' + ' symbol
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        And User click on + Symbol
        And User should able to view the accordions get expanded

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view the accordions should get collapsed on click ' - ' symbol
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        And User click on + Symbol
        And User click on - Symbol
        And User should able to view the accordions get collapsed

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view One accordion should get closed automatically when any other accordion is opened
        When User scroll down to the FAQ Component section
        Then User sees the FAQ Section
        And User clicks on accordion.
        And User sees one accordion should get closed automatically when any other accordion is opened

    @webRegression @mobRegression @rewardstest
    Scenario: User is able to view the accordion getting expanded on clicking on the whole atom (question part) when closed
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        And User clicks on the whole atom and user sees the accordion getting expanded.
        #(question part when closed).

    #@regression @rewards @cms >>>>>> POOJA <<<<<<<
    #Scenario: User is able to view CTA to show the entire set of FAQs  - when the list is more than 8
        #When User scroll down to the FAQ Component section
        #Then User should be able to view the FAQ Section
        #And User is able to view more than 8 set of FAQs under the FAQ section
        #And User should be able to view the CTA to show the entire set of FAQs

    @webRegression @mobRegression
    Scenario: User is able to view the total number of FAQs present in that section
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        #And User is able to view more than 8 set of FAQs under the FAQ section >>>> CMS
        And User should be view the total number of FAQs present in that section
        #(eg: ‘Showing 4 of 8’)

    @webRegression @mobRegression
    Scenario: User is able to view the remaining number of accordions or FAQs present on the CTA - when the list is more than 8
        When User scroll down to the FAQ Component section
        Then User should be able to view the FAQ Section
        #And User is able to view more than 8 set of FAQs under the FAQ section >>>> CMS
        And User should be able to view the remaining number of accordions or FAQs present on the CTA
        #(eg: ‘Show more (4)’)








    

    @rewards
    Scenario: Rewards Page
        When User is viewing the Rewards Hero Banner
        Then User should able to view Title Text
        And User should able to view Copy Text
        And User should able to view image
        And User should able to view RISE Rewards Logo
        And User should be able to view the ‘Join now’ CTA

        When User scroll down to the Member Benefit section
        Then User is able to view the Member Benefit Section
        And User should be able to view the section Title Text
        And User should be able to view the section Copy Text
        And User should be able to view the Benefit name along with the benefit icon
        And User is able to view less than or equal to 4 benefits card
        And User should not be able to view the horizontal scroll with left or right scroll

        When User scroll down to the Point Matrix section demo
        Then User is able to view the Point matrix with points division Banner image
        Then User should be able to view the Title text
        And User should be able to view the Copy Text
        And User should be able to view the Join now CTA
        And User should be able to view the Banner image

        When User scroll down to the How it works section demo
        Then User is able to view the How its work Section
        And User should be able to view the section Title Text for How its work
        Then User should be able to view the images
        And User should be able to view the  image title text
        And User should be able to view the  image Copy Text
        And User should be able to view the tooltip icon against the image title
        And User hovers on tooltip icon
        Then User should be able to view the Tooltip text box with relevant copy text

        When User scrolls down to the Banner Variant A demo
        Then User is on banner variant A Text and primary Button
        And User should see an icon with small text
        And User should be able to view the image title text with primary button
        And User should see a CTA on any one of the page.

        When User scroll down to the FAQ Component section demo
        Then User should be able to view the FAQ Section
        And User should be able to view Title Text
        And user should be able to view Copy Text
        And user should be able to view Image
        And User should be able to view + and - symbols
        And User click on + Symbol
        And User should able to view the accordions get expanded
        And User sees one accordion should get closed automatically when any other accordion is opened
        And User clicks on the whole atom and user sees the accordion getting expanded.
        And User should be view the total number of FAQs present in that section
        And User should be able to view the remaining number of accordions or FAQs present on the CTA