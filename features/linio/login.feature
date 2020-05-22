Feature: Login

    @mao
    Scenario: Login successful
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user wait

    #Assertions
        Then can be seen in the header a Message with the text "¡Hola Mao!"
        Then the user should put Mouse over the Perfil Icon
        And can be seen a table with some options
        And the first option is "Mi cuenta"
        And the second option is "Mis reseñas"
        And the third option is "Mis pedidos"
        And the fourth option is "Mis cupones"
        And the fifth option is "Mis suscripciones"
        And the last option is "Cerrar sesión"

    Scenario: login with a bad password
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user enter a bad password "1234"
        And the user click on button Iniciar Sesión segura
        And the user wait

    Scenario: login forgot the password
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user click on button olvidé mi contraseña
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user click on button no soy un robot
        And the user click on button restablecer contraseña
        And the user wait

    Scenario: login with a bad e-mail
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter a bad e-mail "maoruizh@gmail"
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user wait

    Scenario: login without e-mail
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user wait

    # Scenario: create new account
    #     Given the user is on the Linio page
    #     When the user put Mouse over the Perfil Icon
    #     When the user click on button crear cuenta
    #     And the user enter his name "john"
    #     And the user enter his lastname "ruiz"
    #     And the user enter his e-mail "jruiz@loggro.com"
    #     And the user enter his password "Linio1234"
    #     And the user click on button acepto terminos
    #     And the user click on button completar registro
    #     And the user wait