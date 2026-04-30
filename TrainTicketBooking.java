import java.util.Scanner;

public class TrainTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available seats: ");
        int seats = sc.nextInt();

        System.out.print("Are you VIP? (yes/no): ");
        String vip = sc.next().toLowerCase();

        if (seats > 0) {
            System.out.println("Ticket Confirmed");
        } else if (vip.equals("yes")) {
            System.out.println("Ticket Confirmed");
        } else {
            System.out.println("Added to Waitlist");
        }

        sc.close();
    }
}