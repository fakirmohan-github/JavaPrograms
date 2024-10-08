###Steps to push the new project to Git###

#############################################################################################

echo "# SolidPrinciple" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/fakirmohan-github/SolidPrinciple.git
git push -u origin main

##############################################################################################

In Project Directory Path

git init   — This will add the .git folder so that git can track all the changes.
git status  — check the status
git add .   —Instead adding 1 by 1 file With this command will add all the 				changes files inside the folder.
git commit -m "Sample Commit";  — Commit to Local branch
git remote add origin https://github.com/fakirmohan-github/Java8Features.git. — Push to remote branch created in Github.

########################  Interview Questions #############################


Q.1. In Microservice environment if one service is down then how to rollback the previous service execution that has already persist the data
Ans. 
1. Two-Phase Commit (2PC)
   Description: This is a classic distributed transaction protocol where a coordinator ensures all participating services either commit or roll back their changes.
   Implementation:
   Prepare Phase: Each service prepares to commit and locks the resources.
   Commit Phase: If all services agree to commit, the coordinator instructs all to commit; otherwise, it instructs all to roll back.
   Pros: Ensures atomicity across services.
   Cons: Can lead to blocking and is complex to implement.

2. Event Sourcing
   Description: Instead of storing the current state, you store a sequence of events that led to that state. If a service fails, you can revert to a previous state by replaying events.
   Implementation:
   Use an event store to save all changes as events.
   On failure, identify the last successful event and replay all subsequent events to restore the previous state.
   Pros: Provides a clear audit trail and allows for flexible recovery.
   Cons: Can increase complexity and storage requirements.

3. Compensating Transactions
   Description: Instead of rolling back a transaction, create a new transaction that undoes the effects of the previous transaction.
   Implementation:
   Each service defines a compensating action (e.g., if Service A creates a record, Service B should delete that record if it fails).
   In case of failure, trigger the compensating transactions to revert the state.
   Pros: Simpler than 2PC, allows for eventual consistency.
   Cons: Requires careful design of compensating actions.

4. Saga Pattern
   Description: Break down the overall process into smaller, independent steps that can be executed in sequence, where each step can either succeed or fail.
   Implementation:
   Use either Choreography (events trigger the next step) or Orchestration (a central coordinator controls the flow).
   On failure, execute compensating transactions for all previous successful steps.
   Pros: More resilient to failures, promotes microservice independence.
   Cons: Adds complexity to the flow management.

5. Circuit Breaker Pattern
   Description: Use a circuit breaker to prevent a service from attempting an operation that is likely to fail.
   Implementation:
   If a service fails multiple times, open the circuit to prevent further attempts until it recovers.
   This doesn’t roll back transactions but helps manage overall service health.
   Pros: Increases system resilience.
   Cons: Doesn’t handle data consistency directly.

6. Retry Logic with Idempotency
   Description: Implement retry logic for failed operations. Ensure operations are idempotent (can be repeated without additional side effects).
   Implementation:
   If a service call fails, retry it with an exponential backoff strategy.
   Use unique identifiers for requests to ensure that repeated operations do not cause inconsistent states.
   Pros: Simple to implement and can handle transient failures.
   Cons: Doesn’t solve complex rollback scenarios.







#######################################   MAP vs FLATMAP #####################################

How Map works in Java 8

The Stream.map() function performs map functional operation i.e. it takes a Stream and transforms it to another new Stream.

It applies a function on each element of Stream and stores return value into new Stream.

The map operation takes a Function, which is called for each value in the input stream and produces one result value, which is sent to the output stream.


How Flat Map works in java 8

Is the combination of a map and a flat operation

This means you first apply the map function and then flattens the result.

The key difference is the function used by map operation returns a Stream of values or a list of values rather than a single value, that's why we need flattening. When you flat a Stream of Stream, it gets converted into Stream of values.

To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] which has "two levels". It's basically a big List containing three more List.  Flattening this means transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.

In short,
Before flattening - Stream of List of Integer
After flattening - Stream of Integer