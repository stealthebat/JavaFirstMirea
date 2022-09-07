package ru.mirea.task1;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {

        System.out.println("Task one");
        taskOne();
        System.out.println("\nTask two");
        taskTwo(args);
        System.out.println("\nTask three");
        taskThree();
        System.out.println("\nTask four");
        taskFour();
        System.out.println("\nTask five");
        taskFive();
    }


    // Разработайте программу, которая будет с помощью метода вычислять факториал числа (используйте управляющую конструкцию цикла), проверьте работу метода.*/
    public static void taskFive() {
        int x;
        BigInteger res = BigInteger.ONE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычисление факториала x");
        System.out.println("Введите x: ");
        x = sc.nextInt();
        while (x > 1) {
            res = res.multiply(BigInteger.valueOf(x));
            x--;
        }
        System.out.println("Результат: " + res);
    }

    // Разработайте программу, в результате работы которой генерируется массив целых чисел случайным образом, выведите его на экран, отсортируйте,
    // и снова выведите на экран (используйте два подхода к генерации случайных чисел – метод random() класса Math и класс Random).
    public  static  void taskFour() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Random array with Math.random():");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt() % 10;
        }

        System.out.println("Random array with class Random:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));

    }

    // Разработайте программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматируйте вывод).
    public static void taskThree() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(1 + "/" + i + " ");
        }
        System.out.println();
    }

    // Разработайте программу, в результате работы которой выводятся на экран аргументы командной строки в цикле for.
    public static  void taskTwo(String[] args) {
        System.out.println("Command line arguments: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[1]);
        }
    }

    // Разработайте программу, в результате работы которой считается сумма элементов целочисленного массива
    // с помощью циклов for, while, do while, результат выводится на экран.
    public static void taskOne() {
        int[] array = {5, 1, 2, 10, 4, 4, 3};
        int sumFor = 0, sumWhile = 0, sumDoWhile  = 0;
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }

        System.out.println("Sum with for: " + sumFor);

        int i = 0;
        while (i < array.length) {
            sumWhile += array[i];
            i++;
        }

        System.out.println("Sum with while: " + sumFor);

        i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while (i < array.length);

        System.out.println("Sum with do while: " + sumFor);
    }
}
