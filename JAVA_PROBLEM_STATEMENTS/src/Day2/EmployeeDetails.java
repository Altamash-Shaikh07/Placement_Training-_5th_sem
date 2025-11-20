// A company maintains a database that has the details of all the employees. 
// There are two levels of employees where level 1 is the top management having a salary more 
// than 1000 dollars and level 2 is the staff who are getting a salary less than 1000 dollars. 
// Create a base class named "Employee" with empId and salary as attributes. Create a subclass, 
// empLevel, that extends the employee and categorises the employee into various levels, and 
// implements the following concept. 
// Input Format 
// The input should contain integer the employee ID and salary of the employee 
// Note: Employee id should be of integer type and salary float type. 
// Output Format 
// The output of the program must display the employee id, salary, and level of the employee, 
// one below the other in the same order. 
// Sample Input 
// 253 5.6 
// Sample Output 
// 253 
// 5.6 
// 2 
package Day2;
import java.util.Scanner;
class Employee{
    private int empId;
    private float salary;

    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }
}

    class empLevel extends Employee {
        public empLevel(int empId, float salary) {
            super(empId, salary);
        }

        public int getLevel() {
            return (getSalary() > 1000.0f) ? 1 : 2;
        }
    }

    public class EmployeeDetails {
        public static void main(String[] args) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            if (!sc.hasNextInt()) {
                sc.close();
                return;
            }
            int id = sc.nextInt();
            float sal = 0.0f;
            if (sc.hasNextFloat()) {
                sal = sc.nextFloat();
            }
            empLevel e = new empLevel(id, sal);
            System.out.println(e.getEmpId());
            System.out.println(e.getSalary());
            System.out.println(e.getLevel());
            sc.close();
        }
    }
