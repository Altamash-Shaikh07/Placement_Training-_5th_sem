// Create a class with the following attributes: 
// int rollno, 
// int mark1, 
// int mark2, 
// int mark3. 
// Create an array of objects for the above class. 
// Create the main class and in the main method calculate and print the following. 
// Total marks obtained by each student. 
// The highest mark in each subject with the roll number of the student who scored it. 
// The student who obtained the highest total mark. 
// Input Format 
// The first line of the input consists of the value of n. 
// The second lines consist of an integer (roll number, mark1, mark2, and mark3) 
// Output Format 
// First n lines print the total marks of each student. 
// The next 3 lines print the student's roll number and highest marks in each subject, separated 
// by a space. 
// The last line prints the roll number of the student and the highest total marks scored. 
// Sample Input 
// 5 
// 1 98 85 76 
// 2 85 74 65 
// 3 85 96 75 
// 4 52 65 79 
// 5 52 75 65 
// Sample Output 
// 259 
// 224 
// 256 
// 196 
// 192
// 1 98
// 3 96
// 1 76
// 1 259
package Day2.CLASSES_AND_OBJECTS;

import java.util.Scanner;
class Student {
    private int rollno;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(int rollno, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            students[i] = new Student(roll, m1, m2, m3);
        }

        // Print total marks of each student
        for (Student s : students) {
            System.out.println(s.getTotalMarks());
        }

        // Highest marks in each subject with roll number
        int max1 = Integer.MIN_VALUE, roll1 = -1;
        int max2 = Integer.MIN_VALUE, roll2 = -1;
        int max3 = Integer.MIN_VALUE, roll3 = -1;
        int maxTotal = Integer.MIN_VALUE, rollMaxTotal = -1;

        for (Student s : students) {
            if (s.getMark1() > max1) {
                max1 = s.getMark1();
                roll1 = s.getRollno();
            }
            if (s.getMark2() > max2) {
                max2 = s.getMark2();
                roll2 = s.getRollno();
            }
            if (s.getMark3() > max3) {
                max3 = s.getMark3();
                roll3 = s.getRollno();
            }
            int total = s.getTotalMarks();
            if (total > maxTotal) {
                maxTotal = total;
                rollMaxTotal = s.getRollno();
            }
        }

        System.out.println(roll1 + " " + max1);
        System.out.println(roll2 + " " + max2);
        System.out.println(roll3 + " " + max3);
        System.out.println(rollMaxTotal + " " + maxTotal);

        sc.close();
    }
}