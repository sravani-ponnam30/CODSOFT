import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double accountBalance = 10000.0; 
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int userChoice = inputScanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Your balance is: " + accountBalance + " Rs.");
            } else if (userChoice == 2) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = inputScanner.nextDouble();
                accountBalance += depositAmount;
                System.out.println("Deposit successful. Your new balance is: " + accountBalance + " Rs.");
            } else if (userChoice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = inputScanner.nextDouble();
                if (withdrawalAmount <= accountBalance) {
                    accountBalance -= withdrawalAmount;
                    System.out.println("Withdrawal successful. Your new balance is: " + accountBalance + " Rs.");
                } else {
                    System.out.println("Withdrawal failed. Insufficient funds.");
                }
            } else if (userChoice == 4) {
                System.out.println("Thank you for using the ATM.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println();
        }

        inputScanner.close();
    }
}
