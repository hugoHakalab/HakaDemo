@featureService
Feature: Validacion de servicio SOAP

  @validacionDemo
  Scenario Outline: validacion de servicio SOAP Obtener Persistencia
    When realizo llamada al servicio con rut solicitado <rut>
    Then valido respuesta correcta

    Examples: 
      | rut          |
      | "15045517-0" |
      | "150455"     |
