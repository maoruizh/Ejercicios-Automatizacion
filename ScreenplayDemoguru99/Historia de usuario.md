Historia de usuario
Login en aplicación web Demo Guru99

Preparado por:
Mauricio Ruiz
21/Marzo/2023

Resumen Ejecutivo
Este documento tiene como finalidad establecer el plan con cual se va garantizar que una vez el usuario esté en la página web de Demo Guru99; Este se pueda logear en la aplicación, y posteriormente validar que el login sea efectivo. Así mismo validar que estén visibles los elementos de administración en la izquierda de la página de inicio. 

ALCANCE: lo que voy a probar y lo que no.
•Validar que el login funcione correctamente.

Que valide las credenciales en la BD.
	Que si valide el User ID.
	Que valide los password.
	Que pueda iniciar sesión un usuario
•Validar que después de estar logeado se vea el mensaje de bienvenida.
	Este mensaje se ve en el centro de la pantalla y se desplaza de derecha a izquierda.
•Validar que el menú de administración este visible.
	Este menú debe aparecer en la parte izquierda de la página de inicio. 

Para esto se crearán escenarios y se utilizaran como usuarios los cuales harán peticiones a la página y a cada uno de ellos se le asignara una cantidad de peticiones y detalles específicos.

ESTRATEGIA: es el cómo voy a probar.

Para las pruebas descritas en el ALCANCE se realizarán solo pruebas Web funcionales End to End, no usaremos pruebas en dispositivos moviles. Además, usaremos herramientas como Selenium, Cucumber, Gherkin, IntelliJ y ScreenPlay como patrón. 

Feature: successful login users
  Me as a web Automator
  I need to login a user
  To validate that users are successfully login

  Scenario: create an user successfully
  Given I want to go to the login page of demoguru
  When I enter the information to login a user
  Then I validate the correct user login

DATOS E INFRAESTRUCTURA

•	Haremos las pruebas directamente en el ambiente de producción de Demo Guru99 y para esto cada uno de los QA deberá tener acceso a él.
•	Haremos consultas a la aplicación desde diferentes maquinas (varios usuarios simultáneos) para confirmar que este bien dimensionado el servidor que aloja la aplicación.
•	Se debe contar con licencias o permisos para instalar las herramientas anteriormente enunciadas. 
•	Usaremos datos generados directamente por la aplicación web.


SUPUESTOS Y LIMITACIONES

•	Todos los usuarios deben tener permisos de administrador en sus máquinas y no tener restricciones de navegación.
•	Las pruebas se pueden desarrollar de manera virtual, no es necesario ir a lugares físicos específicos.
•	En caso de que alguno de los QA falte por incapacidades pediremos apoyo a una de las células que también están relacionadas con el proyecto.

PRE REQUISISTOS

•	Contar con la autorización de IS para navegación ilimitada.
•	Cada usuario debe tener una maquina con 16gb de memoria para que las pruebas puedan correr sin dificultades.
•	Cada usuario debe tener acceso a internet para su correcto desempeño.
•	Validar con que los ambientes si estén activos y tener claras las ventanas de mantenimiento para contar con ellas y que estas no interfieran con las pruebas.

