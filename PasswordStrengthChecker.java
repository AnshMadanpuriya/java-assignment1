import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        StringBuilder missing = new StringBuilder();
        boolean strong = true;

        // Check length
        if (password.length() < 8) {
            missing.append("length < 8");
            strong = false;
        }

        // Check digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            if (missing.length() > 0)
                missing.append(", ");
            missing.append("digit");
            strong = false;
        }

        // Check uppercase
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            if (missing.length() > 0)
                missing.append(", ");
            missing.append("uppercase");
            strong = false;
        }

        // Check special character
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
                break;
            }
        }
        if (!hasSpecial) {
            if (missing.length() > 0)
                missing.append(", ");
            missing.append("special character");
            strong = false;
        }

        if (strong) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password: Missing " + missing.toString());
        }

        sc.close();
    }
}