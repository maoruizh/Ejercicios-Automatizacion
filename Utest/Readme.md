Título del proyecto:
	*Pruebas de Login en aplicación Web Utest

Introducción:
•	El objetivo de este proyecto es realizar pruebas E2E en el sitio Web.
•	Los QA deben validaran una vez el usuario ingrese en la página Utets y pueda ver que el boton Joint Today este visible 
•	Los QA deben validaran que se pueda diligenciar el formulario Step1 correctamente 
•	Los QA deben validaran que el mensaje del Step 2 corresponda a “Add your addres”.

Aplicativos:
•	Se busca reemplazar los ambientes de pruebas locales y facilitar la conexión a ellos para que al momento de realizar un test sea mucho más fácil, además de encontrarlo siempre disponible.
•	Se puede utilizar para Test automatizados vía WEB, Mobile y APIS. en este caso solo realizaremos test WEB.
•	Al ser WEB, permite conexiones desde los principales navegadores disponibles (Chrome, Firefox, Safari).

Prerrequisitos:
•	Conexión a internet.
•	Java JDK 1.8.
•	IntelliJ IDEA.
•	Gradle V7.5.1 o superior con las dependencias requeridas.
•	Serenity.properties actualizadas.
•	Variables de entorno configuradas.
•	Instalar Plugin de Cucumber y Gradle en el IDE.
•	Instalar en la raíz del proyecto, el driver según la versión del navegador. Para este caso usaremos el Chrome web driver versión 11 descargado de acá: https://chromedriver.chromium.org/downloads.

Construido con:
•	BDD: Estrategia de desarrollo.
•	Screenplay: Patrón de diseño de pruebas.
•	Gradle: Gestor de proyectos para manejar las dependencias.
•	Selenium Web Driver: Herramienta para automatizar acciones del navegador WEB.
•	Cucumber: Framework para automatizar pruebas BDD.
•	Serenity BDD: Biblioteca de informes de código abierto la cual nos ayuda a describir criterios de aceptación automatizados, mejor estructurados, sostenibles y también genera informes de documentación viva.
•	Gerkin: Lenguaje especifico de dominio legible por el negocio.
•	Azure Devops: Repositorio de archivos.
 
Ejecutando las pruebas:
•	Actualizar Gradle desde el IDE.
•	Descargar/clonar el proyecto desde el repositorio de AZURE (https://dev.azure.com/maoruizh) y posteriormente en el IDE ejecutar el Runner deseado para ver la prueba en acción.

Pruebas E2E:
La automatización debe realizar las siguientes acciones:
•	Abrir el navegador y lo maximiza.
•	Ingresar a la página web https://www.utest.com/.
•	Luego validar el Botón principal Join Today y accionarlo.
• 	Luego diligenciar los campos del formulario Step1, estos datos seran enviados desde las Tasks.
•	Luego validar que el mensaje del Step2 sea el indicado.

Wiki:
•	Puedes encontrar mucho mas sobre este proyecto en la URL de maoruiz.com

Versionado:
•	Usaremos Azure Devops para el versionado de las pruebas realizadas en el proyecto. Todas las versiones disponibles se pueden ver según los tags copiados.

Autor:
•	Mauricio Ruiz realizador de las pruebas E2E.

Licencia:
•	Este proyecto esta bajo la licencia de Maoruizh

Expresiones de gratitud:
•	Doy las gracias públicamente a mis compañeros por todo su apoyo.
