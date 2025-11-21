package Day2.Inheritance;
import java.util.Scanner;

import Day2.CLASSES_AND_OBJECTS.Student;

// Superclass Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Student extending Person
class Student extends Person {
    String university;

    Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
}

// Subclass Graduate extending Student
class Graduate extends Student {
    int graduationYear;

    Graduate(String name, int age, String university, int graduationYear) {
        super(name, age, university);
        this.graduationYear = graduationYear;
    }

    void printDetails() {
        System.out.println("Graduate " + name + ", Age: " + age +
                           ", University: " + university +
                           ", Year: " + graduationYear);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String university = sc.nextLine();
        int graduationYear = sc.nextInt();

        Graduate g = new Graduate(name, age, university, graduationYear);
        g.printDetails();
    }
}
