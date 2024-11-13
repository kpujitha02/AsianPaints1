Feature: Store locator

Scenario Outline: Validate user is able to get store locations from stores

Given Browser is open and url is navigated
When The user clicks on beautiful homes
And The user hover on button 
And The user selects store locator
And The user scrolls and selects <Location> from dropdown

Examples:

| Location |
|     0      | 
|     1      |
|     2      |