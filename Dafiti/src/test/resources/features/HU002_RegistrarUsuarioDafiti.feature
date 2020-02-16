#Author: enrortega01@gmail.com
Feature: Registrar usuario en Dafiti

  Background: Iniciar sesion en Dafiti
    Given He ingresado a la pagina Dafiti

  Scenario: Registrar un usuario en Dafiti
    Given Registro de un usuario
      |     email        | contra | nombre | apellido | doc   | dianac | mesnac |
      | luisenriquejunior@gmail.com | asdfgh | JUNIOR |  ORTEGA   | 12345 | 01 | 07 |
    And Validado el registro
    Then Validar cierre sesion
