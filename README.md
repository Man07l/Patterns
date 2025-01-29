# Patterns

## Integrantes
- Nicolas Esteban Toro Criolllo
- Manuel David Robayo Vega
- William Camilo Hernandez Deaza

## Desarrollo
 Se empieza con la creacion del proyecto Maven con ayuda de los arquetipos (archetypes), utilizando la configuración dada en el laborotorio desde la terminal de windows (cmd).

 ![Proyecto Maven](/images/image1.png)
 
Despues de ejecutar la linea de comando, los resultados son los siguientes

 ![Resultados](/images/image2.png)
 
Revisamos el conjunto de archivos y directorios

![Directorios Creados](/images/image7.png)

Luego de crear el proyecto Maven, se ajustan algunas configuraciones dentro del archivo pom.xml para ajustar la version java.

![Ajuste pom](/images/image3.png)

Luego usamos el siguiente comando 

```sh
$ mvn package
```
Para compilar los cambios, los resultados de ejecutar la linea de comando son los siguientes

![Resultado ajuste](/images/image4.png)

### Comandos MVN
- Package: El objetivo del parámetro package es tomar el código compilado y empaquetarlo en su formato distribuible (.JAR o .WAR).
- Validate: Valida que el proyecto esté correcto y que la información necesaria esté disponible.
- Compile: Compila el código fuente del proyecto.
- Test: Prueba el código fuente compilado utilizando un marco de pruebas unitarias adecuado. Estas pruebas no deben requerir que el código se empaquete o implemente.
- Integration-test: Implementa el paquete en un entorno donde se puedan ejecutar pruebas de integración.
- Verify: Ejecuta las comprobaciones para verificar que el paquete es válido y cumple con los criterios de calidad.
- Install: Instala el paquete en el repositorio local, para usarlo como dependencia en otros proyectos localmente.
- Deploy: Realizado en un entorno de integración o lanzamiento, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.
- Clean: Limpia los artefactos creados por compilaciones anteriores.
- Site: Genera la documentación del sitio para este proyecto.

### Ejecución del proyecto maven
Cambiamos la configuración del POM creando un plugin dentro del archivo pom.xml de la siguiente manera:

![Cambio_configuración](/images/image5.png)

Dandonos com resultado lo siguiente:

![Resultado_cambio_configuración](/images/image6.png)

Procedemos a utilizar el comando:

```sh
$ mvn exec:java
```

Que nos da como resultado:

![Resultado_comando_java](/images/image8.png)
