//  Harini is a content analyst at an online media company that tracks trending topics on social
//  media. Her team receives large blocks of text data daily, filled with various user comments
//  and hashtags. To quickly identify frequently mentioned words or topics, Harini is tasked with
//  creating a tool that counts the occurrences of each word in a given text block.
//  How can Harini implement this Java program to efficiently count each word's occurrences in
//  a given text block, using the Map interface and HashMap? Ensure the implementation is
//  case-insensitive and ignores punctuation.
//  Sample Input:
//  Enter a string:
//  This is a test. This test is only a test.
//  Sample Output:
//  Word occurrences:
//  a: 2
//  test: 1
//  this: 2
//  only: 1
//  is: 2
//  test.: 2
package Day4.Collections2;
import java.util.*;
public class Harini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Convert to lowercase and remove punctuation
        String[] words = input.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}