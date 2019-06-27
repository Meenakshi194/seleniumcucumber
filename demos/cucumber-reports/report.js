$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:TDD/login_feature.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters username",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});