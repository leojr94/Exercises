#Author: enrortega01@gmail.com
Feature: Registrar usuario en Dafiti

  Scenario: Registrar un usuario en Dafiti
    Given Pagina dafiti
    When Registro de un usuario
      | email                          | contra | nombre | apellido | doc   | dianac | mesnac |
      | luisenriquejunior115@gmail.com | asdfgh | JUNIOR | ORTEGA   | 12345 |     01 |     07 |
    And Validado el registro
    Then Validar cierre sesion
