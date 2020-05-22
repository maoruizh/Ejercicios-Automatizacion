Feature: Search categories

    #@mao
    Scenario Outline: Scenario Outline name: Search categories
        Given the user is on the Falabella page
        When the user click on button categorias
        #And the user click on category "Tecnología" sin el scenario Outline
        And the user click on category "<category>"
        #And the user click on item "Samsung Watch" inside "Smartwatch" sin el scenario Outline
        And the user click on item "<item>" inside "<subCategory>"
        And the user wait

        Examples:
            | category       | subCategory      | item          |
            | Tecnología     | Smartwatch       | Samsung Watch |
            | Tecnología     | Smartwatch       | Fitbit        |
            | Tecnología     | Smartwatch       | Huawei        |
            | Planes en casa | Cocina Divertida | Vino y Bar    |