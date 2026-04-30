import java.util.Scanner;

public class CabFareSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Is it night? (yes/no): ");
        String night = sc.next().toLowerCase();

        double fare = 0;

        if (distance <= 5) {
            fare = distance * 50;
        } else if (distance <= 10) {
            fare = (5 * 50) + ((distance - 5) * 40);
        } else {
            fare = (5 * 50) + (5 * 40) + ((distance - 10) * 30);
        }

        if (night.equals("yes")) {
            fare = fare * 1.20; // +20% night surcharge
        }

        System.out.println("Fare = " + (int) fare);

        sc.close();
    }
}