Feature: successfully create users
  Me as course automation
  I need to create a users
  To validate that users are successfully created

  Background: Login in the web page
    Given I want to go to the login page of advantage demo

  Scenario: create an user successfully
    When I enter the information to create the user
    Then I validate the correct user creation
