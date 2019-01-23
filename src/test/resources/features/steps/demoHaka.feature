@demoHakalab
Feature: ingreso a Hakalab.com desde Google

  @validoHakalab.com
  Scenario Outline: ingreso a Hakalab desde Google
    Given Me encuentro en Google.com <Url>
    When Ingreso <palabraClave> en barra de busqueda
    And doy click en boton buscar
    And selecciono primera opcion desplegada en la lista
    Then valido que me encuentro en Hakalab.com

    Examples: 
      | Url                      | palabraClave     |
      | "https://www.google.com" | "www.hakalab.com" |
