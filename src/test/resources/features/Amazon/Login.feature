Feature: User login

  Background:
    And User is logged in

  Scenario Outline: Login Negative Positive Tests
    When User click on the sign in
    And User enters '<email>' and '<password>'
    Then User Login should be '<result>'


  Examples:
    | email                | password    | result     |
    | devxschool@gmail.com | Batch2019   | Success    |
    | johnDoe@gmail.com    | InvalidPass | Failed     |