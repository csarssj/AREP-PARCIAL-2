# AREP-PARCIAL-2

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/AREP-PARCIAL-2.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```

Ejecutando el siguiente comando puede generar la documentacion:

```
mvn javadoc:javadoc

```

Ejecutando el siquiente comando en la consola y accediendo al siguiente link se puede visualizar una prueba.

```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.parcialarep2.App


```


### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Reporte de pruebas

Construir la imagen con el siguiente comando:

Se prueba localmente las dos funciones con las siguientes url:

```
  http://localhost:4568/exp?value=2.718281828459045
  
  http://localhost:4568/ln?value=1
  
```
![image](https://github.com/csarssj/AREP-PARCIAL-2/blob/main/img/local.png)



Construir la imagen con el siguiente comando:

```
  docker build --tag parcial2 .
  
```


Se crean la instancia con el siguiente comando:
```
docker run -d -p 8000:6000 --name firstdockercontainer parcial2

```

Y como se ve se creo y funciona:


Ahora se realizan los siguientes comandos, para el despliegue en dockerhub;

```
docker tag parcial2 csarssj/arep-parcial-2

docker push csarssj/arep-parcial-2:lastest}

```

Se crea la instancia en AWS y del contentedor 

```
docker run -d -p 42000:6000 --name firstdockercontainer csarssj/arep-parcial-2
```
y finalmente se evidencian las dos funciones:

![image](https://github.com/csarssj/AREP-PARCIAL-2/blob/main/img/aws.png)

## Video de la solucion en este link

* https://github.com/csarssj/AREP-PARCIAL-2/blob/main/videosolucion.mp4

### NOTA: Me toco desinstalar docker del computador porque se me presento un error preciso en el parcial y toco volver a instalarlo

![image](https://github.com/csarssj/AREP-PARCIAL-2/blob/main/img/error_docker.png)

![image](https://github.com/csarssj/AREP-PARCIAL-2/blob/main/img/error_docker2.png)

## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management



## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 24 de Marzo del 2021_ 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) 