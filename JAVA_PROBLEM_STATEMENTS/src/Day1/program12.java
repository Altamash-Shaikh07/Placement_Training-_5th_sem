// Employee Data Management using Encapsulation 
// Arjun works in an HR department and needs to store employee data securely. He wants to 
// create a class Employee where name and salary are private instance variables. Provide getter 
// and setter methods to access and modify the private data. Implement encapsulation to ensure 
// the employee's salary can be updated only through the setter. 
// Input Format: 
// The first input is the employee name (string). 
// The second input is the salary of the employee (double). 
// The third input is the new salary (double). 
// Output Format: 
// Display the employee's name and salary after updating it. 
// Sample Input 1: 
// Rajesh 
// 50000 
// 55000 
// Sample Output 1: 
// Employee Name: Rajesh, Salary: 55000.0 
// Sample Input 2: 
// Suresh 
// 60000
// 65000
// Sample Output 2:
// Employee Name: Suresh, Salary: 65000.0
import java.util.Scanner;
class program12 {
    private String name;
    private double salary;

    public program12(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        if (sc.hasNextLine()) {
            name = sc.nextLine().trim();
        }
        double salary = 0.0;
        if (sc.hasNextDouble()) {
            salary = sc.nextDouble();
        }
        double newSalary = salary;
        if (sc.hasNextDouble()) {
            newSalary = sc.nextDouble();
        }
        program12 emp = new program12(name, salary);
        emp.setSalary(newSalary);
        System.out.println("Employee Name: " + emp.getName() + ", Salary: " + emp.getSalary());
        sc.close();
    }
}
