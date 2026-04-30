import java.util.Scanner;

public class OnlineExamAntiCheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tab switches: ");
        int tabSwitch = sc.nextInt();

        System.out.print("Enter idle time in minutes: ");
        int idleTime = sc.nextInt();

        if (tabSwitch > 3 || idleTime > 5) {
            System.out.println("Cheating Suspected");
        } else {
            System.out.println("No Cheating Detected");
        }

    }
}