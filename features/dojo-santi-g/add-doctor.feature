Feature: Add Doctor

    #@mao
    Scenario Outline: To Register a new Doctor
        Given the user is on the "Add Doctor" page
        When the user enter his "name" "<name>"
        And the user enter his "lastname" "<lastname>"
        And the user enter his "telephone" "<telephone>"
        And the user click on Type of ID
        And the user select "Cédula de ciudadanía"
        And the user enter his ID "<identification>"
        And the user await
        And the user click on the save button

        #Assertions
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then name typed by user should be displayed in the Nombre row "<name>"
        Then last name typed by user should be displayed in the Apellidos row "<lastname>"
        Then phone typed by user should be displayed in the Teléfono row "<telephone>"
        Then document type typed by user should be displayed in the Tipo de documento de identidad row "C?ula de ciudadan?"
        Then document id typed by user should be displayed in the Documento de identidad row "<identification>"

        Examples:
            | name   | lastname | telephone | identification |
            | Andres | Urrea    | 7894565   | 444444         |
            | Santi  | Garces   | 7654321   | 555555         |
            | Cata   | Urrea    | 1234765   | 666666         |

    #---------------------------------------------------------------------------------------------------------------

    #@mao
    Scenario: Fail To Register a new Doctor
        Given the user is on the "Add Doctor" page
        When the user enter his "name" "Mao"
        And the user enter his "lastname" "Ruiz"
        And the user enter his "telephone" "1234567"
        And the user select "Cédula de ciudadanía"
        And the user dont enter his ID ""
        And the user await
        And the user click on the save button

        #Assertions
        Then I see error Message with text "*El campo 'Documento de identidad' es requerido."
        Then I see a table with the summary
        Then name typed by user should be displayed in the Nombre row "Mao"
        Then last name typed by user should be displayed in the Apellidos row "Ruiz"
        Then phone typed by user should be displayed in the Teléfono row "444444"
        Then document type typed by user should be displayed in the Tipo de documento de identidad row "C?ula de ciudadan?"
        Then the Documento de identidad row should be displayed empty ""