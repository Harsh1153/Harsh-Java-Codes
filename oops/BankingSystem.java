
import java.util.Scanner;

class BankAccount {
    private static int accountNumberGenerator = 1001;
    private int accountNumber;
    private String name, gender;
    private double balance;

    BankAccount(String name, String gender, double initialDeposit) {
        this.name = name;
        this.gender = gender;
        if (initialDeposit >= 3000) {
            this.balance = initialDeposit;
            this.accountNumber = accountNumberGenerator++;
            System.out.println("Account opened successfully with Account Number: " + this.accountNumber);
        } else {
            System.out.println("Minimum deposit required to open an account is 3000");
        }
    }

    void checkBalance() {
        System.out.println("Account Number: " + accountNumber + "\nName: " + name + "\nGender: " + gender + "\nBalance: " + balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= 2000) {
            if (amount > 0) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully. Updated Balance: " + balance);
            } else {
                System.out.println("Invalid amount. Withdrawal amount should be positive.");
            }
        } else {
            System.out.println("Insufficient balance. Minimum balance of 2000 should be maintained.");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Updated Balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit amount should be positive.");
        }
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        BankAccount[] accountList = new BankAccount[10];
        int accountCount = 0;

        do {
            System.out.println("\n1. Open Account\n2. Check Balance\n3. Withdraw\n4. Deposit\n0. Exit\nEnter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Name, Gender, and Initial Deposit:");
                    String name = scanner.nextLine();
                    String gender = scanner.nextLine();
                    double initialDeposit = scanner.nextDouble();
                    scanner.nextLine();
                    accountList[accountCount++] = new BankAccount(name, gender, initialDeposit);
                    break;
                case 2:
                    System.out.println("Enter Account Number:");
                    int accountNum = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountList[i].getAccountNumber() == accountNum) {
                            accountList[i].checkBalance();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Number:");
                    accountNum = scanner.nextInt();
                    found = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountList[i].getAccountNumber() == accountNum) {
                            System.out.println("Enter Amount to Withdraw:");
                            double withdrawAmount = scanner.nextDouble();
                            accountList[i].withdraw(withdrawAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account Number:");
                    accountNum = scanner.nextInt();
                    found = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accountList[i].getAccountNumber() == accountNum) {
                            System.out.println("Enter Amount to Deposit:");
                            double depositAmount = scanner.nextDouble();
                            accountList[i].deposit(depositAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}
