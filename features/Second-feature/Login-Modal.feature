Feature: Login-Modal

    #@mao
    Scenario: Login-Modal
        Given the user is on the Falabella page
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user enter his password "Falabella20"
        And the user click on button Iniciar Sesión
        And the user wait
        

      
               
#Assertions
         Then can be seen in the header a Message with the text "Bienvenid@,Mao"
         Then the user should be click on the word Mao
         And can be seen a table with sometime options
         And the first option is "Mi cuenta"
         And the second option is "Mis órdenes"
         And the third option is "Cerrar sesión"
       