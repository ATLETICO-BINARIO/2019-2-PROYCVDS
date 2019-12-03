> # 2019-2-PROYCVDS
> ## Proyecto cvds 2019-2


> ### Nombre del proyecto: 
>  #### ATLETICO-BINARIO/2019-2-PROYCVDS

> Período académico, nombre del curso, nombre de los integrantes, nombre del profesor, roles asignados (no olvidar que el   
> profesor tuvo el rol de 'dueño de producto'): 
>
> - 2019-2 
> - CVDS
>
> Integrantes: 
> - #### Andres Rocha 
> - #### David Herrera 
> - #### Damian Garrido 
> - #### Juan Garcia 
> 
> Nombre del profesor: 
> - #### Santiago Alzate 
> - #### Julian Gutierrez 
> Roles: 
> - ##### Profesores product owner 
> - ##### Andres Rocha scrum master 
> - ##### David Herrera, Damian Garrido, Juan Garcia team members 

### Descripción del producto:

> -  ##### Descripción general: 

> Nuestro proyecto es una aplicacion web que busca facilitar el acceso a los servicios que presta la Biblioteca de la
> Universidad a la comunidad educativa. Usando una interfaz amigable con el usuario y presentando la informacion de los 
> recursos disponibles y los servicios que se pueden usar de forma clara . 

> - ##### Manual de usuario: 

> * La pagina inicial de la aplicacion web muetra los servicios que presta la biblioteca y deja usar servicios dependiendo el usuario (Administrador, Usuario). Para acceder a los servicios restringidos por el tipo de usuario correspondiente, se debe iniciar sesión. Otra de las funcionalidades de la página inicial de la aplicación. 
>
> * Sino se inicia sesión con ninguno de los dos tipos de usuario, el visitante podrá acceder a los servicios de comunidad que están en la página principal, es decir, al servico de Consultar Recursos Disponibles 
>
> * Al tratar de iniciar sesion el usuario debera colocar su correo registrado y su contraseña, la pagina hace la verificacion de los datos y si son validos pasara a otra interfaz ya sea la de administrador o la de usuario comunidad. 
>
> * Cuando se inicia sesion con el rol de usuario, vamos a ana pagina secundaria que me da las siguentes opciones: 
>
>       Consultar recursos disponibles 
>       Reservar  nuevos recursos 
>       Realizar reservas de recursos  
>       Cancelar reservas  

> * Cuando se inicia sesión  con el rol de Administrador, vamos a una página secundaria que me da las siguientes ocpiones: 
>
>       Consultar recursos disponibles 
>       Registrar nuevos recursos 
>       Modificar el estado de los recursos existentes 

### Imágenes y descripción de las funcionalidades más importantes: 
> ![](/ImagenesdelreadMe/restringir.PNG)
> Restringir el accesso a las personas sin usuario 

> ![](ImagenesdelreadMe/iniciar.PNG)
> Hacer el login y redireccionar segun el tipo de usuario 

> ![](ImagenesdelreadMe/consultar.PNG)
> Cunsultar un recurso 

 
### Arquitectura y Diseño detallado: 
> ![](ImagenesdelreadMe/er.PNG)
>Modelo E-R: 

Diagrama de clases (hacerlo mediante ingeniería inversa): 

### Descripción de la arquitectura (capas) y del Stack de tecnologías utilizado (PrimeFaces, Guice, QuickTheories, PostgreSQL): 

> * ##### En la capa Aplicacion se uso lo siguiente: 
>
>   - Google Guice (Un framework para inyección de dependencias) 
>   - Maven (Herramienta para gestión de dependencias) 
>   - Apache Shiro (Framework para autentiticación) 
>
> * ##### En la capa presentacion se uso lo siguiente: 
>   - JSF-(Java-Server-Faces) 
>   - Primefaces 
>
> * Tambien se uso un motor de bases de datos que era PostgreSQL. MyBatis es una herramienta de persistencia Java que se encarga de mapear sentencias SQL y procedimientos almacenados con objetos a partir de ficheros XML o anotaciones. 

>### Enlace a la aplicación en Heroku. 
> ##### http://cvdsproyecto2019-2.herokuapp.com/ 
>### Enlace al sistema de integración continua 
> Falta 

> ### Descripción del proceso: 
> * #### Integrantes: 
>   - ##### Andres Rocha 
>   - ##### David Herrera 
>   - ##### Damian Garrido 
>   - ##### Juan Garcia 

> * #### Breve descripción de la Metodología: 
>
>   En el proyecto se utilizo la metodologia agil Scrum, La metodologia busca desrrollar un proyecto con entregables cada sprint y facilitar el desarrollo de actividades urgentes o correcciones de sprints anteriores sin afectar de manera critica otra parte del proyecto. Esta metodologia cuenta con un backlog que es donde estan todas las actividades que no estan programadas en el sprint, los esprints son 1 o 2 semanas donde se desarrollan las actividades planeadas por el equipo. Despues de acbar el spirnt se hace una reunion para revisar que se hizo, que esta bien, que esta mal y tambien que se debe corregir comno equipo para el proximo sprint 

> * #### Enlace a Taiga (hacer público el Backlog). 
>
>   ##### https://tree.taiga.io/project/davidandresherrera-gestion-de-recursos-biblioteca/backlog 

> * #### Generar el 'release-burndown chart' del proyecto, e indicar los puntos de historia realizados y los faltantes. 
>   # Falta 

>  #### Para cada Sprint: 
> * #####  Sprint 1:
>   * ######  Imagen del 'sprint-backlog' 
>   ![](ImagenesdelreadMe/er.PNG)
 

Imagen del 'sprint-burndown chart' (sacado del sprint-backlog anterior), y una descripción breve de los problemas encontrados y mejoras realizadas al proceso 

 

Uno de los mayores problemas que tuvimos con este sprint fue que no tuvimos una buena preparacion y falta de comunicacion durante el desarrollo del sprint, esto produjo errores y desorden en el sprint. 

 

 

 

Sprint 2 

Imagen del 'sprint-backlog' 

 

Imagen del 'sprint-burndown chart' (sacado del sprint-backlog anterior), y una descripción breve de los problemas encontrados y mejoras realizadas al proceso 

 

En este sprint se logro comunicar mas con el equipo, pero teniamos muchos errores del sprint anterior, entonces toco corregir todo y no se logro avanzar en el sprint 

Sprint 3 

Imagen del 'sprint-backlog' 

 

Imagen del 'sprint-burndown chart' (sacado del sprint-backlog anterior), y una descripción breve de los problemas encontrados y mejoras realizadas al proceso 

 

Encontramos problemas con las consultas que estabamos haciendo, y nos toco corregir cosas del anterior sprint 

 

Reporte de pruebas y de cubrimiento de las mismas (sólo la foto del reporte principal). Para la cobertura, pueden usar los plugins disponibles (EclEmma, Jacoco, etc.) 

Falta 

Reporte de análisis estático de código. Se pueden usar las mismas herramientas trabajadas en los laboratorios. 

Falta 

 

 