$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_LoginNewtours.feature");
formatter.feature({
  "name": "Entrar a pagina con credenciales",
  "description": "  Como automatizador de pruebas\n  necesito automatizar proceso de login \n  para probar pagina newtours",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logear En pagina",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesito entrar a pagina con credenciales",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionNewtours.necesitoLogear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Campos Luis Ortega 300867 leor@gmail.com luise y asdfgh",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionNewtours.camposUserPass(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cerrar sesion",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionNewtours.cerrarSesion()"
});
formatter.result({
  "status": "passed"
});
});