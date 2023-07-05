package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                scanner.close();
                return;
        }

        System.out.println
                ("###################################");

        System.out.println("Result: "+result);

        System.out.println
                ("###################################");

        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("\nDo you want to perform another calculation?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.println
                    ("###################################");

            System.out.print("Enter your choice (1-2): ");
            int continueChoice = scanner.nextInt();

            System.out.println
                    ("###################################");

            switch (continueChoice) {
                case 1:
                    System.out.println("Select an operation:");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");

                    System.out.println
                            ("###################################");

                    System.out.print("Enter your choice (1-4): ");
                    choice = scanner.nextInt();

                    System.out.print("\nEnter the first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();


                    result = 0.0;

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
                            scanner.close();
                            return;
                    }

                    System.out.println("Result: " + result);
                    break;
                case 2:
                    shouldContinue = false;
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice! Exiting calculator...");
                    shouldContinue = false;
                    break;
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
