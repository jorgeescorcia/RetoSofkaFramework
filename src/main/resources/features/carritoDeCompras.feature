# language: es
@FeatureName:carritoDeCompras
  Característica: validar carrito de compras
    Como usuario de la tieda
    necesito logueado
    para poder realizar compras en línea.

@ScenarioName:CompraExitosa
Escenario: compra exitosa
  Dado que el cliente esta registrado en la pagina
  Cuando el cliente selecciona los productos y los agrega al carrito
  Entonces como resultado el usuario podra hacer el pago de los productos

  Escenario: compra erronea
    Dado que el cliente se encuentra registrado
    Cuando el cliente no acepta los terminos y condiciones
    Entonces como resultado el usuario no podra continuar con el proceso de compra