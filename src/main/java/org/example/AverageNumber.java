package org.example;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {

            System.out.println
                    ("###################################");

            System.out.println
                    ("Hi, welcome ! Here you can find out the average of three numbers");

            System.out.println
                    ("###################################");

            System.out.println("Enter the three numbers you want know the average of:");

            System.out.println
                    ("###################################");

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            double result = 0.0;

            result = (num1 + num2 + num3) / 3;

            System.out.println("Result: " + result);


            System.out.println("\nDo you want to perform another calculation?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.println
                    ("###################################");

            System.out.print("Enter your choice (1-2): ");
            int continueChoice = scanner.nextInt();

            if (continueChoice == 2) {
                shouldContinue = false;

                System.out.println
                        ("###################################");

                System.out.println("Exiting calculator...");

            } else {
                System.out.println
                        ("###################################");
            }
        }

        System.out.println
                ("Thanks for using this calculator");

        System.out.println
                ("###################################");

        scanner.close();


    }
}
