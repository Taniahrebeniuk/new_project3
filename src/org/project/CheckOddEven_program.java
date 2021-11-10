package org.project;

import java.util.Scanner;

public class CheckOddEven_program {
    public static void main(String[] args) {
        int number = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number.BYE");

        } else {
            System.out.println("Odd number.BYE");

        }
    }
}