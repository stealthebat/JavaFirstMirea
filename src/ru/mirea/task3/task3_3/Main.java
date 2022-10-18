package ru.mirea.task3.task3_3;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//выведите его на экран в строку, далее определите и выведите на экран
//сообщение о том, является ли массив строго возрастающей последовательностью



public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }
        System.out.println("Последовательность " + (isStrictlyIncreasing ? "" : "не ") + "строго возрастающая");
    }
}
