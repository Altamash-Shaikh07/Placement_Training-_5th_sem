// Create a class Main with the following member variables int length int breadth int height int 
// radius In Main class, get the details of the values of all variables and pass it to the shape class 
// Create a class Shape with the following member variables int length int breadth int height int 
// radius The values are passed from the Main class as parameters to the constructors in Shape 
// class. In Shape class, create four constructors. The first constructor is the default 
// constructor.Shape(){} The second constructor is for the cube, which receives length, breadth, 
// and height as arguments. Shape(int length, int breadth, int height) {constructor body} The 
// third constructor is for the sphere, which receives radius as arguments. Shape(int 
// radius) {constructor body} The fourth constructor is for the cylinder, which receives radius 
// and height as arguments. Shape(int radius, int height) {Constructor body} Include three 
// methods in Shape class namely public float calculateAreaOfCylinder() public float 
// calculate AreaOfSphere() public Integer calculateAreaOfCube() to calculate the area of each 
// shapes. 
// Sample Input and Output 1 : 
// 1.Cube 
// 2.Sphere 
// 3.Cylinder 
// Enter the choice 
// 1 
// length 
// Y7 
// 21 
// 10 
// breadth 
// 20 
// height 
// 30 
// Area of Cube is 6000 
// Sample Input and Output 2: 
// 1. Cube 
// 2. Sphere 
// 3. Cylinder 
// Enter the choice 
// 2 
// radius 
// 10 
// Area of Sphere is 4186.67 
// Sample Input and Output 3: 
// 1. Cube 
// 2. Sphere 
// 3. Cylinder 
// Enter the choice 
// 3 
// radius 
// 10 
// height 
// 5 
// Area of Cylinders is 1570.0 
// Case 1 
// Input (stdin) 
// 1 
// 10 
// BIZOTIC 
// 222 
// 20 
// 30 
// Output (stdout) 
// 1.Cube 
// 2.Sphere 
// 3.Cylinder 
// Enter the choice 
// length 
// breadth 
// height 
// Area of Cube is 6000 
package Day2;
import java.util.Scanner;
class Shape {
    private int length;
    private int breadth;
    private int height;
    private int radius;

    // Default constructor
    public Shape() {
    }

    // Constructor for Cube
    public Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Constructor for Sphere
    public Shape(int radius) {
        this.radius = radius;
    }

    // Constructor for Cylinder
    public Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public Integer calculateAreaOfCube() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public float calculateAreaOfSphere() {
        return (float) (4 * Math.PI * radius * radius);
    }

    public float calculateAreaOfCylinder() {
        return (float) (2 * Math.PI * radius * (radius + height));
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("length");
                int length = sc.nextInt();
                System.out.println("breadth");
                int breadth = sc.nextInt();
                System.out.println("height");
                int height = sc.nextInt();
                Shape shape = new Shape(length, breadth, height);
                System.out.println("Area of Cube is " + shape.calculateAreaOfCube());
                break;
            }
            case 2: {
                System.out.println("radius");
                int radius = sc.nextInt();
                Shape shape = new Shape(radius);
                System.out.println("Area of Sphere is " + String.format("%.2f", shape.calculateAreaOfSphere()));
                break;
            }
            case 3: {
                System.out.println("radius");
                int radius = sc.nextInt();
                System.out.println("height");
                int height = sc.nextInt();
                Shape shape = new Shape(radius, height);
                System.out.println("Area of Cylinders is " + String.format("%.1f", shape.calculateAreaOfCylinder()));
                break;
            }
            default:
                break;
        }
        sc.close();
    }
}
