# Prueba tecnica Computec - Diego Cabrera

> Este es un CRUD de un usuario a una empresa, desarrollado en SpringBoot, se utilizó una base de datos no relacional como MongoDB y para comprobar los servicios se utilizo Postman.
> En este CRUD se puede visualizar correctamente, como es el registro de determinado usuario, el login de determinado usuario, como se genera el JWT cuando este ingresa; despúes
del ingreso del usuario, puede llamar las otras peticiones, ya que se genero el token y tiene permiso para buscar todos los usuarios, usuario por id o eliminar algún usuario.

## Base de datos MongoDB

![ScreenShot](/images_README/DB.png)

Como se puede ver en la imagen anterior, la base de datos tiene como nombre **tienda_prueba**.

y la coleccion que se crea dentro de la base de datos es **Usuarios**.

![ScreenShot](/images_README/Collection.png)

## CRUD Usuario
### Crear Usuario (Registrar)

El siguiente metodo es POST, ya que se va a crear un nuevo usuario.

 ##### Url:

```
localhost:8080/register
```
 #### Ejemplo:
 
 ![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/register_request.JPG)
 
 
 ### Login Usuario
 
 El siguiente metodo es POST, una vez creado el usuario, se procede a hacer el login y generar el token.
 
 ##### Url:
 
 ```
localhost:8080/user
```

#### Ejemplo:
##### Request:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/login_request.JPG)

##### Response:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/login_response.JPG)

### Visualizar todos los usuarios registrados

El sigiente metodo es GET ya que se requiere visualizar todos los usuarios ya registrados; para que este metodo funcione tenemos que pasar como parametro en Headers lo siguiente:
 
* _Key: Authorization_
* _Value : (Token generado cuando ingresa el usuario)_

 ##### Url:
 
```
localhost:8080/findAllUsuarios
```
#### Ejemplo:
##### Request:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/find_all_user_request.JPG)

##### Response:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/find_all_user_response.JPG)

### Busqueda por id usuario ya registrado

El sigiente metodo es GET ya que se requiere visualizar un usuario ya registrados buscandolo por su id; para que este metodo funcione tenemos que pasar como parametro en Headers lo siguiente:
 
* _Key: Authorization_
* _Value : (Token generado cuando ingresa el usuario)_

 ##### Url:
 
```
localhost:8080/findAllUsuarios/22
```
**22** -> Hace referencia al id del usuario ya registrado que se quiere filtrar.

#### Ejemplo:
##### Request:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/find_user_by_id%20request.JPG)

##### Response:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/find_user_by_id%20response.JPG)

### Borrar por id usuario ya registrado

El sigiente metodo es GET ya que se requiere borrar un usuario ya registrados buscandolo por su id; para que este metodo funcione tenemos que pasar como parametro en Headers lo siguiente:
 
* _Key: Authorization_
* _Value : (Token generado cuando ingresa el usuario)_

 ##### Url:
 
```
localhost:8080/deleteUsuario/22
```
**22** -> Hace referencia al id del usuario ya registrado que se quiere eliminar.

#### Ejemplo:
##### Request:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/delete_user_by_id_request.JPG)

##### Response:

![ScreenShot](https://github.com/diego1193/prueba_tecnica/blob/main/images_README/delete_user_by_id_response.JPG)
