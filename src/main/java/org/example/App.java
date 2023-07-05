package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println
                ("###################################");

        System.out.println
        ("Hi, welcome to a simple calculator");

        System.out.println
                ("############# Menu ################");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println
                ("###################################");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println
                ("###################################");

        System.out.println("Result: " + result);

        System.out.println
                ("###################################");

        System.out.println
                ("Thanks for using this calculator");

        System.out.println
                ("###################################");

        scanner.close();




    }
}
