@etsy
Feature: Etsy login functionality

  Scenario: Happy path-positive scenario
    Given user is on th etsy home page
    When user clicks on sign in button
    And user inputs his username
    And user inputs his password
    And user clicks on sign it button
    Then verify the error message user account has been deactivated is displayed

  Scenario Outline: Multiple login accounts
    Given user is on th etsy home page
    When user clicks on sign in button
    And user inputs his username '<username>'
    And user inputs his password '<password>'
    And user clicks on sign in button
    Then verify the error message user account has been '<status>' is displayed


    Examples:
      | username              | password | status                        |
      | devxschool@gmail.com  | abc123   | Account has been deactivated. |
      | johnDoe@gmail.com     | joeDoe   | Password was incorrect        |
      | dummyaccout@gmail.com | veryHard | Email address is invalid      |
      | aaaa                  | bb       | invalid message               |


    Scenario: Search for multiple items
      #Given user is on th etsy home page
      When user enters the following items
      |item |
      |baby |
      |daddy|
      |mommy|