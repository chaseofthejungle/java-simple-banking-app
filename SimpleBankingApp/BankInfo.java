import java.util.Scanner;

public class BankInfo {
    private String accountNum;
    private String accountType;
    private String customerName;
    private long accountBalance;
    Scanner input = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNum = input.next();
        System.out.print("Enter Account Type: ");
        accountType = input.next();
        System.out.print("Enter Account Holder Name: ");
        customerName = input.next();
        System.out.print("Enter Account Balance: ");
        accountBalance = input.nextLong();
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void deposit() {
        long depositAmount;
        System.out.println("Enter the Amount to Deposit: $");
        depositAmount = input.nextLong();
        accountBalance = accountBalance + depositAmount;
    }

    public void withdrawal() {
        long withdrawAmount;
        System.out.println("Enter the Amount to Withdraw: ");
        withdrawAmount = input.nextLong();
        if (accountBalance >= withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Balance after Withdrawal: " + accountBalance);
        } else {
            System.out.println("Transaction Failed: Balance Less Than " + withdrawAmount);
        }
    }

    public boolean searchAccountNum(String numToSearch) {
        if (accountNum.equals(numToSearch)) {
            showAccountDetails();
            return true;
        }

        return false;
    }
}