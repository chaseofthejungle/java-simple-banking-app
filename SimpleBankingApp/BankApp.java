import java.util.Scanner;

public class BankApp {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Customers to Input Data for? ");
        int numCustomers = input.nextInt();
        BankInfo Customers[] = new BankInfo[numCustomers];
        for (int i = 0; i < Customers.length; i++) {
            Customers[i] = new BankInfo();
            Customers[i].openAccount();
        }

        int menuOption;
        do {
            System.out.println("\n ---Banking System Demo---");
            System.out.println("\n 1. Display Account Details \n 2. Search by Account Number\n 3. Deposit an Amount" +
                    " \n 4. Withdraw an Amount \n 5. Exit App");
            System.out.println("Enter a Menu Option: ");
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    for (int i = 0; i < Customers.length; i++) {
                        Customers[i].showAccountDetails();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    String numToSearch = input.next();
                    boolean accountFound = false;
                    for (int i = 0; i < Customers.length; i++) {
                        accountFound = Customers[i].searchAccountNum(numToSearch);
                        if (accountFound) {
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Search Failed: Account Number Not Found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    numToSearch = input.next();
                    accountFound = false;
                    for (int i = 0; i < Customers.length; i++) {
                        accountFound = Customers[i].searchAccountNum(numToSearch);
                        if (accountFound) {
                            Customers[i].deposit();
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Search Failed: Account Number Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    numToSearch = input.next();
                    accountFound = false;
                    for (int i = 0; i < Customers.length; i++) {
                        accountFound = Customers[i].searchAccountNum(numToSearch);
                        if (accountFound) {
                            Customers[i].withdrawal();
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Search Failed: Account Number Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for your patronage!");
                    break;
            }
        } while (menuOption != 5);
    }
}