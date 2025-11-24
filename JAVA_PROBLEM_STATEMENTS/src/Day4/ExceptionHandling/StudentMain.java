package Day4.ExceptionHandling;
//  Create a class Student with attributes roll no, name, age and course. Initialize values through
//  the parameterized constructor.
//  If the age of a student is not between 15 and 21 then generate a user-defined exception
//  "AgeNotWithinRangeException". If the name contains numbers or special symbols raise
//  exception
//  "NameNotValidException". Define the two exception classes to display the message as shown
//  in sample output.
//  Example1
//  Input
//  100
//  Babu
//  20
//  MCA
//  Output
//  100 Babu 20 MCA
//  Explanation
//  Since the input values satisfy the constraint, print the given data.
//  Example2
//  Input
//  101
//  Babu1
//  22
//  MCA
//  Output
//  NameNotValidException
//  AgeNotWithinRangeException
import java.util.Scanner;
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("NameNotValidException");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + age + " " + course;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rollNo = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        String course = scanner.next();

        try {
            Student student = new Student(rollNo, name, age, course);
            System.out.println(student);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
