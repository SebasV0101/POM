Feature: Register

  Scenario: Register successful
    Given The user gets into the page
    When The user enters the credentials
      | email            | password   |
      | sena@yopmail.com | Sena12345* |
    Then The user should see the popup
