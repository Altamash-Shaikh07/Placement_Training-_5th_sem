package Day4.LAMBDA_EXPRESSIONS_STREAMS;

import java.util.*;

@SuppressWarnings("unused")
public class Einstein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bucket = sc.nextLine();
        char target = sc.next().charAt(0);

        long count = bucket.chars()
                .filter(ch -> ch == target)
                .count();

        System.out.println(count);
    }
}