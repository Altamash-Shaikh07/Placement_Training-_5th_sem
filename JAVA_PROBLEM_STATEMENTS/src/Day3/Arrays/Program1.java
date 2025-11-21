//  Ravi, Sita, Mohan, and Geeta are in a relay race, and their speeds are represented as an
//  integer array. After the race, you want to determine a special score for each of them. This
//  score is the product of the speeds of all participants except their own speed. The challenge is
//  to calculate this without using division.
//  Problem Statement:
//  Given an integer array speeds representing the running speeds of Ravi, Sita, Mohan, and
//  Geeta, return a new array score where score[i] is the product of all elements of speeds except
//  speeds[i].
//  Example 1:
//  Input:
//  speeds = [1, 2, 3, 4]
//  Output:
//  score = [24, 12, 8, 6]
//  Example 2:
//  Input:
//  speeds = [-1,1,0,-3,3]
//  Output:
//  score =[0,0,9,0,0]
package Day3.Arrays;
import java.util.Scanner;
public class Program1 {
    public static int[] calculateScores(int[] speeds) {
        int n = speeds.length;
        int[] score = new int[n];
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * speeds[i - 1];
        }

        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * speeds[i + 1];
        }

        for (int i = 0; i < n; i++) {
            score[i] = leftProducts[i] * rightProducts[i];
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] speeds = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            speeds[i] = Integer.parseInt(input[i]);
        }
        int[] scores = calculateScores(speeds);
        for (int score : scores) {
            System.out.print(score + " ");
        }
        scanner.close();
    }
}