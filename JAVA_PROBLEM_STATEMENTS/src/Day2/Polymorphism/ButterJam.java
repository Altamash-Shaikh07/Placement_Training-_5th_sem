package Day2.Polymorphism;
import java.util.Scanner;

class Calories {
    private double totalCalories;

    public void calculateCalories(int bread) {
        totalCalories = bread * 74;
    }

    public void calculateCalories(int bread, int jam) {
        totalCalories = bread * 74 + jam * 26;
    }

    public void calculateCalories(int bread, int jam, int butter) {
        totalCalories = bread * 74 + jam * 26 + butter * 102;
    }

    public double returnCalories() {
        return totalCalories;
    }

    public double calculateEnergy() {
        return totalCalories * 4.1868;
    }
}


public class ButterJam {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Calories c = new Calories();
            
            System.out.println("1.Bread only");
            System.out.println("2.Bread+Jam");
            System.out.println("3.Bread+Jam+Butter");
            
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 ->                     {
                        System.out.println("Enter the number of Slice of bread");
                        int bread = sc.nextInt();
                        c.calculateCalories(bread);
                    }
                case 2 ->                     {
                        System.out.println("Enter the number of Slice of bread");
                        int bread = sc.nextInt();
                        System.out.println("Enter the number of teaspoon of Jam");
                        int jam = sc.nextInt();
                        c.calculateCalories(bread, jam);
                    }
                case 3 ->                     {
                        System.out.println("Enter the number of Slice of bread");
                        int bread = sc.nextInt();
                        System.out.println("Enter the number of teaspoon of Jam");
                        int jam = sc.nextInt();
                        System.out.println("Enter the number of teaspoon of Butter");
                        int butter = sc.nextInt();
                        c.calculateCalories(bread, jam, butter);
                    }
                default -> {
                }
            }
            
            double calories = c.returnCalories();
            double energy = c.calculateEnergy();
            
            System.out.printf("%.3f kJ of energy generated from %.1f calories", energy, calories);
        }
    }
}