Feature: Buy a product
  Me as a web automator
  I need to buy a product
  To validate that the product was successfully purchased

  Background: Login in the web page
    Given I want to go to the login page of advantage demo

  Scenario: Buy a product successfully
    When I enter the information to buy a product
    Then I validate that the product was successfully purchased