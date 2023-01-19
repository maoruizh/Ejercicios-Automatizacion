Feature: successful login users
  Me as a mobile automator
  I need to login a user
  To validate that users are successfully login

  Scenario Outline: create an user successfully
    Given I want to go to the page of advantage demo
    When I enter the information to create The user
      | username   | email   | password   | confirmPassword   | firstName   | lastName   | phoneNumber   | country   | state   | address   | city   | zip
      | <username> | <email> | <password> | <confirmPassword> | <firstName> | <lastName> | <phoneNumber> | <country> | <state> | <address> | <city> | <zip>
    Then I validate the correct user creation

    Examples:
      | username | email             | password       | confirmPassword | firstName | lastName | phoneNumber | country  | state     | address      | city     | zip
      | maoruizh | maoruiz@gmail.com | Asdfghj1234567 | Asdfghj1234567  | Mao       | Ruiz     | 3112575629  | Colombia | Antioquia | Calle 65 sur | Sabaneta | 05514

