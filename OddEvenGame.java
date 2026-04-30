import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int even = 0;
        int odd = 0;
        
        System.out.println("Enter numbers (enter 0 to stop): ");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            // if (num == 0) break;
        }
        
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        
        sc.close();
    }
}
