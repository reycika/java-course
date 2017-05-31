package com.company;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if there are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {

    }

    // we can also create a default bank account if no values are entered, but
    // can't have an empty constructor and a default one together

    /*public BankAccount() {
        this("000000", 0.0, "Default name",
                "Default email", "Default phone number");
    }*/

    public BankAccount(String accountNumber, double balance, String customerName,
                       String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void depositFunds(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            //System.out.println("New balance is " + balance);
        } else {
            System.out.println("Amount to deposit must be greater than 0");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount < 0.0) {
            System.out.println("You cannot withdraw a negative amount");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds. The highest amount" +
                    " you can withdraw is " + this.balance);
        } else {
            balance -= amount;
        }
    }
}
