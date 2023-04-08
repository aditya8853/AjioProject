#Author: adityapatil2100@gmail.com

Feature: Dynamic Offers


  Scenario: Verification of Dynamic Offers on HomePage
    Given User is on HomePage of Ajio Website
    When User checks and clicks on Offers mentioned on the HomePage
    Then User is able to verify that products mentioned has price as per Offer mentioned on HomePage

  
  Scenario: Verification of Sort by functionality
    Given User is on Ajio Luxe Page
    When User hovers over Mens section and clicks on Belts
    And Sorts by price lower to higher
    Then Verify that lowest price is displayed first by comparing it to second item
