# Software Construction Lab Task 05

## Designing Specifications: Preconditions and Postconditions

**University:** University of Engineering and Technology, Abbottabad Campus

**Department:** Software Engineering

**Semester:** 5th Semester

**Subject:** Software Construction

**Instructor:** Engr. Rizwan Shah

**Date:** 15 September 2026

## Objective

The objective of this lab is to understand and implement method specifications using preconditions and postconditions. The lab also focuses on behavioral equivalence, fail-fast validation, mutation contracts, immutability, and declarative specifications. JUnit 5 is used to test and verify the implemented methods.

## Technologies and Tools

* Java
* JUnit 5
* Maven
* NetBeans IDE
* GitHub

## Lab Tasks

### Task 1 – Behavioral Equivalence

Implemented two search strategies:

* `findFirst()` returns the first occurrence of a value.
* `findLast()` returns the last occurrence of a value.

JUnit tests were written to verify cases where the methods return different results and cases where they return the same result.

### Task 2 – Failing Fast on Precondition Violations

Implemented `calculateGravitationalPotentialEnergy()` with a precondition that altitude must be greater than or equal to zero.

If a negative altitude is provided, the method throws an `IllegalArgumentException`.

JUnit `assertThrows()` was used to verify that invalid input is rejected immediately.

### Task 3 – Mutation Contracts

Implemented two list operations:

* `sortInPlace()` modifies the original list.
* `toLowerCase()` creates and returns a new list without modifying the original list.

JUnit tests verify the expected mutation and non-mutation behavior.

### Task 4 – Immutability for Safer Contracts

Implemented two methods in the `Authenticator` class:

* `getMitId()` returns a mutable `char[]`, which can allow the cached data to be changed accidentally.
* `getMitIdSecure()` returns an immutable `String`.

Returning an immutable `String` provides a safer way to protect internal data from unwanted modification.

### Task 5 – Declarative vs. Operational Specifications

Implemented `joinStrings()` to combine a list of strings using a delimiter.

The task demonstrates the difference between:

* Operational specification: explains how the method works internally.
* Declarative specification: explains what result the method should produce.

The declarative JavaDoc describes the expected behavior without depending on the implementation details.

## Testing

JUnit 5 was used to test all five tasks.

The tests covered:

* Normal cases
* Boundary and invalid cases
* Different search results
* Precondition violations
* Mutation and non-mutation behavior
* Immutable return values
* String joining behavior

All test cases passed successfully.

## How to Run the Project

1. Clone or download this repository.
2. Open the project in NetBeans IDE.
3. Make sure Maven dependencies are loaded.
4. Run the JUnit tests.
5. Verify that all tests pass successfully.
6. The Maven test execution should show `BUILD SUCCESS`.

## Project Structure

The project contains Java source files and JUnit test files for all five tasks.

Main implementation classes include:

* `SearchStrategies.java`
* `MathUtils.java`
* `ListFormatter.java`
* `Authenticator.java`
* `JoinStrings.java`

JUnit test classes are included for testing the functionality of each task.

## Result

All five lab tasks were successfully implemented and tested using JUnit 5. All test cases passed successfully, confirming that the implemented methods satisfy their required specifications and behavior.

## Conclusion

This lab provided practical experience with designing method specifications and testing software behavior. The implementation demonstrated preconditions, postconditions, mutation, immutability, behavioral equivalence, and declarative specifications. JUnit 5 testing confirmed that all implemented functionality works as expected.

