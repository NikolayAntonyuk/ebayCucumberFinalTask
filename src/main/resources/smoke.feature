Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check add product to Cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    And User clicks 'Add to Cart' button on product
    Then User checks that amount of products in wish list are '<amountOfProducts>'

    Examples:
      | homePage                            | keyword | amountOfProducts |
      | https://www.ebay.com                | phone   | 1                |


  Scenario Outline: Check validity add product to Cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    And User clicks Add to Cart button on product validity
    Then User checks without select Color
    And User checks without select StorageCapacity
    And User checks without select '<Quantity>'

    Examples:
      | homePage                            | keyword | Quantity |
      | https://www.ebay.com                | phone   | 0        |


  Scenario Outline: Check add product to Watchlist
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    And User clicks Add button on product
    Then User checks that lock captcha checking

    Examples:
      | homePage                            | keyword |
      | https://www.ebay.com                | phone   |


  Scenario Outline: Check site language functions
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks cart visibility
    And User checks language visibility
    When User clicks language Country
    Then User checks selected language

    Examples:
      | homePage                 |
      | https://www.ebay.com     |


  Scenario Outline: Check site delete product to Cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    And User clicks 'Add to Cart' button on product
    And User clicks Cart Remove Item
    And User clicks Cart Item
    Then User checks that amount of products in cart is empty

    Examples:
      | homePage                            | keyword |
      | https://www.ebay.com                | phone   |
