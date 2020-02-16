#Author: enrortega01@gmail.com
Feature: Compra Articulo en Dafiti

  Background: Iniciar sesion en Dafiti
    Given He ingresado a la pagina Dafiti
    Then Iniciar sesion un usuario enrique.ortega@udea.edu.co y contrasena asdfgh

  Scenario: Agregar al carrito
    Given He seleccionado articulo
    And Verifico agregado al carrito
    Then Cerrar sesion
