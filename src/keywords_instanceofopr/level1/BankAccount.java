package keywords_instanceofopr.level1;

public class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void showDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Bank: " + bankName);
        } else {
            System.out.println("Not a BankAccount object");
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Shobhit", 1001);
        BankAccount b2 = new BankAccount("Aarav", 1002);

        b1.showDetails(b1);
        b2.showDetails("Invalid");

        getTotalAccounts();
    }
}