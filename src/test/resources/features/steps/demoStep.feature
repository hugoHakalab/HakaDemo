@stepDemo
Feature: Demo hakalab

  Scenario Outline: Login
    Given inicio sesion en salesforce <url><usuario><clave>

    Examples: 
      | url                            | usuario            | clave         |
      | "https://test.salesforce.com/" | "hugo@hakalab.com" | "peralta1234" |

  Scenario Outline: Creacion de caso
    When selecciono menu cuentas
    And selecciono dentro de menu desplegable todas las cuentas
    And doy click en boton ir pra verificar cuentas
    And copio nombre de cliente de la lista
    And ingreso nombre de cliente en barra de busqueda
    And selecciono cliente para continuar la solicitud
    And creo nuevo caso para cliente selccionado
    And selecciono tipo de registro<registro>
    And doy click en continuar con caso
    And selcciono tipo de solicitante<solicitante>
    And selcciono canal<canal>
    And selecciono negocio<negocio>
    And selecciono guardar caso
    Then valido que se crea caso de acuerdo a parametros ingresados

    Examples: 
      | registro   | solicitante       | canal               | negocio              |
      | "Atención" | "Contratante"     | "Asistencia Agente" | "RRVV"               |
      | "Atención" | "No identificado" | "Call Center"       | "Seguros Colectivos" |
      | "Atención" | "Prospecto"       | "CMF"               | "Seguros Familiares" |
