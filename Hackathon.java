import java.util.Scanner;

public class Hackathon {
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // Input vehicle details
        System.out.print("Enter Vehicle Number: ");
        int vehicleNumber = sc.nextInt();

        System.out.print("Enter Waste Collected (kg): ");
        double wasteCollectedKg = sc.nextDouble();

        System.out.print("Enter Number of Collection Points: ");
        int collectionPoints = sc.nextInt();

        System.out.print("Enter Vehicle Status (A=Active, I=Inactive): ");
        char vehicleStatus = sc.next().charAt(0);

        // Display details
        System.out.println("\n--- Waste Collection Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollectedKg);
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);



        // If-Else check for target
        if (wasteCollectedKg >= 100) {
            System.out.println("Status: Collection Target Achieved");
        } else {
            System.out.println("Status: More Waste Collection Required");
        }



        // Method usage: calculate total waste from two points
    

  System.out.println("Waste collected at point 1 :- ");
        double point1Waste = sc.nextDouble();

        System.out.println("Waste collected at point 2 :- ");
        double point2Waste = sc.nextDouble();

        // Call the separate method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected from points: " + totalWaste + " KG");

    }


    public static double calculateTotalWaste(double point1, double point2) {
        return point1 + point2;
    }
}
