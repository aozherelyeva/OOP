//Дано число n при помощи цикла for посчитать факториал n!

package com.javalesson.tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");

        String number = myObj.nextLine();  // Read user input
        int input = Integer.parseInt(number);
        int output = 1;

        for (int i = 1; i <= input; i++) {
            output *= i;
        }

        System.out.println(input + " factorial is " + output);
    }
}
