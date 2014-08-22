Meta:

Narrative:
As an Administrator
I want to see how many pages was printed
So that I can count company print costs

Scenario: user send job to SafeQ and print it. Administrator can see how many pages was printed
Given SafeQ
When user prints all jobs
Then printed pages on SafeQ is 0

When user sends 3 pages to SafeQ
And user prints all jobs
Then printed pages on SafeQ is 3

When user sends 2 pages to SafeQ
And user sends 5 pages to SafeQ
Then printed pages on SafeQ is 3

When user prints all jobs
Then printed pages on SafeQ is 10