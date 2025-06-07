import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private Double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew Rs." + amount);
        }
    }
}

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name to create account :");
        String name = scanner.nextLine();
        int initialBalance;
        while (true) {
            System.out.print("Enter initial balance: ");
            String balanceInput = scanner.nextLine();
           try{
            initialBalance = Integer.parseInt(balanceInput);
            if (initialBalance<0){
                System.out.println("Initial balance cannot ne negative");
                continue;
            }
            break;

           }
           catch(NumberFormatException e)
           {
            System.out.println("Invalid amount. please enter a valid number");
           } 
        }
        BankAccount account1 = new BankAccount(name, initialBalance);
        System.out.println("\nAccount created successfully for "+name+"!");
        boolean exit = false;
        while (!exit) {
            System.out.println("\n====Banking Menu====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw MOney");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-4): ");
            int choice;
            try{
                choice =  Integer.parseInt(scanner.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number");
                continue;
            }
            switch(choice){
                case 1: account1.checkBalance();
                break;
             
               case 2: System.out.print("Enter amount to deposit: Rs.");
            double depositAmount;
            try{
                depositAmount = Double.parseDouble(scanner.nextLine());
                account1.deposit(depositAmount);
            } catch(NumberFormatException e)
            {
                System.out.println("Invalid amount. Please enter a valid number");
            }
            break;
            case 3: System.out.print("Enter amount to withdraw Rs.");
            double withdrawAmount;
            try{
                withdrawAmount = Double.parseDouble(scanner.nextLine());
                account1.withdraw(withdrawAmount);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid amount. Please enter a valid number");
            }
            break;
            case 4: exit = true;
            System.out.println("Thank for using SimpleBankingSystem");
            break;
            default:
            System.out.println("invalid choice. please select from 1 to 4.");

            }

        }
        scanner.close();
    }
}