Feature: appointment Scheduling

    #@mao
    Scenario: appointment Scheduling
        Given the user is on the "appointment Scheduling" page
        When the user enter the date day "12/07/2019"
        When the user enter the patient ID "111111"
        When the user enter the doctor ID "444444"
        When the user enter a observation "No comer alientos 6 horas antes de la cita"
        And the user await
        And the user click on the save button
               
#Assertions
        Then I see Succesful Message with text "Datos guardados correctamente."
        Then I see a table with the summary
        Then the date day typed by user should be displayed in the date row "12/07/2019"
        Then the doctor id returned by the system should be displayed in the doctor id row "444444"
        Then the doctor name returned by the system should be displayed in the doctor name row "Andres"
        Then the patient id returned by the system should be displayed in the patient id row "111111"
        Then the patient name returned by the system should be displayed in the patient name row "Mao"
        Then the observations typed by the user should be displayed in the observations row "No comer alientos 6 horas antes de la cita"

       