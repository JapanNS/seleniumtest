
  Feature: Amazon Main Functionality

    Scenario: Search For an Item
      Given User is on the main page
      When User enters 'Iphone' in the search box
      Then All results should contain 'Iphone' in the title

      Scenario: Checkout
        Given User is on the main page
        When User enters 'Iphone' in the search box
        And User selects the first 'Ihpone'
        Then User should see the price in detail