// Kaprekar number 
// A Kaprekar number is a number whose square when divided into two parts and such that the 
// sum of parts is equal to the original number and none of the parts has value 0. 
// Input: n = 45 
// Output: Yes 
// Explanation : 45*45 = 2025 and 20+ 25 is 45 
// Input: n = 13 
// Output: No 
// Explanation : 13^2 = 169. Neither 16+ 9 nor 1 + 69 is equal to 13 
// Input: n = 297 
// Output: Yes 
// Explanation: 297^2 = 88209 and 88+ 209 is 297 
// Input: n = 10 
// Output: No 
// Explanation: 102 = 100. It is not a Kaprekar number even if sum of 100+ 0 is 100. This is 
// because of the condition that none of the parts should have value 0. 
import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int square = n * n;
        String squareStr = Integer.toString(square);
        boolean isKaprekar = false;

        for (int i = 1; i < squareStr.length(); i++) {
            String leftPartStr = squareStr.substring(0, i);
            String rightPartStr = squareStr.substring(i);

            int leftPart = Integer.parseInt(leftPartStr);
            int rightPart = Integer.parseInt(rightPartStr);

            if (rightPart != 0 && (leftPart + rightPart) == n) {
                isKaprekar = true;
                break;
            }
        }

        if (isKaprekar || (square == n && n != 0)) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}
