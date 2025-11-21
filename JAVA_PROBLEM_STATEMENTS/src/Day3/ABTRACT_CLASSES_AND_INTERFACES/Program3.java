// Alphabetics Game: You have to enter four characters. For each uppercase letter, you will get
//  10 marks, and for each lowercase letter, you will get-5 marks.
//  Write a program to calculate the total score:
//  Create a base class with a method void game().
//  Define this method in the derived class to calculate the total score based on the letter cases.
//  Input Format:
//  The input consists of four characters separated by spaces.
//  Output Format:
//  The output prints the total score calculated based on the conditions specified.
//  Sample Input
//  AFKR
//  Sample Output
//  Score : 40
//  Sample Input
//  AbDf
//  Sample Output
//  Score : 10
package Day3.ABTRACT_CLASSES_AND_INTERFACES;
import java.util.Scanner; 
class Game {
    public void game() {
    }
}
class Alphabetics extends Game {
    private String characters;
    public Alphabetics(String characters) {
        this.characters = characters;
    }
    @Override
    public void game() {
        int score = 0;
        for (char ch : characters.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                score += 10;
            } else if (Character.isLowerCase(ch)) {
                score -= 5;
            }
        }
        System.out.println("Score : " + score);
    } 
}
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ", "");
        Alphabetics alphabetics = new Alphabetics(input);
        alphabetics.game();
        scanner.close();
    }
}


    