// The IT giant "SoftCompInfo" has decided to transfer its message through the network using a 
// new encryption technique. The company has decided to encrypt the data using the non-prime 
// number concept. The message is in the form of a number and the sum of non-prime digits 
// present in the message is used as the encryption key. 
// Write an algorithm to determine the encryption key. 
// Example 
// Input: 45673 
// Output:10 
// Explanation 
// The non-prime digits are 4 and 6. Hence the output is 4+6 = 10. 
import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message number: ");
        int n = scanner.nextInt();
        int sumOfNonPrimeDigits = 0;

        while (n > 0) {
            int digit = n % 10;
            if (!isPrime(digit)) {
                sumOfNonPrimeDigits += digit;
            }
            n /= 10;
        }

        System.out.println("Encryption Key: " + sumOfNonPrimeDigits);
        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
