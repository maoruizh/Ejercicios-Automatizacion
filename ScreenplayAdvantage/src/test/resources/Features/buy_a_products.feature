Feature: Buy a product
  Me as a web automator
  I need to buy a product
  To validate that the product was successfully purchased

  Scenario: Buy a product successfully
    Given I want to go to the buy page of advantage demo
    When I enter the information to buy a product
    Then I validate that the product was successfully purchased