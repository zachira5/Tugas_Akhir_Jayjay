Feature: Test automation web

  @web
  Scenario: Test sign up with username and password empty
    Given open web home page
    And user click signup popup
    And user input username sign up ""
    And user input password sign up ""
    And user click signup button

  @web
  Scenario: Test sign up normal
    Given open web home page
    And user click signup popup
    And user input username sign up "malayoichi@gmail.com"
    And user input password sign up "mala1234"
    And user click signup button

  @web
  Scenario: Test sign up with user existing
    Given open web home page
    And user click signup popup
    And user input username sign up "malafauzana@gmail.com"
    And user input password sign up "pass123"
    And user click signup button

  @web
  Scenario: Test login web normal
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "pass123"
    And user click login button

  @web
  Scenario: Test login web with wrong password
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "dededidi"
    And user click login button

  @web
  Scenario: Test cancel login web normal
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "pass123"
    And user click cancel login button

  @web
  Scenario: Test login and show product
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "pass123"
    And user click login button
    When user click product


  @web
  Scenario: Test send message from contact menu
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "pass123"
    And user click login button
    When user click menu contact
    And user input contact email "malafauzana@gmail.com"
    And user input contact name "Mala Yoichi"
    And user input message "Ini final project mala"
    And user click button send message

  @web
  Scenario: Test login and logout
    Given open web home page
    And user click login popup
    And user input username "malafauzana@gmail.com"
    And user input password "pass123"
    And user click login button
    When user click logout button



