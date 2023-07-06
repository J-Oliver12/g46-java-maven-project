package org.example;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println
                ("###################################");

        System.out.println
                ("Type a year to see if it is a leap year or not:");

        System.out.println
                ("###################################");

        int year = scanner.nextInt();

        System.out.println
                ("###################################");

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }

            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println
                    (year + " is a leap year");
        }
            else {
            System.out.println
                    (year + " is not a leap year");
        }

        System.out.println
                ("###################################");

        scanner.close();

    }
}
