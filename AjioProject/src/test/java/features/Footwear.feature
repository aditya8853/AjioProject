#Author:saurabhsawale7875@gmail.com

Feature: Verify Filter Functionality on Footwear Page
@tag1
Scenario: Verifying Filter Functionality in Mens Category
Given User is on Footwear page
When User Search the shoes by applying following features
| Men | Sports | Puma | 50 |
Then Verify all shoes are displayed are of Selected Brand
And Discount is greater than or equals to 50%


Scenario: Verifying the Size Chart
Given User is on Footwear page
When User Select Gender Men and Category as Sports
And Select Size Chart for particular shoes
Then Verify the sizes are mentioned in Ascending order
