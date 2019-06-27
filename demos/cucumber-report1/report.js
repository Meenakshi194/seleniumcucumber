$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:TDD1/change_password.feature");
formatter.feature({
  "name": "changepassword",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success changepassword",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters password \"abc@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "change_password.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User re-enters password \"abc@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "change_password.user_re_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password changed",
  "keyword": "Then "
});
formatter.match({
  "location": "change_password.password_changed()"
});
formatter.result({
  "status": "passed"
});
});