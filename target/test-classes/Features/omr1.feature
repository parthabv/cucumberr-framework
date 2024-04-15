Feature: Verifying omr loginn module

  Scenario Outline: verifying login with validd credentails
    Given user is on the omr page
    When user entered "parthasarathyb95@gmail.com" and "Bvmcp@1802"
    And user click login button
    Then user should verify after login success message

  Scenario Outline: verifying login with valid credentails
    Given user is on the omr page
    When user entered "<username>" and "<password>"
    And user click login button
    Then user should verify after login success message

    Examples: 
      | username                     | password   |
      | parthasarathyb1995@gmail.com | Bvmcp@1802 |

  Scenario Outline: verifying with valid details
    Given user is on the signin page
    When user is entered "<email>" and "<password>"
    When user click login button in blue
    Then user will verify after login success message

    Examples: 
      | email                      | password   |
      | parthasarathyb85@gmail.com | Bvmcp@1802 |
