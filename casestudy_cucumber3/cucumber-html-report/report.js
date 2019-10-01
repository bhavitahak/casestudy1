$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/demo.feature");
formatter.feature({
  "name": "product purchase",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "App is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "DefineStep.app_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "microwave purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "John purchase microwave for 100 dollars",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "has a receipt",
  "keyword": "And "
});
formatter.match({
  "location": "DefineStep.has_a_receipt()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "John returns the microwave",
  "keyword": "When "
});
formatter.match({
  "location": "DefineStep.john_returns_the_microwave()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "he got the refund of 100 dollars",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});