package ru.mirea.task10;

import javax.sound.midi.Soundbank;
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

    public static <T extends Comparable<T>> void mergeSort(List<T> arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, r, mid);

        }
    }

    public static <T> void printList(List<T> list) {
        for (T val : list) {
            System.out.println(val);
        }
    }

    public static <T extends Comparable<T>> List<T> mergeIntoSorted(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        mergeSort(result, 0, result.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        List<Student> arr1 = new ArrayList<>();
        arr1.add(new Student("Peter", "Pen", "Science", 3, 10));
        arr1.add(new Student("Marie", "Smith", "Computer Science", 2, 5));
        arr1.add(new Student("Bob", "Johnson", "Geography", 4, 1));

        List<Student> arr2 = new ArrayList<>();
        arr2.add(new Student("Polly", "Pen", "Biology", 5, 11));
        arr2.add(new Student("John", "Floyd", "Engineering", 1, 2));
        arr2.add(new Student("Mark", "Floyd", "Engineering", 1, 2));

        printList(arr1);
        System.out.println("------------");
        printList(arr2);
        System.out.println("------------");
        System.out.println("Result: ");
        List<Student> res = mergeIntoSorted(arr1, arr2);
        printList(res);
    }
}
