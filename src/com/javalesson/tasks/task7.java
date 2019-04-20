/*Создайте простую игру, основанную на угадывании букв.
        Пользователь должен угадать загаданную букву A-Z, введя ее в консоль. Если пользователь угадал букву,
        программа выведет «Right» и игра закончится, если нет, то пользователь продолжит вводить буквы.
        (Опционально) Вывести «You’re too low», если пользователь ввел букву меньше загаданной,
        «You’re too high», если пользователь ввел букву больше загаданной.*/

package com.javalesson.tasks;

import java.util.Random;
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = (char) ('A' + new Random().nextInt(26));

        //System.out.println(ch);
        System.out.println("Hello, try to guess the letter!");

        for (char i = 0; i < 26; i++) {
            char s = sc.next().charAt(0);

            if (ch == s) {
                System.out.println("Congratulations! You win this time!");
                break;
            } else {
                System.out.println("Sorry, but you didn't guess, try again!");

                if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {
                    System.out.println("You are too low!");
                } else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
                    System.out.println("You are too high!");
                }
            }
        }
    }
}