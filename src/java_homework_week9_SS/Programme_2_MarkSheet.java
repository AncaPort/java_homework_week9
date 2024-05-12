package java_homework_week9_SS;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        MarkCalculation();//calling static method
    }

    public static void MarkCalculation() {

        Scanner scanner = new Scanner(System.in);//scanner declaration

        //enter student details
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll No. :");
        int rollNo = scanner.nextInt();

        //enter three subject Marks
        System.out.println("Enter marks of three subjects Math, Science, English: ");
        int math = enterValidMarks("Math", scanner);
        int science = enterValidMarks("Science", scanner);
        int english = enterValidMarks("English", scanner);

        //calculate percentage and grade
        int total = math + science + english;
        double percentage = (double) total / 3;
        String result = (percentage > 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Invalid";
        }

        //Print MarkSheet
        System.out.println("_______________________________");
        System.out.println("|                           |");
        System.out.println("|         Mark Sheet        |");
        System.out.println("|___________________________|");
        System.out.println("| Name : " + name);
        System.out.println("| Roll No: " + rollNo);
        System.out.println("|___________________________|");
        System.out.println("| Subjects : Marks         |");
        System.out.println("|___________________________|");
        System.out.println("| Math : " + math);
        System.out.println("| Science : " + science);
        System.out.println("| English : " + english);
        System.out.println("|___________________________|");
        System.out.println("| Total : " + total);
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|___________________________|");

        scanner.close();//scanner close
    }

    //method for valid marks (between 0 to 100)
    public static int enterValidMarks(String sub, Scanner scanner) {
        int marks;
        while (true) {
            System.out.println("Enter marks for " + sub + ": ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input, should be between 0 to 100");
            }
        }
        return marks;

    }
}
