package org.two;

import java.util.Scanner;

public class Apptwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {

            System.out.println
                    ("###################################");

            System.out.println
                    ("Hi, welcome to a simple calculator");

            System.out.println
                    ("############# Menu ################");


            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println
                    ("###################################");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            System.out.println
                    ("###################################");


            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println
                    ("###################################");

            double result = 0.0;


            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println
                    ("###################################");

            if (shouldContinue) {
                System.out.println();
                System.out.println("Do you want to perform another calculation?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                System.out.println
                        ("###################################");

                System.out.print("Enter your choice (1-2): ");
                int continueChoice = scanner.nextInt();

                System.out.println
                        ("###################################");

                if (continueChoice == 2) {
                    shouldContinue = false;
                    System.out.println("Exiting calculator...");
                }
            }
        }

        System.out.println
                ("###################################");

        System.out.println
                ("Thanks for using this calculator");

        System.out.println
                ("###################################");

        scanner.close();
    }
}