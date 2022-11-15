# Autor: Miguel Angel Preciado Monsalve
@stories
Feature: Automation Demo Site
  As a user, i want to register on the Automation Demo Site
  @scenario1
  Scenario Outline: Register
    Given than Miguel wants to register
    When he enters his personal data
      | firstName   | lastName   | address   | emailAddress   | phone   | skills   | selectCountry   | year   | month   | day   | password   | confirmPassword   |
      | <firstName> | <lastName> | <address> | <emailAddress> | <phone> | <skills> | <selectCountry> | <year> | <month> | <day> | <password> | <confirmPassword> |
    Then he must see the <webtableMessage>

    Examples:
      | firstName     | lastName           | address          | emailAddress           | phone      |  skills   | selectCountry | year | month | day | password | confirmPassword | webtableMessage                                 |
      | miguel angel  | Preciado Monsalve  | calle 51 # 45-38 | miguelmon328@gmail.com | 3014873960 |  Software | Japan         | 1996 | March | 28  | 1234     | 1234            | Double Click on Edit Icon to EDIT the Table Row.|