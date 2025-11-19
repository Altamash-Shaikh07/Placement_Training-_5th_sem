import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter four ASCII values:");  
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();

        char char1 = (char) num1;
        char char2 = (char) num2;
        char char3 = (char) num3;
        char char4 = (char) num4;

        System.out.println(num1 + "-" + char1);
        System.out.println(num2 + "-" + char2);
        System.out.println(num3 + "-" + char3);
        System.out.println(num4 + "-" + char4);
    }
}