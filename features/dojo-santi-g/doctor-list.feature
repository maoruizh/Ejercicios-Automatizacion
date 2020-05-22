Feature: Doctor List

    #@mao
    Scenario: Doctor List
        Given the user is on the "Doctor List" page
        And the user await
       
        #Assertions
        Then I see Succesful Message with text "recorrer la tabla en busca del doctor recien creado"
        Then I see a table with the summary
        Then In the row 1 I should see the Document ID "1"
        Then In the row 1 I should see the Type of ID "C?ula de ciudadan?"
        Then In the row 1 I should see the name "1"
        Then In the row 1 I should see the last Name "1"
        Then In the row 1 I should see the telephone "1"
        
        
        #Then the name in the row "1" should be "1""