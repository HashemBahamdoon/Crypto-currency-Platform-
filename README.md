# mini Cryptocurrency Exchange Platform

A cryptocurrency exchange is a group project for a design pattern course at King Abdulaziz University in 2022, and it is a marketplace where users can buy, sell, and trade cryptocurrencies locally. It functions similarly to online brokerages. This project focuses on developing a cryptocurrency exchange that addresses specific problems and utilizes design patterns for effective implementation.

## Problems

During the development of this project, we encountered the following problems:

1. Ensuring that each user has only one wallet address.
2. Encapsulating the user to protect their information.
3. Verifying that the user is the correct user.
4. Using only one file to save all broker orders.

## Solutions

To address these problems, we have employed the following solutions:

1. Singleton Design Pattern: Ensures that only one instance of the wallet exists, providing a single wallet address per user.
2. Proxy Design Pattern: Encapsulates the user by using a proxy object to control access to the user's information.
3. Command Design Pattern: Implements the broker orders using a command object, allowing us to save all broker orders in a single file.

## Design Patterns Used

The following design patterns were utilized in this project:

1. Singleton Design Pattern: Implemented to ensure only one instance of the wallet exists.
2. Proxy Design Pattern: Utilized to control access to the user's information and encapsulate the user.
3. Command Design Pattern: Used to implement the broker orders and save them in a single file.

## Code

The provided code consists of several classes and interfaces that contribute to the functionality of the cryptocurrency exchange. Here is a brief overview of the key components:

- `App.java`: Contains the main method and serves as the entry point for the application. It demonstrates the usage of the implemented classes.
- `Authorization.java`: Defines the `Authorization` interface, which is implemented by the `TradingAuthorization` class.
- `Broker.java`: Represents the broker responsible for executing orders.
- `BuyCrypto.java` and `SellCrypto.java`: Implement the `Order` interface and execute buy and sell orders, respectively.
- `Logger.java`: Provides a logging mechanism to record important events in the system.
- `User.java`: Defines the `User` class, which holds user information such as username and password.
- `authorizationProxy.java`: Implements the `Authorization` interface using a proxy pattern to control access to trading operations.
- `cryptocurrency.java`: Manages the cryptocurrencies available for trading and handles buy and sell operations.
- `wallet.java`: Represents the user's wallet and manages the balance, cryptocurrency holdings, and related operations.

Please refer to the provided code for further implementation details.

## Getting Started

To run the application, follow these steps:

1. Ensure you have Java installed on your machine.
2. Compile the Java files using a Java compiler.
3. Run the `App` class, which contains the main method.


---
