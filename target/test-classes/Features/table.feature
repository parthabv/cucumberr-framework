Feature: verify the amazon search module
Scenario: verify the amazon searchbox
Given user is in amazon home page
When user is entering the value
|iphone|
|laptop|
Then verify the value is present in searchbox