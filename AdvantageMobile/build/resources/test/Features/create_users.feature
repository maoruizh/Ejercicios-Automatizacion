Feature: successful login users
  Me as a mobile automator
  I need to login a user
  To validate that users are successfully login

  Scenario Outline: create an user successfully
    Given I want to go to the page of advantage demo
    When I enter the information to create The user
      | username   | email   | password   | confirmPassword   | firstName   | lastName   | phoneNumber   | countryList   | countrySpecific   | state   | address   | city   | zip   |
      | <username> | <email> | <password> | <confirmPassword> | <firstName> | <lastName> | <phoneNumber> | <countryList> | <countrySpecific> | <state> | <address> | <city> | <zip> |
    Then I validate the correct user creation

    Examples:
      | username   | email             | password     | confirmPassword | firstName | lastName | phoneNumber | countryList | countrySpecific | state     | address      | city     | zip   |
      | maoruizh111 | maoruiz@gmail.com | Asdfghj12345 | Asdfghj12345    | Mao       | Ruiz     | 3112575629  | Lista       | Argentina       | Antioquia | Calle 65 sur | Sabaneta | 05514 |

