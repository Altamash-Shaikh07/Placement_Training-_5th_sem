package Day4.LAMBDA_EXPRESSIONS_STREAMS;

import java.util.*;
import java.util.stream.Collectors;

public class productIds {
    @SuppressWarnings("UnnecessaryTemporaryOnConversionFromString")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replaceAll("[\\[\\]\\s]", "");
        String[] parts = input.split(",");

        List<Integer> productIds = new ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty())
                productIds.add(Integer.parseInt(p));
        }

        List<Integer> uniqueIds = productIds.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueIds);
    }
}