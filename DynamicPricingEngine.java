import java.util.Scanner;

public class DynamicPricingEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base price: ");
        double base = sc.nextDouble();

        System.out.print("Demand (High/Low): ");
        String demand = sc.next().toLowerCase();

        System.out.print("Weekend (Yes/No): ");
        String weekend = sc.next().toLowerCase();

        double price = base;

        if (demand.equals("high")) {
            price *= 1.20;
        }

        if (weekend.equals("yes")) {
            price *= 1.10;
        }

        System.out.println("Final Price = " + (int) price);

    }
}