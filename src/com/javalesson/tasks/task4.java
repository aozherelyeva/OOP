//Даны переменные x и n вычислить x^n.

package com.javalesson.tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter a number");
        String x = myObj1.nextLine();  // Read user input
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter a degree");
        String n = myObj2.nextLine();  // Read user input

        int number = Integer.parseInt(x);
        int degree = Integer.parseInt(n);
        int result = 1;

        for (int i = 1; i <= degree; i++) {
            result *= number;
        }

        System.out.println(number + "^" + degree + " = " + result);
    }
}