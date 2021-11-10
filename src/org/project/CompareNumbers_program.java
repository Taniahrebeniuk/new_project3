package org.project;

import java.util.Scanner;

public class CompareNumbers_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Input first integer");
        x = sc.nextInt();

        System.out.println("Input second integer");
        y = sc.nextInt();

        if (x > y) {
            System.out.println("The number X has the greatest value");
        } else if (x < y) {
            System.out.println("The number Y has the greatest value");
        } else {
            System.out.println("X and Y are equal");
        }

    }
}
