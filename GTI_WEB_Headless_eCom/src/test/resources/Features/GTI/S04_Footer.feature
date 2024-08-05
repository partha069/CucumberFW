Feature: To verify user should see the footer components


    Background:
        Given user launches risecannabis "<url>" website
    #When User is on the Age Gate screen
        And user clicks on the Accept in cookies gate banner

    @Footer @webRegression @mobRegression
    Scenario: To verify that user is able to view the home navigation list
        When user scrolls down to the footer section
        Then user should able to view the Footer section
        And user should be able to view the Home navigation list with the components 'Home' and 'Shop' and 'Rewards' and 'Cannabis insider' and 'Dispensaries' and 'Rise logo'
    #And user should be able to view the license details for the geo located dispensary
    #And user should be able to view the copyrights text from the footer
    #And user should be redirected to the RISE Home Page by clicking on the Home option
    #And user should be redirected to the Geolocated PLP page by clicking on the Shop option
    #And user should get redirected to the REWARDS page by clicking on the Rewards option
    #And user should be redirected to the Cannabis Insider Index Page by clicking on the Cannabis Insider menu
    #And user should be redirected to the Primary dispensaries page by clicking on the Dispensaries menu
    #And user should redirected to the home page by clicking the Rise logo from the footer

    #@Footer @webRegression @mobRegression
    #Scenario: To verify user is able to view the Terms of use internal navigation list
    #When user scrolls down to the footer section
    #And user should able to view the Footer section
    #Then user should be able to view the Terms of use internal navigation list with the components 'Customer Center' and 'Contact Us' and 'FAQ' and 'Sitemap' and 'Terms of Use' and 'Privacy Policy' and 'Notice of Privacy practices' and 'Chat with us'
    #And user should be able redirected to the contact us menu with call, chat and mail options by clicking on customer center option
    #And user should be redirected to the contact us form by clicking contact us option
    #And user should be redirected to the FAQ page by cliking on FAQ option
    #And user should be redirected to the sitemap page by clicking on Sitemap option
    #And user should be redirected to the  GTI Terms of Use link by clicking on Terms of Use from the list
    #And user Should be redirected to the GTI Privacy Policy link by clicking on Privacy Policy from the list
    #And user Should be redirected to the  GTI Privacy Practices link by clicking on Notice of Privacy Practices from the list
    #And user should see the chatbot to be opened by clicking on Chat with us

    #@Footer @webRegression @mobRegression
    #Scenario: To verify user is able to view the terms of use external navigation list
    #When user should able to view the Footer section
    #Then user should be able to view the terms of use external navigation list with the components 'Careers' and 'instagram icon' and 'Facebook' and 'Twitter icon'
    #And user should be redirected to the External GTI Careers page by clicking on Careers from the list
    #And user should be redirected to instagram page by clicking on instagram icon from the footer
    #And user should be redirected to Facebook page by clicking on Facebook icon from the footer
    #And user should be redirected to twitter page by clicking on twitter icon from the footer
