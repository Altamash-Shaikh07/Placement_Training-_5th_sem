//  Likith is an HR assistant at a startup, and he is tasked with organising employee data for a
//  company-wide team-building event. To create a fair distribution of teams by age group, Likith
//  decides to sort the list of employees by age. How can Likith write a Java program that uses a
//  Comparator to sort employee records by age, with the ability to take dynamic input for names
//  and ages?
//  Sample Input:
//  Enter the number of people:
//  3
//  Enter name for person 1:
//  Alice
//  Enter age for person 1:
//  30
//  Enter name for person 2:
//  Bob
//  Enter age for person 2:
//  25
//  Enter name for person 3:
//  Charlie
//  Enter age for person 3:
//  35
//  Sample Output:
//  People sorted by age:
//  Bob (25)
//  Alice (30)
//  Charlie (35)
package Day4.Collections2;
import java.util.*;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Likith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name for person " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter age for person " + (i + 1) + ":");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            people.add(new Person(name, age));
        }

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println("People sorted by age:");
        for (Person person : people) {
            System.out.println(person.name + " (" + person.age + ")");
        }
    }
}