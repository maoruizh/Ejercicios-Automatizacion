Feature: successful login users
  Me as a web automator
  I need to login a user
  To validate that users are successfully login

  Scenario Outline: create an user successfully
    Given I want to go to the login page of demoguru
    When I enter the information to login a user
      | userID   | password   |
      | <userID> | <password> |
    Then I validate the correct user login

    Examples:
      | userID     | password |
      | mngr486180 | asuvAta  |
      | mngr486149 | tAtUpYz  |
      | mngr485965 | mErAheb  |
      | mngr486180 | asuvAta  |
