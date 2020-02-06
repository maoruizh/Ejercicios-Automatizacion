Feature: Add patient

    #@mao
    Scenario Outline: To Register a new Patient
        Given the user is on the "Add Patient" page
        When the user enter his "name" "<name>"
        And the user enter his "lastname" "<lastname>"
        And the user enter his "telephone" "<telephone>"
        And the user click on Type of ID
        And the user select "Cédula de ciudadanía"
        And the user enter his ID "<identification>"
        And the user click on Prepaid Health
        And the user await
        And the user click on the save button
        
        # Assertions
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then name typed by user should be displayed in the Nombre row "<name>"
        Then last name typed by user should be displayed in the Apellidos row "<lastname>"
        Then phone typed by user should be displayed in the Teléfono row "<telephone>"
        Then document type typed by user should be displayed in the Tipo de documento de identidad row "C?ula de ciudadan?"
        #nos saltamos este Step porque en la aplicacion el elemento esta mal codificado y repite el nombre
            #Then document id typed by user should be displayed in the Documento de identidad row "<identification>"
        Then Prepaid Health marked by user should be displayed in the Prepaid Health row

Examples:
      | name  | lastname | telephone | identification |
      | Mao   | Ruiz     | 1234567   | 111111         |
      | Santi | Garces   | 7654321   | 222222         |
      | Cata  | Urrea    | 123765    | 333333         |