package java_homework_week9_SS.calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//SCanner declaration
        Calculator calculator = new Calculator();//object creation
        char choice;

        do {
            System.out.print("enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Please enter one of symbol +, -, *, / : ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(a, b, symbol);//method calling via object

            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the calculator.");

        scanner.close();//scanner close
    }
}

