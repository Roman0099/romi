$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "As a user i should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login as a User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "as a user i log in to CybertekTraining",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});