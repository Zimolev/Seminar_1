package org.example.homeWork;

import java.util.Scanner;

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
 * после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 * */
public class HomeWorkTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int nextNumber = scanner.nextInt();
            if (firstNumber >= 0 && nextNumber < 0) {
                sum = sum + firstNumber;
            }
            firstNumber = nextNumber;
        }
        System.out.println("sum = " + sum);
    }
}
