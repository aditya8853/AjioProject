#Author:saurabhsawale7875@gmail.com

Feature: Verify Filter Functionality on Footwear Page

Scenario: Verifying Filter Functionality in Mens Category
Given User is on Footwear page
When User Selects the Gender Men, Category Formal and & Brand as Action
Then Verify all shoes are displayed are of Action Brand


Scenario: Verifying the Size Chart
Given User is on Footwear page
When User Select Gender Men and Category as Sports
And Select Size Chart for particular shoes
Then Verify the sizes are mentioned in Ascending order
