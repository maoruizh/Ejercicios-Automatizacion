Título del proyecto:
	*Pruebas en Demo GURU99 para el correcto logeo de un usuario.

Introducción:
•	El objetivo de este proyecto es realizar pruebas E2E en la aplicación Web.
•	Los QA puedan utilizar la aplicación para hacer pruebas en ella de distintos tipos.
•	Esta aplicación es completamente gratuita y la forma de ingresar a ella es por medio de una URL, la cual almacena y consume los recursos propios de los creadores de la aplicación.

Aplicativos:
•	Se busca reemplazar los ambientes de pruebas locales y facilitar la conexión a ellos para que al momento de realizar un test sea mucho más fácil, además de encontrarlo siempre disponible.
•	Se puede utilizar para Test automatizados vía WEB, Mobile y APIS. en este caso solo realizaremos test WEB.
•	Al ser WEB, permite conexiones desde los principales navegadores disponibles (Chrome, Firefox, Safari).

Prerrequisitos:
•	Conexión a internet.
•	Java JDK 1.8.
•	IntelliJ IDEA.
•	Gradle V7.5.1 o superior con las dependencias requeridas.
•	Variables de entorno configuradas.
•	Cucumber.
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
•	Descargar/clonar el proyecto desde el repositorio de AZURE (https://dev.azure.com/maoruizh/TCS%20Upskilling/_git/TCS%20Upskilling) y posteriormente en el IDE ejecutar el Runner LoginUser para ver la prueba en acción.

Pruebas E2E:
La automatización debe realizar las siguientes acciones:
•	Abrir el navegador y lo maximiza.
•	Ingresar a la página web https://demo.guru99.com/
•	Luego hacer clic en el Botón Bank Project
•	Luego ingresar los datos de User ID
•	Luego ingresar los datos de Password
•	Luego hacer clic en el botón login
•	Luego validar que se observe el mensaje de Bienvenida.
•	Finalmente validar que se vea el menú de administración.
•	Luego repetir este proceso con todos los datos del escenario Outline.

Wiki:
•	Puedes encontrar mucho mas sobre este proyecto en la URL de TCS Upskilling.

Versionado:
•	Usaremos Azure Devops para el versionado de las pruebas realizadas en el proyecto. Todas las versiones disponibles se pueden ver según los tags copiados.

Autor:
•	Mauricio Ruiz realizador de las pruebas E2E.

Licencia:
•	Este proyecto esta bajo la licencia de Maoruizh

Expresiones de gratitud:
•	Doy las gracias públicamente a Demo Guru99 por sus aportes a la comunidad y especialmente dejar que disfrutemos de sus proyectos de manera gratuita.
