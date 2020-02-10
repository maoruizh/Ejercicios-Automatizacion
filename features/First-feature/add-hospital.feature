Feature: Add Hospital

    #@mao
    Scenario: Add Hospital
        Given the user is on the "Add Hospital" page

        When the user enter the code number "615"
        When the user enter his name "Saman"
        When the user enter his address "calle 65 # 20 - 30"
        When the user enter his telephone "2811058"
        And the user click on department Antioquia
        And the user select "Medellín"
        And the user await
        And the user click on the save button
               
#Assertions
      
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then code typed by user should be displayed in the code row "615"
        Then name typed by user should be displayed in the name row "Saman"
        Then address typed by user should be displayed in the address row "calle 65 # 20 - 30"
        Then telephone typed by user should be displayed in the telephone row "2811058"
        Then Department typed by user should be displayed in the department row "Antioquia"
        Then municipality typed by user should be displayed in the municipalitty row "Medell?"
       