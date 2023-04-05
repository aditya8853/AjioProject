#Author: yogeshthosar5522@gmail.com

Feature: Login Feature.
Scenario: verification of add to cart functionality
Given User is on USPA shirt selection page 
When User select Shirt and select size of the shirt 
Then User is able to proceed to checkout 
And verify thet the selected shirt appears in the cart and cost is same as selected 

Scenario: verify the login functionality of Ajio.com
Given User is on login page 
When User enterd the valid username and password 
Then user is sucessfully logged into ajio.com website

Scenario: Verify the addition of cost of multipal products. 
Given user is on bag page.
When User select multipal item And go for place order. 
Then User is able to proced for payment And verify the addition of all products.


Scenario: Verify the quantity of products
Given User is on mens fashion page 
When User select the USPA shirt and Leecooper jens
Then USer is able to proceed for checkout and verify the quantity of product