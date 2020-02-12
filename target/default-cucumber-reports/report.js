$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Amazon/Amazon.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Main Functionality",
  "description": "",
  "id": "amazon-main-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search For an Item",
  "description": "",
  "id": "amazon-main-functionality;search-for-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "All results should contain \u0027Iphone\u0027 in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 28
    }
  ],
  "location": "AmazonSteps.all_results_should_contain_Iphone_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Checkout",
  "description": "",
  "id": "amazon-main-functionality;checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects the first \u0027Ihpone\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should see the price in detail",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("features/Amazon/Cart.feature");
formatter.feature({
  "line": 1,
  "name": "Carts Test",
  "description": "",
  "id": "carts-test",
  "keyword": "Feature"
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
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "Item is added to the card",
  "description": "",
  "id": "carts-test;item-is-added-to-the-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the item number 1",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should see \u0027Added to Cart\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("features/Amazon/Search.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Main Functionality",
  "description": "",
  "id": "amazon-main-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Search For an Item",
  "description": "",
  "id": "amazon-main-functionality;search-for-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "All results should contain \u0027apple\u0027 in the title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "apple",
      "offset": 28
    }
  ],
  "location": "AmazonSteps.all_results_should_contain_Iphone_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Item Details",
  "description": "",
  "id": "amazon-main-functionality;item-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User selects the first \u0027Iphone\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "All results should contain \u0027Iphone\u0027 in the title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 28
    }
  ],
  "location": "AmazonSteps.all_results_should_contain_Iphone_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSteps.user_is_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Cart",
  "description": "",
  "id": "amazon-main-functionality;cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User enters \u0027Iphone\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User selects the first \u0027Ihpone\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User adds the selected item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User should see \u0027Iphone\u0027 in the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User should see the price in the detail",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Use shouldn\u0027t see the \u0027Iphone\u0027 characteristics",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 13
    }
  ],
  "location": "AmazonSteps.user_enters_Iphone_in_the_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("features/Etsy/EtsyLogin.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@etsy"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Happy path positive scenario",
  "description": "",
  "id": ";happy-path-positive-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "use is on the etsy home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "use clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user inputs his username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user inputs his password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the user has successfully logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "EtsyLoginSteps.user_inputs_his_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EtsyLoginSteps.user_inputs_his_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EtsyLoginSteps.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("features/expedia/ListYourProperty.feature");
formatter.feature({
  "line": 2,
  "name": "List Your Property",
  "description": "",
  "id": "list-your-property",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@expedia"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "New window for property listing",
  "description": "",
  "id": "list-your-property;new-window-for-property-listing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user is on the main expedia page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \u0027list your property button\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the new tab should open",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "how much could you earn text be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "ExpediaNewWindowVerificationSteps.the_user_is_on_the_main_expedia_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ExpediaNewWindowVerificationSteps.the_user_clicks_on_the_list_your_property_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ExpediaNewWindowVerificationSteps.the_new_tab_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ExpediaNewWindowVerificationSteps.how_much_could_you_earn_text_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});