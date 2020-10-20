Feature: Login

    @mao
    Scenario: Login successful
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        And the user enter his "email Field" "maoruizh@gmail.com"
        And the user enter his "password Field" "Linio19"
        And the user click on "login Button"
        And the user put mouse over the "profile Icon"
        And the user wait

        #Assertions
        Then the user can see a message with the text "¡Hola Mao!" in "welcome message"
        Then the user put mouse over the "profile Icon2"
        And the user can see a table with "some options"
        And the user can see a message with the text "Mi cuenta" in "My acount"
        And the user can see a message with the text "Mis reseñas" in "My reviews"
        And the user can see a message with the text "Mis pedidos" in "My orders"
        And the user can see a message with the text "Mis cupones" in "My coupons"
        And the user can see a message with the text "Mis suscripciones" in "My subscriptions"
        And the user can see a message with the text "Cerrar sesión" in "Sign off"
        And the user click on "Sign off"
    #---------------------------------------------------------------------------------------

    @mao
    Scenario: login with a bad password
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        And the user enter his "email Field" "maoruizh@gmail.com"
        And the user enter his "password Field" "1234"
        And the user click on "login Button"
        And the user wait

        #Assertions
        Then the user can see a message with the text "No hemos podido iniciar sesión con tu cuenta en este momento. Por favor, intenta de nuevo más tarde." in "invalidPassMessage"  
    #------------------------------------------------------------------------------------------

    @mao
    Scenario: login forgot the password
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        And the user click on "forgot Password"
        And the user enter his "forgot Email" "maoruizh@gmail.com"
        And the user wait
        #And the user click on "not Robot" debi omitir este paso porque el selector esta dentro de un iframe y esa parte es mas compleja de automatizar
        #And the user click on "recover Pass"
        And the user wait

        #Assertions
        #Then can see a Message with the text "Hemos enviado un enlace a tu email para restablecer la contraseña. Si no lo recibes en unos minutos, revisa tu carpeta de correo no deseado."
        #Este mensaje no lo puedo validar porque el captcha a veces pide escoger imagenes y cuando pasa eso no se como validarlo
    #------------------------------------------------------------------------------------------

    @mao
    Scenario: login with a bad e-mail
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        And the user enter his "email Field" "maoruizh@mail.com"
        And the user enter his "password Field" "Linio19"
        And the user click on "login Button"
        And the user wait

        #Assertions
       Then the user can see a message with the text "No hemos podido iniciar sesión con tu cuenta en este momento. Por favor, intenta de nuevo más tarde." in "invalidPassMessage"
        #quisera validar el mensaje que sale cuando no se coloca el formato del correo correcto
    #------------------------------------------------------------------------------------------

    @mao
    Scenario: login without e-mail
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        And the user enter his "password Field" "Linio19"
        And the user click on "login Button"
        And the user wait

    #Assertions
    #quisera validar el mensaje que sale cuando no se coloca el correo
    #------------------------------------------------------------------------------------------

    @mao
    Scenario: create new account
        Given the user is on the "Login" page
        When the user put mouse over the "profile Icon"
        When the user click on "login"
        When the user click on "new Account"
        And the user enter his "name Field" "john"
        And the user enter his "last Name Field" "ruiz"
        And the user enter his "new Email" "jruiz@loggro.com"
        And the user enter his "new Password" "Linio1234"
        And the user click on "accept Terms"
        #And the user click on button completar registro // no hace para no estar creando cuntas nuevas en cada prueba
        And the user close page
        And the user wait

#Assertions
#No lleva validaciones porque no es viable crear cuentas nuevas por cada test