package ATM_Management;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM_Main {
    public static void main(String[] args) {
        ArrayList<User> data = new ArrayList<>();
        data.add(new User("Manikandan", 6369032947L, 2947, 0 ));
        data.add(new User("Mr.A", 1234567890L, 1234, 0 ));
        data.add(new User("Mr.B", 9087654321L, 9876, 0 ));
        data.add(new User("Mrs.Gayathri", 8344598151L, 8151, 0 ));


        System.out.println("----- Welcome to My ATM -----");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        long enteredAcNumber = scan.nextLong();
        System.out.println("Enter PIN:");
        int enteredPIN = scan.nextInt();

        User loggedInUser = null;
        for (User u : data) {
            if (u.getAccountNumber() == enteredAcNumber && u.getPIN() == enteredPIN) {
                loggedInUser = u;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Invalid credentials. Exiting.");
            return;
        }

       ATM_Implementation atm = new ATM_Implementation(loggedInUser);
        System.out.println("Hello " + loggedInUser.getName());

whole:
        while(true){

            System.out.println("What do you want to do ?");

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    atm.viewBalance();
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    System.out.println("Enter your deposit Amount");
                    long depositAmount = scan.nextLong();
                    atm.deposit(depositAmount);
                    System.out.println("----------------------------------------");
                    break;

                case 3:
                    System.out.println("Enter your withdraw amount");
                    long withdrawAmount = scan.nextLong();
                    atm.withdraw(withdrawAmount);
                    System.out.println("----------------------------------------");
                    break;

                case 4:
                    System.out.println("Exited");
                    System.out.println("----------------------------------------");
                    break whole;

                default:
                    System.out.println("Invalid choice");
                    System.out.println("----------------------------------------");
                    break;
            }
        }
    }
}
