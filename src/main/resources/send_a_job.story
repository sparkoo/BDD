Meta:

Narrative:
As a user
I want to send a page to printer
So that I can print it

Scenario: user sends 3 page job
Given printer with terminal
When user sends 3 pages to the printer
Then 1 job with 3 pages appears on Terminal

When user push print button on terminal
Then 3 pages are printed
And user is charged for 6 dollars