Feature: Add Room

    #@mao
    Scenario: Add Room
        Given the user is on the "Add Room" page
        When the user enter his number Room "615"
        And the user select type of Room "Habitación de lujo"
        And the user select Feature of the Room "DirecTV"
        And the user await
        And the user click on the save button

        #Assertions
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then Number Room typed by user should be displayed in the number Room row "615"
        Then Room type typed by user should be displayed in the Room type row "Habitaci? de lujo"
        Then Doble Room typed by user should be displayed in the Doble Room row
        Then DirecTV Room typed by user should be displayed in the DirecTV Room row