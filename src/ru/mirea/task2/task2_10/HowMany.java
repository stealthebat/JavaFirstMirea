package ru.mirea.task2.task2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of words in input: " + sc.nextLine().split(" ").length);
    }
}
