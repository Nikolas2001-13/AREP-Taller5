# TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATRÓN IOC, REFLEXIÓN

Para este taller los estudiantes deberán construir un servidor 
Web (tipo Apache) en Java. El servidor debe ser capaz de entregar 
páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer 
un framework IoC para la construcción de aplicaciones web a partir de POJOS. 
Usando el servidor se debe construir una aplicación Web de ejemplo y 
desplegarlo en Heroku. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades 
reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar 
una aplicación Web a partir de él. Debe entregar su trabajo al final del laboratorio.

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/AREP-Taller4`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd AREP-Taller4`

Compilamos con maven

`$ mvn package`

Y por último corremos el programa

`$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.DemoServer"`

### Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.
Tener conocimiento sobre Maven, HEROKU, GIT, Spark y GITHUB. 

## Despliegue en Heroku

[![Heroku App](http://heroku-shields.herokuapp.com/shrouded-sea-44498)](https://shrouded-sea-44498.herokuapp.com/ )

## Integración Continua CircleCi


## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Documentacion

Para generar la documentación habrá que ejecutar el siguiente comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 
