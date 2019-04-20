//Переделайте последний пример на break.Необходимо, чтобы заданный символ встречался в строке хотя бы 2 раза.
package com.javalesson.tasks;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Введите исходный текст");
        String searchMe = myObj.nextLine();  // Read user input

        int max = searchMe.length();

        char symb = 0;

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Введите символ для вхождения");
        String symbolIn = myObj2.nextLine();  // Read user input
        if (symbolIn.length() > 1) {
            System.out.println("Введите только один символ!");
        } else if (symbolIn.length() == 0) {
            System.out.println("Вы не ввели ни одного символа. Введите один символ");
        } else {
            symb = symbolIn.charAt(0);

            System.out.println("....");
            System.out.println("....");
            System.out.println("....");
            System.out.println("...Ведётся поиск 2 вхождений символа " + symb + " в строке " + searchMe + "...");
            System.out.println("....");
            System.out.println("....");
            System.out.println("....\n");


            boolean findFirst = false;
            boolean findSecond = false;
            int symbol = 0;

            for (int i = 0; i < max; i++) {
                if (searchMe.charAt(i) == symb) {
                    findFirst = true;
                    symbol = i;
                    break;
                }
            }

            for (int j = symbol + 1; j < max; j++) {
                if (searchMe.charAt(j) == symb) {
                    findSecond = true;
                    break;
                }
            }
            if (findFirst && findSecond)
                System.out.println("Символ '" + symb + "' найден в строке как минимум 2 раза");
            else
                System.out.println("Символ '" + symb + "' не найден в строке или найден менее 2 раз");
        }
    }
}
