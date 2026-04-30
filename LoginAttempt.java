import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String correctPassword = "password";  
        int maxAttempts = 3;
        int attempts = 0;
        boolean loggedIn = false;
        
        while (attempts < maxAttempts) {
            System.out.print("Enter password: ");
            String input = sc.next();
            
            if (input.equals(correctPassword)) {
                System.out.println("Login Successful");
                loggedIn = true;
                break;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Wrong password \nAttempts left: " + (maxAttempts - attempts));
                }
            }
        }
        
        if (!loggedIn) {
            System.out.println("Account Locked");
        }
        
        sc.close();
    }
}

