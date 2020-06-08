Feature: Login

    #@mao
    Scenario: Login successful
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user put Mouse over the Perfil Icon
        And the user wait

        #Assertions
        Then can see in the header a Message with the text "¡Hola Mao!"
        Then the user should put Mouse over the Perfil Icon
        And can see a table with some options
        And the first option is "Mi cuenta"
        And the second option is "Mis reseñas"
        And the third option is "Mis pedidos"
        And the fourth option is "Mis cupones"
        And the fifth option is "Mis suscripciones"
        And the last option is "Cerrar sesión"
        And the user click on button cerrar Sesión
    #---------------------------------------------------------------------------------------

    #@mao
    Scenario: login with a bad password
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@gmail.com"
        And the user enter his password "1234"
        And the user click on button Iniciar Sesión segura
        And the user wait

        #Assertions
        Then can see a Message with the text "Nombre de usuario o contraseña inválidos."
    #------------------------------------------------------------------------------------------

    #@mao
    Scenario: login forgot the password
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user click on button olvidé mi contraseña
        And the user enter his e-mail2 "maoruizh@gmail.com"
        And the user click on button no soy un robot
        And the user click on button restablecer contraseña
        And the user wait

        #Assertions
        #Then can see a Message with the text "Hemos enviado un enlace a tu email para restablecer la contraseña. Si no lo recibes en unos minutos, revisa tu carpeta de correo no deseado."
        #Este mensaje no lo puedo validar porque el captcha a veces pide escoger imagenes y cuando pasa eso no se como validarlo
    #------------------------------------------------------------------------------------------

    #@mao
    Scenario: login with a bad e-mail
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his e-mail "maoruizh@mail.com"
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user wait

        #Assertions
        Then can see a Message with the text "Nombre de usuario o contraseña inválidos."
        #quisera validar el mensaje que sale cuando no se coloca el formato del correo correcto
    #------------------------------------------------------------------------------------------

    #@mao
    Scenario: login without e-mail
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        And the user enter his password "Linio19"
        And the user click on button Iniciar Sesión segura
        And the user wait

    #Assertions
    #quisera validar el mensaje que sale cuando no se coloca el correo
    #------------------------------------------------------------------------------------------

    #@mao
    Scenario: create new account
        Given the user is on the Linio page
        When the user put Mouse over the Perfil Icon
        When the user click on button Inicia Sesión
        When the user click on button crear cuenta
        And the user enter his name "john"
        And the user enter his lastname "ruiz"
        And the user enter his new e-mail "jruiz@loggro.com"
        And the user enter his new password "Linio1234"
        And the user click on button acepto terminos
        #And the user click on button completar registro
        And the user wait

#Assertions
#No lleva validaciones porque no es viable crear cuentas nuevas por cada test