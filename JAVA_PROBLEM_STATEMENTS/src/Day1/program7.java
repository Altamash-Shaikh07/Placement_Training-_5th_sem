// The renowned book fair of the season "Publishers Federation Book Expo" is back, it promises 
// to be bigger and better with a spread of about a million books on display. It is organised in a 
// wide space this year on the topmost floor N of Hotel Grand Regency. 
// Williams, an ardent book lover visits the fair and wants to minimise the time it takes him to 
// go from the N-th floor to ground floor. He can either take the elevator or the stairs. 
// The stairs are at an angle of 45 degrees and Williams's velocity is V1 m/s when taking the 
// stairs down. The elevator on the other hand moves with a velocity V2 m/s. Whenever an 
// elevator is called, it always starts from ground floor and goes to N-th floor where it collects 
// Williams (collecting takes no time), it then makes its way down to the ground floor with 
// Williams in it. 
// The elevator cross a total distance equal to N metres when going from N-th floor to ground 
// floor or vice versa, while the length of the stairs is sqrt(2) * N because the stairs are at an 
// angle 45 degrees. Williams has requested your help to decide whether he should use stairs or 
// the elevator to minimise his travel time. Can you help him out? 
// Input Format 
// The first line of the input contains three space-separated integers N, V1, V2. 
// Output Format 
// Output a single line with string Elevator or Stairs, denoting the answer to the problem. 
// Sample Input 
// 5 10 15 
// Sample Input 
// 2 10 14 
// Sample Output 
// Elevator 
// Sample Output 
// Stairs
import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        int N = scanner.nextInt();
        int V1 = scanner.nextInt();
        int V2 = scanner.nextInt();
        
        // Calculate time taken using stairs
        double stairsDistance = Math.sqrt(2) * N;
        double timeStairs = stairsDistance / V1;
        
        // Calculate time taken using elevator
        double elevatorDistance = 2 * N; // going up and then down
        double timeElevator = elevatorDistance / V2;
        
        // Determine which option is faster
        if (timeElevator < timeStairs) {
            System.out.println("Elevator");
        } else {
            System.out.println("Stairs");
        }
        
        scanner.close();
    }
}
