import java.util.Scanner;
public class TrafficFine{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        
        System.out.print("Is it repeated violation? (yes/no): ");
        String repeated = sc.next();
        
        int fine = 0;
        if (speed > 100) {
            fine = 1000;
        } else if (speed > 80) {
            fine = 500;
        }
        else{
            fine=0;
        }
        
        if (repeated.equalsIgnoreCase("yes")) {
            fine *= 2;
        }
        
        System.out.println("Fine = " + fine);
        
    }
}