$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_EntrarDafiti.feature");
formatter.feature({
  "name": "Compra Articulo en Dafiti",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Iniciar sesion en Dafiti",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He ingresado a la pagina Dafiti",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDafiti.irA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iniciar sesion un usuario enrique.ortega@udea.edu.co y contrasena asdfgh",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDafiti.ingresar(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Agregar al carrito",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "He seleccionado articulo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDafiti.seleccionarArticulo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico agregado al carrito",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDafiti.verificarCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cerrar sesion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDafiti.cerrarSesion()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/HU002_RegistrarUsuarioDafiti.feature");
formatter.feature({
  "name": "Registrar usuario en Dafiti",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Iniciar sesion en Dafiti",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "He ingresado a la pagina Dafiti",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDafiti.irA()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registrar un usuario en Dafiti",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Registro de un usuario",
  "rows": [
    {
      "cells": [
        "email",
        "contra",
        "nombre",
        "apellido",
        "doc",
        "dianac",
        "mesnac"
      ]
    },
    {
      "cells": [
        "luisenriquejunio@gmail.com",
        "asdfgh",
        "JUNIOR",
        "ORTEGA",
        "12345",
        "01",
        "07"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDafiti.registrar(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validado el registro",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDafiti.validarRegistro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validar cierre sesion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDafiti.validarCierre()"
});
formatter.result({
  "status": "passed"
});
});