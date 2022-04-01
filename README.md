# RetoSofkaFramework - Plan de Pruebas



| Version  | Comentarios |Fecha|Descripción|Responsable|
|----------|:-------------:|------:|-------:|---------|
| 1.0  | Creacion  |1/04/2022|Creación Plan De pruebas|Jorge Escorcia|

## Descripción
La empresa YourLogo requiere contar con un canal virtual que les permita a sus clientes realizar compras por este medio sin necesidad de ir a la tienda física.
El proceso da inicio con la construcción de este sitio Web que le permite a los usuarios visualizar las diferentes prendas de vestir con las que cuenta el sitio, así como la descripción y precio correspondiente al artículo. Adicionalmente los usuarios o clientes podrán realizar un registro, login, y escribir mensaje a servicio al cliente mediante el apartado de contáctenos y por otra parte podrá proceder a la compra del articulo mediante un carrito de compra que los guiara por todo el proceso.


## Alcance de las pruebas
Se realizarán pruebas de caja negra (automatizadas) a las funcionalidades seleccionadas durante la planificación de cada sprint.
Las funcionalidades a ser automatizadas serán seleccionadas utilizando los criterios de la Lista de Chequeo
-	Las pruebas se realizarán en navegadores  
•	Mozilla v54 o superior
•	Chrome v55 o superior
-	Se realizarán pruebas automatizadas
-	Se realizarán las pruebas en computadoras con sistema operativo Windows 10
-	Se probará la visualización del sitio web en un equipo móvil con sistema operativo Android 12

## **HU001 – Compra Exitosa en la web**
 yo como usuario de la tieda
 necesito tener productos en el carrito de compras
 para poder realizar compra en línea.
 
 ### Criterios De Aceptación
 - Verificar que el boton T-Shirts de la categoria de ropa este disponible o visible
 - Verficar que al presionar el boton T-Shirts se despliegue los diferente tipos de articulos pertenecientes a esa categoria
 - Verificar que al darle click al articulo me lleva a la pantalla siguente para proceder con el pago
 - Verficar que el producto seleccionado mustre su nombre y su precio
 - verifcar que este visible el boton Add to Cart
 - verficar que el boton Proceed to checkout este disponible
 - verificar que check de terminos y condiciones este visible
 - verificar que el metodo de pago bank este disponible
 - verificar que el botón de i confirm my order

### Fuera de Alcance
- Verificar otras categoria distintas a T-Shirts
- Realizar pruebas en navegadores diferentes a Mozilla y GoogleChrome
- Verificar un metodo de pago distinto de Bank

## **HU002 – Envio de Mensaje exitoso a servicio al cliente**
 yo como usuario de la tieda
 necesito enviar mensaje al area de servicio al cliente
 para pedir asesoria al momento de realizar una compra.
 
 ### Criterios De Aceptación
 - Verificar que el boton ContacUs este disponible o visible
 - Verficar que al presionar el boton ContacUs se despliegue el formulario con los campos para el envio del mensaje
 - Verificar que aparzeca la opción webmaster
 - Verficar que el email se ingrese correctamente
 - verifcar que el mensaje se ingrese correctamente
 - verficar que el boton Send se encuentre visible
 - verificar que al ar click en el boton Send se haga efectivo el envio del mensaje
 

### Fuera de Alcance
- Verificar otros botones distintos al de ContacUs
- Realizar pruebas en navegadores diferentes a Mozilla y GoogleChrome
- Verificar que la prueba se ejecute en un sistema operativo distinto a windows

## Roles Y Responsabilidades
| Roles  | Responsabilidades |
|----------|:-------------:|
| Manager QA | Planificación y monitoreo de las pruebas automatizadas Reporte de Defectos Reporte de progreso de las pruebas||----------|:-------------:|  
|Ingeniero QA de Automatización/ Analista QA|Diseño e implementación de las pruebas. /Ejecución de las pruebas automatizadas. /Reporte de resultados de las pruebas|        |----------|:-------------:|  
|Product Owner/Stakeholders|Toma de decisiones|

## Estrategias de Pruebas
### Todas las ejecuciones de pruebas serán de tipo Manual.

Se iniciará realizando un Smoke Test para determinar que el portal cargue correctamente, también que todos los campos están disponibles para ingresar información y que los botones se encuentren presentes, Para los módulos que se mencionan en el alcance se realizaran pruebas funcionales a nivel de sistema.

## Herramientas de Pruebas
| Herramienta  | Función |
|----------|:-------------:|
|Framework Sofka|conjunto de utilidades que facilita la labor de obtener juegos de pruebas para aplicaciones web|
|Gradle|Creación de la estructura de proyectos y uso e importación de librerías|
|Chromedriver|Crea una instancia del navegador Chrome|

## Planificación de ejecución de las pruebas
Lista de funcionalidades a ser automatizadas por Sprint

|Sprint número|	Funcionalidades|	Comentarios|
|----------|:-------------:|:-------------:|
|HU001	|Automatizar el modulo de carrito de compras||	
|HU002	|	Automatizar el modulo de contacUs||

Las pruebas de automatización normalmente comenzarán en la segunda semana del Sprint (de 2 semanas).
Es necesario que las funcionalidades a automatizar se desarrollen, implementen y prueben manualmente para que tengan un nivel determinado de estabilidad cuando comienzan las tareas de automatización

## Requerimientos
- Se debe contar con un ambiente de pruebas en el que se encuentre la versión más reciente de la aplicación
- Contar con la ultima version de la web desplegada

## Infraestructura  Y Datos
- Disponibilidad en la conexión a la red.
- Computador con sistema operativo Windows.

## Limitaciones
Para este caso no se cuenta con ninguna limitación
