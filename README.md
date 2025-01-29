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
- Package:
El objetivo del parámetro package es tomar el código compilado y empaquetarlo en su formato distribuible (.JAR o .WAR).


