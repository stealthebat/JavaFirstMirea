package ru.mirea.task2.task2_8;


import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = "Hi from Random another string some words".split(" ");
        System.out.println(Arrays.toString(arr));
        // Collections.reverse(Arrays.asList(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
