Feature: profile config

    #@mao
    Scenario: profile config
        Given the user is on the "profile config" page
        When the user enter his full name "John Mauricio"
        When the user enter his full last name "Ruiz Herrrea"
        When the user enter his telephone "1234567"
        When the user select Disease history "Select options"
        When the user select type of Disease "Gripa"
        And the user await
        When the user enter his ID "111111"
        #When the user select "select File"
        And the user await
        And the user click on the save button
               
#Assertions
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then the name typed by user should be displayed in the name row "John Mauricio"
        Then the lastname typed by user should be displayed in the lastname row "Ruiz Herrrea"
        Then the telephone typed by user should be displayed in the telephone row "1234567"
        Then the Disease typed by user should be displayed in the Disease row "Gripa"
        Then the ID typed by user should be displayed in the ID row "111111"

       