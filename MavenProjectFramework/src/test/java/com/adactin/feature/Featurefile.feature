Feature: By using adactin application user can be able to book hotels.

  Scenario: Login-Page
    Given User launch the application by using URL.
    When User enter username in inputfield.
    And User enter password in inputfield.
    Then Clicking login button.

  Scenario: Search-Page
    When Selecting location using dropdown button.
    And Selecting hotels using dropdown button.
    And Selecting Room-type using dropdown button.
    And Selecting No.of.rooms using dropdown button.
    And User enter Check-in-date in input field.
    And User enter Check-out-date in input field.
    And Selecting Adults-per-room using dropdown button.
    And Selecting Children-per-room using dropdown button.
    Then User click the search button.

  Scenario: Search-Hotel Page
    When User click the radio button to select the hotel.
    Then User click on the continue button.

  Scenario: Book-A-Hotel page
    When First name is given in input field.
    And Last name is given in the input field.
    And Billing address is given in input field.
    And Credit card no is given in input field.
    And Selecting Credit card type using dropdown button.
    And Selecting Expiry month using dropdown button.
    And Selecting Expiry year using dropdown button.
    And User enter CVV no in the input field.
    Then User click book now button.

  Scenario: Booking-Confirm Page
    When User click on the MyItinerary button.

  Scenario: Booked-Itinerary Page
    When User click on logout button.
