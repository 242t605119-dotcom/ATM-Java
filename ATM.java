import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 5000;

        System.out.println("===== ATM =====");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong PIN!");
            sc.close();
            return;
        }

        while (true) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Balance: ₹" + balance);

            } else if (choice == 2) {

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Amount deposited!");
                } else {
                    System.out.println("Invalid amount.");
                }

            } else if (choice == 3) {

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount > balance) {
                    System.out.println("Insufficient balance.");
                } else if (amount <= 0) {
                    System.out.println("Invalid amount.");
                } else {
                    balance -= amount;
                    System.out.println("Please collect your cash.");
                }

            } else if (choice == 4) {

                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
