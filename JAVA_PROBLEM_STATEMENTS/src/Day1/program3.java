import java.util.Scanner;   
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of copies sold, cost per copy, and cost per copy to the agency
        int w = scanner.nextInt(); // number of copies sold
        int x = scanner.nextInt(); // cost per copy
        int y = scanner.nextInt(); // cost to the agency per copy

        // Fixed cost for storage, delivery, etc.
        int fixedCost = 100;

        // Calculate total revenue
        int totalRevenue = w * x;

        // Calculate total cost
        int totalCost = (w * y) + fixedCost;

        // Calculate profit
        int profit = totalRevenue - totalCost;

        // Print the profit
        System.out.println(profit);

        scanner.close();
    }
}