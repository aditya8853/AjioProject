
Feature: Add to Cart Feature

Scenario: Verification of add to cart functionality
Given User is on USPA shirt selection page 
When User select Shirt and select size of the shirt 
Then User is able to proceed to checkout 
And verify thet the selected shirt appears in the cart and cost is same as selected 

Scenario: Verify the addition of cost of multiple products. 
Given user is on bags page
When User select multiple items and proceed to place order. 
Then On Order summary Page user is able to verify the addition of cost of all products selected is same as expected.


Scenario Outline: Verify the quantity of products
Given User is on mens fashion page 
When User adds the <Shirt> and <Jeans> to Cart
Then Verify that user is able to proceed for checkout and the quantity of products is same as selected

Examples: 
| Shirt | Jeans |
| USPA  | Leecooper |
| Levis | Levis |