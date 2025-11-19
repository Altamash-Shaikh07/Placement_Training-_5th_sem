import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // optional prompt — fine for interactive runs, remove if using online judge
        System.out.println("Enter a two-digit number:");
        int num = s.nextInt();

        int digit1 = num / 10;
        int digit2 = num % 10;

        int sum = digit1 + digit2;

        System.out.println(sum);
        s.close();
    }
}
