$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "something",
  "description": "",
  "id": "something",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test this",
  "description": "",
  "id": "something;test-this",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "test",
  "keyword": "And "
});
formatter.match({
  "location": "Implementation.test()"
});
formatter.result({
  "duration": 20889674873,
  "status": "passed"
});
});