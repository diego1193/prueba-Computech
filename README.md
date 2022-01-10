# Prueba tecnica Computec - Diego Cabrera

Este es un CRUD de un usuario a una empresa, desarrollado en SpringBoot, se utilizó una base de datos no relacional como MongoDB y para comprobar los servicios se utilizo Postman.
En este CRUD se puede visualizar correctamente, como es el registro de determinado usuario, el login de determinado usuario, como se genera el JWT cuando este ingresa; despúes
del ingreso del usuario, puede llamar las otras peticiones, ya que se genero el token y tiene permiso para buscar todos los usuarios, usuario por id o eliminar algún usuario.

## Base de datos MongoDB

![ScreenShot](/images_README/DB.png)

Como se puede ver en la imagen anterior, la base de datos tiene como nombre **tienda_prueba**.

y la coleccion que se crea dentro de la base de datos es **Usuarios**.

![ScreenShot](/images_README/Collection.png)

## CRUD Usuario
### Crear Usuario (Registrar)

El siguiente metodo es POST, ya que se va a crear un nuevo usuario.

```
localhost:8080/register
```
 #### Ejemplo:
 
 ![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/register_request.JPG)
 
 ### Login Usuario
 
 Una vez creado el usuario, se procede a hacer el login y generar el token.
 
 ```
localhost:8080/user
```

#### Ejemplo:
##### Request:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/login_request.JPG)

##### Response:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/login_response.JPG)

