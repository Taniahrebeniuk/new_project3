package org.project;

import java.util.Scanner;

public class CheckPassFail_program {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = scanner.nextInt();

        if (num >= 50) {
            System.out.println("PASS.DONE");


        } else {
            System.out.println("FAIL.DONE");

        }

    }

}