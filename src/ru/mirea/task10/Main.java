package ru.mirea.task10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T extends Comparable<T>>  void merge(List<T> arr, int l, int r, int m) {
        List<T> arr1 = new ArrayList<>(arr.subList(l, m + 1));
        List<T> arr2 = new ArrayList<>(arr.subList(m + 1, r + 1));
        int k = l;
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i).compareTo(arr2.get(j)) <= 0) {
                arr.set(k, arr1.get(i));
                i++;
            }
            else {
                arr.set(k, arr2.get(j));
                j++;
            }
            k++;
        }
        while (i < arr1.size()) {
            arr.set(k, arr1.get(i));
            i++;
            k++;
        }

        while (j < arr2.size()) {
            arr.set(k, arr2.get(j));
            j++;
            k++;
        }
    }

    public static void mergeSort(List<Integer> arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, r, mid);

        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (1 + Math.random() * 19));
        }
        System.out.println(arr.toString());
        mergeSort(arr, 0, arr.size() - 1);
        System.out.println(arr.toString());

    }
}
