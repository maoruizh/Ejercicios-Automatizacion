Feature: Show the subcategories of the categories principal menu
  Me as a QA
  I need to Show the subcategories of the categories principal menu
  To validate that users can find the products


  Scenario Outline: The subcategories is visible
    Given That the user go to the home page of mercado libre
    When The user enter in the category <category>
    Then I validate that the user can see the subcategories

    Examples:
      | category              |
      | Hogar y Muebles       |
      | Industrias y Oficinas |
      | Inmuebles             |