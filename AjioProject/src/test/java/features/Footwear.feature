#Author:saurabhsawale7875@gmail.com

Feature: Verify Filter Functionality on Foot wear Page

Scenario: Verify Filter Functionality in Men Category
Given User is on Footwear page
When User Selects the Gender Men, Category Formal and & Brand as Action
Then Verify all Action shoes are displayed


Scenario: Verify the Size Chart
Given User is on Footwear page
When User Select Gender Men and Category as Sports
And Select Size Chart for particular shoes
Then Verify the sizes are mentioned in Ascending order
