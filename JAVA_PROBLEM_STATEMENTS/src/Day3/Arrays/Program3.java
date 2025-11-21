//  Imagine a group of treasure hunters, Sarah, Tom, and Jake, who have discovered a mysterious
//  ancient temple. Inside the temple, they find a grid-like chamber filled with precious jewels
//  and artefacts arranged in a matrix format. The entrance is located at the top-left corner, and
//  they want to collect the treasures in a specific order as they navigate through the temple.
//  To make their treasure hunt more exciting, they decide to collect the treasures in a spiral
//  order starting from the entrance (top-left corner) and moving around the matrix in a circular
//  manner until they gather all the items.
//  Help Sarah, Tom, and Jake by writing a program that performs a spiral traversal on the given
//  matrix and returns the list of treasures in the order they should collect them.
//  Problem Statement:
//  Given a 2D matrix matrix[][] containing integers, your task is to return a list of integers
//  representing the elements of the matrix collected in a spiral order
//  Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15,16]]
//  Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
//  // Traverse from left to right
//  for (int i = left; i <= right; i++) {
//  System.out.print(matrix[top][i] + " ");
//  }
//  top++;
//  // Traverse downwards
//  for (int i = top; i <= bottom; i++) {
//  System.while (to
//  print(matrix[i][right] + " ");
//  }
//  right--;
//  // Traverse from right to left
//  for (int i = right; i >= left; i--) {
//  System.out.print(matrix[bottom][i] + " ");
//  }
//  bottom--;
//  // Traverse upwards
//  for (int i = bottom; i >= top; i--) {
//  System.out.print(matrix[i][left] + " ");
//  }
package Day3.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program3 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse downwards
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse upwards
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        List<Integer> spiralOrderList = spiralOrder(matrix);
        for (int num : spiralOrderList) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}