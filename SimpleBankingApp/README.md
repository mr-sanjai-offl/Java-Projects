# Simple Banking Application

## Description
A console-based banking application built with Java to simulate basic banking operations.

## Features
- Create Account
- Deposit Money
- Withdraw Money
- Check Balance

## Technologies Used
- Java 17+

## Setup & Installation
1. Unzip the project folder.
2. Open a terminal and navigate to the `src` folder.
3. Compile the Java files:
```bash
javac Main.java model/Account.java service/BankService.java
```
4. Run the program:
```bash
java Main
```

## Example Usage
```
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit
Enter choice: 1
Enter account number: 101
Enter account holder name: John
Account created successfully!
```

## Running Tests
Navigate to the `test` folder and run:
```bash
javac BankServiceTest.java
java BankServiceTest
```
