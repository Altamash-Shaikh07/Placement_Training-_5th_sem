// Write a program to get the employee id, name, and salary of N professors and print the details 
// of the professors whose salary is greater or equal to 20000. Create a class Professor with the 
// following public attributes, 
// id - int 
// name - string 
// salary - int 
// Include default constructor Professor() and parameterized constructor Professor (int id, string 
// name, int salary) and a method 
// display() which prints the details. 
// In the main method create N objects for the class Professor and call the necessary functions. 
// Input Format 
// The first line consists of the total number of professors(N). 
// The next N lines consist of Employee id, Name, and Salary separated by space in each line. 
// Output Format 
// The output prints the details of the professors whose salary is greater or equal to 20000. 
// Refer to the sample input and output for formatting specifications 
// Sample Input 1 
// 3 
// 1001 Akil 25000 
// 1002 Elon 30000 
// 1003 Musk 12000 
// Sample Output 1 
// 1001 Akil 25000 
// 1002 Elon 30000 
// Sample Input 2 
// 2 
// 100123 Jibran 100000 
// 24 
// 100124 Rahman 200000 
// Sample Output 2 
// 100123 Jibran 100000 
// 100124 Rahman 200000 
package Day2;
import java.util.Scanner;
class Professor {
    public int id;
    public String name;
    public int salary;

    public Professor() {
    }

    public Professor(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character
        Professor[] professors = new Professor[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();
            professors[i] = new Professor(id, name, salary);
        }

        for (Professor prof : professors) {
            if (prof.salary >= 20000) {
                prof.display();
            }
        }
        sc.close();
    }
}

