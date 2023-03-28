#Author:saurabhsawale7875@gmail.com

Feature: Verify Filter Functionality of Foot wear Page

Scenario: Verify Filter Functionality in Men Category
Given User is on Foot wear page
When User Select the Gender Men, Category Formal and & Brand is Action
Then The User Selected Shoes should be displayed


Scenario: Verify the Size Chart
Given User is on Foot wear page
And User Select Gender Men and Category is Sports
When User Select First Shoes
And Select Size Chart
Then Size Chart Shoes the Sizes 
