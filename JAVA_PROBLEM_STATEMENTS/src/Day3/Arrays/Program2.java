//  Rahul, Priya, and Sanjay are planning to organise a secret event, and they have a budget for
//  each item they plan to purchase. They have a list of possible costs, and they want to find three
//  items that, together, perfectly match a specific total cost. If they can find these three items,
//  they can proceed with their plan. If not, they’ll need to change their strategy.
//  Help Rahul, Priya, and Sanjay by writing a program that finds a combination of three item
//  prices from a given list that add up to the total budget.
//  Problem Statement:
//  Given an array of integer prices[] representing the cost of different items and an integer
//  budget, your task is to find three distinct items (a triplet) whose sum equals the budget. If
//  such a triplet exists, return it; otherwise, return that no such triplet is found.
//  Input Format:
//  An integer array prices[] where each element represents the price of an item.
//  An integer budget representing the total cost they want to achieve.
//  Output Format:
//  If such a triplet exists, print the three item prices.
//  If no such triplet exists, print a message indicating no valid combination.
//  Example 1:
//  Input:
//  prices = [12, 3, 4, 1, 6, 9]
//  budget = 24
//  Output:
//  Triplet found: 12, 3, 9
//  Example 2:
//  Input:
//  prices = [1, 2, 3, 4, 5]
//  budget = 12
//  Output:
//  No valid triplet found
package Day3.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Program2 {
    public static void findTriplet(int[] prices, int budget) {
        Arrays.sort(prices);
        int n = prices.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = prices[i] + prices[left] + prices[right];
                if (currentSum == budget) {
                    System.out.println("Triplet found: " + prices[i] + ", " + prices[left] + ", " + prices[right]);
                    return;
                } else if (currentSum < budget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No valid triplet found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] prices = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            prices[i] = Integer.parseInt(input[i]);
        }
        int budget = scanner.nextInt();
        findTriplet(prices, budget);
        scanner.close();
    }
}

