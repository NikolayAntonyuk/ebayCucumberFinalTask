Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check add product to wishlist
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    And User clicks 'Add to Cart' button on product
    Then User checks that amount of products in wish list are '<amountOfProducts>'

    Examples:
      | homePage                            | keyword | amountOfProducts |
      | https://www.ebay.com                | phone   | 1               |

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


    Scenario Outline: Check add new Personal account
    Given User opens '<signUpPage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    Then User checks that amount of products in wish list are '<amountOfProducts>'

    Examples:
      | signUpPage                            | keyword | amountOfProducts |
      | https://signup.ebay.com/pa/crte       | cake    | 1                |


  Scenario Outline: Check Logging new Personal account
    Given User opens '<signInPage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks wish list on first product
    Then User checks that amount of products in wish list are '<amountOfProducts>'

    Examples:
      | signInPage                        | keyword | amountOfProducts |
      | https://www.ebay.com/signin       | cake    | 1                |


  Scenario Outline: Check site Sign In functions
    Given User opens '<homePage>' page
    And User checks register button visibility
    And User checks sign in button visibility
    When User clicks 'Sign In' button
    And User checks email and password fields visibility on sign in popup
    And User opens store popup
    And User checks that store popup visible
    And User opens shopping cart
    And User checks that shopping cart title visible
    And User clicks language button
    Then User checks that current url contains 'fr' language
    And User checks that language switcher is '<languageSwitcher>'
    Examples:
      | homePage                            | languageSwitcher |
      | https://www.ebay.com                | Ukraine         |
