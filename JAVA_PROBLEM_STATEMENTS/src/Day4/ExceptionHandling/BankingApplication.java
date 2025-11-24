//  Imagine you're developing a banking application where users can enter the amount they wish
//  to deposit. To enhance user experience and prevent errors, you need to ensure that the
//  application gracefully handles invalid inputs.
//  Problem Statement: The application should prompt users to enter a deposit amount. If the
//  user enters a valid integer, the application will proceed with the deposit. If the input is invalid
//  (e.g., a string or special characters), the application should catch the exception and inform the
//  user without crashing.
//  Requirements:
//  The application prompts the user for an input amount.
//  It attempts to convert the input string to an integer.
//  If the conversion fails due to a NumberFormatException, it should inform the user that the
//  input is invalid and prompt them to try again.
//  The program should continue to request input until a valid integer is provided.
//  Example Interactions:
//  Valid Input:
//  Input: "500"
//  Output: "Deposit successfully: $500 has been added to your account."
//  Invalid Input:
//  Input: "abc"
//  Output: "Invalid input. Please enter a valid integer."
//  Another Invalid Input:
//  Input: "45.67"
//  Output: "Invalid input. Please enter a valid integer.
import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int depositAmount = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the amount to deposit: ");
            String userInput = scanner.nextLine();

            try {
                depositAmount = Integer.parseInt(userInput);
                validInput = true; // Input is valid, exit the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("Deposit successful: $" + depositAmount + " has been added to your account.");
        scanner.close();
    }
}