package service;

import model.Account;
import java.util.HashMap;
import java.util.Scanner;

public class BankService {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        if (!accounts.containsKey(number)) {
            accounts.put(number, new Account(number, name));
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account already exists!");
        }
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        if (accounts.containsKey(number)) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            accounts.get(number).deposit(amount);
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        if (accounts.containsKey(number)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (accounts.get(number).withdraw(amount)) {
                System.out.println("Amount withdrawn successfully!");
            } else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        if (accounts.containsKey(number)) {
            System.out.println("Current balance: " + accounts.get(number).getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}
