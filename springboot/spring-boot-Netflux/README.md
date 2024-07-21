# Spring Boot H2 Database CRUD example: Building Rest API with Spring Data JPA


Javier Hernández García
MA UA Inge. Informática
DSAI

Práctica 3: Microservicio con Spring Boot y Frontend

el proyecto es spring boot 3.1.0
usa maven
java.version 17
data-jpa
H2 database

api rest
/destados   --> este es el único que utiliza service
/peliculas/novedades
/peliculas/{id}
/series/novedades
/series/{id}
/trailers

InfoAbreviada y InfoCast falta (no lo he realizado)

Los errores no van bien, no muestran nada.

http://localhost:8081/...
http://localhost:8081/h2-ui
Login 	
Saved Settings: 	
Setting Name: 	Generic H2 (Embedded)
Driver Class: 	org.h2.Driver
JDBC URL: 	jdbc:h2:./testdb
User Name: 	sa
Password:

...

backend
--------
he añadido un capa de servicioStreamingService pero solo he añadido los destacados.
 Todos los controllers deberán pasar por service y este acceder a repository

 -Problema - al hacer el join con tablas Peliculas y PeliculasDestacadas con OneToOne -- ahora no me aparecen los atributos duration y director en json
  no sé porqué.


bootstrap es el 5.3.2, y está en static/bootstrap no lo incluyo pero lo he realizado en local bajandolo
el frontend con la practica 1 en: (con los ficheros .js de javascript)
    \static

    -El frontend solo lo he realizado utilizando innerHTML para cambiar texto directamente. No uso ninguna funcion que añada hijos o nodos.
    -los trailers no los he sacado en el fronted, he usado:
        destacados -> solo películas
        peliculas
        series -> no tienen imágenes

    Faltan terminar muchas cosas, pero se puede apreciar como va a quedar el fronted al cargar las peticiones ajax de la bbdd.