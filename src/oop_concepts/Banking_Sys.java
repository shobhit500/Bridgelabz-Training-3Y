package oop_concepts;

import java.util.*;

// Interface
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract Cls
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

// SavingsAccount Cls
class SavingsAccount extends BankAccount {
    private String loanPolicyCode;

    public SavingsAccount(String accountNumber, String holderName, double balance, String loanPolicyCode) {
        super(accountNumber, holderName, balance);
        this.loanPolicyCode = loanPolicyCode;
    }

    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied. Policy Code: " + loanPolicyCode);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// CurrentAccount Cls
class CurrentAccount extends BankAccount {
    private String loanPolicyCode;

    public CurrentAccount(String accountNumber, String holderName, double balance, String loanPolicyCode) {
        super(accountNumber, holderName, balance);
        this.loanPolicyCode = loanPolicyCode;
    }

    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    public void applyForLoan() {
        System.out.println("Current Account Loan Applied. Policy Code: " + loanPolicyCode);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 20000;
    }
}

// Main Cls
public class Banking_Sys {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SAV123", "Alice", 15000, "SAV-LOAN-001"));
        accounts.add(new CurrentAccount("CUR456", "Bob", 25000, "CUR-LOAN-002"));

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest Earned: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + (loan.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            System.out.println("---------------------------");
        }
    }
}