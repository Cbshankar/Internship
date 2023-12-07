package org.jspApp_1;

import java.util.Scanner;



public class ATM {


	private BankAccount userAccount;
	 private Scanner scanner;

	 public ATM(BankAccount account) {
	     this.userAccount = account;
	     this.scanner = new Scanner(System.in);
	 }

	 public void displayMenu() {
	     System.out.println("Welcome to the ATM!");
	     System.out.println("1. Check Balance");
	     System.out.println("2. Deposit");
	     System.out.println("3. Withdraw");
	     System.out.println("4. Exit");
	 }

	 public void performTransaction() {
	     int choice;
	     do {
	         displayMenu();
	         System.out.print("Enter your choice: ");
	         choice = scanner.nextInt();

	         switch (choice) {
	             case 1:
	                 checkBalance();
	                 break;
	             case 2:
	                 deposit();
	                 break;
	             case 3:
	                 withdraw();
	                 break;
	             case 4:
	                 System.out.println("Thank you for using the ATM!");
	                 break;
	             default:
	                 System.out.println("Invalid choice! Please select a valid option.");
	                 break;
	         }
	     } while (choice != 4);
	 }

	 private void checkBalance() {
	     System.out.println("Your current balance: $" + userAccount.getBalance());
	 }

	 private void deposit() {
	     System.out.print("Enter deposit amount: $");
	     double amount = scanner.nextDouble();
	     userAccount.deposit(amount);
	 }

	 private void withdraw() {
	     System.out.print("Enter withdrawal amount: $");
	     double amount = scanner.nextDouble();
	     userAccount.withdraw(amount);
	 }

	 public static void main(String[] args) {
	     // Create a bank account with an initial balance of $1000
	     BankAccount account = new BankAccount(1000);

	     // Create an ATM instance and connect it to the user's bank account
	     ATM atm = new ATM(account);

	     // Perform ATM transactions
	     atm.performTransaction();
	 }
	}


