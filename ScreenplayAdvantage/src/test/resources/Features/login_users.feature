Feature: successful login users
  Me as a web automator
  I need to login a user
  To validate that users are successfully login

  Scenario: create an user successfully
    Given I want to go to the login page of advantage demo
    When I enter the information to login a user
    Then I validate the correct user login