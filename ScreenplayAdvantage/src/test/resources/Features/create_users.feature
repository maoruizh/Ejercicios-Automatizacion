Feature: successfully create users
  Me as course automation
  I need to create a users
  To validate that users are successfully created

  Scenario: create an user successfully
    Given I want to go to the page of advantage demo
    When I enter the information to create the user
    Then I validate the correct user creation
