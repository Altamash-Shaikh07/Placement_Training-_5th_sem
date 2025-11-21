//  Write a Program to calculate the current bill
//  Create a class currentBill with a virtual method double amount().
//  Create a Fan
//  Create a class Fan that extends currentBill with watts and hours as its public attributes and
//  overrides the virtual function.
//  Create a class Light that extends currentBill with watts and hours as its public attributes and
//  overrides the virtual function.
//  Create a class TV that extends currentBill with watts and hours as its public attributes and
//  overrides the virtual function.
//  In the main method, prompt the user to enter the power rate of the appliance and the total
//  hours used then create the necessary
//  objects and call the methods.
//  Input Format
//  The first line consists of the power rating of the fan and the total hours used separated by
//  space.
//  The second line consists of the power rating of Light and the total hours used separated by
//  space.
//  The third line consists of the power rating of the TV and the total hours used separated by
//  space.
//  Output Format Sample
//  The output prints the bill amount. Refer to the sample input and output for formatting
//  specifications.
//  Sample Input
//  40 123
//  55 200
//  33 400
//  Sample output:
//  43.68
//  39
// Sample Input
//  60 300
//  54 360
//  30 720
//  Sample output:
//  88.56
package Day3.ABTRACT_CLASSES_AND_INTERFACES;
import java.util.Scanner;
class currentBill {
    public double amount() {
        return 0.0;
    }
}
class Fan extends currentBill {
    public int watts;
    public int hours;

    public Fan(int watts, int hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours * 0.75) / 1000;
    }
}
class Light extends currentBill {
    public int watts;
    public int hours;

    public Light(int watts, int hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours * 0.75) / 1000;
    }
}
class TV extends currentBill {
    public int watts;
    public int hours;

    public TV(int watts, int hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours * 0.75) / 1000;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Fan details
        String[] fanInput = sc.nextLine().split(" ");
        int fanWatts = Integer.parseInt(fanInput[0]);
        int fanHours = Integer.parseInt(fanInput[1]);
        Fan fan = new Fan(fanWatts, fanHours);
        System.out.printf("%.2f%n", fan.amount());

        // Read Light details
        String[] lightInput = sc.nextLine().split(" ");
        int lightWatts = Integer.parseInt(lightInput[0]);
        int lightHours = Integer.parseInt(lightInput[1]);
        Light light = new Light(lightWatts, lightHours);
        System.out.printf("%.2f%n", light.amount());

        // Read TV details
        String[] tvInput = sc.nextLine().split(" ");
        int tvWatts = Integer.parseInt(tvInput[0]);
        int tvHours = Integer.parseInt(tvInput[1]);
        TV tv = new TV(tvWatts, tvHours);
        System.out.printf("%.2f%n", tv.amount());

        sc.close();
    }
}

