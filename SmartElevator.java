public class SmartElevator {
    public static void main(String[] args) {
        int currentFloor = 5;
        int upRequest = 7;
        int downRequest = 3;
        boolean overloaded = false;

        if (overloaded)
            System.out.println("Elevator Stopped");
        else if (upRequest > currentFloor)
            System.out.println("Next Stop = " + upRequest);
        else
            System.out.println("Next Stop = " + downRequest);
    }
}