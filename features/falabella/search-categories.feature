Feature: Search categories

    #@mao
    Scenario: Search categories
        Given the user is on the Falabella page
        When the user click on button categorias
        And the user click on button tecnología
        And the user click on button Samsung Watch
        And  the user click on picture SmartWatch Active 2 44mm
        And the user wait

        #Assertions
        Then can be seen in the header a Message with the text "Mao"
        Then the user should be click on the word Mao
        And can be seen a table with sometime options
        And the first option is "Mi cuenta"
        And the second option is "Mis órdenes"
        And the third option is "Cerrar sesión"
