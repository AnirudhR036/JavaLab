import java.util.Scanner;

class Account {
    protected String customerName;
    protected int accountNumber;
    protected double balance;
    protected String accountType;

    public Account(String customerName, int accountNumber, double balance, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Balance for account number " + accountNumber + ": " + balance);
    }
}

class SavAcct extends Account {
    private static final double INTEREST_RATE = 0.04; // Example interest rate of 4%

    public SavAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, balance, "Savings");
    }

    public void computeAndDepositInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest computed and added: " + interest);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurAcct extends Account {
    private static final double MINIMUM_BALANCE = 500.0;
    private static final double SERVICE_CHARGE = 50.0;

    public CurAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, balance, "Current");
    }

    public void checkMinimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Minimum balance not maintained. Service charge imposed: " + SERVICE_CHARGE);
            displayBalance();
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating savings account
        SavAcct savingsAccount = new SavAcct("Alice", 1001, 1000.0);
        
        // Creating current account
        CurAcct currentAccount = new CurAcct("Bob", 1002, 800.0);

        // Display account options
        System.out.println("Choose an account type:\n1. Savings Account\n2. Current Account");
        int choice = scanner.nextInt();

        Account selectedAccount = (choice == 1) ? savingsAccount : currentAccount;

        // Menu for actions
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an action:\n1. Deposit\n2. Display Balance\n3. Compute Interest (Savings only)\n4. Withdraw\n5. Exit");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    break;

                case 2:
                    selectedAccount.displayBalance();
                    break;

                case 3:
                    if (selectedAccount instanceof SavAcct) {
                        ((SavAcct) selectedAccount).computeAndDepositInterest();
                    } else {
                        System.out.println("Interest computation is not applicable for Current Account.");
                    }
                    break;

                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (selectedAccount instanceof SavAcct) {
                        ((SavAcct) selectedAccount).withdraw(withdrawAmount);
                    } else if (selectedAccount instanceof CurAcct) {
                        ((CurAcct) selectedAccount).withdraw(withdrawAmount);
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
