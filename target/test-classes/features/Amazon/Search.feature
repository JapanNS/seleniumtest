
Feature: Amazon Main Functionality

  Background:
    Given User is on the main page
    And User is logged in



  Scenario: Search For an Item

    When User enters 'Iphone' in the search box
    Then All results should contain 'apple' in the title

  Scenario: Item Details
    When User enters 'Iphone' in the search box
    And User selects the first 'Iphone'
    Then All results should contain 'Iphone' in the title

  Scenario: Cart

    When User enters 'Iphone' in the search box
    And User selects the first 'Ihpone'
    And User adds the selected item to the cart
    Then User should see 'Iphone' in the cart
    And User should see the price in the detail
    But Use shouldn't see the 'Iphone' characteristics