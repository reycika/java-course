package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount user = new BankAccount();
        user.setCustomerName("Renata Jakovljevic");
        user.setBalance(300);
        user.setCustomerEmail("renata.atwork@gmail.com");
        user.setCustomerPhoneNumber("+38640257896");
        user.setAccountNumber("2900 5687 4588 222");

        System.out.println("Customer name: " + user.getCustomerName());
        System.out.println("Customer account number: " + user.getAccountNumber());
        System.out.println("Customer balance: " + user.getBalance());
        System.out.println("Customer email: " + user.getCustomerEmail());
        System.out.println("Customer phone number: " + user.getCustomerPhoneNumber());

        System.out.println("----------------------------------------------------------");
        System.out.println("DEPOSIT WITH POSITIVE AMOUNT");
        System.out.println("----------------------------------------------------------");

        double amountToDeposit = 100.0;
        System.out.println("Sufficient funds: " + user.getBalance());
        System.out.println("Amount to deposit: " + amountToDeposit);
        user.depositFunds(amountToDeposit);
        System.out.println("Balance is " + user.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println("DEPOSIT WITH NEGATIVE AMOUNT");
        System.out.println("----------------------------------------------------------");

        amountToDeposit = -150.0;
        System.out.println("Sufficient funds: " + user.getBalance());
        System.out.println("Amount to deposit: " + amountToDeposit);
        user.depositFunds(amountToDeposit);
        System.out.println("Balance is " + user.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println("WITHDRAW MORE THAN YOU HAVE");
        System.out.println("----------------------------------------------------------");

        double amountToWithdraw = 500;
        System.out.println("Sufficient funds: " + user.getBalance());
        System.out.println("Amount to withdraw: " + amountToWithdraw);
        user.withdrawFunds(amountToWithdraw);
        System.out.println("Balance is " + user.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println("WITHDRAW NEGATIVE AMOUNT");
        System.out.println("----------------------------------------------------------");

        amountToWithdraw = -500;
        System.out.println("Sufficient funds: " + user.getBalance());
        System.out.println("Amount to withdraw: " + amountToWithdraw);
        user.withdrawFunds(amountToWithdraw);
        System.out.println("Balance is " + user.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println("WITHDRAW SOME AMOUNT");
        System.out.println("----------------------------------------------------------");

        amountToWithdraw = 300;
        System.out.println("Sufficient funds: " + user.getBalance());
        System.out.println("Amount to withdraw: " + amountToWithdraw);
        user.withdrawFunds(amountToWithdraw);
        System.out.println("Balance is " + user.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println("Using constructor BankAccount with parameters called");
        System.out.println("----------------------------------------------------------");

        BankAccount kali = new BankAccount("1234 5678 9101 112", 5000.0, "Kali",
                "kali@something.me", "(078) 223-4589");

        System.out.println("Customer balance: " + kali.getBalance());
        System.out.println("Customer phone number: " + kali.getCustomerPhoneNumber());
        System.out.println("Customer email: " + kali.getCustomerEmail());
        System.out.println("Customer name: " + kali.getCustomerName());
        System.out.println("Customer account number: " + kali.getAccountNumber());

        System.out.println("----------------------------------------------------------");

        BankAccount myAcc = new BankAccount("Ren", "myemail@email.com", "(059) 4321 43432");
        System.out.println(myAcc.getAccountNumber() + " customer name " + myAcc.getCustomerName());

        System.out.println("----------------------------------------------------------");
        System.out.println("TESTING EMPTY CONSTRUCTOR");
        System.out.println("----------------------------------------------------------");

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());

        System.out.println("----------------------------------------------------------");
        System.out.println("TESTING CONSTRUCTOR WITH 2 PARAMETERS (name, creditLimit)");
        System.out.println("----------------------------------------------------------");

        VipCustomer newVip = new VipCustomer("Reni", 1500);
        System.out.println(newVip.getName() + ", " + newVip.getCreditLimit() + ", " + newVip.getEmailAddress());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("TESTING CONSTRUCTOR WITH 3 PARAMETERS (name, creditLimit, emailAddress)");
        System.out.println("-----------------------------------------------------------------------");

        VipCustomer newVipPerson = new VipCustomer("Kali", 5000, "kali@something.com");
        System.out.println(newVipPerson.getName());
        System.out.println(newVipPerson.getCreditLimit());
        System.out.println(newVipPerson.getEmailAddress());

    }
}