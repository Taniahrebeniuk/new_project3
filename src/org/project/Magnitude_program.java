package org.project;

import java.util.Scanner;

public class Magnitude_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int x = 3;
        int y = -9;

        x = sc.nextInt();
        y = sc.nextInt();

        if (Math.abs(x) > Math.abs(y)) {
            System.out.println("x > y");
        }
        else if (Math.abs(x) < Math.abs(y)) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y");

            }

        }

    }


