public class FraudDetection {
    public static void main(String[] args) {
        int amount = 60000;
        boolean locationMatch = true;
        int transactions = 1;

        if ((amount > 50000 && !locationMatch) || transactions > 3)
            System.out.println("Fraud Detected");
        else
            System.out.println("Safe Transaction");
    }
}
