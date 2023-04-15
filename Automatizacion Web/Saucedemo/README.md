# Introduction
Mediante la aplicación Saucedemo se realiza un ingreso de un login a la pagina WEB, parametrizado por variables de acuerdo a las que sean enviadas válidas del set de datos.

Se cuenta con un metodo aleatorio para seleccionar un navegador en las pruebas (chrome,firefox",edge)


# Getting Started
 información en general del proyecto.
 
1.	proyecto construido por el gestor de dependencias Gradle.
2.	visualizar el feature que define el comportamiento del  login
3.	Dependencias en el Buid Gradle Utilizadas.

# Build and Test
mediante consola se puede ejecutar el proyecto gradle test aggregate generando el reporte de las pruebas en la carpeta targe/site/serenity/html.index que contiene la evidencia paso a paso de la las pruebas.

Example: ./gradlew clean test '-Demail=standard_user', '-Dpassword=secret_sauce' --tests com.saucedemo.com.co.runners.Login* -i

Data de usuarios:

1. standard_user
2. locked_out_user
3. problem_user
4. performance_glitch_user


Password

1. secret_sauce



