import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        int minimumBalance = 1000;

        if (withdraw > balance) {
            System.out.println("Transaction Failed: Insufficient balance");
        } else if ((balance - withdraw) < minimumBalance) {
            System.out.println("Transaction Failed: Minimum balance violation");
        } else {
            balance = balance - withdraw;
            System.out.println("Transaction Successful");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}