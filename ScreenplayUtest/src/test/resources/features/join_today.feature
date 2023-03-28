Feature: validate form filling
  Me as a QA
  I need to test the filling is successful
  To validate that users can advance to second step

  Background:
    Given That the user go to the home page of Utest

  Scenario: The button join today is present
    Then The user should validate that if he sees the Join Today button

  Scenario: Fill the personal information form
    When I enter the personal information to personal form
    Then I validate the the information form is ok