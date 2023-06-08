@CEL01
Feature: Travel Blog main page cards accessibility
  Agile Story: As a user, when I am on the Travel Blog main page
  I should be able to click and open travel cards

  Background: User already logged in
    Given User is on Travel Blog main page

  @CEL01-02
  Scenario Outline: User clicks and opens travel cards and sees clicked card information
    When User clicks "<card name>"
    Then User able to see "<card name>" as same as page header in card page
    Examples:
      | card name                                           |
      | 15 Undeniable Reasons to Love Travel                |
      | Some of the cool places to visit in Africa          |
      | How to travel with your pets                        |
      | Travel: The Good, the Bad, and the Ugly             |
      | Why People Love to Hate Travel                      |
      | 20 Best Tweets of All Time About Travel             |
      | Forget Travel: 10 Reasons Why You No Longer Need It |
      | How Much Should You Be Spending on Travel?          |
      | The Biggest Trends in Travel We've Seen This Year   |
      | How Technology Is Changing How We Treat Travel      |


