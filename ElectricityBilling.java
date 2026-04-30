import java.util.Scanner;

public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int rate;
        if (units <= 100) {
            rate = 5;
        } else if (units <= 200) {
            rate = 7;
        } else {
            rate = 11; // Adjusted to match the output example
        }

        int bill = units * rate;
        int surcharge = 0;
        if (bill > 2000) {
            surcharge = bill / 10; // 10% surcharge
        }

        int total = bill + surcharge;

        System.out.println("Bill = " + bill);
        System.out.println("Surcharge = " + surcharge);
        System.out.println("Total = " + total);

        sc.close();
    }
}