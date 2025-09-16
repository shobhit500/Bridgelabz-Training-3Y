package Object_Modeling;

import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Account> accounts;

    Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, customer, initialBalance);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    void showAccounts() {
        System.out.println("Accounts in " + bankName + ":");
        for (Account acc : accounts) {
            acc.showAccount();
            System.out.println();
        }
    }
}

class Customer {
    String name;
    ArrayList<Account> myAccounts;

    Customer(String name) {
        this.name = name;
        myAccounts = new ArrayList<>();
    }

    void addAccount(Account acc) {
        myAccounts.add(acc);
    }

    void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (Account acc : myAccounts) {
            System.out.println("Bank: " + acc.bank.bankName + ", Balance: ₹" + acc.balance);
        }
    }
}

class Account {
    Bank bank;
    Customer customer;
    double balance;

    Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class bank_acc {
    public static void main(String[] args) {
        Bank b1 = new Bank("Axis Bank");
        Bank b2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Shobhit");
        Customer c2 = new Customer("Riya");

        b1.openAccount(c1, 5000);
        b1.openAccount(c2, 7000);
        b2.openAccount(c1, 12000);

        System.out.println();
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
        System.out.println();
        b1.showAccounts();
        System.out.println();
        b2.showAccounts();
    }
}