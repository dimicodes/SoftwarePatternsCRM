# Design Patterns Implementation

This repository contains Java code demonstrating the implementation of multiple design patterns including Behavioral, Creational, and Structural patterns as part of a banking system simulation.

## Project Structure

The project is structured into packages that categorize classes according to the patterns they demonstrate:

- `Patterns.behavioral`: Contains classes related to behavioral design patterns such as Observer and State.
- `Patterns.creational`: Includes implementations of Factory and Singleton patterns.
- `Patterns.structural`: Features classes related to the Adapter and Facade patterns.

## Features

- **Observer Pattern**: Used to notify registered customers (observers like `Customer` and `SalesRepresentative`) about changes in `LoanProduct` state.
- **State Pattern**: Manages state transitions in `LoanApplication` through different phases like New, Under Review, and Approved.
- **Factory Pattern**: Centralizes creation of different types of loans (`AutoLoan`, `PersonalLoan`, `MortgageLoan`) through a `LoanFactory`.
- **Singleton Pattern**: `CRMSystem` is implemented as a singleton to manage customer relationship operations across the system.
- **Adapter Pattern**: `CreditScoreAdapter` adapts an external credit score service for compatibility with the system.
- **Facade Pattern**: `CRMFacade` simplifies interactions with subsystems, providing an easy interface to apply for loans.

## Usage

The main driver (`Main.java`) initializes the system and demonstrates the interaction between different components and patterns:

- Creation and notification of loans.
- State transitions in loan applications.
- Singleton usage in managing customer data.
- Adapting external services for credit score checking.
- Simplifying system operations through a facade.

## Running the Project

To run the project, ensure you have Java installed and compile the classes using:
```javac Main.java```

Then, run the compiled class with:
```java Main```

This will execute the demonstrations defined in `Main.java` for various design patterns.

## Output

The console output will show the results of operations like loan notifications, state transitions, and interactions through the CRM facade based on the coded scenarios.

---

This project provides a practical look at applying design patterns in a software system to solve common design problems and enhance code manageability and scalability.
