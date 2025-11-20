import java.util.Scanner;

// Superclass Employee
class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10;   // 10% bonus
    }
}

// Subclass Manager overriding method
class Manager extends Employee {

    Manager(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;   // 15% bonus
    }
}

public class Sunil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String role = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp;

        if (role.equalsIgnoreCase("Manager")) {
            emp = new Manager(salary);
        } else {
            emp = new Employee(salary);
        }

        System.out.println("Bonus: " + emp.calculateBonus());
    }
}
