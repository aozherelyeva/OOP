//Вывести 10 первых чисел последовательности 0, -5,-10,-15..

package com.javalesson.tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number of the -5's that you want to see:");
        String num = myObj.nextLine();  // Read user input

        int number = Integer.parseInt(num);
        int initial = -5;

        for (int i = 0; i <= number; i++) {
            System.out.println(initial * i);
        }

    }
}