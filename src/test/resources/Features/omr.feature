Feature: Verifying omr login module

  Scenario Outline: verifying login with valid credentails
    Given user is on the omr page
    When user entered "<username>" and "<password>"
    And user click login button 
    Then user should verify after login success message
    Examples:
   |username|password|
   |parthasarathyb95@gmail.com|Bvmcp@1802|
   
   
