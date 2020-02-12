@expedia
Feature: List Your Property

  Scenario: New window for property listing

    Given the user is on the main expedia page
    When the user clicks on the 'list your property button'
    Then the new tab should open
     And how much could you earn text be displayed
