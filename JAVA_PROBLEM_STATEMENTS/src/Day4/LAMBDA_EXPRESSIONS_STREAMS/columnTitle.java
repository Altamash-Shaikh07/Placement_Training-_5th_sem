package Day4.LAMBDA_EXPRESSIONS_STREAMS;

import java.util.*;

public class columnTitle {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String columnTitle = sc.nextLine();
        System.out.println(titleToNumber(columnTitle));
    }
}