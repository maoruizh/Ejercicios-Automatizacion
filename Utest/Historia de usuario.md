Historia de usuario
Login en aplicación web Utest

Preparado por:
Mauricio Ruiz
1/Abril/2023

Resumen Ejecutivo
Este documento tiene como finalidad establecer el plan con cual se va garantizar que una vez el usuario ingrese en la página Utets y pueda validar que el boton Joint Today este visible y posteriormente pueda diligenciar el formulario Step1 y finalmente validar el mensaje correspondiente al Step2. 

ALCANCE: lo que voy a probar y lo que no.
Validar que icono Join Today este activo.
•	Que sea accionable.
•	Que lleve al Step 1.

Validar que se pueda diligenciar el formulario del Step 1 correctamente.
•	Llenar todos los campos del formulario.
Validar que al finalizar el registro anterior se vea el mensaje del próximo Step.
•	Validar que el mensaje del Step 2 sea “Add your addres”

Para esto se crearán escenarios, los cuales harán peticiones a la página y a cada uno de ellos se le asignara una cantidad de peticiones y detalles específicos.

ESTRATEGIA: es el cómo voy a probar.
Para las pruebas descritas en el ALCANCE se realizarán solo pruebas Web funcionales End to End, no usaremos pruebas en dispositivos móviles. Además, usaremos herramientas como Selenium, Cucumber, Gherkin, IntelliJ y ScreenPlay como patrón. 

Feature: validate form filling
  Me as a QA
  I need to test the filling is successful
  To validate that users can advance to second step

  Background:
    Given That the user go to the home page of Utest

  Scenario: The button join today is present
    Then The user should validate that if he sees the Join Today button

  Scenario: Fill the personal information form
    When I enter the personal information to personal form
    Then I validate the the information form is ok

DATOS E INFRAESTRUCTURA
•	Haremos las pruebas directamente en el ambiente de producción de Utest y para esto cada uno de los QA deberá tener acceso a él.
•	Haremos consultas a la aplicación desde diferentes maquinas (varios usuarios simultáneos) para confirmar que este bien dimensionado el servidor que aloja la aplicación.
•	Se debe contar con licencias o permisos para instalar las herramientas anteriormente enunciadas. 
•	Usaremos datos generados directamente desde las Tasks.

SUPUESTOS Y LIMITACIONES
•	Todos los usuarios deben tener permisos de administrador en sus máquinas y no tener restricciones de navegación.
•	Las pruebas se pueden desarrollar de manera virtual, no es necesario ir a lugares físicos específicos.
•	En caso de que alguno de los QA falte por incapacidades pediremos apoyo a una de las células que también están relacionadas con el proyecto.

PRE REQUISISTOS
•	Contar con la autorización de IS para navegación ilimitada.
•	Cada usuario debe tener una maquina con 16gb de memoria para que las pruebas puedan correr sin dificultades.
•	Cada usuario debe tener acceso a internet para su correcto desempeño.
•	Validar con que los ambientes si estén activos y tener claras las ventanas de mantenimiento para contar con ellas y que estas no interfieran con las pruebas.
