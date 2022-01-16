Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly


  Scenario Outline: Check site filters products
    Given User opens '<homePage>' page
    And User click on 'Free yourself' button
    When User click on 'More refinements...'
    And User clicks on checkbox filter '<Quantity>'
    And User clicks 'Apply Filter' button
    Then User checks selected filters

    Examples:
      | homePage                            |  Quantity |
      | https://www.ebay.com                | 3         |

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


  Scenario Outline: Check site filters validity products
    Given User opens '<homePage>' page
    And User click on 'Free yourself' button
    When User click on input Price button '<Price>' value
    Then User checks selected Price filters
    And User click on Clear Filters

    Examples:
      | homePage                            | Price |
      | https://www.ebay.com                | 0     |

  Scenario Outline: Check site footer 'Stay Connected'
    Given User opens '<homePage>' page
    When User click on input eBay's Blogs
    And User click on input Facebook
    And User click on input Twitter
    Then User checks going to page mine

    Examples:
      | homePage                            |
      | https://www.ebay.com                |

  Scenario Outline: Check site page 'Advanced Search'
    Given User opens '<homePage>' page
    And User click on Advanced search
    When User click on inputs Enter keywords or '<itemNumber>'
    And User click on input '<Exclude>' words from your search
    Then User checks selected Search
    And User checks '<Quantity>' search

    Examples:
      | homePage                            |itemNumber     | Exclude | Quantity |
      | https://www.ebay.com                |593084993959   | iPhone  | 1        |

  Scenario Outline: Check site Sign In functions
    Given User opens '<homePage>' page
    And User clicks 'Sign In' button
    When User makes fields by keyword '<username>'
    And User clicks Continue button
    And User makes fields '<password>' by keyword
    And User clicks Sign in button
    Then User checks that Hi Stacey!

    Examples:
      | homePage                            | username              | password  |
      | https://www.ebay.com                | zejehotec@gmail.com   | Pa$$w0rd! |
