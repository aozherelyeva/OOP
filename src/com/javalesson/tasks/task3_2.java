//Перепишите программы с использованием цикла while.

package com.javalesson.tasks;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        String number = myObj.nextLine();  // Read user input

        int input = Integer.parseInt(number);
        int output = 1;

        int i = 1;
        while (i <= input) {
            output *= i;
            i++;
        }

        System.out.println(input + " factorial is " + output);
    }
}
