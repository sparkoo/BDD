Meta:

Narrative:
As a user
I want to send a page to printer
So that I can print it

Scenario: user sends 3 page job and print
Given printer
When user sends 3 pages to the printer
Then 1 job with 3 pages appears on printer display

When user push print button
Then 3 pages are printed for 7 dollars
And 0 job with 0 pages appears on printer display

When user sends 5 pages to the printer
And user sends 3 pages to the printer
Then 2 job with 8 pages appears on printer display

When user push print button
Then 8 pages are printed for 18 dollars