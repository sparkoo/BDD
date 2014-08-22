Meta:

Narrative:
As a user
I want to see proper info on display
So that I can be informed what I have in queue

Scenario: user send some jobs to SafeQ and checks what he has in queue
Given SafeQ
When user checks display
Then display should look like
queue is empty

When user sends 1 pages to SafeQ
And user checks display
Then display should look like
you have 1 jobs in queue

When user sends 2 pages to SafeQ
And user sends 2 pages to SafeQ
And user checks display
Then display should look like
you have 3 jobs in queue

When user prints all jobs
And user checks display
Then display should look like
queue is empty
