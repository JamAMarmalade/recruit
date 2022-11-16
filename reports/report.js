$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userSearchesNearestGym.feature");
formatter.feature({
  "name": "Search postcode",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I search my postocde",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the website \"https://www.nuffieldhealth.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.i_go_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Gym tab\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_click_on(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca id\u003d\"0000014c-faaa-d922-a7ed-fbef5a7f0000\" href\u003d\"#\" class\u003d\"nav__link\"\u003e...\u003c/a\u003e is not clickable at point (702, 66). Other element would receive the click: \u003cdiv id\u003d\"ccc-overlay\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d98.0.4758.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-U223GGUJ\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0-332\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.102, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\Jamzy\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51706}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 60a6eb5585da78a6d941cac802a9a784\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.automation.actions.CommandActions.clickButton(CommandActions.java:28)\r\n\tat com.automation.steps.SearchSteps.i_click_on(SearchSteps.java:37)\r\n\tat ✽.I click on \"Gym tab\"(file:src/test/resources/features/userSearchesNearestGym.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I find and click on the link \"join a gym\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_find_and_click_on_the_link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input \"SE1 9AA\" to the field \"Search Gym\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_input_to_the_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I can see the link with text \"arrange a visit\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_can_see_the_link_with_text(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});