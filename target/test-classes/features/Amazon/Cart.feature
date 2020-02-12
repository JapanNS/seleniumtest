Feature: Carts Test

  Background:
    Given User is on the main page
    And User is logged in

    Scenario: Item is added to the card
      When User enters 'table spoon' in the search box
      And User clicks on the item number 1
      And User clicks on Add to Cart
      Then User should see 'Added to Cart'
