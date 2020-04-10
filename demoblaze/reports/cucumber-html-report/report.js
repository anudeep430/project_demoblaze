$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoBlaze.feature");
formatter.feature({
  "line": 2,
  "name": "DemoBlaze Application testing",
  "description": "Login and buy products",
  "id": "demoblaze-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login with demoblaze",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches demoblaze website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter \u003cusername\u003e and \u003cpassword\u003e and click on login",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "demoblaze-application-testing;login-with-demoblaze;;1"
    },
    {
      "cells": [
        "user_3",
        "user1pass"
      ],
      "line": 14,
      "id": "demoblaze-application-testing;login-with-demoblaze;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login with demoblaze",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches demoblaze website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter user_3 and user1pass and click on login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login_TC.user_launches_demoblaze_website()"
});
formatter.result({
  "duration": 13965239500,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_click_on_login_button()"
});
formatter.result({
  "duration": 90526900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user_3",
      "offset": 11
    },
    {
      "val": "user1pass",
      "offset": 22
    }
  ],
  "location": "Login_TC.user_enter_and_and_click_on_login(String,String)"
});
formatter.result({
  "duration": 10606037700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Add phone to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-phone-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user click on phone",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user click on the desired mobile phone",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user clicks add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Phone_TC.user_click_on_phone()"
});
formatter.result({
  "duration": 11055864600,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.user_click_on_the_desired_mobile_phone()"
});
formatter.result({
  "duration": 1068722200,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.user_click_o_add_to_cart()"
});
formatter.result({
  "duration": 1991813500,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 3344987100,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Add laptop to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-laptop-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user click on laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user click on desired laptop",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "add product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "navigate to cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Laptop_TC.user_click_on_laptop()"
});
formatter.result({
  "duration": 10996529200,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.user_click_on_desired_laptop()"
});
formatter.result({
  "duration": 1902197900,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 3816529600,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 3567203400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Add Monitor to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-monitor-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user click on monitor",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user click on dersired monitor",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "add desired monitor to cart",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "succeed to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Monitor_TC.user_click_on_monitor()"
});
formatter.result({
  "duration": 10991953600,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_click_on_dersired_monitor()"
});
formatter.result({
  "duration": 1587952000,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 3867204100,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 3361465400,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Purchase a product",
  "description": "",
  "id": "demoblaze-application-testing;purchase-a-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user click on desired product",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "user click on add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "move to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on place order",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "fill the details",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on purchase",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "click on ok",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchase_TC.user_click_on_desired_product()"
});
formatter.result({
  "duration": 12488505200,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 1721042200,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 768605300,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_place_order()"
});
formatter.result({
  "duration": 1092256800,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.fill_the_details()"
});
formatter.result({
  "duration": 612708100,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_purchase()"
});
formatter.result({
  "duration": 149335300,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_ok()"
});
formatter.result({
  "duration": 541804400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 51,
  "name": "Signup",
  "description": "",
  "id": "demoblaze-application-testing;signup",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "user clicks on signup button",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "click on signup",
  "keyword": "Then "
});
formatter.examples({
  "line": 56,
  "name": "",
  "description": "",
  "id": "demoblaze-application-testing;signup;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 57,
      "id": "demoblaze-application-testing;signup;;1"
    },
    {
      "cells": [
        "user_6",
        "user1pass"
      ],
      "line": 58,
      "id": "demoblaze-application-testing;signup;;2"
    },
    {
      "cells": [
        "user_7",
        "user1pass"
      ],
      "line": 59,
      "id": "demoblaze-application-testing;signup;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 58,
  "name": "Signup",
  "description": "",
  "id": "demoblaze-application-testing;signup;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 50,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "user clicks on signup button",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user enters user_6 and user1pass",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "click on signup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_TC.user_clicks_on_signup_button()"
});
formatter.result({
  "duration": 11277487500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user_6",
      "offset": 12
    },
    {
      "val": "user1pass",
      "offset": 23
    }
  ],
  "location": "SignUp_TC.user_enters_and(String,String)"
});
formatter.result({
  "duration": 3202646600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_TC.click_on_signup()"
});
formatter.result({
  "duration": 9189263200,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "Signup",
  "description": "",
  "id": "demoblaze-application-testing;signup;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 50,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "user clicks on signup button",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user enters user_7 and user1pass",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "click on signup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_TC.user_clicks_on_signup_button()"
});
formatter.result({
  "duration": 11074093600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user_7",
      "offset": 12
    },
    {
      "val": "user1pass",
      "offset": 23
    }
  ],
  "location": "SignUp_TC.user_enters_and(String,String)"
});
formatter.result({
  "duration": 3238547600,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_TC.click_on_signup()"
});
formatter.result({
  "duration": 9188486500,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "No of mobiles",
  "description": "",
  "id": "demoblaze-application-testing;no-of-mobiles",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "user launch demoblaze application",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "user check the number of products in a webpage",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "print the number of products in a webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileCount_TC.user_launch_demoblaze_application()"
});
formatter.result({
  "duration": 11028424400,
  "status": "passed"
});
formatter.match({
  "location": "MobileCount_TC.user_check_the_number_of_products_in_a_webpage()"
});
formatter.result({
  "duration": 22387900,
  "status": "passed"
});
formatter.match({
  "location": "MobileCount_TC.print_the_number_of_products_in_a_webpage()"
});
formatter.result({
  "duration": 9321024200,
  "status": "passed"
});
});