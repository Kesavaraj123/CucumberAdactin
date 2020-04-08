$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing login function on adactin application",
  "description": "",
  "id": "testing-login-function-on-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "user checking the login funtion using valid username and valid password",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter valid username \"\u003cusername\u003e\" on user name field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enter valid password \"\u003cpassword\u003e\" on password field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validate the name Of the user in homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;;1"
    },
    {
      "cells": [
        "asadas",
        "12334"
      ],
      "line": 17,
      "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;;2"
    },
    {
      "cells": [
        "keshavunique",
        "12345678"
      ],
      "line": 18,
      "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4559525700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 1069588500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 68200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user checking the login funtion using valid username and valid password",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter valid username \"asadas\" on user name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enter valid password \"12334\" on password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validate the name Of the user in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 19283637200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asadas",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_user_name(String)"
});
formatter.result({
  "duration": 5283035400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12334",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_password(String)"
});
formatter.result({
  "duration": 252419200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 17663492500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_validate_the_name_Of_the_user_in_homepage()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.after({
  "duration": 39875803700,
  "status": "passed"
});
formatter.before({
  "duration": 569689400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 246200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 83800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "user checking the login funtion using valid username and valid password",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-checking-the-login-funtion-using-valid-username-and-valid-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter valid username \"keshavunique\" on user name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enter valid password \"12345678\" on password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validate the name Of the user in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 7880002700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keshavunique",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_user_name(String)"
});
formatter.result({
  "duration": 154109600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_password(String)"
});
formatter.result({
  "duration": 98389800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 14501875800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_validate_the_name_Of_the_user_in_homepage()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.after({
  "duration": 404113400,
  "status": "passed"
});
formatter.before({
  "duration": 369949300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 61600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 48300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "user to  fill the booking details",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-to--fill-the-booking-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user navigated to booking details page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user to select the  location",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user to select the  roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user to select  the number of room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user to enter the check-in date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user to enter the check-out date",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user to select the number of adult guest",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user to select the number of guest children",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user to click on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user confirms the booking details are filled",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_booking_details_page()"
});
formatter.result({
  "duration": 18000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_location()"
});
formatter.result({
  "duration": 371720200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_hotel()"
});
formatter.result({
  "duration": 239146600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_roomtype()"
});
formatter.result({
  "duration": 323002800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_number_of_room()"
});
formatter.result({
  "duration": 135988000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_enter_the_check_in_date()"
});
formatter.result({
  "duration": 135385700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_enter_the_check_out_date()"
});
formatter.result({
  "duration": 92444700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_number_of_adult_guest()"
});
formatter.result({
  "duration": 122790100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_the_number_of_guest_children()"
});
formatter.result({
  "duration": 126645400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_the_search_button()"
});
formatter.result({
  "duration": 3614738000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_the_booking_details_are_filled()"
});
formatter.result({
  "duration": 19400,
  "status": "passed"
});
formatter.after({
  "duration": 469768800,
  "status": "passed"
});
formatter.before({
  "duration": 424605100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 63300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 44700,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "user to validate the booked details",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-to-validate-the-booked-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user navigated to booked details page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user to click on the check box button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user to click on the Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user confirmes the user booked details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_booked_details_page()"
});
formatter.result({
  "duration": 25000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_the_check_box_button()"
});
formatter.result({
  "duration": 225267000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_the_Continue_button()"
});
formatter.result({
  "duration": 4322499700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirmes_the_user_booked_details_page()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.after({
  "duration": 393709800,
  "status": "passed"
});
formatter.before({
  "duration": 445606200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 181600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 161600,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "user to fill personal details and done  payment",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-to-fill-personal-details-and-done--payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user navigated to payment page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "user to fill the valid firstname \"keshav \" in firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user to fill the valid lastname  \"billa \" in lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user to fill valid address \"no 67 sri abirami garden unnalamai chetty\" on the address field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user to give valid credit card number \"1234567891234567\"  on the credit card filed",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user to select valid credit card type on the credit card type field",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user to select valid expire  month on month field",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user to select valid expire year on year field",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user to fill valid ccv number \"366\" on ccv field",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user to click on book now button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user to validate the payment had done",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_payment_page()"
});
formatter.result({
  "duration": 3000116400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keshav ",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_to_fill_the_valid_firstname_in_firstname_field(String)"
});
formatter.result({
  "duration": 589438700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "billa ",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_to_fill_the_valid_lastname_in_lastname_field(String)"
});
formatter.result({
  "duration": 679178700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "no 67 sri abirami garden unnalamai chetty",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_to_fill_valid_address_on_the_address_field(String)"
});
formatter.result({
  "duration": 377553600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567891234567",
      "offset": 39
    }
  ],
  "location": "StepDefinition.user_to_give_valid_credit_card_number_on_the_credit_card_filed(String)"
});
formatter.result({
  "duration": 190886100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_valid_credit_card_type_on_the_credit_card_type_field()"
});
formatter.result({
  "duration": 128111400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_valid_expire_month_on_month_field()"
});
formatter.result({
  "duration": 149375000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_valid_expire_year_on_year_field()"
});
formatter.result({
  "duration": 152469400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "366",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_to_fill_valid_ccv_number_on_ccv_field(String)"
});
formatter.result({
  "duration": 90594200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_book_now_button()"
});
formatter.result({
  "duration": 5028083800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_validate_the_payment_had_done()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.after({
  "duration": 316114200,
  "status": "passed"
});
formatter.before({
  "duration": 345847400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to login to  application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 60600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_to_application()"
});
formatter.result({
  "duration": 64200,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "user checking booking is confired and done logout",
  "description": "",
  "id": "testing-login-function-on-adactin-application;user-checking-booking-is-confired-and-done-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 55,
  "name": "user navigated to confirmation page",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "user to click on the Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "user to validate the account logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_confirmation_page()"
});
formatter.result({
  "duration": 31300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_the_Logout_button()"
});
formatter.result({
  "duration": 6721122500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_validate_the_account_logout()"
});
formatter.result({
  "duration": 13780147100,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[    ]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_to_validate_the_account_logout(StepDefinition.java:286)\r\n\tat ✽.Then user to validate the account logout(src/test/java/com/adactin/feature/Adactin.feature:57)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 685829900,
  "status": "passed"
});
});