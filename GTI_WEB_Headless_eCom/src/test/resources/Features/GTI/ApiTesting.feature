Feature: To verify the Test Result through API


    @apiTesting
    Scenario: To verify user should see only Minnesota RISE text logo for the white color variant header
        Given User have a search field on Amazon Page
        And User search for a product with name "Apple MacBook" and price 1000
        Then User should display name of the apple product "Apple M1"