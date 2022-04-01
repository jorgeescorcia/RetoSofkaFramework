# language: es
@FeatureName:Contactenos
Característica: verificar funcionalidad de contactenos
  Como usuario de la tieda
  recibir soporte
  para poder realizar compras en línea.

  @ScenarioName:EnvioMensaje
  Escenario: envio de mensaje exitoso
    Dado que el cliente se encuentra en el apartado de contacus
    Cuando el usuario llena los campos correspondientes
    Entonces el usuario debera ver un mensaje de envio exitoso

  Escenario: envio fallido del mensaje
    Dado que el quiere enviar un mensaje a servicio al cliente
    Cuando el cliente no ingresa email
    Entonces como resultado el usuario no podra enviar el mensaje