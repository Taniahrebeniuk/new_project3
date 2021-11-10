package org.project;
import java.util.Scanner;

public class Equation_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        a = sc.nextInt();
        b = sc.nextInt();


        if (a == 0) {
            System.out.println("Zero value for a");
        } else if ( b == 0) {
            System.out.println("X can be any value");
        } else {
            int x = -b / a;
            System.out.println(x);
        }

    }
}
