import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        
        System.out.print("Premium User (yes/no): ");
        String premium = sc.next().toLowerCase();
        
        int discount = 0;
        if (amount >= 5000) {
            discount = 20;
        } else if (amount >= 3000) {
            discount = 10;
        }
        
        if (premium.equals("yes")) {
            discount += 5;
        }
        
        double finalAmount = amount - (amount * discount / 100);
        
        System.out.println("Final Amount = " + (int)finalAmount);  
        
        sc.close();
    }
}