package org.example.seminarWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Снова Java");
        Scanner scanner = new Scanner(System.in);
        // Для task1
//        int number = scanner.nextInt();
//        System.out.println("Task1(number) = " + Task1(number));
        // Для task2
        //System.out.println(Task2());
        // Для task3
        //String stroka = scanner.nextLine();
        //System.out.println(Task3(stroka));
        //для addBinary
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("addBinary(a, b) = " + addBinary(a, b));


    }

    /**
     * Учитывая целое число n, верните разницу между произведением его цифр и суммой его цифр.
     */
    public static int Task1(int n) {

        int multi = 1, sum = 0;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return (multi - sum);
    }

    /**
     * Дана последовательность N целых чисел. Найти количество положительных чисел,
     * после которых следует отрицательное число.
     */
    public static int Task2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int nextNumber = scanner.nextInt();
            if (firstNumber >= 0 && nextNumber < 0) {
                count++;
            }
            firstNumber = nextNumber;
        }
        return count;
    }

    /**
     * @param s String
     * @return String
     */
    public static String Task3(String s) {
        int l = s.length();
        String strokaHalfOne = s.substring(l / 2);
        String strokaHalfTwo = s.substring(0, l / 2);
        return strokaHalfOne + strokaHalfTwo;
    }

    /**
     * @param array
     * @return true or false
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     */
    public static boolean symmetricArray(int[] array) {

        return false;
    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            addBinary(b, a);
        }
        int k = 0;
        int j = b.length() - 1;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            j--;
            res = k % 2 + res;
            k /= 2;
        }
        if (k > 0) {
            res = 1 + res;
        }

        return res;
    }

}

