public class ReturnPolicy {
    public static void main(String[] args) {
        int days = 10;
        boolean defective = false;
        boolean premium = true;

        if (days <= 7 || defective || (premium && days <= 15))
            System.out.println("Return Accepted");
        else
            System.out.println("Return Rejected");
    }
}